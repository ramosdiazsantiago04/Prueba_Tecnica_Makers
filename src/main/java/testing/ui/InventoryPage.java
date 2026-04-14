package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Localizadores de elementos en la página de inventario (productos) de SauceDemo.
 */
public class InventoryPage {

    private InventoryPage() { }

    /** Primer botón "Add to cart" disponible en la lista de productos */
    public static final Target FIRST_ADD_TO_CART_BUTTON = Target.the("primer botón Add to cart")
            .located(By.cssSelector(".inventory_item .btn_primary.btn_inventory"));

    /** Ícono del carrito de compras en la barra superior */
    public static final Target CART_ICON = Target.the("ícono del carrito")
            .located(By.id("shopping_cart_container"));

    /** Badge (número) que muestra la cantidad de items en el carrito */
    public static final Target CART_BADGE = Target.the("contador de items en el carrito")
            .located(By.className("shopping_cart_badge"));

    /** Título de la página de inventario */
    public static final Target INVENTORY_TITLE = Target.the("título de inventario")
            .located(By.className("title"));
}
