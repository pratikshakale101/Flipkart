Feature: Edit the personal information

Scenario: Positive test scenario of Edit
   Given Initialize the browser with chrome
   And Navigate to "https://www.flipkart.com/" Site on chrome
   And Click on Login link in home page to land on Secure login in Page
   When User enters <Email> and <Password> and logs in
   Then Verify that user is succesfully logged in application
   Then Click on username 
   And Click on My Profile link
   Then Click on Edit link for personal information
   Then clear first and last name
   And Enter <First Name> and <Last Name>
   Then Click on Save link
   And close browsers
   
Examples:
|Email  |Password| First Name| Last Name |
|pratikshakale0707@gmail.com| Unipune@0707 | Pratiksha|Kale|