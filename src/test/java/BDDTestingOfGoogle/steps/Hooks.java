package BDDTestingOfGoogle.steps;


import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void setUpPreconditionsForTest() {
        open("https://www.google.ru/");
    }
}
