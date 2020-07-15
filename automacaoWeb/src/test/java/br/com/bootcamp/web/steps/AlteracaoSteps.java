package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.AlteracaoFuncionalidade;
import br.com.bootcamp.funcionalidade.web.HomeFuncionalidade;
import cucumber.api.java.cs.A;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class AlteracaoSteps {

    private HomeSteps homeSteps;
    private SeleniumRobot seleniumRobot;
    private AlteracaoFuncionalidade alteracaoFuncionalidade;
    private HomeFuncionalidade homeFuncionalidade;


    public AlteracaoSteps() {
        this.homeFuncionalidade = new HomeFuncionalidade();
        this.seleniumRobot = new SeleniumRobot();
        this.alteracaoFuncionalidade = new AlteracaoFuncionalidade();
        this.homeSteps = new HomeSteps();
    }

    @E("^acesso meu perfil$")
    public void acessoMeuPerfil() {
        this.seleniumRobot.scrollAteFimDaPaginaJS();
        this.homeFuncionalidade.clicaEmMyAccount();

    }


    @E("^altero credenciais de nome$")
    public void alteroCredenciaisDeNome() {
        this.alteracaoFuncionalidade.alteraNome();
    }

    @Entao("valido a alteracao")
    public void salvoAAlteracao() {
        Assert.assertEquals(alteracaoFuncionalidade.getNome(), alteracaoFuncionalidade.pegaValorDoAtributoCampoNome());
        Assert.assertEquals(alteracaoFuncionalidade.getSobreNome(), alteracaoFuncionalidade.pegaValorDoATributoCampoSobreNome());
    }
}
