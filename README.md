defense_geoevent_dev
====================

repository for defense team's geoevent server development

To install the compiled adapter, copy the geomessage-adapter-10.2.0.jar file in the ./defense-adapter/target directory and paste into your ``<Geoevent Server Install>\deploy`` directory.

prereqs for building from source
1. Install ArcGIS geoevent server

2. download and install geoevent server sdk (sdk included with geoevent server instalation)

3. follow sdk documentation to set up maven repository

4. the pom.xml may need modification to point to the geoevent server sdk repository. Search for the repositories tag in pom.xml.  The Java Runntime is embedded with Geoevent Server and the libraries are required for advanced geometric operations.  Find the repository with the id 'GEP' Make sure the url points to the System Folder in your GeoEventProcessor install location (example below points to directory in default install location).

```
<repository> 
  <id>GEP</id>
  <name>GeoEvent Processor embedded repository</name>
  <layout>default</layout>
  <url>file:///Program Files/ArcGIS/Server/GeoEventProcessor/System</url> 
</repository>
```
In the example above the url points to the sdk on a local machuine at the path:

C:\geoevent-sdk-10.2.0\repository
