Feature: login to the Sausedemo

    Scenario: Postive Test
      Given User launch chrome browser
      When user opens URL "https://www.saucedemo.com/v1/"
      And User enter email as "standard_user" and Password as "secret_sauce"
      And click on login
      Then page title should be "Swag Labs"
      And close the browser
