package BDDTestingOfGoogle.pageobjects;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class OpenedWebPagesViaLinks extends AbstractPage {
    @NameOfElement("Yandex_page")
    @FindBy(id="text")
    public SelenideElement yandexPage;

}
