package BDDTestingOfGoogle.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
/*
This class consists locators from search result page of google search.
 */
public class GoogleResultPage extends AbstractPage{
    @NameOfElement("Link_to_yandex")
    @FindBy(xpath = "//a[@href='https://www.yandex.ru/']")
    public SelenideElement linkToYandex;

    @NameOfElement("Link_to_facebook")
    @FindBy(xpath = "//a[@href='https://www.facebook2.com/yandex/']")
    public SelenideElement linkToFacebook;
}
