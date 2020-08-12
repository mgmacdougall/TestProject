# TestProject
The following is an example Java, Selenium, JUnit test project

## Overview
The project contains two sub projects:
Framework - that contains all the cods used to run the Tests.  Page models, factories, and utility code for running the tests.
Tests - are the actual tests that use the Framework code to run the tests.


## To Run the Tests
The following instructions are written for Eclipse, and will therefore make reference to that IDE.
1. Install a JDK 1.8.
2. Install Maven and configure for the system
3. Clone this repo
4. Navigate to the location where this repo was cloned
5. Adjust the build paths for the Projects to use the 1.8 JDK - using a JRE will result in errors
6. Select the 'AllTests' under the Tests project to run all the tests, or select an individual test
7. Select 'Run as Junit' to execute the test

Results will be shown inthe Junit Panel.
