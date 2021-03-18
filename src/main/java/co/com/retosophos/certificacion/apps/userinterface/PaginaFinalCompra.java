package co.com.retosophos.certificacion.apps.userinterface;

import static org.openqa.selenium.By.className;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaFinalCompra {

  public static final Target LBL_ORDEN =
      Target.the("Etiqueta con mensaje para finalizar compra")
          .located(className("complete-header"));
}
