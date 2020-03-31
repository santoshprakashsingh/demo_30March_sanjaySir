Feature: Myntra Login test

@MyntraLogin
Scenario: Myntra login page login scenario
Given User is on Myntra login page
When When User enter the Username and Password in Myntra
Then User click on the submit button in Myntra
And User is able to see Myntra page

@MyntraLogin
Scenario: Myntra login page login scenario by passing user id and password
Given User  on Myntra login page
When When User enter  "santosh123@gmail.com" and "55@123" 
Then User click  submit button in Myntra
And User is able to view Myntra page


@SecondTestScenario
Scenario: Myntra login page login scenario by Data Table
Given User  on Myntra login page
When When User enter  username and password
|prakashbabu@gmail.com      |s1ap@12345|
Then User click  submit button in Myntra
And User is able to view Myntra page

@SecondTestScenario
Scenario Outline: Myntra login page login scenario by Example
Given User  on Myntra login page
When When User enter  "<username>" and "<password>" 
Then User click  submit button in Myntra
And User is able to view Myntra page
Examples:
|username               |password|
|prakash@gmail.com      |sap@12345|
|prakash123@gmail.com   |sap@12345|
|prakash234@gmail.com   |sap@12345|
|prakash345@gmail.com   |sap@12345|
|praka124324sh@gmail.com|sap@12345|