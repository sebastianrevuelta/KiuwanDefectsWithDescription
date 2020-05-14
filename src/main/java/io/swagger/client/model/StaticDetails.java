/*
 * Kiuwan REST API
 * Kiuwan REST API specification
 *
 * OpenAPI spec version: 2.8.2004.3-SNAPSHOT
 * Contact: support@kiuwan.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DataFlowElement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StaticDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class StaticDetails {
  @SerializedName("dataFlow")
  private List<DataFlowElement> dataFlow = null;

  @SerializedName("parameter")
  private String parameter = null;

  public StaticDetails dataFlow(List<DataFlowElement> dataFlow) {
    this.dataFlow = dataFlow;
    return this;
  }

  public StaticDetails addDataFlowItem(DataFlowElement dataFlowItem) {
    if (this.dataFlow == null) {
      this.dataFlow = new ArrayList<DataFlowElement>();
    }
    this.dataFlow.add(dataFlowItem);
    return this;
  }

   /**
   * Data flow
   * @return dataFlow
  **/
  @ApiModelProperty(value = "Data flow")
  public List<DataFlowElement> getDataFlow() {
    return dataFlow;
  }

  public void setDataFlow(List<DataFlowElement> dataFlow) {
    this.dataFlow = dataFlow;
  }

  public StaticDetails parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * Injection point
   * @return parameter
  **/
  @ApiModelProperty(example = "cmd.CommandText", value = "Injection point")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticDetails staticDetails = (StaticDetails) o;
    return Objects.equals(this.dataFlow, staticDetails.dataFlow) &&
        Objects.equals(this.parameter, staticDetails.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataFlow, parameter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticDetails {\n");
    
    sb.append("    dataFlow: ").append(toIndentedString(dataFlow)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
