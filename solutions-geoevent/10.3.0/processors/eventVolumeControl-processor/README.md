# Event Volume Control

![Image of Event Volume Control]evcProcessor.PNG

## Features 


* Event Volume Control - The event volume control processor limits the number of events received in a period of time to a user defined threshold - dropping all other events or limits the number of events of a given track-id to a user defined threshold


## Sections

* [Requirements](#requirements)
* [Building](#building)
* [Installation](#installation)
* [Testing](#testing)
* [Licensing](#licensing)

## Requirements

* See common [solutions-geoevent-java requirements](../../../README.md#requirements).
* The ArcGIS Runtime for Java SDK is required in order to run the standalone Maven Tests included with this project.

## Building 

* See the [solutions-geoevent-java instructions](../../../README.md#instructions) for general instructions on 
    * verifying your Maven installation
    * setting the location of GeoEvent Processor and GeoEvent Processor SDK repositories
    * and any other common required steps
* Open a command prompt and navigate to `solutions-geoevent-java/solutions-geoevent/processors/eventVolumeControl-processor`
    * Enter `mvn install` at the prompt.

## Installation

* Install the Event Volume Control.
    * Browse to `solutions-geoevent-java/solutions-processors/eventVolumeControl-processor/target` (this directory is created when you execute mvn install).
    * Copy the .jar file and paste it into the deploy folder in the GeoEvent Processor install directory ([GeoEvent Processor install location]\deploy\ -- default location is C:\Program Files\ArcGIS\Server\GeoEventProcessor\deploy).


## Testing

### Validating the Installation
 
* See the [solutions-geoevent-java validation instructions](../../../README.md#validating-install).
    * Ensure the Event Volume Control exists.

### Testing with Simulated Test Data

* In the following steps you will configure GeoEvent Processor to receive and process simulated data.
* The following example configures the Event Volume Control, the other processors can be configured in a similar manner.

* Open GeoEvent Processor Manager.
* Create an Input Connector to receive simulated data over TCP.
    * Navigate to ‘Site’ > ‘Services’ > 'Inputs'.
    * Click Add Input and select 'Receive text from a TCP Socket' and configure as illustrated below.

![Image of create connector](doc/geometry-input.png)

* Next, create an Output Connector to observe the received data.
    * Navigate to ‘Site’ > ‘Services’ > 'Outputs'.
    * Select Add Input and select 'Write to a json file' and configure the properties.
* Create a simple GeoEvent Service to direct the input data to the output using the selected processor.
    * An example GeoEvent Service and processor configuration is illustrated below.

![Image of service](doc/evc-simple-service.png)

* In GeoEvent Processor Manager, navigate to ‘Services’ > ‘Monitor’ and observe the GeoEvent Processor components, they should be similar to the illustration below (note: your names/outputs may differ).

![Image of monitor](doc/monitor.png)

* Using the GeoEvent Simulator, load the simulation file located at  solutions-geoevent-java\data\simulation_files\geometry.csv
* In GeoEvent Processor Manager, navigate to 'Services' > 'Monitor' to observe that the values are increasing and the selected outputs are updated. 
* You can now test the processors with additional outputs such as published feature services.

## Licensing

Copyright 2013 Esri

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
[license.txt](../../../license.txt) file.

