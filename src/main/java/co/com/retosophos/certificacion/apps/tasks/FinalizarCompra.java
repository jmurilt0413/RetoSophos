package co.com.retosophos.certificacion.apps.tasks;

import static co.com.retosophos.certificacion.apps.userinterface.PaginaCarritoCompras.BTN_CHECKOUT;
import static co.com.retosophos.certificacion.apps.userinterface.PaginaInformacion.BTN_CONTINUAR;
import static co.com.retosophos.certificacion.apps.userinterface.PaginaInformacion.TXT_CODGI_POSTAL;
import static co.com.retosophos.certificacion.apps.userinterface.PaginaInformacion.TXT_PRIMER_NOMBRE;
import static co.com.retosophos.certificacion.apps.userinterface.PaginaInformacion.TXT_SEGUNDO_NOMBRE;
import static co.com.retosophos.certificacion.apps.userinterface.PaginaRevisionCompra.BTN_FINALIZAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.retosophos.certificacion.apps.models.ClienteCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FinalizarCompra implements Task {

  private final String cliente;

  public FinalizarCompra(String cliente) {
    this.cliente = cliente;
  }

  public static FinalizarCompra conLosDatos(String cliente) {
    return instrumented(FinalizarCompra.class, cliente) ;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    ClienteCompra clienteCompra = new ClienteCompra(cliente);
    actor.attemptsTo(Click.on(BTN_CHECKOUT));
    actor.attemptsTo(
        Enter.theValue(clienteCompra.getNombre()).into(TXT_PRIMER_NOMBRE),
        Enter.theValue(clienteCompra.getApellido()).into(TXT_SEGUNDO_NOMBRE),
        Enter.theValue(clienteCompra.getCodigoPostal()).into(TXT_CODGI_POSTAL),
        Click.on(BTN_CONTINUAR),
        Click.on(BTN_FINALIZAR));
  }
}
