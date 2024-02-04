Feature: Cart shop

  Scenario: User can move to shopping cart from Add item to shop cart pop-up
    Given user open main page
    And   user open first popular product
    And   user add item to shopping cart
    And   user move to shopping cart from pop-up
    Then  user see shopping cart page is opened
    Then  user see 1 item in shopping cart

  Scenario: User can continue shopping from Add item to shop cart pop-up
    Given user open main page
    And   user open first popular product
    And   user add item to shopping cart
    And   user continue shopping from Add item to shop cart pop-up
    And   user go to main page
    Then  user see banner on main page

  Scenario: User can delete from shopping cart
    Given user open main page
    And   user open first popular product
    And   user add item to shopping cart
    And   user move to shopping cart from pop-up
    Then  user see 1 item in shopping cart
    And   user delete item from shopping cart
    And   user open shopping cart page
    Then  user see shopping cart is empty

  Scenario: User can add few items and make order from shopping cart
    Given user open main page
    And   user open first popular product
    And   user add item to shopping cart
    And   user continue shopping from Add item to shop cart pop-up
    And   user go to main page
    And   user open one more item
    And   user add item to shopping cart
    And   user continue shopping from Add item to shop cart pop-up
    And   user open shopping cart page
    Then  user see 2 item in shopping cart
    And   user proceed to checkout
    And   there was order details created
    And   user set first name in personal info block
    And   user set last name in personal info block
    And   user set email in personal info block
    And   user confirm agreements
    And   user click continue button in personal info block
    And   user set address
    And   user set Postal code
    And   user set city
    And   user click continue button in address info block
    And   user choose free delivery
    And   user click continue button in delivery info block
    And   user choose pay by check
    And   user confirm terms of service agreement
    And   user click place order button
    Then  user see order status as "Your order is confirmed"
