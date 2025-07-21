Feature: Account Creation in Saleforce
	
Scenario: Create and verify the account in salesforce
    Given User launch the browser
    And user loads the url
    When user enters the username
    And user enters the password
    And user clicks the Login button
    Then user navigates to home page
    And user clicks the toggle button
    And user clicks view all
    Then user clicks sales from the App launcher
    And user clicks on Accounts tab
    And user clicks on New tab
    And user enter name
    And user select ownership as public
    And user clicks save
    Then user verify the account name
        