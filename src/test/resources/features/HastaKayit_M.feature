@probel_hastaKayit
Feature: probel_hastaKayit

  Background:
    Given The user logs in
    And The user goes Hasta İşlemleri, Ayaktan Hasta İşlemleri and then click Poliklinik Muayene Kayıt
    And Click the Hasta button


  @M_test1
  Scenario: TC0090 User should enter "Kurumu" and "Kurum Detay" information for registration
    Given User chooses the "nationality_1"
    And User clicks Patient Type box and Choose Button on dual citizens
    And User clicks Gender box and chooses the "gender_1"
    And User enters "validPassportId" and "validPassportNo"
    And User clicks the Save button
    Then User verifies that the institution Information Warning Message is displayed
