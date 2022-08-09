package com.playground.exportTest.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Root container of one calculation result
 **/
@ApiModel(description = "Root container of one calculation result")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-08-05T11:24:34.216210100+02:00[Europe/Berlin]")
public class Measurement   {
  
  private @Valid Integer id = null;
  private @Valid String name = null;
  private @Valid Integer connectorId = null;
  private @Valid Integer configId = null;

  /**
   **/
  public Measurement id(Integer id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

/**
   **/
  public Measurement name(String name) {
    this.name = name;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

/**
   **/
  public Measurement connectorId(Integer connectorId) {
    this.connectorId = connectorId;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("connectorId")
  @NotNull
  public Integer getConnectorId() {
    return connectorId;
  }

  public void setConnectorId(Integer connectorId) {
    this.connectorId = connectorId;
  }

/**
   **/
  public Measurement configId(Integer configId) {
    this.configId = configId;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("configId")
  @NotNull
  public Integer getConfigId() {
    return configId;
  }

  public void setConfigId(Integer configId) {
    this.configId = configId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Measurement measurement = (Measurement) o;
    return Objects.equals(this.id, measurement.id) &&
        Objects.equals(this.name, measurement.name) &&
        Objects.equals(this.connectorId, measurement.connectorId) &&
        Objects.equals(this.configId, measurement.configId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, connectorId, configId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measurement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

