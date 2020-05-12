package co.com.cafeto.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class SignInAws {

    public static final Target TXT_ROOT_USER = Target.the("Root user email address").located(By.id("resolving_input"));
    public static final Target BTN_NEXT = Target.the("Next button").located(By.id("next_button_text"));
    public static final Target TXT_ACCOUNT_ID = Target.the("Account ID (12 digits) or account alias").located(By.id("account"));
    public static final Target TXT_USER_NAME = Target.the("IAM user name").located(By.id("username"));
    public static final Target TXT_PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target BTN_SIGN_IN= Target.the("Sign In button").located(By.id("signin_button"));

    public static final Target ACCOUNT_ID_REQUIRED = Target.the("My Account").locatedBy("//div[@id='accountFields']/fieldset/div[1][@class='textinput error']");
    public static final Target USERNAME_REQUIRED = Target.the("My Account").locatedBy("//div[@id='accountFields']/fieldset/div[2][@class='textinput error']");
    public static final Target PASSWORD_REQUIRED = Target.the("My Account").locatedBy("//div[@id='accountFields']/fieldset/div[3][@class='textinput error']");

    public static final Target INFORMATION_INCORRECT = Target.the("My Account").locatedBy("//div[@id='main_message' and @class!='hide-page show-page ng-hide']");

    public static final Target ACCOUNT_ID_ALERT = Target.the("Password").located(By.id("resolving_account_input_alert_content"));

}
