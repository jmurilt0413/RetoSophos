package co.com.retosophos.certificacion.apps.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaCarritoCompras {

  public static final Target BTN_CHECKOUT = Target
      .the("Selecciona el boton checkout").locatedBy("//*[@class='btn_action checkout_button']");

}
