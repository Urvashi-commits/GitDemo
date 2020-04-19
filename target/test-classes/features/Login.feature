Feature: Application Login

@RegTest
Scenario: Udemy Home page default login 
Given User is on Udemy Landing Page
When User login into application with "jin" and Password "1234"
Then Home page must be displayed
And Courses displayed are "true" 

@RegTest
Scenario: Udemy Home page default login 
Given User is on Udemy Landing Page
When User login into application with "john" and Password "4321"
Then Home page must be displayed
And Courses displayed are "false"
 
@SanityTest
Scenario: Udemy Home page default login 
Given User is on Udemy Landing Page
When User sign up with following details
| Jennifer | abcd | jennifer@1234 | Australia | 356685|
Then Home page must be displayed
And Courses displayed are "false"

@SanityTest
Scenario Outline: Udemy Home page default login 
Given User is on Udemy Landing Page
When User login in to application with <Username> and password <password>
Then Home page must be displayed
And Courses displayed are "false"

Examples:
|Username| password|
|user1   | pass1   |
|user2   | pass2   |
|user3   | pass3   |
|user4   | pass4   |

