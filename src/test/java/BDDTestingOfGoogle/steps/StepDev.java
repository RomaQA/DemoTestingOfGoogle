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
import static org.junit.Assert.fail;


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
        googleWelcomePage.get("Search_field").shouldBe(visible); // Checking that the search field is visible
        googleWelcomePage.get("Search_field").sendKeys(searchWord); // typing of search word



    }

    @And("^press on search button$")
    public void pressOnSearchButton(){
        googleWelcomePage.get("Search_button").shouldBe(visible); // Checking that the search button is visible
        googleWelcomePage.get("Search_button").click(); // Clicking on the search button
    }

    @Then("^displays result list with link to https://www.yandex.ru$")
    public void displaysResultListWithLinkToYandex(){
        googleResultPage.get("Link_to_yandex").shouldBe(visible); // Checking that search list has searching link.
    }

    @And("^press on the link https://www.yandex.ru$")
    public void pressOnTheLinkYandex()  {

        googleResultPage.get("Link_to_yandex").click(); // Clicking on the link
    }

    @Then("^press on the link https://www.facebook2.com/yandex/$")
    public void pressOnTheLinkFacebook()  {   //
        googleResultPage.get("Link_to_facebook").click(); // Clicking on the link
    }

    @Then("^yandex web page is opened.$")
    public void webPageIsOpened()  {
        openedWebPagesViaLinks.get("Yandex_page").isDisplayed();
    }

}
