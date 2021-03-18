package co.com.retosophos.certificacion.apps.exceptions;

public class LastupdateError extends AssertionError {

  public static final String LASTUPDATE_INCORRECTO = "El atributo lastupdate se encuentra vacio";

  public LastupdateError(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
