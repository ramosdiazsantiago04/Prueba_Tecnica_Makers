
package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SauceLoginPage {

    public static final Target USERNAME = Target.the("username")
            .located(By.id("user-name"));

    public static final Target PASSWORD = Target.the("password")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.id("login-button"));

    public static final Target INVENTORY = Target.the("inventory title")
            .located(By.className("title"));
}
