package com.vemser.correcao.test;

import com.vemser.correcao.data.dto.CadastroDto;
import com.vemser.correcao.data.factory.CadastroFactory;
import com.vemser.correcao.page.CadastroPage;
import com.vemser.correcao.page.HomePage;
import com.vemser.correcao.page.IdentificacaoPage;
import org.junit.jupiter.api.*;

public class CadastrarTest extends BaseTest{
    HomePage homePage = new HomePage();
    IdentificacaoPage identificacaoPage = new IdentificacaoPage();
    CadastroPage cadastroPage = new CadastroPage();

    @Test
    public void testCadastrar(){
        CadastroFactory cadastroFactory = new CadastroFactory();
        CadastroDto cadastroDto = cadastroFactory.cadastroValido();
        homePage.clicarCadastrarBtn();
        identificacaoPage.preencherDocumento(cadastroDto.getCpf());
        identificacaoPage.clicarContinuarBtn();
        cadastroPage.preencherFormulario(cadastroDto);
        cadastroPage.avancarPagina();
        String dadosNome = homePage.lerDadosUsuariosLogado().split(" ")[1];
        Assertions.assertTrue(cadastroDto.getNomeCompleto().contains(dadosNome));
    }
}
