package co.com.choucair.automation.android.tasks;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matcher;

import static co.com.choucair.automation.android.userinterfaces.ApplicationHomepage.LOGIN_BUTTON;
import static co.com.choucair.automation.android.userinterfaces.LoginPage.*;

public class Login implements Task {

    private String user;
    private String password;


    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    //se llama igual que la clase Login
    public static Login with(String user, String password) {
        return Tasks.instrumented(Login.class,user,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                    Enter.theValue(user).into(EMAIL_INPUT),
                    Click.on(EMAIL_BUTTON),
                    Click.on(PASSWORD_LINK),
                    Enter.theValue(user).into(PASSWORD_INPUT),
                    Click.on(PASSWORD_BUTTON),
                    WaitUntil.the(TEXT_LABEL,isPresent()).forNoMoreThan(10).seconds()
        );
    }
}
