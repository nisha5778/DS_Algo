

Feature: graph
  I want to use this template for my feature file

Background: The user is on graph page
	 Given The user is on data structures home page
   
   
  
   @tagDS1 @tagDS
   Scenario: The user is able to navigate to time complexity page
   When The user clicks time complexity link on data structures page
   Then The user should be redirected to time complexity page
   
   @tagDS2 @tagDS
   Scenario: The user should be directed to editor page with run button to test python code
   When The user clicks time complexity link on data structures page
   Then The user should be redirected to time complexity page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   
   @tagDS3 @tagDS
   Scenario: The user is able to run code in Editor for time complexity page
   When The user clicks time complexity link on data structures page
   Then The user should be redirected to time complexity page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters valid python code in Editor from time complexity page
   And Clicks run button after valid code
   Then The user is presented with the result after run button is clicked
   
   @tagDS4 @tagDS
   Scenario: The user is presented with error message for invalid code in Editor for time complexity page
   When The user clicks time complexity link on data structures page
   Then The user should be redirected to time complexity page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters invalid python code in Editor from time complexity page
   And Clicks run button after invalid code
   Then The user gets an error message
   
   @tagDS5 @tagDS
   Scenario: The user is able to navigate to practice questions page
   When The user clicks time complexity link on data structures page
   Then The user should be redirected to time complexity page
   When The user clicks on Practice Questions link
   Then The user should be redirected to data strcuctures practice questions page
   