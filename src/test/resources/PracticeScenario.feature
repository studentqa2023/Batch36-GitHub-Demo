@smoke
Feature: Automation Exercise login testing
Description: write some important requirement/need (optional)
Background: Common step (optional)
Scenario: As a user, I want to login with valid credentials
Given Open the browser
And pass the URL
When Click on Login on Homepage
And Enter "<email>" in the email field

|rezwanislam857@gmail.com|
And Enter "<password>" in the password field

|Boston2023|
And Click on Login
Then Validate login is successful