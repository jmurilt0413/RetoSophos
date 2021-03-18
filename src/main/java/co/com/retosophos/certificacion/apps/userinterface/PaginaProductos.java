package co.com.retosophos.certificacion.apps.userinterface;

import static org.openqa.selenium.By.id;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaProductos {

  public static final Target SELECCIONAR_PRODUCTO =
      Target.the("Selecciona el producto")
          .locatedBy("//*[@class='inventory_item_name' and contains(text(), '{0}')]");

  public static final Target BTN_CARRITO_COMPRAS =
      Target.the("Boton carrito de compras").located(id("shopping_cart_container"));
}
