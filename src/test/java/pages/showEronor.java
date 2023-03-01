package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class showEronor {



    public showEronor(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='search_toggle']" )
    public WebElement search;

    @FindBy(xpath = "//*[@id='search_block_top']")
    public WebElement searchText;

    @FindBy(xpath = "//*[@class='img-responsive center-block']")
    public WebElement sandwichList;

    @FindBy (xpath = "/html/body/header/div[2]/div/div[4]/ul/li[3]/a/span")
    public WebElement account;

    @FindBy (xpath = "//*[@id=\"top-links\"]/ul/li[3]/ul/li[2]/a")
    public  WebElement login;

    @FindBy (xpath = "//*[@id=\"input-email\"]")
    public  WebElement eMail;

    @FindBy (xpath = "//*[@id='input-password']")
    public  WebElement password;

    @FindBy (xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/form/input")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@class='img-responsive']")
    public WebElement burgerList;

    @FindBy (xpath = "(//*[@data-optionname='Menu'])[2]")
    public  WebElement menuChooise;

    @FindBy (xpath = "//*[@class='btn pcrt add-to-cart btn-primary']")
    public WebElement sepetAdd;

    @FindBy (xpath = "//*[@id='content']/h2")
    public WebElement basarili;

    @FindBy (xpath = "//*[@id=\"account-login\"]/div[1]")
    public WebElement basarisiz;

    @FindBy (xpath = "//*[@class='fa fa-user-plus']")
    public WebElement register;

    @FindBy (xpath = "//*[@id='input-firstname']")
    public WebElement registerName;

    @FindBy (xpath = "//*[@id='input-lastname']")
    public WebElement registerSurname;

    @FindBy (xpath = "//*[@id=\"input-email\"]")
    public WebElement registerMail;

    @FindBy (xpath = "//*[@id=\"input-telephone\"]")
    public WebElement registerTel;

    @FindBy (xpath = "//*[@id=\"input-password\"]")
    public WebElement registerPass;

    @FindBy (xpath = "//*[@id=\"input-confirm\"]")
    public WebElement registerPass2;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement registerDevam;

    @FindBy (xpath = "//*[@id=\"content\"]/div[3]/p[2]")
    public WebElement basariliKayit;









}
