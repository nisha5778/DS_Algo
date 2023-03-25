
Feature: Title of your feature
  I want to use this template for my feature file

  @Tag1 @TS_001
  Scenario: User launch home page of an dsalgo project
	Given The user opens DS Algo portal link
	When The user clicks the Get Started button
	Then The user should be redirected to homepage
  
  @Tag1 @TS_003
	Scenario: User is on Home page and click getstarted link on home page without sign in
	Given The user opens DS Algo portal link
	When The user clicks the Get Started button
	When The user clicks on Get Started link on homepage without login
	Then The user gets warning message "You are not logged in"
	
	@Tag1 @TS_004
	Scenario: User is on Home page and click on dropdown without sign in
	Given The user opens DS Algo portal link
	When The user clicks the Get Started button
	And The user clicks on dropdown "Stack" without login
	Then The user gets warning message "You are not logged in"
	
	@Tag1 @TS_006
	Scenario: User is on Home page and click on Register
	Given The user opens DS Algo portal link
	When The user clicks the Get Started button
	When The user clicks Register link
	Then The user should be redirected to Register form "https://dsportalapp.herokuapp.com/register"
	
	@Tag1 @TS_005
	Scenario: User is on Home page and click on sign in
	Given The user opens DS Algo portal link
	When The user clicks the Get Started button
	When The login link is clicked
	Then The user should be redirected to Sign in page "https://dsportalapp.herokuapp.com/login"
	
	@Tag1 @TS_002
  Scenario: check login functionality
	Given The user opens DS Algo portal link
	When The user clicks the Get Started button
	When The login link is clicked
  When user enters user name
  And user enters password
  Then click on login button
  