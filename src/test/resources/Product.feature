Feature: Product scenarios

  Scenario Outline: Validate product info on Products page

    Given I'm logged in
    Then the product is listed with title "<title>" and price "<price>"
    Examples:
      | title                    | price     |
      | sauce Labs Bolt T-Shirt  | $15.99    |

  Scenario Outline: Validate product info on Products Details page

    Given I'm logged in
    When I click product title "<title>"
    Then I should be on product details page with title "<title>", price "<price>" and description "<description>"
    Examples:
      | title               | price | description |
      | sauce Labs Backpack | 29.99 |  carry      |
