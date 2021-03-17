package co.com.retosophos.certificacion.apps.questions;

import static co.com.retosophos.certificacion.apps.userinterface.PaginaFinalCompra.LBL_ORDEN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarMensaje implements Question<String> {

  public static ValidarMensaje deCompra() {
    return new ValidarMensaje();
  }

  @Override
  public String answeredBy(Actor actor) {
    return LBL_ORDEN.resolveFor(actor).getText();
  }
}
