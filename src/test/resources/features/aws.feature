#Author: jeacevedo92@utp.edu.co

@Login
Feature: Make login in the aws account
  As an aws User
  I want to make Login in the aws account



  @loginSuccessfull
  Scenario Outline: Login successfull
    Given that <actor> is a aws user
    When He Login aws account with <AccountId>, <UserName> and <Password>
    Then Login is successfull
    Examples:
      |actor|AccountId    |UserName   |Password   |
      |Jhon |753351468442 |jhonacevedo|xxxxxxxxxxx|

  @loginWinthOutAccountiD
  Scenario Outline: Login without Account ID
    Given that <actor> is a aws user
    When He Login aws account with <AccountId>, <UserName> and <Password>
    Then Account Id Alert should be displayed
    Examples:
      |actor|AccountId    |UserName   |Password   |
      |Jhon |             |jhonacevedo|xxxxxxxxxx |

  @loginWithOutUserName
  Scenario Outline: Login without UserName
    Given that <actor> is a aws user
    When He Login aws account with <AccountId>, <UserName> and <Password>
    Then UserName field must be required
    Examples:
      |actor|AccountId    |UserName   |Password  |
      |Jhon |753351468442 |           |xxxxxxxxxx|

  @loginWithOutPassword
  Scenario Outline: Login without UserName
    Given that <actor> is a aws user
    When He Login aws account with <AccountId>, <UserName> and <Password>
    Then Password field must be required
    Examples:
      |actor|AccountId    |UserName   |Password  |
      |Jhon |753351468442 |jhonacevedo|          |

  @loginWithIncorrectData
  Scenario Outline: Login without UserName
    Given that <actor> is a aws user
    When He Login aws account with <AccountId>, <UserName> and <Password>
    Then Error message should be displayed
    Examples:
      |actor|AccountId    |UserName   |Password     |
      |Jhon |753351468442 |jhonacevedo|passincorrect|