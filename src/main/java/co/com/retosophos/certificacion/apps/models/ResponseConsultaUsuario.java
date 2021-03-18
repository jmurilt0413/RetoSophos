package co.com.retosophos.certificacion.apps.models;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lastUpdate",
    "lastUpdateId",
    "lastUpdateName"
})
public class ResponseConsultaUsuario implements Serializable{

  @JsonProperty("lastUpdate")
  private Long lastUpdate;
  @JsonProperty("lastUpdateId")
  private Long lastUpdateId;
  @JsonProperty("lastUpdateName")
  private String lastUpdateName;
  private final static long serialVersionUID = -6184800962694812909L;

  @JsonProperty("lastUpdate")
  public Long getLastUpdate() {
    return lastUpdate;
  }

  @JsonProperty("lastUpdate")
  public void setLastUpdate(Long lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  @JsonProperty("lastUpdateId")
  public Long getLastUpdateId() {
    return lastUpdateId;
  }

  @JsonProperty("lastUpdateId")
  public void setLastUpdateId(Long lastUpdateId) {
    this.lastUpdateId = lastUpdateId;
  }

  @JsonProperty("lastUpdateName")
  public String getLastUpdateName() {
    return lastUpdateName;
  }

  @JsonProperty("lastUpdateName")
  public void setLastUpdateName(String lastUpdateName) {
    this.lastUpdateName = lastUpdateName;
  }

}