package co.com.retosophos.certificacion.apps.tasks.servicios;

import static co.com.retosophos.certificacion.apps.exceptions.CodigoRespuestaServicioError.CODIGO_RESPUESTA_SERVICIO;
import static co.com.retosophos.certificacion.apps.exceptions.LastupdateError.LASTUPDATE_INCORRECTO;
import static co.com.retosophos.certificacion.apps.utils.enums.EnumRecursosServicios.CREACION_USUARIO;
import static co.com.retosophos.certificacion.apps.utils.enums.EnumVariableSesion.LASTUPDATE_CREACION;
import static co.com.retosophos.certificacion.apps.utils.enums.EnumVariableSesion.NOMBRE_USUARIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import co.com.retosophos.certificacion.apps.exceptions.CodigoRespuestaServicioError;
import co.com.retosophos.certificacion.apps.exceptions.LastupdateError;
import co.com.retosophos.certificacion.apps.models.ResponseConsultaUsuario;
import co.com.retosophos.certificacion.apps.questions.CodigoRespuestaServicio;
import co.com.retosophos.certificacion.apps.questions.ValidacionLastUpDate;
import co.com.retosophos.certificacion.apps.utils.Aleatorios;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.apache.http.HttpStatus;

public class CrearUsuario implements Task {

  private final String usuario;

  /**
   * Este constructor genera un usuario con un sufijo aleatorio para propositos de repeticion de pruebas
   * @param usuario
   */
  public CrearUsuario(String usuario) {
    this.usuario = usuario + Aleatorios.generarAleatoriosNumeros(8);
  }

  public static Performable conNombreAleatorio(String usuario) {
    return Tasks.instrumented(CrearUsuario.class, usuario);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Post.to(String.format(CREACION_USUARIO.getRecurso(), usuario))
            .with(
                requestSpecification -> requestSpecification
                    .header("accept", "*/*").log().all()));
    actor.remember(
        LASTUPDATE_CREACION.getVariableSesion(),
        SerenityRest.lastResponse().as(ResponseConsultaUsuario.class).getLastUpdate());
    actor.remember(NOMBRE_USUARIO.getVariableSesion(), usuario);
    actor.should(
        seeThat(CodigoRespuestaServicio.obtenido(), equalTo(HttpStatus.SC_OK))
            .orComplainWith(CodigoRespuestaServicioError.class, CODIGO_RESPUESTA_SERVICIO));
    actor.should(
        seeThat(ValidacionLastUpDate
            .esVacio(SerenityRest.lastResponse().as(ResponseConsultaUsuario.class)), equalTo(true))
            .orComplainWith(LastupdateError.class, LASTUPDATE_INCORRECTO));
  }
}
