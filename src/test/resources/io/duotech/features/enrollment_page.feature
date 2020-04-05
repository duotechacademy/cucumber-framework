Feature: Verify enrollment feature


Scenario: Verify Enrollment page title
Given The user is on homepage
When The user clicks on enroll button
Then The title of the page should be Enroll | duotech


Scenario: Verify the enrollment date
Given The user is on homepage
When The user clicks on enroll button
Then The correct message should be there 
#SQAE Summer (06.02.2020)
