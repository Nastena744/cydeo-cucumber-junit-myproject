Feature: Cucumber Data Tables implementation practices


  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |


  Scenario: List of my favorite dogs
    Then user should see below the following dogs
      | Pitbul           |
      | Golden retriever |
      | Pomerenium       |
      | Haski            |


  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane       |
      | surname | Doe        |
      | age     | 29         |
      | address | somewhere  |
      | state   | CA         |
      | zipcode | 00000      |
      | phone   | 4567394585 |

  @dataTable
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |