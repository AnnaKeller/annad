package selenide.configuration;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GeckoDriverProvider implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        System.setProperty("webdriver.gecko.driver", "/Users/annadrevnyak/Desktop/temp/geckodriver");

        return new FirefoxDriver();
    }
}
