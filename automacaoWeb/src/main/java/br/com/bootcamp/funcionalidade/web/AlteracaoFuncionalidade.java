package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.AlteracaoPage;
import br.com.bootcamp.settings.BaseTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class AlteracaoFuncionalidade extends BaseTest {

    private AlteracaoPage alteracaoPage;
    private Faker faker;
    private SeleniumRobot seleniumRobot;
    private  String nome;
    private  String sobreNome;

    public AlteracaoFuncionalidade() {
        this.alteracaoPage = new AlteracaoPage(webDriver);
        this.faker = new Faker(new Locale("pt-br"));
        this.seleniumRobot = new SeleniumRobot();
        nome = faker.leagueOfLegends().champion();
        sobreNome = faker.name().lastName();
    }

    public void alteraNome() {
        this.seleniumRobot.insireTextoNoElementoJS(this.alteracaoPage.getCampoFirstName(), nome);
        this.seleniumRobot.insireTextoNoElementoJS(this.alteracaoPage.getCampoLastName(), sobreNome);
        this.seleniumRobot.clicaBotaoJS(this.alteracaoPage.getBtnSave());
    }
    public String pegaValorDoAtributoCampoNome(){
        return this.seleniumRobot.getValueByAttribute(this.alteracaoPage.getCampoFirstName(),"value");
    }
    public String pegaValorDoATributoCampoSobreNome(){
        return this.seleniumRobot.getValueByAttribute(this.alteracaoPage.getCampoLastName(),"value");
    }

    public  String getNome() {
        return nome;
    }

    public  String getSobreNome() {
        return sobreNome;
    }
}