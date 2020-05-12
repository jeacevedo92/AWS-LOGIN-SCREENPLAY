package co.com.cafeto.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import co.com.cafeto.screenplay.userinterface.AwsHomePage;
import net.serenitybdd.screenplay.actions.Click;

public class OpenAws implements Task {

    private AwsHomePage awsHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(awsHomePage));

        actor.attemptsTo(
                Click.on(AwsHomePage.BTN_MY_ACCOUNT),
                Click.on(AwsHomePage.BTN_ACCOUNT_SETTINGS)
        );

    }

    public static OpenAws LoginPage() {
        return Tasks.instrumented(OpenAws.class);
    }
}
