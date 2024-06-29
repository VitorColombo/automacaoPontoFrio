package com.vemser.correcao.page;

import org.openqa.selenium.By;

import java.util.Collections;
import java.util.List;

public class HomePage extends BasePage{
    private static final By botaoCadastrar = By.cssSelector("#__next > div > div.css-4h6is8 > header > div.css-1j9yy15 > div > div.login.css-1knbux5 > div > a > div > span:nth-child(1)");
    private static final By divDadosUsuario = By.cssSelector("#__next > div > div.css-4h6is8 > header > div.css-1mbsklr.e1033o1o76 > div > div.login.css-bcffy2.e1033o1o98 > div > a > div");
    private static final By itensCarrinho = By.xpath("//*[@class=\"css-wihop2 e1033o1o100\"]");
    private static final By produtoEscolhido = By.xpath("/html/body/div[4]/div/div[7]/div/div/div/div/div/div/div/div/div/div/div[1]");

    public void clicarCadastrarBtn() {
        clicar(botaoCadastrar);
    }

    public void clicarProduto(int index){
        clicar(produtoEscolhido);
    }

    public String lerDadosUsuariosLogado(){
        return lerTexto(divDadosUsuario);
    }

    public String lerQuantidadeItensCarrinho(){
        return lerTexto(itensCarrinho);
    }
}
