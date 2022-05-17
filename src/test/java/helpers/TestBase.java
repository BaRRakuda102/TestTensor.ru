package helpers;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    @BeforeAll
    static void BeforeAll() {
        Configuration.browserSize = "1980x1080";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
