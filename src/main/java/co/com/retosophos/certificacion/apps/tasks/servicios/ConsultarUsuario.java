package co.com.retosophos.certificacion.apps.tasks.servicios;

import static co.com.retosophos.certificacion.apps.utils.enums.EnumRecursosServicios.CONSULTA_USUARIO;
import static co.com.retosophos.certificacion.apps.utils.enums.EnumVariableSesion.LASTUPDATE_CONSULTA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.retosophos.certificacion.apps.models.ResponseConsultaUsuario;
import java.util.Arrays;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultarUsuario implements Task {

  private final String nombreUsuario;

  public ConsultarUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  public static ConsultarUsuario conNombre(String nombreUsuario) {
    return instrumented(ConsultarUsuario.class, nombreUsuario);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Get.resource(String.format(CONSULTA_USUARIO.getRecurso(), nombreUsuario))
            .with(requestSpecification -> requestSpecification.header("accept", "*/*")));
    actor.remember(
        LASTUPDATE_CONSULTA.getVariableSesion(),
        Arrays.asList(SerenityRest.lastResponse().as(ResponseConsultaUsuario[].class))
            .get(0)
            .lastUpdate);
  }
}
