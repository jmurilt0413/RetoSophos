package co.com.retosophos.certificacion.apps.utils.enums;

public enum EnumCredenciales {
  CREDENCIALES_SAUCEDEMO("standard_user", "secret_sauce");

  private final String usuario;
  private final String clave;

  EnumCredenciales(String usuario, String clave) {
    this.usuario = usuario;
    this.clave = clave;
  }

  public String getUsuario() {
    return usuario;
  }

  public String getClave() {
    return clave;
  }
}
