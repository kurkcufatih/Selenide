@locators
Feature: locators

  Scenario: TC01 locators
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=form-authentication" adresine gider
    And 3 saniye bekler
    And kullanici adini gir
    And 3 saniye bekler
    And kullanici sifresini gir
    And 3 saniye bekler
    When submit butonuna tikla
    And 3 saniye bekler
    Then giris yapildigini test et

  #1. feature file olustur
  #2.  test caseleri yaz
  #3. yeni test adimlari icin yeni bir step definitions (java methodlari) olustur
  #4. page class olustur (pages klasorunun icinde)
  #5. kullaniciAdi ve sifresini gir ve submit butonunu o sayfada bul

