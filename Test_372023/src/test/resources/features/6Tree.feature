
@tagTree
Feature: graph
  I want to use this template for my feature file

Background: The user is on graph page	
	 	Given The user is on tree home page
   
   @tagTree1 @tagTree
   Scenario: 
   Given The user opens DS Algo portal link
		When The user clicks the Get Started button
		When The login link is clicked
		When user enters user name
		And user enters password
		Then click on login button
		When The user clicks the tree item from the drop down menu
	  Then The user should be redirected to tree page
  
   @tagTree2 @tagTree
   Scenario: The user is able to navigate to overview of trees page
   When The user clicks overview of trees link on tree page
   Then The user should be redirected to overview of trees page
   
   @tagTree3 @tagTree
   Scenario: The user should be directed to editor page with run button to test python code
   When The user clicks overview of trees link on tree page
   Then The user should be redirected to overview of trees page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
      
   @tagTree4 @tagTree
   Scenario: The user is able to run code in Editor for overview of trees page
   When The user clicks overview of trees link on tree page
   Then The user should be redirected to overview of trees page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given  The user is in a page having an Editor with a Run button to test
   When The user enters valid python code in Editor
   And Clicks run button after valid code
   Then The user is presented with the result after run button is clicked
   
   @tagTree5 @tagTree
   Scenario: The user is presented with error message for invalid code in Editor for overview of trees page
   When The user clicks overview of trees link on tree page
   Then The user should be redirected to overview of trees page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters invalid python code in Editor
   And Clicks run button after invalid code
   Then The user gets an error message
   
 
 
 
 
 
 
 
 
 @tagTree6 @tagTree
   Scenario: The user is able to navigate to terminologies page
   When The user clicks terminologies link on tree page
   Then The user should be redirected to terminologies page
   
   @tagTree7 @tagTree
   Scenario: The user should be directed to editor page with run button to test python code
   When The user clicks terminologies link on tree page
   Then The user should be redirected to terminologies page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
      
   @tagTree8 @tagTree
   Scenario: The user is able to run code in Editor for terminologies page
   When The user clicks terminologies link on tree page
   Then The user should be redirected to terminologies page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters valid python code in Editor
   And Clicks run button after valid code
   Then The user is presented with the result after run button is clicked
   
   @tagTree9 @tagTree
   Scenario: The user is presented with error message for invalid code in Editor for terminologies page
   When The user clicks terminologies link on tree page
   Then The user should be redirected to terminologies page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters invalid python code in Editor
   And Clicks run button after invalid code
   Then The user gets an error message
