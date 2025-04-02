Feature: Add Contract

  As a user, I want to add a new contract so that it can be managed and tracked in the system.

  Scenario Outline: Successfully add a new contract
    Given User has successfully logged In with valid credentials
    Then User is on Landing to select '<Tenant>'
    And User is directed to dashboard and click '<Contract>' Button
    Then User click the '<AddContract>' button
    And I fill in the contract details '<ContractName>', '<DeliveryType>','<Quantity>'.
    And AddONE '<StartsOnDate>','<EndOnDate>','<NumberofLoads>','<AverageLoad>','<TripsRequired>'.
    And AddTWO '<ReferenceNumber>','<ContractCurrency>','<ContractValue>','<Notes>'.
    And AddTHREE '<Customer>','<PaymentTerm>', '<ProductDescription>','<Route>'.
    Then I click Contract Save button

    Examples:
      | ContractName | DeliveryType        | Quantity | StartsOnDate | EndOnDate | NumberofLoads | AverageLoad | TripsRequired | ReferenceNumber | ContractCurrency | ContractValue | Notes        | Customer | PaymentTerm | ProductDescription | Route |
      | Contract A    |Fast without insurance|10        |2025-03-09 |2025-03-09|10             |5             |2               |Test01            |Angolan Kwanza     |10              |Ishmael Direro|Paul Jacobs|Cash in advance|Testing            |DBN_KOL_Swift|
