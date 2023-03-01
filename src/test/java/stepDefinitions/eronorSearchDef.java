package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.showEronor;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Random;

public class eronorSearchDef {

    showEronor eronor = new showEronor();
    Actions action = new Actions(Driver.getDriver());
    @Given("Kullanici Eronora gider")
    public void kullaniciEronoraGider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("EronorUrl"));
        Thread.sleep(1000);
    }
    @Then("Kullanici Arama butonuna Tiklar")
    public void kullaniciAramaButonunaTiklar() throws InterruptedException {
        eronor.search.click();
        Thread.sleep(1000);
    }
    @Then("Kullanici {string} aramasi yapar")
    public void kullaniciAramasiYapar(String kelime) throws InterruptedException {
        eronor.searchText.click();
        action.sendKeys(kelime).sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
    }
    @And("Kullanici random bir urunu secer")
    public void kullaniciRastgeleBirUrunuSecer() {
        Random random = new Random();
        ArrayList<WebElement> urunListesi = (ArrayList<WebElement>) Driver.getDriver().findElements(By.xpath("//*[@class='img-responsive']"));
        int low = 2;
        int high = 7;
        int secilenUrun = random.nextInt(high-low) + low;
        String  dinamikXpath="(//*[@class='img-responsive'])["+secilenUrun+"]";
        WebElement urun = Driver.getDriver().findElement(By.xpath(dinamikXpath));
        urun.click();

    }

    @And("Kullanici {string} ile giris yapar")
    public void kullaniciIleGirisYapar(String arg0) throws InterruptedException {
        eronor.account.click();
        Thread.sleep(1000);
        eronor.login.click();
        Thread.sleep(1000);
        eronor.eMail.sendKeys(ConfigReader.getProperty("pEmail"));
        Thread.sleep(1000);
        eronor.password.sendKeys(ConfigReader.getProperty("pPass"));
        Thread.sleep(1000);
        eronor.loginButton.click();
        Thread.sleep(1000);

    }
    @Then("Kullanici sepete gider")
    public void kullaniciSepeteGider() throws InterruptedException {
        eronor.sepetAdd.click();
        Thread.sleep(4000);
    }
    @And("Kullanici {string} menu secer")
    public void kullaniciMenuSecer(String arg0) {
        eronor.menuChooise.click();
    }
    @And("Kullanici random bir Legumes secer")
    public void kullaniciRandomBirLegumesSecer() {
        Random r = new Random();
        ArrayList<WebElement> urunListesi = (ArrayList<WebElement>) Driver.getDriver().findElements(By.xpath("//*[@data-optionname='Legumes']"));
        int low = 1;
        int high = 4;
        int secilenUrun = r.nextInt(high-low) + low;
        String  dinamikXpath="(//*[@data-optionname='Legumes'])["+secilenUrun+"]";
        WebElement urun = Driver.getDriver().findElement(By.xpath(dinamikXpath));
        urun.click();
    }
    @Then("Kullanici random uc sos secer")
    public void kullaniciRandomUcSosSecer() {

        Random r = new Random();
        ArrayList<WebElement> urunListesi = (ArrayList<WebElement>) Driver.getDriver().findElements(By.xpath("//*[@data-optionname='Soslar']"));
        int i = 0;
        for(i = 0; i < 3; i++) {
            int low = 2;
            int high = 15;
            int secilenUrun = r.nextInt(high-low) + low ;
            String  dinamikXpath="(//*[@data-optionname='Soslar'])["+secilenUrun+"]";
            WebElement urun = Driver.getDriver().findElement(By.xpath(dinamikXpath));
            urun.click();
        }
    }
    @And("Kullanici sepete ekledigini kontrol eder")
    public void kullaniciSepeteEklediginiKontrolEder() {
        String expectedMessage = "Başarılı";
        String actualMessage = eronor.basarili.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @And("Kullanici random Boissons secer")
    public void kullaniciRandomBoissonsSecer() {
        Random r = new Random();
        ArrayList<WebElement> urunListesi = (ArrayList<WebElement>) Driver.getDriver().findElements(By.xpath("//*[@data-optionname='İçecekler']"));
        int low = 1;
        int high =13;
        int secilenUrun = r.nextInt(high-low) + low;
        String  dinamikXpath="(//*[@data-optionname='İçecekler'])["+secilenUrun+"]";
        WebElement urun = Driver.getDriver().findElement(By.xpath(dinamikXpath));
        urun.click();
    }

    @Then("Kullanici Gecersiz Kullanici ile giris yapar")
    public void kullaniciGecersizKullaniciIleGirisYapar() throws InterruptedException {
        eronor.account.click();
        Thread.sleep(1000);
        eronor.login.click();
        Thread.sleep(1000);
        eronor.eMail.sendKeys(ConfigReader.getProperty("nEmail"));
        Thread.sleep(1000);
        eronor.password.sendKeys(ConfigReader.getProperty("nPass"));
        Thread.sleep(1000);
        eronor.loginButton.click();
        Thread.sleep(1000);
    }

    @And("Kullanici hatali giris mesajı alir")
    public void kullaniciHataliGirisMesajıAlir() {
        String expectedMessage = "Uyarı: E-Posta Adresiniz Ya Da Parolanız Yanlış!";
        String actualMessage = eronor.basarisiz.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @And("Kullanici rastgele hesap ile oturum acmayi dener")
    public void kullaniciRastgeleHesapIleOturumAcmayiDener() throws InterruptedException {
        Faker faker = new Faker();
        eronor.account.click();
        Thread.sleep(1000);
        eronor.login.click();
        Thread.sleep(1000);
        eronor.eMail.sendKeys(faker.internet().emailAddress());
        Thread.sleep(1000);
        eronor.password.sendKeys(faker.internet().password());
        Thread.sleep(1000);
        eronor.loginButton.click();
        Thread.sleep(1000);

    }

    @Then("Kullanici kayit olmak ister")
    public void kullaniciKayitOlmakIster() throws InterruptedException {

        eronor.account.click();
        Thread.sleep(1000);
        eronor.register.click();
        Thread.sleep(1000);



    }

    @And("Uyelik bilgilerini doldurur")
    public void uyelikBilgileriniDoldurur() {
        Faker faker = new Faker();
        String fakePass = faker.internet().password();
        eronor.registerName.sendKeys(faker.name().firstName());
        eronor.registerSurname.sendKeys(faker.name().lastName());
        eronor.registerMail.sendKeys(faker.internet().emailAddress());
        eronor.registerTel.sendKeys(faker.phoneNumber().cellPhone());
        eronor.registerPass.sendKeys(fakePass);
        eronor.registerPass2.sendKeys(fakePass);
        eronor.registerDevam.click();
    }

    @And("Kayıt olur")
    public void kayıtOlur() {
        String expectedMesaj = "Tebrikler! Hesabınız başarılı bir şekilde oluşturuldu!";
        String actualMesaj = eronor.basariliKayit.getText();
        Assert.assertEquals(expectedMesaj,actualMesaj);

    }
}
