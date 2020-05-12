package co.com.cafeto.screenplay.stepdefinitions;
import static co.com.cafeto.screenplay.stepdefinitions.Hook.nombreActor;

import co.com.cafeto.screenplay.model.User;
import co.com.cafeto.screenplay.questions.FieldRequired;
import co.com.cafeto.screenplay.questions.InformationIncorrect;
import co.com.cafeto.screenplay.tasks.*;
import  co.com.cafeto.screenplay.tasks.LoginAws;
import static co.com.cafeto.screenplay.model.builders.UserBuilder.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import co.com.cafeto.screenplay.questions.LoginSuccessfull;
import co.com.cafeto.screenplay.questions.AccountIdAlert;

public class AwsLoginStepDefinition {



    @Given("^that (.*) is a aws user$")
    public void thatIsAAwsUser(String nameActor) {
        nombreActor.wasAbleTo(OpenAws.LoginPage());

    }

    @When("^He Login aws account with (.*),(.*) and (.*)")
    public void heLoginAwsAccount(String AccountId, String UserName, String Password) {
        User user = DefaultCredentials().
                WithUserName(UserName).
                WithPassword(Password).
                WithAccountId(AccountId).
                build();

        nombreActor.attemptsTo(
                LoginAws.with(user)
        );
    }



    @Then("^Login is successfull$")
    public void loginIsSuccessfull() {
        nombreActor.should(seeThat(LoginSuccessfull.is()));
    }

    @Then("^Account Id Alert should be displayed$")
    public void AccountIdAlertShouldBeDisplay() {
        nombreActor.should(seeThat(AccountIdAlert.is()));
    }

    @Then("^(.*) field must be required$")
    public void fieldMustBeRequired(String Field) {
        nombreActor.should(seeThat(FieldRequired.is(Field)));
    }

    @Then("^Error message should be displayed$")
    public void ErrorMessage() {
        nombreActor.should(seeThat(InformationIncorrect.is()));
    }




}
