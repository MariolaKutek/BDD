Feature: T-shirts shop

  Scenario: Visit shop
    When I go to website
    Then I can see 16 products

  Scenario: Filters - size S
    And I go to website
    And I can see 16 products
    When I select "S" size
    Then I can see 2 products

  Scenario: Filters - size M
    And I go to website
    And I can see 16 products
    When I select "M" size
    Then I can see 1 products

  Scenario Outline: Filters- all
    And I go to website
    And I can see 16 products
    When I select "<size>" size
    Then I can see <count> products
    Examples:
      | size | count |
      | XS   | 1     |
      | S    | 2     |
      | M    | 1     |
      | ML   | 2     |
      | L    | 10    |
      | XL   | 10    |
      | XXL  | 4     |
