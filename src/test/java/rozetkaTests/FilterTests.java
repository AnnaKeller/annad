package rozetkaTests;

import com.academy.automationpractice.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class FilterTests extends BaseTest {


    @Test
    public void testSlider() {
        String baseUrl = "https://rozetka.com.ua/";
        driver.get(baseUrl);
        WebElement menuItem = driver.findElement(By.cssSelector("body > app-root > div > div:nth-child(2) > app-rz-main-page > div > aside > main-page-sidebar > sidebar-fat-menu > div > ul > li:nth-child(1) > a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuItem).perform();
        driver.findElement(By.partialLinkText("Мониторы")).click();

        WebElement leftBtn = driver.findElement(By.className("rz-slider__range-button rz-slider__range-button_type_left"));
        actions.moveToElement(leftBtn)
                .clickAndHold()
                .moveByOffset(15, 0)
                .perform();
    }
}
