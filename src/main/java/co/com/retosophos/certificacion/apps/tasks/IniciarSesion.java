package co.com.retosophos.certificacion.apps.tasks;

import static co.com.retosophos.certificacion.apps.userinterface.PaginaInicial.BTN_LOGIN;
import static co.com.retosophos.certificacion.apps.userinterface.PaginaInicial.TXT_CONTRASENHA;
import static co.com.retosophos.certificacion.apps.userinterface.PaginaInicial.TXT_USUARIO;
import static co.com.retosophos.certificacion.apps.utils.enums.EnumCredenciales.CREDENCIALES_SAUCEDEMO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;


public class IniciarSesion implements Task {

  EnvironmentVariables environmentVariable;


  public static IniciarSesion conUsuario(String usuario) {
    return instrumented(IniciarSesion.class, usuario);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Open.url(String.valueOf(environmentVariable.getProperty("environments.default.baseurl"))),
        Enter.theValue(CREDENCIALES_SAUCEDEMO.getUsuario()).into(TXT_USUARIO),
        Enter.theValue(CREDENCIALES_SAUCEDEMO.getClave()).into(TXT_CONTRASENHA),
        Click.on(BTN_LOGIN));
  }
}
