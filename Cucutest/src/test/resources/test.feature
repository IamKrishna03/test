@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user enter "valid" username password 
    |name|
    |pass|
    When click on submit
    Then verify msg   
    
    @tag2
     Scenario: Title of your scenario again
  	Given user enter "invalid" username password 
  	|invalid name|
    |invalid pass|
    When click on submit
    Then verify msg
   

