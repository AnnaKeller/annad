package com.academy.automationpractice;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SuccessfulAuth {
    private String baseUrl;
    private WebDriver driver;
    private Properties properties;

    @Test
    public void logInSuccessfully() throws Exception {
        //настроить драйвер
        properties = new Properties();
        // вычитываем файл *.properties из директории <root>/src/main/java/resources
        properties.load(this.getClass().getClassLoader().getResourceAsStream("common.properties"));
        // Инициализируем драйвер Chrome
        System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.driver"));
        driver = new ChromeDriver();
        //попасть на главную страницу
        baseUrl = "http://automationpractice.com/index.php";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.className("login")).click();
        WebElement emailAdressField = driver.findElement(By.id("email"));
        emailAdressField.click();
        emailAdressField.clear();
        emailAdressField.sendKeys("annaqa122@gmail.com");
        WebElement passwordField = driver.findElement(By.id("passwd"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("password");
        driver.findElement(By.id("SubmitLogin")).click();
        //убедиться, что в верхнем меню отображается гиперссылка с именем пользователя
        driver.findElement(By.className("account")).isDisplayed();
        driver.findElement(By.className("logout")).click();

    }
    

    @Test(dataProvider = "IncorrectAuthData")
    public void logInUnsuccessfully(String login, String password, String errorMessage) throws Exception {
        //настроить драйвер
        properties = new Properties();
        // вычитываем файл *.properties из директории <root>/src/main/java/resources
        properties.load(this.getClass().getClassLoader().getResourceAsStream("common.properties"));
        // Инициализируем драйвер Chrome
        System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.driver"));
        driver = new ChromeDriver();
        //попасть на главную страницу
        baseUrl = "http://automationpractice.com/index.php";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.className("login")).click();
        WebElement emailAdressField = driver.findElement(By.id("email"));
        emailAdressField.click();
        emailAdressField.clear();
        emailAdressField.sendKeys(login);
        WebElement passwordField = driver.findElement(By.id("passwd"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();



    }


    @DataProvider(name = "IncorrectAuthData")
    public Object[][] IncorrectAuthData() throws IOException {
        String file = properties.getProperty("data.dir") + "/automationpractice-auth-data.csv";
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        List<String> data = new ArrayList<>();
        String line = br.readLine();
        while ((line = br.readLine()) != null) {
            if (!line.trim().startsWith("#"))
                data.add(line);
        }
        br.close();
        fr.close();

        Object[][] obj = new Object[data.size()][3];

        for (int i = 0; i < data.size(); i++) {
            obj[i] = data.get(i).split(",");
        }

        return obj;
    }
}