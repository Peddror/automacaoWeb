package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlteracaoPage {
    public AlteracaoPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath ="//input[@id='FirstName']")
    private WebElement campoFirstName;

    @FindBy(xpath ="//input[@id='LastName']")
    private WebElement CampoLastName;

    @FindBy(xpath ="//input[@value='Save']")
    private WebElement btnSave;

    public WebElement getCampoFirstName() {
        return campoFirstName;
    }

    public WebElement getCampoLastName() {
        return CampoLastName;
    }

    public WebElement getBtnSave() {
        return btnSave;
    }
}
