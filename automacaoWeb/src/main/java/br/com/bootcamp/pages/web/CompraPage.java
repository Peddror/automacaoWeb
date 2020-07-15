package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompraPage {
    public CompraPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='add-to-cart-button-74']")
    private WebElement btnAddToCard;

    @FindBy(xpath = "//span[text()='Shopping cart']")
    private WebElement btnAcessaCarrinho;

    @FindBy(xpath = "//input[@id='termsofservice']")
    private WebElement checkBoxTermosOfServices;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckOt;

    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    private WebElement selectListPais;

    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    private WebElement campoCidade;

    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    private WebElement campoEndereco;

    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    private WebElement campoZipCode;

    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    private WebElement campoPhoneNumber;

    @FindBy(xpath = "//input[@class='button-1 new-address-next-step-button' and parent::div[@id='billing-buttons-container']]")
    private WebElement btnContinuar1;

    @FindBy(xpath = "//input[@class='button-1 new-address-next-step-button' and parent::div[@id='shipping-buttons-container']]")
    private WebElement btnContinuar2;

    @FindBy(xpath = "//input[@class='button-1 shipping-method-next-step-button' and parent::div[@id='shipping-method-buttons-container']]")
    private WebElement btnContinuar3;

    @FindBy(xpath = "//label[@for='paymentmethod_2' and parent::div[@class='payment-details']]")
    private WebElement radioBoxCreditCard;

    @FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
    private WebElement btnCotinuarMetodoDePagamento;

    @FindBy(xpath = "//input[@id='CardholderName']")
    private WebElement campoNomeDoCartao;

    @FindBy(xpath = "//input[@id='CardNumber']")
    private WebElement campoNumeroDoCartao;

    @FindBy(xpath = "//input[@id='CardCode']")
    private WebElement campoCodigoDoCartao;

    @FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
    private WebElement btnContinuarCartaoCredito;

    @FindBy(xpath = "//input[@class='button-1 confirm-order-next-step-button']")
    private WebElement btnConfirmarFinal;

    @FindBy(xpath = "//h1[text()='Thank you']")
    private WebElement mensagemFinal;

    public WebElement getBtnAddToCard() {
        return btnAddToCard;
    }

    public WebElement getBtnAcessaCarrinho() {
        return btnAcessaCarrinho;
    }

    public WebElement getCheckBoxTermosOfServices() {
        return checkBoxTermosOfServices;
    }

    public WebElement getBtnCheckOt() {
        return btnCheckOt;
    }

    public WebElement getCampoCidade() {
        return campoCidade;
    }

    public WebElement getSelectListPais() {
        return selectListPais;
    }

    public WebElement getCampoEndereco() {
        return campoEndereco;
    }

    public WebElement getCampoZipCode() {
        return campoZipCode;
    }

    public WebElement getCampoPhoneNumber() {
        return campoPhoneNumber;
    }

    public WebElement getBtnContinuarDoEndereco() {
        return btnContinuar1;
    }

    public WebElement getBtnContinuar1() {
        return btnContinuar1;
    }

    public WebElement getBtnContinuar2() {
        return btnContinuar2;
    }

    public WebElement getBtnContinuar3() {
        return btnContinuar3;
    }

    public WebElement getRadioBoxCreditCard() {
        return radioBoxCreditCard;
    }

    public WebElement getCampoNomeDoCartao() {
        return campoNomeDoCartao;
    }

    public WebElement getCampoNumeroDoCartao() {
        return campoNumeroDoCartao;
    }

    public WebElement getCampoCodigoDoCartao() {
        return campoCodigoDoCartao;
    }

    public WebElement getBtnContinuarCartaoCredito() {
        return btnContinuarCartaoCredito;
    }

    public WebElement getBtnConfirmarFinal() {
        return btnConfirmarFinal;
    }

    public WebElement getBtnCotinuarMetodoDePagamento() {
        return btnCotinuarMetodoDePagamento;
    }

}
