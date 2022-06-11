Feature: Search the Product in search bar

  Scenario: Positive test scenario of Search
    Given Initialize the browser with chrome
    And Navigate to "https://www.flipkart.com/" Site on chrome
    And Click on Login link in home page to land on Secure login in Page
    When User enters <Email> and <Password> and logs in
    Then Verify that user is succesfully logged in application
    Then Click on username
    Then Click on My Orders link
    Then Click on search Bar
    And Enter <ProductName>
    And Click on Search Orders
    Then close browsers

Examples:
|Email                      |Password      | Product Name       |
|pratikshakale0707@gmail.com| Unipune@0707 | SAMSUNG Galaxy F12 |