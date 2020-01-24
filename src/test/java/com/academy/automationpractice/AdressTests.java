package com.academy.automationpractice;

import PageObj.*;
import com.academy.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.Random;

public class AdressTests extends BaseTest {

    @Test
    public void addAdressTest() {
        HomePage homePage = new HomePage(driver, baseUrl)
                .goToHome();

        LoginPage loginPage = homePage.clickSignIn();
        loginPage.fillEmail("annaqa122@gmail.com")
                .fillPassword("password");

        MyAccountPage myAccountPage = loginPage.clickSubmit();

        AdressPage adressPage = myAccountPage.clickMyAdress();

        AddNewAdressPage addNewAdressPage = adressPage.clickaAddNewAdressButton();

        String firstNameText = addNewAdressPage.getText(addNewAdressPage.getFirstnameField());
        Assert.assertNotNull(firstNameText);

        String lastNameText = addNewAdressPage.getText(addNewAdressPage.getLastnameField());
        Assert.assertNotNull(lastNameText);

        BasePage.fillInput(addNewAdressPage.getCompanyField(), "DataArt");
        BasePage.fillInput(addNewAdressPage.getAdress1Field(), "Aviatsiyna street, 1");
        BasePage.fillInput(addNewAdressPage.getAdress2Field(), "Sumska street, 58");
        BasePage.fillInput(addNewAdressPage.getCityField(), "Kharkiv");
        BasePage.fillInput(addNewAdressPage.getPhoneField(), "342890");
        BasePage.fillInput(addNewAdressPage.getPhoneMobileField(), "0669066084");
        BasePage.fillInput(addNewAdressPage.getPostcodeField(), "64600");

        addNewAdressPage.getStateSelector().click();
        addNewAdressPage.getAlabamaState().click();

        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        BasePage.fillInput(addNewAdressPage.getAdressTitle(), "My test adress #" + rand_int1 );

        addNewAdressPage.clickSubmitAdressButton();






        //driver.quit();

    }
}
