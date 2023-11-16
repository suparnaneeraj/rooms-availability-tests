# rooms-availability-tests
This is a simple Maven project to automate the end to end testing of the room occupancy functionality.The test verifies the number of occupied premium and economy rooms along with the total amount earned by the hotel for the respective room category.This project is designed to follow a Behaviour Driven Development Approach (BDD) using Cucumber , the browser interactions are simulated using Selenium WebDriver ,the scripting is done using Java programming language and the testing framework used is JUnit. This approach is chosen to provide a simple framework where the test cases are written in simple English with multiple examples .The design uses a Page Object Model approach making the implementation reusable.

##Project folder and structure
-The test cases or features are stored in the features folder.
-The configs folder contains the properties file which includes few parameters required to run the test.
-The test implementation(step definition file) and the runner class are defined in src/test/java/automation/roomOccupancy
-All the locators and its operations are included in the respective classes defined in src/test/java/pages
-The webdriver operations and configuration class are stored in src/test/java/utility folder
-Reporting is done using inbuilt Cucumber options .The html test report is saved in target/cucumber folder

##Pre-requisites
-Eclipse IDE or any suitable IDE with Cucumber plugin installed
-JDK 17 or any compatible version
-Apache maven 3.8.1 or any compatible version
-Ensure system variables JAVA_HOME and MAVEN_HOME are correctly configured.

##Running the tests
-Clone and checkout the git repository.
-Import the project as Maven (Import->Existing Maven project) in Eclipse or any suitable IDE.
-Right click on the file RoomOccupancyTests.java inside src/test/java/automation/roomOccupancy and Choose Run as JUnit Test, if JUnit Test is already configured or else, choose Run as -> RunConfiguration -> Select JUnit -> Under option Run all tests in selected folder , choose the folder containing tests -> Apply -> Run .
-The application url is currently pointing to "http://localhost:3004" , this value is provided as a property(url) in file configs/configurationFile.properties. Provide the url specific to the system used.

##Improvements
-Currently the test is verified only in the Chrome browser. The test is partially implemented to support Firefox and Edge browser but is not functional.
-Refactoring and Code scalability
-External reporting library can be used for generating html report.
-Currently the test has to be run manually , but this can be automated using a CI/CD pipeline.

