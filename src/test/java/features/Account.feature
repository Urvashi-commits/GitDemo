Feature: Application Login

Background:
Given Validate the browser
When Browser is triggered
Then check if browser is started

@SmokeTest
Scenario: Udemy Home page default login 
Given User is on Udemy Landing Page
When User login into application with "jin" and Password "1234"
Then Home page must be displayed
And Courses displayed are "true" 
