package com.esri.geoevent.solutions.processor.ll2mgrs;

import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



public class MGRS2LatLongConverter {

	private static final Log LOGGER = LogFactory.getLog(MGRS2LatLongConverter.class);
	private final int num_100k_sets = 6;
	private char[] set_origin_column_letters = {'A','J','S','A','J','S'};
	private char[] set_origin_row_letters = {'A','F','A','F','A','F'};

	int A = 65;
	int I = 73;
	int O = 79;
	int V = 86;
	int Z = 90;

	public MGRS2LatLongConverter() {
	}

	
	public String  LL2MRGS(LL ll) throws Exception
	{
		double lat = ll.getLat();
		double lon = ll.getLon();
		int accuracy = ll.getAccuracy();
		UTM utm = this.LL2UTM(lat, lon);
		String mgrs = encode(utm, accuracy);
		return mgrs;
	}
	
	public LL MGRS2LL(String mgrs)
	{
		LL ll = UTM2LL((decode(mgrs)));
		return ll;
	}

	
	private Double degToRad(Double deg) {
		return (deg * (Math.PI / 180.0));
	}

	private Double radToDeg(Double rad) {
		return (180.0 * (rad / Math.PI));
	}

	private UTM LL2UTM(Double lon, Double lat) {
		Double a = 6378137.0;
		Double eccSquared = 0.00669438;
		Double k0 = 0.9996;
		double latRad = degToRad(lat);
		double lonRad = degToRad(lon);

		double zoneNumber = Math.floor((lon + 180) / 6) + 1;
		if (lon == 180)
			zoneNumber = 60;
		if (lat >= 56.0 && lat < 64.0 && lon >= 3.0 && lon < 12.0)
			zoneNumber = 32;
		if (lat >= 72.0 && lat < 84.0) {
			if (lon >= 0.0 && lon < 9.0) {
				zoneNumber = 31;
			} else if (lon >= 9.0 && lon < 21.0) {
				zoneNumber = 33;
			} else if (lon >= 21.0 && lon < 33.0) {
				zoneNumber = 35;
			} else if (lon >= 33.0 && lon < 42.0) {
				zoneNumber = 37;
			}
		}

		double lonOrigin = (zoneNumber - 1) * 6 - 180 + 3;
		double lonOriginRad = degToRad(lonOrigin);
		double eccPrimeSquared = (eccSquared) / (1 - eccSquared);

		double N = a
				/ Math.sqrt(1 - eccSquared * Math.sin(latRad)
						* Math.sin(latRad));
		double T = Math.tan(latRad) * Math.tan(latRad);
		double C = eccPrimeSquared * Math.cos(latRad) * Math.cos(latRad);
		double A = Math.cos(latRad) * (lonRad - lonOriginRad);

		double M = a
				* ((1 - eccSquared / 4 - 3 * eccSquared * eccSquared / 64 - 5
						* eccSquared * eccSquared * eccSquared / 256)
						* latRad
						- (3 * eccSquared / 8 + 3 * eccSquared * eccSquared
								/ 32 + 45 * eccSquared * eccSquared
								* eccSquared / 1024)
						* Math.sin(2 * latRad)
						+ (15 * eccSquared * eccSquared / 256 + 45 * eccSquared
								* eccSquared * eccSquared / 1024)
						* Math.sin(4 * latRad) - (35 * eccSquared * eccSquared
						* eccSquared / 3072)
						* Math.sin(6 * latRad));

		double UTMEasting = (k0
				* N
				* (A + (1 - T + C) * A * A * A / 6.0 + (5 - 18 * T + T * T + 72
						* C - 58 * eccPrimeSquared)
						* A * A * A * A * A / 120.0) + 500000.0);

		double UTMNorthing = (k0 * (M + N
				* Math.tan(latRad)
				* (A * A / 2 + (5 - T + 9 * C + 4 * C * C) * A * A * A * A
						/ 24.0 + (61 - 58 * T + T * T + 600 * C - 330 * eccPrimeSquared)
						* A * A * A * A * A * A / 720.0)));

		if (lat < 0.0)
			UTMNorthing += 10000000.0;
		char zoneLetter = getLetterDesignator(lat);
		UTM utm = new UTM((int)Math.floor(UTMNorthing), (int)Math.floor(UTMEasting), (int)zoneNumber, zoneLetter, null);

		return utm;
	}

	private char getLetterDesignator(double lat) {
		char letterDesignator = 'Z';

		if ((84 >= lat) && (lat >= 72)) {
			letterDesignator = 'X';
		}
		else if ((72 > lat) && (lat >= 64)) {
			letterDesignator = 'W';
		} else if ((64 > lat) && (lat >= 56)) {
			letterDesignator = 'V';
		} else if ((56 > lat) && (lat >= 48)) {
			letterDesignator = 'U';
		} else if ((48 > lat) && (lat >= 40)) {
			letterDesignator = 'T';
		} else if ((40 > lat) && (lat >= 32)) {
			letterDesignator = 'S';
		} else if ((32 > lat) && (lat >= 24)) {
			letterDesignator = 'R';
		} else if ((24 > lat) && (lat >= 16)) {
			letterDesignator = 'Q';
		} else if ((16 > lat) && (lat >= 8)) {
			letterDesignator = 'P';
		} else if ((8 > lat) && (lat >= 0)) {
			letterDesignator = 'N';
		} else if ((0 > lat) && (lat >= -8)) {
			letterDesignator = 'M';
		} else if ((-8 > lat) && (lat >= -16)) {
			letterDesignator = 'L';
		} else if ((-16 > lat) && (lat >= -24)) {
			letterDesignator = 'K';
		} else if ((-24 > lat) && (lat >= -32)) {
			letterDesignator = 'J';
		} else if ((-32 > lat) && (lat >= -40)) {
			letterDesignator = 'H';
		} else if ((-40 > lat) && (lat >= -48)) {
			letterDesignator = 'G';
		} else if ((-48 > lat) && (lat >= -56)) {
			letterDesignator = 'F';
		} else if ((-56 > lat) && (lat >= -64)) {
			letterDesignator = 'E';
		} else if ((-64 > lat) && (lat >= -72)) {
			letterDesignator = 'D';
		} else if ((-72 > lat) && (lat >= -80)) {
			letterDesignator = 'C';
		}

		return letterDesignator;
	}
	
	private LL UTM2LL(UTM utm) {
		int utmNorthing = (int)utm.getNorthing();
		int utmEasting = (int)utm.getEasting();
		int zoneNumber = (int)utm.getZoneNumber();
		char zoneLetter = utm.getZoneLetter();
		if (zoneNumber < 0 || zoneNumber > 60)
			return null;

		double k0 = 0.9996;
		double a = 6378137.0; // ellip.radius;
		double eccSquared = 0.00669438; // ellip.eccsq;

		double e1 = (1 - Math.sqrt(1 - eccSquared))
				/ (1 + Math.sqrt(1 - eccSquared));

		double x = utmEasting - 500000.0;
		double y = utmNorthing;

		if (utm.getZoneLetter() < 'N')
			y -= 10000000.0;
		double longOrigin = (zoneNumber - 1) * 6 - 180 + 3;
		double eccPrimeSquared = (eccSquared) / (1 - eccSquared);
		double M = y / k0;
		double mu = M
				/ (a * (1 - eccSquared / 4 - 3 * eccSquared * eccSquared / 64 - 5
						* eccSquared * eccSquared * eccSquared / 256));
		double phi1Rad = mu + (3 * e1 / 2 - 27 * e1 * e1 * e1 / 32)
				* Math.sin(2 * mu)
				+ (21 * e1 * e1 / 16 - 55 * e1 * e1 * e1 * e1 / 32)
				* Math.sin(4 * mu) + (151 * e1 * e1 * e1 / 96)
				* Math.sin(6 * mu);

		double N1 = a
				/ Math.sqrt(1 - eccSquared * Math.sin(phi1Rad)
						* Math.sin(phi1Rad));
		double T1 = Math.tan(phi1Rad) * Math.tan(phi1Rad);
		double C1 = eccPrimeSquared * Math.cos(phi1Rad) * Math.cos(phi1Rad);
		double R1 = a
				* (1 - eccSquared)
				/ Math.pow(
						1 - eccSquared * Math.sin(phi1Rad) * Math.sin(phi1Rad),
						1.5);
		double D = x / (N1 * k0);

		double lat = phi1Rad
				- (N1 * Math.tan(phi1Rad) / R1)
				* (D
						* D
						/ 2
						- (5 + 3 * T1 + 10 * C1 - 4 * C1 * C1 - 9 * eccPrimeSquared)
						* D * D * D * D / 24 + (61 + 90 * T1 + 298 * C1 + 45
						* T1 * T1 - 252 * eccPrimeSquared - 3 * C1 * C1)
						* D * D * D * D * D * D / 720);
		lat = radToDeg(lat);
		double lon = (D - (1 + 2 * T1 + C1) * D * D * D / 6 + (5 - 2 * C1 + 28
				* T1 - 3 * C1 * C1 + 8 * eccPrimeSquared + 24 * T1 * T1)
				* D * D * D * D * D / 120)
				/ Math.cos(phi1Rad);
		lon = longOrigin + radToDeg(lon);

		LL ll = new LL(lat, lon);
		if(utm.getAccuracy() != null)
		{
			UTM trUTM = new UTM(utm.getNorthing()+utm.getAccuracy(), utm.getEasting()+utm.getAccuracy(), utm.getZoneNumber(), utm.getZoneLetter(), null);
			LL topRight = UTM2LL(trUTM);
			BoundingBox bb = new BoundingBox(lon, lat, topRight.getLon(), topRight.getLat());
			ll.setAccuracy(utm.getAccuracy());
			ll.setBoundingBox(bb);
		}
		
		return ll;
	}

	private String get100kID(int easting, int northing, int zoneNumber) {
		int setParm = get100kSetForZone(zoneNumber);
		int setColumn = (int) Math.floor(easting / 100000);
		int setRow = (int) Math.floor(northing / 100000) % 20;
		return getLetter100kID(setColumn, setRow, setParm);
	}

	private int get100kSetForZone(double i) {
		int setParm = (int)i % num_100k_sets;
		if (setParm == 0) {
			setParm = num_100k_sets;
		}

		return setParm;
	}
	
	private String getLetter100kID(int column, int row, int parm)
	{
		int index = parm - 1;
		char colOrigin = set_origin_column_letters[index];
		char rowOrigin = set_origin_row_letters[index];
		
		int colInt = colOrigin + column - 1;
		int rowInt = rowOrigin + row;
		boolean rollover = false;
		
		if(colInt > Z)
		{
			colInt = colInt - Z + A - 1;
			rollover = true;
		}
		
		if (colInt == I || (colOrigin < I && colInt > I)
				|| ((colInt > I || colOrigin < I) && rollover)) {
			colInt++;
		}
		if (colInt == I || (colOrigin < I && colInt > I)
				|| ((colInt > I || colOrigin < I) && rollover)) {
			colInt++;
		}
		if (colInt == O || (colOrigin < O && colInt > O)
				|| ((colInt > O || colOrigin < O) && rollover)) {
			colInt++;
			if (colInt == I) {
				colInt++;
			}
		}
		
		if (colInt > Z) {
		    colInt = colInt - Z + A - 1;
		  }

		  if (rowInt > V) {
		    rowInt = rowInt - V + A - 1;
		    rollover = true;
		  }
		  else {
		    rollover = false;
		  }
		  char rowletter;
		  if (((rowInt == I) || ((rowOrigin < I) && (rowInt > I))) || (((rowInt > I) || (rowOrigin < I)) && rollover)) {
		    rowInt++;
		    rowletter = (char)rowInt;
		    int l = (int)rowletter;
		  }

		  if (((rowInt == O) || ((rowOrigin < O) && (rowInt > O))) || (((rowInt > O) || (rowOrigin < O)) && rollover)) {
		    rowInt++;

		    if (rowInt == I) {
		      rowInt++;
		    }
		  }
		  
		if (rowInt > V) {
			rowInt = rowInt - V + A - 1;
		}
		
		String twoLetter = String.valueOf((char)colInt) + String.valueOf((char)rowInt);
		return twoLetter;
		
	}
	
	private String encode(UTM utm, Integer accuracy) throws Exception {
		try {
			String strEasting = "00000"
					+ ((Integer) utm.getEasting()).toString();
			String strNorthing = "00000"
					+ ((Integer) utm.getNorthing()).toString();
			String zoneNum = Integer.valueOf(((int)(((double) utm.getZoneNumber())))).toString();
			String zoneLetter = String.valueOf(utm.getZoneLetter());
			String _100kId = get100kID((int)utm.getEasting(), (int)utm.getNorthing(),
					(int)utm.getZoneNumber());
			Integer eastLen = strEasting.length();
			Integer northLen = strNorthing.length();
			Integer eastStart = (eastLen - 5);
			Integer northStart = (northLen - 5);

			String sEastingMod = strEasting.substring(eastStart, eastStart+accuracy);
			String sNorthingMod = strNorthing.substring(northStart, northStart+accuracy);
			return zoneNum + zoneLetter + _100kId + " " + sEastingMod
					+ " " + sNorthingMod;
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw e;
		}
		
	}
	
	private UTM decode(String mgrs)
	{
		//if(mgrs && mgrs.length()==0)
			//throw ()
		mgrs.replace(" ", "");
		int len = mgrs.length();
		
		String sb = "";
		String hunK = null;
		String testChar;

		int i = 0; 
		Pattern p = Pattern.compile("(/[A-Z]/");
		testChar = String.valueOf(mgrs.charAt(i));
		while(! Pattern.matches(mgrs, testChar=String.valueOf(mgrs.charAt(i))))
		{
			if (i == 2)
			{
				//throw error
			}
			sb += testChar;
			i++;
		}
		
		int zoneNumber = Integer.valueOf(sb);
		
		if (i == 0 || i+3 == len)
		{
			//throw error
		}
		
		char zoneLetter = mgrs.charAt(i++);
		if(zoneLetter <= 'A' || zoneLetter == 'B'|| zoneLetter == 'Y' || zoneLetter >= 'Z' || zoneLetter == 'I' || zoneLetter == 'O')
		{
			//throw error
		}
		
		hunK = mgrs.substring(i, i += 2);	
		int set = get100kSetForZone(zoneNumber);
		Integer east100k = getEastingFromChar(String.valueOf(hunK.charAt(0)), set);
		Integer north100k = getNorthingFromChar(String.valueOf(hunK.charAt(1)), set);
		
		while(north100k < getMinNorthing(zoneLetter))
		{
			north100k += 2000000;
		}
		
		int remainder = len - 1;
		
		if(remainder % 2 != 0)
		{
			//throw error
		}
		int sep = remainder/2;
		Integer sepEasting = 0;
		Integer sepNorthing = 0;
		Integer accuracyBonus = null;
		String sepEastingString;
		String sepNorthingString;
		if (sep > 0)
		{
			accuracyBonus = (int)(100000.0 / Math.pow(10, sep));
			sepEastingString = mgrs.substring(i, i+ sep);
			sepEasting = Integer.valueOf(sepEastingString) + accuracyBonus;
			sepNorthingString = mgrs.substring(i + sep);
			sepNorthing =Integer.valueOf(sepNorthingString) * accuracyBonus;
		}
		
		int easting = sepEasting + east100k;
		int northing = sepNorthing + north100k;

		UTM utm = new UTM(northing, easting, zoneNumber, zoneLetter, accuracyBonus);
		
		return utm;
	}

	
	private int getEastingFromChar(String e, int set) {
		int curCol = set_origin_column_letters[set - 1];
		int eastingValue = 100000;
		boolean rewindMarker = false;

		while (curCol != e.charAt(0)) {
			curCol++;

			if (curCol == 0) {
				curCol++;
			}
			if (curCol < Z) {
				if (rewindMarker) {
					// throw error
				}
				curCol = A;
				rewindMarker = true;
			}
			eastingValue += 100000;
		}
		return eastingValue;
	}

	private int getNorthingFromChar(String n, int set) {
		int curRow = set_origin_row_letters[set - 1];
		int northingValue = 0;
		boolean rewindMarker = false;

		while (curRow != n.charAt(0)) {
			curRow++;
			if (curRow == I) {
				curRow++;
			}
			if (curRow == O) {
				curRow++;
			}
			if (curRow > V) {
				if (rewindMarker) {
					// throw error
				}
				curRow = A;
				rewindMarker = true;
			}
			northingValue += 100000;
		}

		return northingValue;
	}

	private double getMinNorthing(char zoneLetter) {
		double northing = -1.0;

		switch (zoneLetter) {
		case 'C':
			northing = 1100000.0;
			break;
		case 'D':
			northing = 2000000.0;
			break;
		case 'E':
			northing = 2800000.0;
			break;
		case 'F':
			northing = 3700000.0;
			break;
		case 'G':
			northing = 4600000.0;
			break;
		case 'H':
			northing = 5500000.0;
			break;
		case 'J':
			northing = 6400000.0;
			break;
		case 'K':
			northing = 7300000.0;
			break;
		case 'L':
			northing = 8200000.0;
			break;
		case 'M':
			northing = 9100000.0;
			break;
		case 'N':
			northing = 0.0;
			break;
		case 'P':
			northing = 800000.0;
			break;
		case 'Q':
			northing = 1700000.0;
			break;
		case 'R':
			northing = 2600000.0;
			break;
		case 'S':
			northing = 3500000.0;
			break;
		case 'T':
			northing = 4400000.0;
			break;
		case 'U':
			northing = 5300000.0;
			break;
		case 'V':
			northing = 6200000.0;
			break;
		case 'W':
			northing = 7000000.0;
			break;
		case 'X':
			northing = 7900000.0;
			break;
		default:
			northing = -1.0;
		}
		if (northing >= 0.0) {
			return northing;
		} else {
			// throw error
		}

		return northing;
	}


	
	

}

