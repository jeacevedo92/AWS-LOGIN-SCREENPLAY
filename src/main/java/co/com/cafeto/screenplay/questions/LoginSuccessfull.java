package co.com.cafeto.screenplay.questions;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import static  co.com.cafeto.screenplay.userinterface.InfmationAccountAwsPage.BTM_HOME;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class LoginSuccessfull implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(BTM_HOME, isVisible())
                );
        return BTM_HOME.resolveFor(actor).isVisible();
    }

    public static LoginSuccessfull is() {
        return new LoginSuccessfull();
    }

}
