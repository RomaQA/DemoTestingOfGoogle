package BDDTestingOfGoogle.steps;


import BDDTestingOfGoogle.pageobjects.*;

import com.codeborne.selenide.commands.IsDisplayed;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import javafx.scene.control.TextFormatter;
import jdk.nashorn.internal.runtime.Undefined;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static com.codeborne.selenide.Selectors.*;


public class StepDev {

    GoogleWelcomePage googleWelcomePage = page(GoogleWelcomePage.class);
    GoogleResultPage googleResultPage = page(GoogleResultPage.class);
    OpenedWebPagesViaLinks openedWebPagesViaLinks=page(OpenedWebPagesViaLinks.class);

    @Given("^open google$")
    public void openGoogle() {
        open("https://www.google.ru/");

    }

    @When("^input word \"([^\"]*)\" to the search field$")
    public void inputWordYandexInSearchField(String searchWord) {
        googleWelcomePage.get("Search_field").shouldBe(visible); // Проверяем, что строка поиска google видна
        googleWelcomePage.get("Search_field").sendKeys(searchWord); //Печатаем искомое слово



    }

    @And("^press on search button$")
    public void pressOnSearchButton(){
        googleWelcomePage.get("Search_button").shouldBe(visible); // Проверям, что кнопка "Поиск в Google" видна
        googleWelcomePage.get("Search_button").click(); // Нажимаем на кнпоку поиска
    }

    @Then("^displays result list with link to \"([^\"]*)\"$")
    public void displaysResultListWithLinkToYandex(String link)  {
        googleResultPage.get("Link_to_yandex").shouldHave(text(link)); // проверяем, что в результатах поиска имеется искомая ссылка.
    }

    @And("^press on the link \"([^\"]*)\"$")
    public void pressOnTheLink(String link)  {
        googleResultPage.get("Link_to_yandex").shouldHave(text(link)).click(); // сверяем, что ссылка правильная и нажимаем на нее
    }

    @Then("^yandex web page is opened.$")
    public void webPageIsOpened()  {
        openedWebPagesViaLinks.get("Yandex_page").isDisplayed();
    }
}
