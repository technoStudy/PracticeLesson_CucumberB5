#Kullanılacak Web site: http://zero.webappsecurity.com/login.html
#Username: username
#Password: password

#   Task: Add New Payee
#➢ ZeroBank sitesine gidiniz.
#➢ Login olunuz
#➢ Online Banking’e tıklayınız.
#➢ Pay Bills’e tıklayınız.
#➢ “Add New Payee” tıklayınız
#➢ Name, Address, Account, Details alanlarını doldurunuz.
#➢ Add butona tıklayınız
#➢ İşlemin başarıyla tamamlandığını doğrulayınız.

Feature: New Payee Functionality

  Background:
    Given Navigate to the website
    And Enter username that as "username" and password that as "password"
    When Click login button
    Then Verify that user logged in

  @Regression
  Scenario: Add New Payee

    When Click on the element in ZBOnlineBanking
      | onlineBankingLink |
      | payBillsLink      |
      | addNewPayeeLink   |

    And User sending name, address, account and details in ZBOnlineBanking
      | newPayeeName    | Terry Smith  |
      | newPayeeAddress | London       |
      | newPayeeAccount | 1563210      |
      | newPayeeDetails | Rent payment |

    When Click on the element in ZBOnlineBanking
      | addButton |

    Then Verify that the transaction was successful