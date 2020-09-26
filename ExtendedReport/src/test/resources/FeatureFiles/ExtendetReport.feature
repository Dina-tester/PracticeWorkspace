Feature: Verifying adactin Hotel booking

  Scenario Outline: Verifying adactin login page
    Given User is on Adactin login Page
    When User enter the "<username>" and "<password>"
    Then user enter the loginButton

    Examples: 
      | username | password   |
      | dina2311 | D@12345678 |
