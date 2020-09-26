Feature: To verify Adactin Hotel Website

  Scenario Outline: To verify Hotel Booking Pages
    Given User on the Adactin page
    When User enter the "<username>" and "<password>"
    And User to fill the search hotel detail Page
    And user should select the hotel
    Then user should fill the Book a hote page
    

    Examples: 
      | username | password   |
      | dina2311 | D@12345678 |