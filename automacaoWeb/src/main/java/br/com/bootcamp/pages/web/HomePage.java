package br.com.bootcamp.pages.web;

import cucumber.api.java.en_lol.WEN;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement btnLoginTexto;

    @FindBy(xpath = "//a[text()='Build your own expensive computer' and parent::h2]")
    private WebElement computador;

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement btnLogin;

    @FindBy(xpath = "//a[@href='/logout']")
    private WebElement btnLogOut;

    @FindBy(xpath = "//a[@href='/customer/info' and ancestor::div[@class='column my-account']]")
    private WebElement btnMyAccount;

    public WebElement getClicBtnLogin() {
        return btnLogin;
    }
    public WebElement getBtnLogOut() {
        return btnLogOut;
    }
    public WebElement getSelecionaComputador() {
        return computador;
    }
    public WebElement getBtnLoginTexto(){
        return btnLoginTexto;
    }

    public WebElement getBtnMyAccount() {
        return btnMyAccount;
    }
}
