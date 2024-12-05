package com.yaeat.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class PlaceAnOrder extends TestBase{
    @Test
    public void PlaceAnOrder(){
        click(By.cssSelector("[data-testid=\"desktop-address-suggestion-select-button\"]"));
        type(By.cssSelector("[aria-controls='react-autowhatever-1']"), "Барнаул пролетарская 56 подъезд 2");
        driver.findElement(By.cssSelector("[aria-controls='react-autowhatever-1']")).sendKeys(Keys.ENTER);
        click(By.cssSelector("[data-testid='desktop-location-modal-confirm-button']"));
        type(By.cssSelector("[id='id_1']"), "Бургер кинг");
        driver.findElement(By.cssSelector("[id='id_1']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//span[text()='Бургер Кинг']")).click();


    }
}
