Feature: 
  @test2
  Scenario: Pozive test scenario
    
    Given Kullanici Eronora gider
    And Kullanici "Gecerli Kullanici" ile giris yapar
    And Kullanici Arama butonuna Tiklar
    Then Kullanici "Salata" aramasi yapar
    And Kullanici random bir urunu secer
    And Kullanici "Salata" menu secer
    And Kullanici random bir Legumes secer
    Then Kullanici random uc sos secer
    And Kullanici random Boissons secer
    Then Kullanici sepete gider
    And Kullanici sepete ekledigini kontrol eder
    