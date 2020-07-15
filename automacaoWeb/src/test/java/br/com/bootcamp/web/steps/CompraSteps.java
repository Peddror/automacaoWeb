package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.CompraFuncionalidade;
import br.com.bootcamp.funcionalidade.web.HomeFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CompraSteps {
    private SeleniumRobot seleniumRobot;
    private CompraFuncionalidade compraFuncionalidade;
    private HomeFuncionalidade homeFuncionalidade;

    public CompraSteps() {
        this.seleniumRobot = new SeleniumRobot();
        this.compraFuncionalidade = new CompraFuncionalidade();
        this.homeFuncionalidade = new HomeFuncionalidade();

    }

    @E("^que clico no produto escolhido$")
    public void queClicoNoProdutoEscolhido() {
        this.homeFuncionalidade.scrollaAteFinal();
        this.homeFuncionalidade.clicaNoComputadorEscolhido();
        this.compraFuncionalidade.scrollaAteElementoAddToCard();
        this.compraFuncionalidade.clicaEmAddToCart();

    }

    @E("^acesso o carrinho de compras$")
    public void acessoOCarrinhoDeCompras() {
        this.compraFuncionalidade.clicaNoCarrinho();
        this.compraFuncionalidade.marcaCheckBoxDosTermos();
        this.compraFuncionalidade.clicaEmCheckOut();
    }

    @Quando("^preencho informaçoes de pagamento$")
    public void preenchoInformaçoesDePagamento() {
        this.compraFuncionalidade.preencheFormularioCompleto();

    }

    @Entao("^valido a compra finalizada$")
    public void validoACompraFinalizada() {
    }


}
