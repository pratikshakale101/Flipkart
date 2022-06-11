Feature: Successful login into application

 Scenario: Positive test scenario Login
   Given Initialize the browser with chrome
   And Navigate to "https://www.flipkart.com/" Site
   And Click on Login link in home page to land on Secure login in Page
   When User enters <Email> and <Password> and logs in
   Then Verify that user is succesfully logged in 
   And close browsers

Examples:
|Email                      |Password      | 
|pratikshakale0707@gmail.com| Unipune@0707 | 


    
