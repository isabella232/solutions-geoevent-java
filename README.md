solutions-geoevent-java 
====================

![Image of geomessage-adapter](Images.JPG "solutions-geoevent-java")

repository for solution team's geoevent server development

To install the compiled adapter, copy the geomessage-adapter-10.2.0.jar file in the ./defense-adapter/target directory and paste into your ``<Geoevent Server Install>\deploy`` directory.

prereqs for building from source



# Prerequisites
1. Install ArcGIS geoevent server
2. download and install geoevent server sdk (sdk included with geoevent server instalation)
3. follow sdk documentation to set up maven repository
4. Install the ArcGIS Java Runtime 10.1.1 sdk
5. Individual modules may need modifications.  Please refer to the read me before building the toplevel pom.xml
6. Clone the solutions-geoevent-java repository


## Instructions

### General Help

* [New to Github? Get started here.](http://htmlpreview.github.com/?https://github.com/Esri/esri.github.com/blob/master/help/esri-getting-to-know-github.html)

## Getting Started


Building All Adapters and Processors
 
1. From a command prompt go to the ./solutions-geoevent-java/solutions-geoevent directory
2. Type mvn install at the prompt and hit return
3. Each Adapter and processor module will now have a target folder (see each module's readme.md for exact path)
3. Browse to each target directory 
4. Copy the copy the .jar file paste it into the deploy directory on your GeoEvent server (<GeoEventServer install location>\deploy\ -- default location is C:\Program Files\ArcGIS\Server\GeoEventProcessor\deploy)
 
### Validating Install
 
1. Browse to the 'Site' tab in GeoEvent Service manager
2. Click on the 'Adapters' tab and you should see each installed adapter as one of the available adapters
3. Click on the 'Processors' tab (from the 'Site' tab) and you should see each installed processor as one of the available processors

## Resources

* Learn more about Esri's [ArcGIS for the Military](http://solutions.arcgis.com/military/).
* Learn more about Esri's[ArcGIS GeoEvent Processor for Server Resource Center](http://pro.arcgis.com/share/geoevent-processor/)
* Learn more about Esri's[ArcGIS Blog](http://blogs.esri.com/esri/arcgis/)
* Learn more about [twitter@esri](http://twitter.com/esri)

## Issues

Find a bug or want to request a new feature?  Please let us know by submitting an issue.

## Contributing

Esri welcomes contributions from anyone and everyone. Please see our [guidelines for contributing](https://github.com/esri/contributing).

## Licensing

Copyright 2012-2013 Esri

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   [http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

A copy of the license is available in the repository's
[license.txt](license.txt) file.
