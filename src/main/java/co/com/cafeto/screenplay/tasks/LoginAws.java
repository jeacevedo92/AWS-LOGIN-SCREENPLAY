package co.com.cafeto.screenplay.tasks;

import co.com.cafeto.screenplay.model.User;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.cafeto.screenplay.userinterface.SignInAws;

public class LoginAws  implements Task {

    private User user;

    public LoginAws(User user){
        this.user=user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(user.getAccountId()).into(SignInAws.TXT_ROOT_USER),
                Click.on(SignInAws.BTN_NEXT)

        );
        if(!user.getAccountId().isEmpty()){
            actor.attemptsTo(
                    Enter.theValue(user.getAccountId()).into(SignInAws.TXT_ACCOUNT_ID),
                    Enter.theValue(user.getUserName()).into(SignInAws.TXT_USER_NAME),
                    Enter.theValue(user.getPassword()).into(SignInAws.TXT_PASSWORD),
                    Click.on(SignInAws.BTN_SIGN_IN)

            );
        }
    }

    public static LoginAws with(User user) {
        return Tasks.instrumented(LoginAws.class, user) ;
    }
}
