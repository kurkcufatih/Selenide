package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestCenterPage {

    //kullanici adi
    public SelenideElement kullaniciAdi = $(By.id("exampleInputEmail1"));

    //kullanici sifresi
    public SelenideElement kullaniciSifresi = $("#exampleInputPassword1");

    //submit butonu
    public SelenideElement submitButonu = $(By.xpath("//button[@type='submit']"));

    //giris mesaji
    public SelenideElement girisMesaji = $(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));

    //CHECKBOX ELEMENTLERI

    //checkbox 1
    public SelenideElement checkbox1 = $(By.id("box1"));

    //checkbox 2
    public SelenideElement checkbox2 = $(By.id("box2"));

    //RADIO BUTTON ELEMENTLERI
    public SelenideElement red = $(By.id("red"));
    public SelenideElement football = $(By.id("football"));
}
