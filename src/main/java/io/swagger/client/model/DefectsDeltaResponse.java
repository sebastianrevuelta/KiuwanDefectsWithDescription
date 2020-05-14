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
 * DefectsDeltaResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class DefectsDeltaResponse {
  @SerializedName("Main analysis code")
  private String mainAnalysisCode = null;

  @SerializedName("Previous analysis code")
  private String previousAnalysisCode = null;

  @SerializedName("New violated rules count")
  private Integer newViolatedRulesCount = null;

  @SerializedName("Removed violated rules count")
  private Integer removedViolatedRulesCount = null;

  @SerializedName("New defects count")
  private Integer newDefectsCount = null;

  @SerializedName("Removed defects count")
  private Integer removedDefectsCount = null;

  public DefectsDeltaResponse mainAnalysisCode(String mainAnalysisCode) {
    this.mainAnalysisCode = mainAnalysisCode;
    return this;
  }

   /**
   * Main analysis code
   * @return mainAnalysisCode
  **/
  @ApiModelProperty(example = "A-7e3-16e5b1aad2a", value = "Main analysis code")
  public String getMainAnalysisCode() {
    return mainAnalysisCode;
  }

  public void setMainAnalysisCode(String mainAnalysisCode) {
    this.mainAnalysisCode = mainAnalysisCode;
  }

  public DefectsDeltaResponse previousAnalysisCode(String previousAnalysisCode) {
    this.previousAnalysisCode = previousAnalysisCode;
    return this;
  }

   /**
   * Previous analysis code
   * @return previousAnalysisCode
  **/
  @ApiModelProperty(example = "A-7e3-16dc9e29131", value = "Previous analysis code")
  public String getPreviousAnalysisCode() {
    return previousAnalysisCode;
  }

  public void setPreviousAnalysisCode(String previousAnalysisCode) {
    this.previousAnalysisCode = previousAnalysisCode;
  }

  public DefectsDeltaResponse newViolatedRulesCount(Integer newViolatedRulesCount) {
    this.newViolatedRulesCount = newViolatedRulesCount;
    return this;
  }

   /**
   * New violated rules count
   * @return newViolatedRulesCount
  **/
  @ApiModelProperty(example = "1", value = "New violated rules count")
  public Integer getNewViolatedRulesCount() {
    return newViolatedRulesCount;
  }

  public void setNewViolatedRulesCount(Integer newViolatedRulesCount) {
    this.newViolatedRulesCount = newViolatedRulesCount;
  }

  public DefectsDeltaResponse removedViolatedRulesCount(Integer removedViolatedRulesCount) {
    this.removedViolatedRulesCount = removedViolatedRulesCount;
    return this;
  }

   /**
   * Removed violated rules count
   * @return removedViolatedRulesCount
  **/
  @ApiModelProperty(example = "0", value = "Removed violated rules count")
  public Integer getRemovedViolatedRulesCount() {
    return removedViolatedRulesCount;
  }

  public void setRemovedViolatedRulesCount(Integer removedViolatedRulesCount) {
    this.removedViolatedRulesCount = removedViolatedRulesCount;
  }

  public DefectsDeltaResponse newDefectsCount(Integer newDefectsCount) {
    this.newDefectsCount = newDefectsCount;
    return this;
  }

   /**
   * New defects count
   * @return newDefectsCount
  **/
  @ApiModelProperty(example = "3", value = "New defects count")
  public Integer getNewDefectsCount() {
    return newDefectsCount;
  }

  public void setNewDefectsCount(Integer newDefectsCount) {
    this.newDefectsCount = newDefectsCount;
  }

  public DefectsDeltaResponse removedDefectsCount(Integer removedDefectsCount) {
    this.removedDefectsCount = removedDefectsCount;
    return this;
  }

   /**
   * Removed defects count
   * @return removedDefectsCount
  **/
  @ApiModelProperty(example = "0", value = "Removed defects count")
  public Integer getRemovedDefectsCount() {
    return removedDefectsCount;
  }

  public void setRemovedDefectsCount(Integer removedDefectsCount) {
    this.removedDefectsCount = removedDefectsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefectsDeltaResponse defectsDeltaResponse = (DefectsDeltaResponse) o;
    return Objects.equals(this.mainAnalysisCode, defectsDeltaResponse.mainAnalysisCode) &&
        Objects.equals(this.previousAnalysisCode, defectsDeltaResponse.previousAnalysisCode) &&
        Objects.equals(this.newViolatedRulesCount, defectsDeltaResponse.newViolatedRulesCount) &&
        Objects.equals(this.removedViolatedRulesCount, defectsDeltaResponse.removedViolatedRulesCount) &&
        Objects.equals(this.newDefectsCount, defectsDeltaResponse.newDefectsCount) &&
        Objects.equals(this.removedDefectsCount, defectsDeltaResponse.removedDefectsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainAnalysisCode, previousAnalysisCode, newViolatedRulesCount, removedViolatedRulesCount, newDefectsCount, removedDefectsCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefectsDeltaResponse {\n");
    
    sb.append("    mainAnalysisCode: ").append(toIndentedString(mainAnalysisCode)).append("\n");
    sb.append("    previousAnalysisCode: ").append(toIndentedString(previousAnalysisCode)).append("\n");
    sb.append("    newViolatedRulesCount: ").append(toIndentedString(newViolatedRulesCount)).append("\n");
    sb.append("    removedViolatedRulesCount: ").append(toIndentedString(removedViolatedRulesCount)).append("\n");
    sb.append("    newDefectsCount: ").append(toIndentedString(newDefectsCount)).append("\n");
    sb.append("    removedDefectsCount: ").append(toIndentedString(removedDefectsCount)).append("\n");
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

