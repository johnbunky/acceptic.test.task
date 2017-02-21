package acceptic.test.task;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by johnbunky on 21.02.17.
 */
public class MainMailPage {
    public SelenideElement inbox(){
       return  $(byText("COMPOSE"));
    }
}
