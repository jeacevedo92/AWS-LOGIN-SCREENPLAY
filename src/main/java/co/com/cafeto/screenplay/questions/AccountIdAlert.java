package co.com.cafeto.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.cafeto.screenplay.userinterface.SignInAws.ACCOUNT_ID_ALERT;

public class AccountIdAlert implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return ACCOUNT_ID_ALERT.resolveFor(actor).isVisible();
    }

    public static AccountIdAlert is() {
        return new AccountIdAlert();
    }
}
