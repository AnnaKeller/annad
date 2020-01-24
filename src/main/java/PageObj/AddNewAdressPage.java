package PageObj;

import com.academy.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class AddNewAdressPage extends BasePage {
    public AddNewAdressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstname")
    private WebElement firstnameField;

    public String getText(WebElement element) {
        String fieldText = element.getText().trim();
        return fieldText;
    }

    @FindBy(id = "lastname")
    private WebElement lastnameField;

    @FindBy(id = "company")
    private WebElement companyField;

    @FindBy(id = "address1")
    private WebElement adress1Field;

    @FindBy(id = "address2")
    private WebElement adress2Field;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "phone")
    private WebElement phoneField;

    @FindBy(id = "postcode")
    private WebElement postcodeField;

    @FindBy(id = "phone_mobile")
    private WebElement phoneMobileField;

    @FindBy(id = "uniform-id_state")
    private WebElement stateSelector;

    @FindBy(css = "#id_state > option:nth-child(2)")
    private WebElement alabamaState;

    @FindBy(id = "alias")
    private WebElement adressTitle;

    @FindBy(id = "submitAddress")
    private WebElement submitAdressButton;

    public AddNewAdressPage clickSubmitAdressButton () {
        submitAdressButton.click();
        return new AddNewAdressPage(driver);
    }

    public WebElement getAdressTitle() {
        return adressTitle;
    }

    public WebElement getAlabamaState() {
        return alabamaState;
    }

    public WebElement getStateSelector() {
        return stateSelector;
    }

    public WebElement getCompanyField() {
        return companyField;
    }

    public WebElement getFirstnameField() {
        return firstnameField;
    }

    public WebElement getLastnameField() {
        return lastnameField;
    }

    public WebElement getAdress1Field() {
        return adress1Field;
    }

    public WebElement getAdress2Field() {
        return adress2Field;
    }

    public WebElement getCityField() {
        return cityField;
    }

    public WebElement getPhoneField() {
        return phoneField;
    }

    public WebElement getPostcodeField() {
        return postcodeField;
    }

    public WebElement getPhoneMobileField() {
        return phoneMobileField;
    }
}
