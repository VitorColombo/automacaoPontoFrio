package com.vemser.correcao.test;

import com.vemser.correcao.data.dto.CadastroDto;
import com.vemser.correcao.data.factory.CadastroFactory;
import com.vemser.correcao.page.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdicionarAoCarrinhoTest extends BaseTest{
    HomePage homePage = new HomePage();
    IdentificacaoPage identificacaoPage = new IdentificacaoPage();
    CadastroPage cadastroPage = new CadastroPage();
    ProdutoPage produtoPage = new ProdutoPage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();

    @Test
    public void testAdicionarAoCarrinho() throws InterruptedException {
        CadastroFactory cadastroFactory = new CadastroFactory();
        CadastroDto cadastroDto = cadastroFactory.cadastroValido();
        homePage.clicarCadastrarBtn();
        identificacaoPage.preencherDocumento(cadastroDto.getCpf());
        identificacaoPage.clicarContinuarBtn();
        Thread.sleep(2000);
        cadastroPage.preencherFormulario(cadastroDto);
        cadastroPage.avancarPagina();
        homePage.clicarProduto(0);
        String nomeProduto = produtoPage.lerNomeProduto();
        String precoProduto = produtoPage.lerPrecoProduto();
        produtoPage.adicionarAoCarrinho();
        produtoPage.selecionarVoltagem();
        produtoPage.clicarAgoraNao();
        Assertions.assertEquals(nomeProduto, carrinhoPage.lerNomeProduto1());
        Assertions.assertEquals("1", carrinhoPage.lerQtdProduto1());
        Assertions.assertEquals(precoProduto, carrinhoPage.lerPrecoProduto1());
        carrinhoPage.clicarComprarMaisProdutos();
        String qtdCarrinho = homePage.lerQuantidadeItensCarrinho();
        Assertions.assertEquals("1", qtdCarrinho);
    }
}
