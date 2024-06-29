package com.vemser.correcao.page;

import com.vemser.correcao.data.dto.CadastroDto;
import org.openqa.selenium.By;

public class ProdutoPage extends BasePage{
    private static final By nameProduto = By.xpath("//*[@data-testid=\"dsvia-base-div\"]/h1");
    private static final By btnComprar = By.cssSelector("#buy-button");
    private static final By precoProduto = By.xpath("//*[@id=\"product-price\"]/span[2]");
    private static final By btnAgoraNao = By.xpath("//*[@data-testid=\"agora_nao\"]");
    private static final By voltagem = By.xpath("/html/body/div[12]/div/div/div/div/div/div/button[2]");
    public String lerNomeProduto() {
        return lerTexto(nameProduto);
    }

    public String lerPrecoProduto() {
        return lerTexto(precoProduto).split(" ")[1];
    }

    public void clicarComprar() {
        clicar(btnComprar);
    }

    public void clicarAgoraNao() {
        clicar(btnAgoraNao);
    }

    public void adicionarAoCarrinho() {
        clicar(btnComprar);
    }
    public void selecionarVoltagem(){
        clicar(voltagem);
    }
}

