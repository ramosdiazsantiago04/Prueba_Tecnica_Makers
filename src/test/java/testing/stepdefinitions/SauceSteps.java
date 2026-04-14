
package testing.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.GivenWhenThen;
import testing.tasks.LoginSauce;
import testing.questions.LoginExitoso;

public class SauceSteps {

    Actor Santiago = Actor.named("Santiago");

    @Given("que el usuario abre la pagina de SauceDemo")
    public void abrirPagina() {
        Santiago.wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("ingresa credenciales validas")
    public void login() {
        Santiago.attemptsTo(
                LoginSauce.conCredenciales("standard_user", "secret_sauce")
        );
    }

    @Then("deberia ver el inventario")
    public void validar() {
        Santiago.should(
                GivenWhenThen.seeThat(LoginExitoso.validacion())
        );
    }
}
