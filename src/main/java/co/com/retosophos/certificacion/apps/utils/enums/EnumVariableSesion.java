package co.com.retosophos.certificacion.apps.utils.enums;

public enum EnumVariableSesion {
  LASTUPDATE_CREACION("Ultima actualización creacion"),
  LASTUPDATE_CONSULTA("Ultima actualización consulta"),
  NOMBRE_USUARIO("Nombre del usuario");

  private final String variableSesion;

  public String getVariableSesion() {
    return variableSesion;
  }

  EnumVariableSesion(String variableSesion) {
    this.variableSesion = variableSesion;
  }
}
