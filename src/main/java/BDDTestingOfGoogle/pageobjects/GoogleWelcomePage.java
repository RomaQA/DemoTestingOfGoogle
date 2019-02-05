package BDDTestingOfGoogle.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;


public class GoogleWelcomePage extends AbstractPage {
    @NameOfElement("Search_field")
    @FindBy(name = "q")
    public SelenideElement searchField;

    @NameOfElement("Search_button")
    @FindBy(name = "btnK")
    public SelenideElement searchButton;

}
