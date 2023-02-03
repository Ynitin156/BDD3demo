Feature: Test the myhcl login page 

  Scenario: Test the mchcl page with valid crdentials 
    Given open chrome browser and url of the applications
    When  Enter valid login id and password nd click on login button & fill the itimesheet
    Then  succesfully login & itimesheet fill succesfully
    
 