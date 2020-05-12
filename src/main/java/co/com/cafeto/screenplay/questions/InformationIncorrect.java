package co.com.cafeto.screenplay.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.cafeto.screenplay.userinterface.InfmationAccountAwsPage.BTM_HOME;
import static  co.com.cafeto.screenplay.userinterface.SignInAws.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InformationIncorrect  implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(INFORMATION_INCORRECT, isVisible())
                );

        return INFORMATION_INCORRECT.resolveFor(actor).isVisible();
    }

    public static InformationIncorrect is() {
        return new InformationIncorrect();
    }
}
