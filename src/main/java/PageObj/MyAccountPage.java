package PageObj;

import com.academy.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    @FindBy(partialLinkText = "addresses")
    private WebElement myAdressesLi;

    @FindBy(css="div.header_user_info > a > span")
    private WebElement username;

    @FindBy(css="a.logout")
    private WebElement logOutButton;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getUserName() {
        return username.getText().trim();
    }

    public LoginPage logout() {
        logOutButton.click();
        return new LoginPage(driver);
    }

    public AdressPage clickMyAdress() {
        myAdressesLi.click();
        return new AdressPage(driver);
    }
}
