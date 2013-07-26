defense_geoevent_dev
====================

repository for defense team's geoevent server development

To install the compiled adapter, copy the geomessage-adapter-10.2.0.jar file in the ./defense-adapter/target directory and paste into your <Geoevent Server Install>\deploy directory.
prereqs for building from source
download and install geoevent server sdk
follow sdk documentation to set up maven repository

the pom.xml may need modification to point to the geoevent server sdk repository. Search for the repository tag in pom.xml and modify the url propery to point to the sdk.  See example below:
```
<repository> 
  <id>ages-sdk-repo</id> 
  <url>file:///geoevent-sdk-10.2.0/repository</url> 
</repository>
```
In the example above the url points to the sdk on a local machuine at the path:

C:\geoevent-sdk-10.2.0\repository
