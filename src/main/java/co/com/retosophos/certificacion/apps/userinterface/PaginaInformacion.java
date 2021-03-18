package co.com.retosophos.certificacion.apps.userinterface;

import static org.openqa.selenium.By.id;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaInformacion {

  public static final Target TXT_PRIMER_NOMBRE =
      Target.the("Ingresar nombre").located(id("first-name"));

  public static final Target TXT_SEGUNDO_NOMBRE =
      Target.the("Ingresar segundo nombre").located(id("last-name"));

  public static final Target TXT_CODGI_POSTAL =
      Target.the("Ingresar codigo postal").located(id("postal-code"));

  public static final Target BTN_CONTINUAR =
      Target.the("Boton continuar").locatedBy("//*[@class='btn_primary cart_button']");
}
