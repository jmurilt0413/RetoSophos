package co.com.retosophos.certificacion.apps.tasks;

import static co.com.retosophos.certificacion.apps.userinterface.PaginaProducto.BTN_ADD_CAR;
import static co.com.retosophos.certificacion.apps.userinterface.PaginaProductos.BTN_CARRITO_COMPRAS;
import static co.com.retosophos.certificacion.apps.userinterface.PaginaProductos.SELECCIONAR_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProductoCarroCompras implements Task {

  private final String producto;

  public AgregarProductoCarroCompras(String producto) {
    this.producto = producto;
  }

  public static AgregarProductoCarroCompras producto(String producto) {
    return instrumented(AgregarProductoCarroCompras.class, producto);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(SELECCIONAR_PRODUCTO.of(producto)),
        Click.on(BTN_ADD_CAR),
        Click.on(BTN_CARRITO_COMPRAS));
  }
}
