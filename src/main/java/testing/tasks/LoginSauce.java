
package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import testing.ui.SauceLoginPage;

public class LoginSauce implements Task {

    private final String user;
    private final String pass;

    public LoginSauce(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(SauceLoginPage.USERNAME),
                Enter.theValue(pass).into(SauceLoginPage.PASSWORD),
                Click.on(SauceLoginPage.LOGIN_BUTTON)
        );
    }

    public static LoginSauce conCredenciales(String user, String pass) {
        return Tasks.instrumented(LoginSauce.class, user, pass);
    }
}
