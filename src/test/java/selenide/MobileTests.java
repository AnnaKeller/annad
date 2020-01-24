package selenide;

import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MobileTests {

    @BeforeClass
    public void setUp() {
        baseUrl = "http://localhost:8081";
        Configuration.timeout = 3000;
       //Configuration.browser = "selenide.configuration.GeckoDriverProvider";
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }

    @Test
    public void testCreateSubscriber() {
        open(baseUrl);
        $(byPartialLinkText("Subscribers")).click();
        List<String> lastNamesBefore = $$(byXpath("//td[4]")).texts();
        System.out.println(lastNamesBefore);
        $(byId("add")).click();
        $(byId("fname")).sendKeys("FirstName");
        $(byId("lname")).sendKeys("LastName");
        $(byId("FEMALE")).click();
        $(byId("age")).clear();
        $(byId("age")).sendKeys("18");
        $(byCssSelector(".btn.btn-success")).click();

        List<String> lastNamesAfter = $$(byXpath("//td[4]")).texts();
        Assert.assertEquals(lastNamesBefore.size() + 1, lastNamesAfter.size());

        lastNamesBefore.add("LastName");
        Collections.sort(lastNamesBefore);
        Collections.sort(lastNamesAfter);

        Assert.assertEquals(lastNamesBefore, lastNamesAfter);
        sleep(3000);
    }

    @AfterClass
    public void tearDown() {
        closeWebDriver(); //Selenide.closeWeb..
    }
}