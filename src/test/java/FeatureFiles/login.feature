Feature: Login function for orange HRM website


  Scenario Outline: TC_001 Valid login for orange HRM
    Given user is on the login page
    And user enters "<username>" and "<password>"
    And user clicks the login button

    Examples:


      | username | password  |
      | user     | admin     |
      | Admin    | admin123  |




