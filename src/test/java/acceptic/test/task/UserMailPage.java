package acceptic.test.task;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by johnbunky on 21.02.17.
 */
public class UserMailPage {
    public SelenideElement compose(){
       return  $(byText("COMPOSE"));
    }

    public String getUnreadCounter() {
        String str =  $("span>a[aria-label]").getText();
        String[] str1 = str.split(" ");
        return  str1[1];
    }
}
