@chrome
  Feature: Homepage of google account
    Scenario Outline: As a user i want to create google account page so that i can access the application
      Given I am in homepage "https://accounts.google.com/signup/v2"
      When I type "<firstname>"
      And I type "<lastname>" last
      And I type "<emailAddress>" email
      And I type "<password>" pass
      And I type "<reEnterPassword>" re
      And I click on checkbox
      And I click on next
      And I verify the "<phonenumber>"
      And I click on next again
      Then I verify the <status> in step
      Examples:
      |firstname|lastname|emailAddress|password|reEnterPassword|phonenumber|
      |charles  |Harries |charles0971237866768|tt@14589|tt@14589|3472452978|