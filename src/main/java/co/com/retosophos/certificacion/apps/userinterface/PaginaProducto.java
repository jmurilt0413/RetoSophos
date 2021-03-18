package co.com.retosophos.certificacion.apps.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaProducto {

  public static final Target BTN_ADD_CAR =
      Target.the("Agregar producto al carro de compras")
          .locatedBy("//*[@class='btn_primary btn_inventory']");
}
