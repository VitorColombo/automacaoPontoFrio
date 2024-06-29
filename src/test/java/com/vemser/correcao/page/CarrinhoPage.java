package com.vemser.correcao.page;

import org.openqa.selenium.By;

public class CarrinhoPage extends BasePage{
    private static final By documentoInput = By.cssSelector("#cpfcnpj-verification-input");
    private static final By nomeProduto1 = By.xpath("//*[@data-qa=\"cart-item-title\"]");
    private static final By qtdProduto1 = By.xpath("//*[@data-qa=\"item-quantity\"]");
    private static final By precoProduto1 = By.xpath("//*[@class=\"dsvia-flex css-11nrkw7\"]/div/p");
    private static final By comprarMaisProdutos = By.xpath("//*[@data-qa=\"cart-keep-buying\"]");
    public void clicarDocumentoInput() {
        clicar(documentoInput);
    }

    public void clicarComprarMaisProdutos() {
        clicar(comprarMaisProdutos);
    }

    public String lerNomeProduto1() {
        return lerTexto(nomeProduto1);
    }

    public String lerQtdProduto1() {
        String qtd = lerTexto(qtdProduto1).split("\n")[0];
        return qtd;
    }

    public String lerPrecoProduto1() {
        return lerTexto(precoProduto1).split(" ")[2];
    }
}
