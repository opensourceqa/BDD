Feature: User Registration.

  Scenario Outline: Registar a user
    Given navigate to application
    Then click on signin button
    And enter email address as"<EmailAddress>"
    And click on create an account button
    And select title as "<Title>"
    And enter first name as "<FirstName>"
    And enter last name as"<LastName>"
    And enter password as"<Password>"
    And select date of birth as "<Date>"-"<Month>"-"<Year>"
    And enter address first name as "<AddressFName>"
    And enter address last name as "<AddressLName>"
    And enter company name as "<Company>"
    And enter address as "<Address>"
    And enter city as "<City>"
    And select state as "<State>"
    And enter zip code as "<Zip>"
    And select country as "<Country>"
    And enter mobile number as "<MobileNo>"
    And enter address alias as "<AddressAlias>"
    When click on Register button
    Then verify regiestration status

    Examples: 
      | Title | FirstName | LastName | Password | Date | Month    | Year | AddressFName | AddressLName | Company | Address   | City      | State     | Zip     | Country | MobileNo   | AddressAlias      |
      | Mr    | Raj       | Kumar    | Welcome  |   01 | August   | 1992 | Babu         | Rao          | Google  | Gachiboli | Hyderabad | Telengana | 0999876 | India   | 9876543210 | 23-23 park Avinue |
      | Mr    | Rajesh    | Khanna   | Welcome  |   21 | December | 1972 | Raja         | Nanu         | NYC     | Gachiboli | Hyderabad | Telengana |    0996 | India   | 9876543211 | 23-23 park Avinue |
