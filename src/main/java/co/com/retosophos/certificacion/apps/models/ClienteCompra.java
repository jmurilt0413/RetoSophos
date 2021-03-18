package co.com.retosophos.certificacion.apps.models;

public class ClienteCompra {

  private final String nombre;
  private final String apellido;
  private final String codigoPostal;

  public ClienteCompra(String nombre) {
    this.nombre = nombre;
    this.apellido = "Murillo";
    this.codigoPostal = "00500010";
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getCodigoPostal() {
    return codigoPostal;
  }
}
