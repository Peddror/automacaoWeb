package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "Email")
    private WebElement txtEmail;

    @FindBy(id = "Password")
    private WebElement txtSenha;

    @FindBy(xpath = "//input[@value='Log in']")
    private WebElement btnLogin;



    public WebElement getTxtEmail() {
        return txtEmail;
    }

    public WebElement getTxtSenha() {
        return txtSenha;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }
}