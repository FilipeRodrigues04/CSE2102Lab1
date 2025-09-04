# CSE2102Lab1

## Overview
This lab implements a `HybridVehicle` class that combines both gasoline and electric vehicle efficiency calculations.  
Two interfaces are defined: `GasolineInterface` and `ElectricInterface`.  
The `HybridVehicle` class implements both interfaces and provides methods to calculate:
- Gas MPG
- Electric MPGe
- Hybrid average MPG

JUnit tests are included to verify correctness.

## Project Structure
c/ → main code
GasolineInterface.java
ElectricInterface.java
HybridVehicle.java
CarRunner.java
u/ → tests
HybridVehicleTest.java
junit-4.13.2.jar, hamcrest-core-1.3.jar → JUnit libraries

## How to Build
Compile all source and test files:
'''bash
javac -cp junit-4.13.2.jar ./c/*.java ./u/*.java

## How to Run
'''bash
java -cp "./" c.CarRunner

Expected Output:
MPG (gas) = 20.0
MPGe (Electric) = 144.42857142857144
Hybrid avg MPG = 82.21428571428572

## How to Run Tests
'''bash
java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:./" org.junit.runner.JUnitCore u.HybridVehicleTest

Expected Output:
JUnit version 4.13.2
...
Time: 0.01

OK (3 tests)

## Description
In this lab I built two interfaces (GasolineInterface, ElectricInterface) and one class (HybridVehicle) that implements both. The class calculates gas MPG, electric MPGe, and the hybrid average. I wrote a driver program (CarRunner) to demonstrate the calculations, and JUnit tests (HybridVehicleTest) to automatically check the results. The code compiles and all tests pass.
