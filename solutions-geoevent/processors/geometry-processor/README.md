# geometry processor
The geometry processor demonstrates how to extend geoevent server to build processors that manipulate the geometry of a geoevent service.
Multiple processors are included in the geometry-processor jar.  
* Buffer Processor: convert the geoevent geometry to a buffer around the incoming event
* Ellipse Processor: convert the geoevent geometry to an ellipse centered on the incoming event geometry
* Rangefan Processor: convert the geoevent geometry to a rangefan with an origin at the incoming event geometry
* Visibility Processor: Generate a viewshed with an observer located at the incoming geoevent geometry.  The visibility processor also allows the user to clip the viewshed to a polygon.
* Query Report Processor: Executes a spatial query on feature services registered in the geoevent server's datastore.  The author of the service then configures a report based on returned features.

1. The path to the repository in the module's pom.xml may need to be modified to point at Systems folder in the geoevent server install location.  In the example below the repo points to the default location of the systems folder.

```
<repository> 
  <id>GEP</id>
  <name>GeoEvent Processor embedded repository</name>
  <layout>default</layout>
  <url>file:///Program Files/ArcGIS/Server/GeoEventProcessor/System</url> 
</repository>
```
