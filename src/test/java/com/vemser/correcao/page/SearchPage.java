package com.vemser.correcao.page;

import org.openqa.selenium.By;

public class SearchPage extends BasePage{
    private static final By inputBusca =
            By.cssSelector("#search-field");
    private static final By resultadosBusca =
            By.cssSelector("body > section > div > main > div:nth-child(2) > div > h2");

    public String lerResultadoBusca() {
        return lerTexto(resultadosBusca);
    }
    public void clicarInputBusca() {
        clicar(inputBusca);
    }
    public void preencherInputBusca(String place) {
        preencherInput(inputBusca, place);
    }
    public void enviarBusca() {
        elemento(inputBusca).submit();
    }
}
