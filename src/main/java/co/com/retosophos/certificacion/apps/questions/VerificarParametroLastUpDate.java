package co.com.retosophos.certificacion.apps.questions;

import static co.com.retosophos.certificacion.apps.utils.enums.EnumVariableSesion.LASTUPDATE_CONSULTA;
import static co.com.retosophos.certificacion.apps.utils.enums.EnumVariableSesion.LASTUPDATE_CREACION;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarParametroLastUpDate implements Question<Boolean> {

  private final Long LastUpDateCreacion =
      theActorInTheSpotlight().recall(LASTUPDATE_CREACION.getVariableSesion());

  private final Long LastUpDateConsulta =
      theActorInTheSpotlight().recall(LASTUPDATE_CONSULTA.getVariableSesion());

  public static VerificarParametroLastUpDate conDatos() {
    return new VerificarParametroLastUpDate();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return LastUpDateCreacion.equals(LastUpDateConsulta);
  }
}
