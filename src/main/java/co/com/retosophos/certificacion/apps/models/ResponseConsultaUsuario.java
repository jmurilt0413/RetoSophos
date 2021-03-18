package co.com.retosophos.certificacion.apps.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"lastUpdateId", "lastUpdateName", "lastUpdate"})
public class ResponseConsultaUsuario implements Serializable {

  @JsonProperty("lastUpdateId")
  public Long lastUpdateId;

  @JsonProperty("lastUpdateName")
  public String lastUpdateName;

  @JsonProperty("lastUpdate")
  public Long lastUpdate;

  private static final long serialVersionUID = -3563913275783308058L;
}
