
package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import testing.ui.SauceLoginPage;

public class LoginExitoso implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return SauceLoginPage.INVENTORY.resolveFor(actor).isVisible();
    }

    public static LoginExitoso validacion() {
        return new LoginExitoso();
    }
}
