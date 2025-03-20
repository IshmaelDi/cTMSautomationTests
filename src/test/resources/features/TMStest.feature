Feature: Create an Order through the TMS Application as a Driver.

  Scenario Outline: Validate that a user can create an Order successfully.
    Given User has valid data to create an order
    And User logs into the TMS Website
    And User navigates to the "Dashboard" page
    And User clicks the "Create Order" button
    And User fills in the Order Information with:
      | OrderId   | PONumber   | Customer   | Route   | Product   | ProductDesc   | DeliveryType   | Quantity   | SlotTime   |
      | <OrderId> | <PONumber> | <Customer> | <Route> | <Product> | <ProductDesc> | <DeliveryType> | <Quantity> | <SlotTime> |
    When User clicks the "Save" button
    And User navigates to "Edit" mode
    Then User clicks the "Authorize" button

    Examples:
      | OrderId     | PONumber            | Customer             | Route                | Product | ProductDesc                   | DeliveryType | Quantity | SlotTime |
      | OrderId 1st | Product Order 10111 | SIM001 - Simone Sims | 000001 - Zinja Mguni | Product | Order Successfully Created 01 | DeliveryType | 20       | 00:00    |
      | OrderId 2nd | Product Order 10112 | SIM001 - Simone Sims | 000001 - Zinja Mguni | Product | Order Successfully Created 02 | DeliveryType | 10       | 00:00    |
      | OrderId 3rd | Product Order 10113 | SIM001 - Simone Sims | 000001 - Zinja Mguni | Product | Order Successfully Created 03 | DeliveryType | 50       | 00:00    |
      | OrderId 4th | Product Order 10114 | SIM001 - Simone Sims | 000001 - Zinja Mguni | Product | Order Successfully Created 04 | DeliveryType | 30       | 00:00    |
      | OrderId 5th | Product Order 10115 | SIM001 - Simone Sims | 000001 - Zinja Mguni | Product | Order Successfully Created 05 | DeliveryType | 1        | 00:00    |
      | OrderId 6th | Product Order 10117 | SIM001 - Simone Sims | 000001 - Zinja Mguni | Product | Order Successfully Created 06 | DeliveryType | 5        | 00:00    |



  Scenario: As a user, I want to add a new contract so that it can be managed and tracked in the system.
    Given I am on the "Contracts" page
    When I click the "Add Contract" button
    And I fill in the contract details:
      | Field         | Value               |
      | Contract Name | Service Agreement A |
      | Start Date    | 2024-01-01          |
      | End Date      | 2025-01-01          |
      | Amount        | 5000                |
    And I click the "Save" button
    Then I should see a confirmation message "Contract has been successfully added"
    And the contract "Service Agreement A" should appear in the contract list