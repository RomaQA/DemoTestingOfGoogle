package BDDTestingOfGoogle.pageobjects;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
/*
This class consists locators of web pages which have been opened from google search list.
 */
public class OpenedWebPagesViaLinks extends AbstractPage {
    @NameOfElement("Yandex_page")
    @FindBy(css="div.home-logo__default")
    public SelenideElement yandexPage;

}
