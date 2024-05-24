Feature: Customer initial deposit

  Scenario: Clear Account Balance status
    Given the User is on the homepage
    When the User Clicks the Customer Login Button
    And the User Clicks Dropdown List
    Then the User Selects <yourName>
    And the User Clicks on Login Button
    Then Welcome <yourName> !! message is displayed
    And User Clicks on Account Dropdown List
    And Selects Account number
    Then User verifies account balance
