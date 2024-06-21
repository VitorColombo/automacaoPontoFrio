package com.vemser.correcao.page;

import org.openqa.selenium.By;

public class IdentificacaoPage extends BasePage{
    private static final By documentoInput =
            By.cssSelector("#cpfcnpj-verification-input");

    private static final By continuarBtn =
            By.cssSelector("#__next > main > section > form > button");

    public void clicarContinuarBtn() {
        clicar(continuarBtn);
    }

    public void clicarDocumentoInput() {
        clicar(documentoInput);
    }

    public void preencherDocumento(String texto){
        preencherInput(documentoInput, texto);
    }
}
