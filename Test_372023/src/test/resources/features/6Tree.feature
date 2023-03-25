

Feature: graph
  I want to use this template for my feature file

Background: The user is on graph page	
	 	Given The user is on tree home page
   
   @tagTree1 @tagTree
   Scenario: The user is able to navigate to overview of trees page
   When The user clicks overview of trees link on tree page
   Then The user should be redirected to overview of trees page
   
   @tagTree2 @tagTree
   Scenario: The user should be directed to editor page with run button to test python code
   When The user clicks overview of trees link on tree page
   Then The user should be redirected to overview of trees page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
      
   @tagTree3 @tagTree
   Scenario: The user is able to run code in Editor for overview of trees page
   When The user clicks overview of trees link on tree page
   Then The user should be redirected to overview of trees page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters valid python code in Editor from tree page
   And Clicks run button after valid code
   Then The user is presented with the result after run button is clicked
   
   @tagTree4 @tagTree
   Scenario: The user is presented with error message for invalid code in Editor for overview of trees page
   When The user clicks overview of trees link on tree page
   Then The user should be redirected to overview of trees page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters invalid python code in Editor from tree page
   And Clicks run button after invalid code
   Then The user gets an error message
   
 
 
 
 
 
 
 
 
 @tagTree5 @tagTree
   Scenario: The user is able to navigate to terminologies page
   When The user clicks terminologies link on tree page
   Then The user should be redirected to terminologies page
   
   @tagTree6 @tagTree
   Scenario: The user should be directed to editor page with run button to test python code
   When The user clicks terminologies link on tree page
   Then The user should be redirected to terminologies page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
      
   @tagTree7 @tagTree
   Scenario: The user is able to run code in Editor for terminologies page
   When The user clicks terminologies link on tree page
   Then The user should be redirected to terminologies page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters valid python code in Editor from tree page
   And Clicks run button after valid code
   Then The user is presented with the result after run button is clicked
   
   @tagTree8 @tagTree
   Scenario: The user is presented with error message for invalid code in Editor for terminologies page
   When The user clicks terminologies link on tree page
   Then The user should be redirected to terminologies page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters invalid python code in Editor from tree page
   And Clicks run button after invalid code
   Then The user gets an error message
   
   @tagTree9 @tagTree
   Scenario: The user is able to navigate to practice questions page
   When The user clicks types of trees link on tree page
   Then The user should be redirected to type of trees page
   When The user clicks on Practice Questions link
   Then The user should be redirected to tree practice questions page
   
