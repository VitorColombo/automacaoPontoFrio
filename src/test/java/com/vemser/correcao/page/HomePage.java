package com.vemser.correcao.page;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    private static final By botaoCadastrar =
            By.cssSelector("#__next > div > div.css-4h6is8 > header > div.css-1j9yy15 > div > div.login.css-1knbux5 > div > a");

    public void clicarCadastrarBtn() {
        clicar(botaoCadastrar);
    }
}
