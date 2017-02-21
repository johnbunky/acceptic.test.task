package acceptic.test.task;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by johnbunky on 21.02.17.
 */
public class GoogleTest {
    @BeforeClass
    public static void setup(){
        startMaximized = false;
        browser = "chrome";
        holdBrowserOpen = true;
    }
    @Test
    public void loginSucces() {

        // Arrage
        GoogleMailPage mailPage = open("https://mail.google.com", GoogleMailPage.class);

        // Act
        MainMailPage userPage = mailPage.mainMailPage("treasy.uitest@gmail.com", "N3cqNkjF6RvN");

        // Assert
        userPage.inbox().should(exist);
    }
    @Test
    public void unreadCounter(){

    }
}
