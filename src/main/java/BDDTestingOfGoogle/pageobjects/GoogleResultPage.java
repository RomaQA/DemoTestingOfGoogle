package BDDTestingOfGoogle.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class GoogleResultPage extends AbstractPage{
    @NameOfElement("Link_to_yandex")
    @FindBy(xpath = "//a[@href='https://www.yandex.ru/']")
    public SelenideElement linkToYandex;
}
