package testing.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import testing.questions.CartProductCount;
import testing.tasks.AddProductToCart;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

/**
 * Step Definitions para los escenarios relacionados con el carrito de compras.
 */
public class CartStepDefinitions {

    @When("agrega un producto al carrito")
    public void agregaUnProductoAlCarrito() {
        OnStage.withCurrentActor(AddProductToCart.enElCarrito());
    }

    @Then("el carrito debe mostrar {string} producto\\(s)")
    public void elCarritoDebeMostrarProductos(String expectedCount) {
        theActorInTheSpotlight().should(seeThat(CartProductCount.conCantidad(expectedCount)));
    }
}
