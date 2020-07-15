package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.HomePage;
import br.com.bootcamp.settings.BaseTest;

public class HomeFuncionalidade extends BaseTest {


    private SeleniumRobot seleniumRobot;
    private HomePage homePage;

    public HomeFuncionalidade() {
        this.seleniumRobot = new SeleniumRobot();
        this.homePage = new HomePage(webDriver);
    }
    public boolean vizualizaBotaoLogOut(){
        return seleniumRobot.verificaElementoPresenteTela(homePage.getBtnLogOut());
    }
    public void scrollaAteFinal(){
        this.seleniumRobot.scrollAteFimDaPaginaJS();
    }
    public void clicaNoComputadorEscolhido(){
        this.seleniumRobot.clicaBotaoJS(this.homePage.getSelecionaComputador());
    }
    public void clicaEmMyAccount(){
        this.seleniumRobot.clicaBotaoJS(this.homePage.getBtnMyAccount());
    }
}
