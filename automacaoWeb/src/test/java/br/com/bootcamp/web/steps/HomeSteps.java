package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.HomeFuncionalidade;
import br.com.bootcamp.funcionalidade.web.LoginFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class HomeSteps {
    private SeleniumRobot seleniumRobot;
    private HomeFuncionalidade homeFuncionalidade;
    private LoginFuncionalidade loginFuncionalidade;
    private LoginSteps loginSteps;

    public HomeSteps() {
        this.seleniumRobot = new SeleniumRobot();
        this.homeFuncionalidade = new HomeFuncionalidade();
        this.loginFuncionalidade = new LoginFuncionalidade();
        this.loginSteps = new LoginSteps();
    }

    @Dado("^que clico no botao \"([^\"]*)\"$")
    public void queClicoNoBotao(String textoBotao) {
        this.seleniumRobot.clicaBotaoPorTexto(textoBotao);
    }

    @Entao("^visualizo a tela inicial com meu usuario logado$")
    public void visualizoATelaInicialComMeuUsuarioLogado() {
        Assert.assertTrue(homeFuncionalidade.vizualizaBotaoLogOut());
    }

    @Dado("^que vizualizo a home com usuario logado$")
    public void queVizualizoAHomeComUsuarioLogado() {
        Assert.assertTrue(homeFuncionalidade.vizualizaBotaoLogOut());
    }

    @Dado("^que estou logado no sistema$")
    public void queEstouLogadoNoSistema() {
     this.queClicoNoBotao("Log in");
     this.loginSteps.preenchoOsDadosDeLoginComUsuário("cadastrado");
     this.loginSteps.clicoEmLogIn();

    }
}
