package acceptic.test.task;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by johnbunky on 21.02.17.
 */
public class GoogleMailPage {
    public UserMailPage mainMailPage(String login, String password){
        $("#Email").val(login).pressEnter();
        $("#Passwd").val(password);
        $("#signIn").click();
        $(".error-msg").waitUntil(disappears, 2000);
        return page(UserMailPage.class);
    }
}

