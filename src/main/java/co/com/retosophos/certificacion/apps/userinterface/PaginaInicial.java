package co.com.retosophos.certificacion.apps.userinterface;

import static org.openqa.selenium.By.id;

import net.serenitybdd.screenplay.targets.Target;

public final class PaginaInicial {

  public static final Target TXT_USUARIO = Target.the("Ingresar usuario")
      .located(id("user-name"));

  public static final Target TXT_CONTRASENHA = Target
      .the("Ingresar contraseña").located(id("password"));

  public static final Target BTN_LOGIN = Target
      .the("Boton login").located(id("login-button"));

}
