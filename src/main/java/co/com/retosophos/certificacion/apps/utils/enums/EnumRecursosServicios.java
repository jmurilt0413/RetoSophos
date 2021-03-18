package co.com.retosophos.certificacion.apps.utils.enums;

public enum EnumRecursosServicios {
  CREACION_USUARIO("catalog/api/v1/catalog/LastUpdate/create/%s"),
  CONSULTA_USUARIO("catalog/api/v1/catalog/LastUpdate/%s");

  private final String recurso;

  public String getRecurso() {
    return recurso;
  }

  EnumRecursosServicios(String recurso) {
    this.recurso = recurso;
  }
}
