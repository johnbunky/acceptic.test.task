package acceptic.test.task;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

 class UserMailPage {
    SelenideElement compose(){
       return  $(byText("COMPOSE"));
    }

     String getUnreadCounter() {
        String str =  $("span>a[aria-label]").getText();
        String[] str1 = str.split(" ");
        return  str1[1];
    }
}
