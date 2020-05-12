package co.com.cafeto.screenplay.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hook {

    @Managed(driver="chrome")
    private WebDriver suNavegador;

    public static Actor nombreActor = Actor.named("jhon");

    @Before
    public void configuracionInicial() {
        nombreActor.can(BrowseTheWeb.with(suNavegador));
    }


}
