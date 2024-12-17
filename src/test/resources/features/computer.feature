Feature:computer page
  As a user
  I should select computer tab

  Background: I am on homepage

  @smoke @author_Payal
  Scenario: Verify User Should Navigate To ComputerPage Successfully
    When I click on the COMPUTER tab
    Then I should see the "Computers" text

  @sanity
  Scenario: Verify User Should Navigate To DesktopsPage Successfully
    When I click on the COMPUTER tab
    And I click on the Desktops link
    Then I should see the "Desktops" text

  @regression
  Scenario Outline: Verify That User Should Build You Own Computer And Add Them To Cart Successfully
    When I click on the COMPUTER tab
    And I click on the Desktops link
    And I click on the product name Build your own computer
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on ADD TO CART Button
    Then I should see the sucesssfull message "The product has been added to your shopping cart"

    Examples:
      | processor                                      | ram          | hdd              | os                  | software                  |
      | 2.2 GHz Intel Pentium Dual-Core E2200          | 2 GB         | 320 GB           | Windows 7 [+50.00]  | Microsoft Office [+50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+15.00] | 4GB [+20.00] | 400 GB [+100.00] | Windows 10 [+60.00] | Acrobat Reader [+10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+15.00] | 8GB [+60.00] | 320 GB           | Ubuntu              | Total Commander [+5.00]   |
