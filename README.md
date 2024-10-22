# README - Cars and Tunnels pt. 1

This program implements a traffic control system for vehicles (cars and sleds) sharing a system of tunnels. There are constraints on which vehicles can be in a tunnel at any given time. The implementation uses Java Threads to represent the vehicles, and the Java default synchronized methods and busy waiting to enforce tunnel constaints. This program was submitted as an assignment for an Operating Systems class. As instructed, only the CarsTunnels package was edited to complete the assignment. All other packages/files outside of it were not edited in any way or changed from the original files provided. 

## Installation and Execution 

This project contains no main method and relies only on the JUnit tests provided from the class. The JUnit files to use for testing are BehaviorTest and SimulationTest. 

## Tunnel Constraints 

The Tunnel class being implemented abides by the following constraints: 

* Each tunnel only has one lane so all vehicles traveling on one must be heading in the same direction 
* Only 3 cars can be in a tunnel at any given time 
* Only 1 sled can be in a tunnel at any given time 
* Cars and sleds can't share a tunnel 