package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.ui.InventoryPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Tarea que agrega el primer producto disponible del inventario al carrito de compras.
 */
public class AddProductToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InventoryPage.FIRST_ADD_TO_CART_BUTTON)
        );
    }

    /**
     * Factory method para instanciar la tarea de forma compatible con Screenplay.
     */
    public static AddProductToCart enElCarrito() {
        return instrumented(AddProductToCart.class);
    }
}
