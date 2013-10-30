1. The path to the repository in the module's pom.xml may need to be modified to point at Systems folder in the geoevent server install location.  In the example below the repo points to the default location of the systems folder.
```
<repository> 
  <id>GEP</id>
  <name>GeoEvent Processor embedded repository</name>
  <layout>default</layout>
  <url>file:///Program Files/ArcGIS/Server/GeoEventProcessor/System</url> 
</repository>
```
