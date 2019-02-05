This is brief presentaion of BDD test for google search as example.

The test architecture consists of two main part:

I. /src/test/java/BDDTestingOfGoogle  <- there is contains test scenario(features), definition of steps, runner and hooks.

II. /src/main/java/BDDTestingOfGoogle/pageobjects/ <- there is contains pageobjects classes. 

I part has 3 folders: 
  1. features <- there is contains test scenario. 
  2. runner < - there is contains configuration for run test cases.
  3. steps <- there is contains test steps and hooks. 
  
II part consists of next typical classes and intarfaces:
  1. NameOfElement <- custom annotation of web elemets;
  2. AbstractPage <- class there is nameOfElements definited. This class is inherited by classes which describe web elements.
  3. And several classes with definition web elements for each web page which are using in the test. 
  

