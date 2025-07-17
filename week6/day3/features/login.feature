Feature: Verify the Login functionality of leaftaps application

Scenario: The user tries to login with valid credentials
When the user enters the username as demosalesmanager
And the user enters the password as crmsfa
And the user clicks the login button

Scenario: The user tries to creat a Lead
When the user enters the username as demosalesmanager
And the user enters the password as crmsfa
And the user clicks the login button
And the user clicks the crmsfa link
And the user clicks the Leadmodule 
And the user clicks the createLeadShortcut
And the user fills the company name
And the user fills the firstname
And the user fills the lastname
And the user fills the phonenumber
And the user clicks the Submit button
And the user verify the created Lead from view leads page