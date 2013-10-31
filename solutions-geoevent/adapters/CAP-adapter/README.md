# CAP-Adapter

The CAP adapter provides an example of how to injest Common Alert Protocol (CAP) messages as geoevents.

# Prerequisits
The cap adapter requires an ArcGIS Runtime for Java 10.1.1 license to run.

## Instructions

### General Help

* [New to Github? Get started here.](http://htmlpreview.github.com/?https://github.com/Esri/esri.github.com/blob/master/help/esri-getting-to-know-github.html)

## Getting Started
1. The path to the repository in the module's pom.xml may need to be modified to point at Systems folder in the geoevent server install location.  In the example below the repo points to the default location of the systems folder.
 
 ```
<repository> 
  <id>GEP</id>
  <name>GeoEvent Processor embedded repository</name>
  <layout>default</layout>
  <url>file:///Program Files/ArcGIS/Server/GeoEventProcessor/System</url> 
</repository>
```

### Building just the CAP-Adapter
 
1. navigate to the ./solutions-geoevent-java/solutions-geoevent/adapters/CAP-adapter directory on the command prompt
2. type mvn install at the prompt and hit return
3. Browse to ./solutions-geoevent-java/solutions-geoevent/adapters/CAP-adapter/target (this directory is created when you execute mvn install).
4. Copy the CAP-Adapter-10.2.0.jar file and paste it into the deploy directory on your GeoEvent server (<GeoEventServer install location>\deploy\ -- default location is C:\Program Files\ArcGIS\Server\GeoEventProcessor\deploy)
 
### Validating Install
 
1. Browse to the 'Site' tab in GeoEvent Service manager
2. Click on the 'Adapters' tab and you should see the CAP-adapter as one of the available input adapters

