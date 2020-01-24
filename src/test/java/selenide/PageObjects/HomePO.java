package selenide.PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class HomePO {
    @FindBy(linkText = "Subscribers")
    private SelenideElement subscribersLink;

    public SubscribersPO goToSubscribers(){
        subscribersLink.click();
        return page(SubscribersPO.class);
    }
}
