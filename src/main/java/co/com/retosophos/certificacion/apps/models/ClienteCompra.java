package co.com.retosophos.certificacion.apps.models;

public class ClienteCompra {

  private final String nombre;
  private final String apellido;
  private final String codigoPostal;

  /**
   * Debido a la simplicidad del reto no se requiere implementar una solucion mas
   * flexible, en caso que el proyecto creciera implementaria un patron builder con
   * esos valores por defecto que facilitaran la creación de la test data
   * @param nombre
   */
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
