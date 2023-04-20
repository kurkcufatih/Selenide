package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TestCenterStepDefinitions {
    TestCenterPage testCenterPage = new TestCenterPage();

    @Given("kullanici adini gir")
    public void kullanici_adini_gir() {
        testCenterPage.kullaniciAdi.setValue("techproed");
    }

    @Given("kullanici sifresini gir")
    public void kullanici_sifresini_gir() {
        testCenterPage.kullaniciSifresi.setValue("SuperSecretPassword");
    }

    @When("submit butonuna tikla")
    public void submit_butonuna_tikla() {
        testCenterPage.submitButonu.click();
    }

    @Then("giris yapildigini test et")
    public void giris_yapildigini_test_et() {
        Assert.assertTrue(testCenterPage.girisMesaji.isDisplayed()); //JUnitteki geleneksel dogrulama
        //testCenterPage.girisMesaji.shouldBe(Condition.visible); //importlu
        testCenterPage.girisMesaji.shouldBe(visible); //importsuz
        //Selenide assertion, fail ederse ekran goruntusu otomatik olarak alir ve build dosyasina kaydedilir.

    }

    @And("{string} secili degilse sec")
    public void seciliDegilseSec(String text) {
        //eger text= Checkbox 1 ve checkbox 1 secili degilse, checbox1 e tikla
        if (text.equals("Checkbox 1") && !testCenterPage.checkbox1.isSelected()) {
            testCenterPage.checkbox1.click();
            //Assert.assertTrue(testCenterPage.checkbox1.isSelected()); JUnit assertion

            //testCenterPage.checkbox1.shouldBe(Condition.checked); //uzun versiyon
            testCenterPage.checkbox1.shouldBe(checked); //kisa versiyon
        }
        if (text.equals("Checkbox 2") && !testCenterPage.checkbox2.isSelected()) {
            testCenterPage.checkbox2.shouldNotBe(checked); //secili olmadigini dogrular
            testCenterPage.checkbox2.click();
            testCenterPage.checkbox2.shouldBe(checked);
        }
        if (text.equals("red") && !testCenterPage.red.isSelected()) {
            testCenterPage.red.shouldNotBe(checked); //secili olmadigini test et
            testCenterPage.red.click(); //sec
            testCenterPage.red.shouldBe(checked); //secili oldugunu test et
        }
        if (text.equals("football") && !testCenterPage.red.isSelected()) {
            testCenterPage.football.shouldNotBe(checked); //secili olmadigini test et
            testCenterPage.football.click(); //sec
            testCenterPage.football.shouldBe(checked); //secili oldugunu test et
        }
    }
}

