package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import testing.ui.InventoryPage;

/**
 * Question que valida que el badge del carrito muestra el número esperado de productos.
 */
public class CartProductCount implements Question<Boolean> {

    private final String expectedCount;

    public CartProductCount(String expectedCount) {
        this.expectedCount = expectedCount;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(InventoryPage.CART_BADGE).isDisplayed(),
                Ensure.that(InventoryPage.CART_BADGE).text().isEqualTo(expectedCount)
        );
        return true;
    }

    /**
     * Factory method: verifica que hay exactamente {@code count} productos en el carrito.
     */
    public static CartProductCount conCantidad(String count) {
        return new CartProductCount(count);
    }
}
