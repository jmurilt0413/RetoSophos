package co.com.retosophos.certificacion.apps.exceptions;

public class MensajeIncorrecto extends AssertionError {

  public static final String MENSAJE_INCORRECTO_COMPRA =
      "El mensaje encontrado no es igual al esperado";

  public MensajeIncorrecto(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
