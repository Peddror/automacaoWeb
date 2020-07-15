package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.CompraPage;
import br.com.bootcamp.settings.BaseTest;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class CompraFuncionalidade extends BaseTest {

    private SeleniumRobot seleniumRobot;
    private CompraPage compraPage;
    private Faker faker;
    private Random random;

    public CompraFuncionalidade() {
        this.compraPage = new CompraPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
        this.faker = new Faker(new Locale("pt-br"));
        this.random = new Random();
    }

    public void scrollaAteElementoAddToCard() {
        this.seleniumRobot.scrollAteOElementoJS(this.compraPage.getBtnAddToCard());
    }

    public void clicaEmAddToCart() {
        this.seleniumRobot.clicaBotaoJS(this.compraPage.getBtnAddToCard());
    }

    public void clicaNoCarrinho() {
        this.seleniumRobot.clicaBotaoJS(this.compraPage.getBtnAcessaCarrinho());
    }

    public void marcaCheckBoxDosTermos() {
        this.seleniumRobot.selecionaCheckBoxJS("termsofservice");
    }

    public void clicaEmCheckOut() {
        this.seleniumRobot.clicaBotaoJS(this.compraPage.getBtnCheckOt());
    }

    public void preencheFormularioCompleto() {
        if (this.seleniumRobot.verificaElementoPresenteTela(this.compraPage.getCampoCidade())) {
            this.seleniumRobot.insireTextoNoElementoJS(this.compraPage.getCampoCidade(), faker.address().cityName());
            this.seleniumRobot.insireTextoNoElementoJS(this.compraPage.getCampoEndereco(), faker.address().streetAddress());
            this.seleniumRobot.insireTextoNoElementoJS(this.compraPage.getCampoZipCode(), faker.address().zipCode());
            this.seleniumRobot.insireTextoNoElementoJS(this.compraPage.getCampoPhoneNumber(), faker.phoneNumber().phoneNumber());


        }
        this.seleniumRobot.clicaBotaoJS(this.compraPage.getBtnContinuarDoEndereco());
        this.seleniumRobot.clicaBotaoJS(this.compraPage.getBtnContinuar1());
        this.seleniumRobot.clicaBotaoJS(this.compraPage.getBtnContinuar2());
        this.seleniumRobot.clicaBotaoJS(this.compraPage.getBtnContinuar3());
        this.seleniumRobot.scrollAteFimDaPaginaJS();
        this.seleniumRobot.clicaBotaoJS(this.compraPage.getRadioBoxCreditCard());
        this.seleniumRobot.clicaBotaoJS(this.compraPage.getBtnCotinuarMetodoDePagamento());
        this.seleniumRobot.insireTextoNoElementoJS(this.compraPage.getCampoNomeDoCartao(), faker.name().name());
        this.seleniumRobot.insireTextoNoElementoJS(this.compraPage.getCampoNumeroDoCartao(), faker.finance().creditCard());
        this.seleniumRobot.insireTextoNoElementoJS(this.compraPage.getCampoCodigoDoCartao(), String.valueOf(random.nextInt(899) + 100));
        this.seleniumRobot.clicaBotaoJS(this.compraPage.getBtnContinuarCartaoCredito());
        this.seleniumRobot.clicaBotaoJS(this.compraPage.getBtnConfirmarFinal());
        this.seleniumRobot.validaTexto("Thank you", "Thank you");
    }

}
