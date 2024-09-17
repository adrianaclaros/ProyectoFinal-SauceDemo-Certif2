Feature: Home page

  Background: User login into Sauce Demo
    Given I am in sauce demo web page

    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario Outline: Verify that all products can be added to the cart
    When The home page should be displayed
    And I add to the cart the product "<products>"
    Then The cart icon should display "1"
    And I remove the product "<products>" from the cart
    Examples:
      | products                |
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |
      | Sauce Labs Onesie       |

#redes sociales
  #deberia pasar el test
  Scenario Outline: Verify that all Social Media Links are working
    When I want to enter a Sauce Demo social network
    And I locate the "<socialMedia>" link
    And I click on the "<socialMedia>" link
    Then I should be redirected to the Sauce Labs "<socialMedia>" page
    Examples:
      | socialMedia |
      | Twitter     |
      | Facebook    |
      | LinkedIn    |

#sistema de ordenamiento
  #deberia pasar el test
  @run
  Scenario: Verify if the order of products is from Z to A
      When I want to search for products according to an order
      Then I locate the ordering system
      And I click on the ordering system from "Z to A"
      Then I click on the ordering system from "Z to A"

