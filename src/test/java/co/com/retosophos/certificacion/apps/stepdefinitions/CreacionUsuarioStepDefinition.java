package co.com.retosophos.certificacion.apps.stepdefinitions;

import static co.com.retosophos.certificacion.apps.exceptions.LastupdateError.LASTUPDATE_INCORRECTO;
import static co.com.retosophos.certificacion.apps.utils.enums.EnumVariableSesion.NOMBRE_USUARIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.retosophos.certificacion.apps.exceptions.LastupdateError;
import co.com.retosophos.certificacion.apps.questions.VerificarParametroLastUpDate;
import co.com.retosophos.certificacion.apps.tasks.servicios.ConsultarUsuario;
import co.com.retosophos.certificacion.apps.tasks.servicios.CrearUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class CreacionUsuarioStepDefinition {

  @Cuando("creo el usuario {string} en Advantage")
  public void crearUsuarioServicio(String usuario) {
    theActorInTheSpotlight().attemptsTo(CrearUsuario.conNombreAleatorio(usuario));
  }

  @Y("consulto el usuario creado")
  public void ConsultarUsuarioServicio() {
    theActorInTheSpotlight()
        .attemptsTo(
            ConsultarUsuario.conNombre(
                theActorInTheSpotlight().recall(NOMBRE_USUARIO.getVariableSesion())));
  }

  @Entonces("la fecha de actualizacion concuerda con la de creacion")
  public void validarFechaActualizacion() {
    theActorInTheSpotlight()
        .should(
            seeThat(VerificarParametroLastUpDate.conDatos(), equalTo(true))
                .orComplainWith(LastupdateError.class, LASTUPDATE_INCORRECTO));
  }
}
