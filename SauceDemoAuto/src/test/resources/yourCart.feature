#Feature: Edit product quantities in the cart


 # Background: User login into Sauce Demo
  #  Given I am in sauce demo web page, I go to Your Cart

#Editar la unidad de los productos
#  Scenario: Verify if the quantity of products can be edited in the cart
 #   Given The cart page is displayed
  #  And I add "Sauce Labs Backpack" to the cart
   # When I increase the quantity of "Sauce Labs Backpack" to "2"
   # Then The cart should display "2" items for "Sauce Labs Backpack"


#Hacer Checkout sin productos añadidos
 # @run
  #Feature: Checkout without products

#  Scenario: Check if you can checkout if no products were added to the cart
 #   Given I am in sauce demo web page
  #  And The cart page is displayed
   # When you click the "Checkout" button of "Your Cart"
    #Then you should not enter "Checkout: Your Information"

