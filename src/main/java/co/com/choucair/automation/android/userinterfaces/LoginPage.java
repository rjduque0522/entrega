package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target EMAIL_INPUT = Target.the("Ingresar email")
            .located(By.id("org.wordpress.android:id/input"));

    public static final Target EMAIL_BUTTON = Target.the("Ingresar contraseña")
            .located(By.id("org.wordpress.android:id/primary_button"));

    public static final Target PASSWORD_LINK = Target.the("Login button")
            .located(By.id("org.wordpress.android:id/login_enter_password"));


    public static final Target PASSWORD_INPUT = Target.the("Login button")
            .located(By.id("org.wordpress.android:id/input"));


    public static final Target PASSWORD_BUTTON = Target.the("Login button")
            .located(By.id("org.wordpress.android:id/prymary_button"));


    public static final Target TEXT_LABEL = Target.the("Login button")
            .located(By.id("org.wordpress.android:id/logged_in_as_heading"));
}
