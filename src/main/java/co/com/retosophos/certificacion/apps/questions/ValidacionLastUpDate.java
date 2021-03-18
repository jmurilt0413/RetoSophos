package co.com.retosophos.certificacion.apps.questions;

import co.com.retosophos.certificacion.apps.models.ResponseConsultaUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionLastUpDate implements Question<Boolean> {

  private final ResponseConsultaUsuario responseConsultaUsuario;

  public ValidacionLastUpDate(ResponseConsultaUsuario responseConsultaUsuario) {
    this.responseConsultaUsuario = responseConsultaUsuario;
  }

  public static ValidacionLastUpDate esVacio(ResponseConsultaUsuario responseConsultaUsuario) {
    return new ValidacionLastUpDate(responseConsultaUsuario);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return (!responseConsultaUsuario.getLastUpdate().toString().equals(""));
  }
}
