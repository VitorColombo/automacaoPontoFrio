package com.vemser.correcao.page;

import com.vemser.correcao.service.Elementos;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasePage extends Elementos {

    protected static void preencherInput(By by, String text){
        esperarElemento(by);
        elemento(by).sendKeys(text);
    }

    protected static void clicar(By by) {
        esperarElementoSerClicavel(by);
        elemento(by).click();
    }
    protected static String lerTexto(By by){
        esperarElementoSerLegivel(by);
        return elemento(by).getText();
    }

    protected static String lerInput(By by){
        esperarElemento(by);
        return elemento(by).getAttribute("value");
    }

    public static void rolarTela() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,300)");
    }

    protected static WebElement selecionaElementoFilho(By pai, By filho) {
        esperarElemento(pai);
        return elemento(pai).findElement(filho);
    }

    protected static void limparValorDoCampo(By by) {
        WebElement elemento = elemento(by);
        elemento.clear();
    }
}
