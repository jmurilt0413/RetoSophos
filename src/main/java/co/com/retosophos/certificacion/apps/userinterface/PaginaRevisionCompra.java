package co.com.retosophos.certificacion.apps.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaRevisionCompra {

  public static final Target BTN_FINALIZAR =
      Target.the("Boton finalizar").locatedBy("//*[@class='btn_action cart_button']");
}
