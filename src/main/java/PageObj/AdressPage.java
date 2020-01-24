package PageObj;

import com.academy.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdressPage extends BasePage{

    public AdressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#center_column > div.clearfix.main-page-indent > a")
    private WebElement addNewAdressButton;

    public AddNewAdressPage clickaAddNewAdressButton() {
        addNewAdressButton.click();
        return new AddNewAdressPage(driver);
    }

}
