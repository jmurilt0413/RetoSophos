package co.com.retosophos.certificacion.apps.stepdefinitions;

import static co.com.retosophos.certificacion.apps.exceptions.MensajeIncorrecto.MENSAJE_INCORRECTO_COMPRA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.retosophos.certificacion.apps.exceptions.MensajeIncorrecto;
import co.com.retosophos.certificacion.apps.questions.ValidarMensaje;
import co.com.retosophos.certificacion.apps.tasks.AgregarProductoCarroCompras;
import co.com.retosophos.certificacion.apps.tasks.FinalizarCompra;
import co.com.retosophos.certificacion.apps.tasks.IniciarSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class ValidarCompraStepDefinition {

  @Dado("que René ingresa a la pagina Saucedemo con el usuario {word}")
  public void iniciarSesionSaucedemo(String usuario) {
    theActorInTheSpotlight().attemptsTo(
        IniciarSesion.conUsuario(usuario));
  }

  @Cuando("{word} compra el articulo {string}")
  public void agregarProductoCarro(String cliente, String producto) {
    theActorInTheSpotlight().attemptsTo(
        AgregarProductoCarroCompras.producto(producto),
        FinalizarCompra.conLosDatos(cliente));
  }

  @Entonces("debería visualizar el siguiente mensaje: {string}")
  public void validarMensajeCompra(String mensaje) {
    theActorInTheSpotlight()
        .should(
            seeThat(
                ValidarMensaje.deCompra(),
                equalTo(
                    mensaje))
                .orComplainWith(MensajeIncorrecto.class, MENSAJE_INCORRECTO_COMPRA));
  }
}
