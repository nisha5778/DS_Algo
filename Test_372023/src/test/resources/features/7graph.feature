

Feature: graph
  I want to use this template for my feature file

Background: The user is on graph page
	 Given The user is on graph home page
   
   @tagGraph1 @tagGraph
   Scenario: The user is able to navigate to Graph page
   When The user clicks Graph link on Graph page
   Then The user should be redirected to Graph Graph page
   
   @tagGraph2 @tagGraph
   Scenario: The user should be directed to editor page with run button to test python code
   When The user clicks Graph link on Graph page
   Given The user navigates to Graph-Graph page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   
   @tagGraph3 @tagGraph
   Scenario: The user is able to run code in Editor for Graph page
   When The user clicks Graph link on Graph page
   Given The user navigates to Graph-Graph page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters valid python code in Editor from graph page
   And Clicks run button after valid code
   Then The user is presented with the result after run button is clicked
   
   @tagGraph4 @tagGraph
   Scenario: The user is presented with error message for invalid code in Editor for Graph page
   When The user clicks Graph link on Graph page
   Given The user navigates to Graph-Graph page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters invalid python code in Editor from graph page
   And Clicks run button after invalid code
   Then The user gets an error message
   
   @tagGraph5 @tagGraph
   Scenario: The user is able to navigate to graph page and click on Graph Representations link
   When The user clicks on Graph Representations link
   Then The user should be redirected to Graph Representations page
   
   @tagGraph6 @tagGraph
   Scenario: The user should be directed to editor page with run button to test python code from Graph Representations page
   When The user clicks on Graph Representations link
   Then The user should be redirected to Graph Representations page	
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   
   @tagGraph7 @tagGraph
   Scenario: The user is able to run code in Editor for Graph Representations page
   When The user clicks on Graph Representations link
	 Then The user should be redirected to Graph Representations page	
   When The user clicks on Tryhere link
   Given The user is in a page having an Editor with a Run button to test
   When The user enters valid python code in Editor from graph page
   And Clicks run button after valid code
   Then The user is presented with the result after run button is clicked
   
   @tagGraph8 @tagGraph
   Scenario: The user is presented with error message for invalid code in Editor for Graph Representations page
   When The user clicks on Graph Representations link
   Then The user should be redirected to Graph Representations page	
   When The user clicks on Tryhere link
   Given The user is in a page having an Editor with a Run button to test
   When The user enters invalid python code in Editor from graph page
   And Clicks run button after invalid code
   Then The user gets an error message
   
   @tagGraph9 @tagGraph
   Scenario: The user is able to navigate to graph representations page and click on Practice Questions	
   When The user clicks on Graph Representations link
   Then The user should be redirected to Graph Representations page	
   When The user clicks on Practice Questions link
   Then The user is directed to graph Practice questions page