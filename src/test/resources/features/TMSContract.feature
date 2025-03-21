Feature: Add Contract

  As a user, I want to add a new contract so that it can be managed and tracked in the system.

  Scenario Outline: Successfully add a new contract
    Given User has loged In
    And User click Contract Contacts on dashboard

    When I click the Add Contract button
    And I fill in the contract details '<Contract Name>', '<Delivery Type>','<Quantity>'.
    And Add '<Starts On>','<End On>','<Number of Loads>','<Average Load>','<Trips Required>'.
    And Add '<Reference Number>','<Contract Currency>','<Contract Value>','<Notes>'.
    And Add '<Customer>','<Payment Term>', '<Product Description>','<Route>'.
    Then I click "Save" button
    Examples:
      | Contract Name | Delivery Type        | Quantity | Starts On | End On | Number of Loads | Average Load | Trips Required | Reference Number | Contract Currency | Contract Value | Notes        | Customer | Payment Term | Product Description | Route |
      | Contract A    |Fast without insurance|10        |2025-03-09 |2025-03-09|10             |5             |2               |Test01            |Angolan Kwanza     |10              |Ishmael Direro|Paul Jacobs|Cash in advance|Testing            |DBN_KOL_Swift|
