package com.vemser.correcao.service;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elementos extends SeleniumService {
    public static WebElement elemento(By by){
        return driver.findElement(by);
    }

    public static void esperarElemento(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void esperarElementoSerClicavel(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void esperarElementoSerLegivel(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static boolean elementoExiste(By by){
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
