# Geoevent Processor

The Geomessage Adapter provides an example of an adapter that injests and writes out messages in Esri's geomessage format.  Geomessage is an xml format used to transmit messages to esri's military features.




# Prerequesits

1. Install ArcGIS geoevent server

2. download and install geoevent server sdk (sdk included with geoevent server instalation)

3. follow sdk documentation to set up maven repository
 
6. Clone the solutions-geoevent-java repository


## Instructions

### General Help

* [New to Github? Get started here.](http://htmlpreview.github.com/?https://github.com/Esri/esri.github.com/blob/master/help/esri-getting-to-know-github.html)

## Getting Started


### Building just the CAP-Adapter
 
1. navigate to the ./solutions-geoevent-java/solutions-geoevent/adapters/geomessage-adapter directory on the command prompt
2. type mvn install at the prompt and hit return
3. Browse to ./solutions-geoevent-java/solutions-geoevent//adapters/geomessage-adapter/target (this directory is created when you execute mvn install).
4. Copy the geomessage-adapter-10.2.0.jar file and paste it into the deploy directory on your GeoEvent server (<GeoEventServer install location>\deploy\ -- default location is C:\Program Files\ArcGIS\Server\GeoEventProcessor\deploy)
 
### Validating Install
 
1. Browse to the 'Site' tab in GeoEvent Service manager
2. Click on the 'Adapters' tab and you should see both a Geomessage input adapter and Geomessage output adapter listed.

