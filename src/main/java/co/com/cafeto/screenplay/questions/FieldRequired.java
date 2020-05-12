package co.com.cafeto.screenplay.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import static  co.com.cafeto.screenplay.userinterface.SignInAws.*;

public class FieldRequired implements Question<Boolean>{

    private String Field;

    public FieldRequired(String Field) {
        this.Field = Field;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (Field.equals("AccountId"))
            return ACCOUNT_ID_REQUIRED.resolveFor(actor).isVisible();
        else if (Field.equals("UserName"))
                return USERNAME_REQUIRED.resolveFor(actor).isVisible();
            else return PASSWORD_REQUIRED.resolveFor(actor).isVisible();
    }

    public static FieldRequired is(String Field) {
        return new FieldRequired(Field);
    }
}
