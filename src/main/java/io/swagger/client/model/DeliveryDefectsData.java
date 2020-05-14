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
import java.io.IOException;

/**
 * DeliveryDefectsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class DeliveryDefectsData {
  @SerializedName("newDefects")
  private Integer newDefects = null;

  @SerializedName("removedDefects")
  private Integer removedDefects = null;

  @SerializedName("defects")
  private Integer defects = null;

  public DeliveryDefectsData newDefects(Integer newDefects) {
    this.newDefects = newDefects;
    return this;
  }

   /**
   * Number of new defects
   * @return newDefects
  **/
  @ApiModelProperty(example = "3", value = "Number of new defects")
  public Integer getNewDefects() {
    return newDefects;
  }

  public void setNewDefects(Integer newDefects) {
    this.newDefects = newDefects;
  }

  public DeliveryDefectsData removedDefects(Integer removedDefects) {
    this.removedDefects = removedDefects;
    return this;
  }

   /**
   * Number of removed defects
   * @return removedDefects
  **/
  @ApiModelProperty(example = "0", value = "Number of removed defects")
  public Integer getRemovedDefects() {
    return removedDefects;
  }

  public void setRemovedDefects(Integer removedDefects) {
    this.removedDefects = removedDefects;
  }

  public DeliveryDefectsData defects(Integer defects) {
    this.defects = defects;
    return this;
  }

   /**
   * Total defects
   * @return defects
  **/
  @ApiModelProperty(example = "582", value = "Total defects")
  public Integer getDefects() {
    return defects;
  }

  public void setDefects(Integer defects) {
    this.defects = defects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryDefectsData deliveryDefectsData = (DeliveryDefectsData) o;
    return Objects.equals(this.newDefects, deliveryDefectsData.newDefects) &&
        Objects.equals(this.removedDefects, deliveryDefectsData.removedDefects) &&
        Objects.equals(this.defects, deliveryDefectsData.defects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newDefects, removedDefects, defects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryDefectsData {\n");
    
    sb.append("    newDefects: ").append(toIndentedString(newDefects)).append("\n");
    sb.append("    removedDefects: ").append(toIndentedString(removedDefects)).append("\n");
    sb.append("    defects: ").append(toIndentedString(defects)).append("\n");
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

