package com.academy.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SearchTest extends BaseTest {

    @Test
    public void testSearchAndSort() throws Exception {

        driver.get(baseUrl);
        //ввести в поле поиска
        WebElement searchField = driver.findElement(By.cssSelector("#search_query_top"));
        searchField.click();
        searchField.clear();
        searchField.sendKeys("dress");
        searchField.submit();
        // сортировка
        driver.findElement(By.cssSelector("#list > a")).click();
//        new WebDriverWait(driver, 5)
//                .until(ExpectedConditions.attributeToBe(
//                        By.id("list"), "class", "selected"
//                ));
        Select select = new Select(driver.findElement(By.id("selectProductSort")));
        select.selectByValue("name:desc");
//        WebElement selector = driver.findElement(By.id("selectProductSort"));
//        selector.click();
//        WebElement sorter = driver.findElement(By.cssSelector("#selectProductSort > option:nth-child(5)"));
//        sorter.click();

        //подождать
        //проверка
        driver.manage().window().maximize(); //в полный размер окна
        WebElement titleElement = driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div > div > h5 > a"));
        String titleText = titleElement.getText().trim();
        WebElement priceElement = driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div > div.right-block > div > div > span.price.product-price"));
        String priceText = priceElement.getText().trim();
        Assert.assertEquals(titleText, "Printed Summer Dress");
        Assert.assertEquals(priceText, "$28.98");

        //Thread.sleep(5000);
        //driver.quit();

    }
}
