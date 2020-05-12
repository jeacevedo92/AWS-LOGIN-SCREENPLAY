package co.com.cafeto.screenplay.userinterface;
import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://aws.amazon.com/en/")
public class AwsHomePage extends PageObject{

    public static final Target BTN_MY_ACCOUNT = Target.the("My Account").locatedBy("//a[contains(text(),'My Account')]");

    public static final Target BTN_ACCOUNT_SETTINGS = Target.the("Account Settings").locatedBy("//a[contains(text(),'Account Settings')]");


}
