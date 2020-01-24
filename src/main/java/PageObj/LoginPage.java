package PageObj;

import com.academy.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    @FindBy(css="#center_column > div.alert.alert-danger > ol > li")
    private WebElement errMsgElement;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillEmail(String login) {
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys(login);
        fillInput(emailInput, login);
        return this;
    }

    public LoginPage fillPassword(String password) {
        fillInput(passwordInput, password);
        return this;
    }

    public MyAccountPage clickSubmit() {
        signInButton.click();
        return new MyAccountPage(driver);
    }

    public LoginPage and() {
        return this;
    }

    public String getErrMsg() {
        return errMsgElement.getText().trim();
    }
}
