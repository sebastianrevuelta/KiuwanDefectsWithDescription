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
import io.swagger.client.model.NavigationFilterData;
import java.io.IOException;

/**
 * It is necessary to indicate the name of the application or the analysis code, as well as the source and the target identifier
 */
@ApiModel(description = "It is necessary to indicate the name of the application or the analysis code, as well as the source and the target identifier")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class SubGraphImpactRequest {
  @SerializedName("applicationName")
  private String applicationName = null;

  @SerializedName("analysisCode")
  private String analysisCode = null;

  @SerializedName("sourceId")
  private Long sourceId = null;

  @SerializedName("targetId")
  private Long targetId = null;

  @SerializedName("navigationFilter")
  private NavigationFilterData navigationFilter = null;

  public SubGraphImpactRequest applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Application name
   * @return applicationName
  **/
  @ApiModelProperty(example = "myApp", value = "Application name")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public SubGraphImpactRequest analysisCode(String analysisCode) {
    this.analysisCode = analysisCode;
    return this;
  }

   /**
   * Analysis code
   * @return analysisCode
  **/
  @ApiModelProperty(example = "A-7e3-16dc9e29131", value = "Analysis code")
  public String getAnalysisCode() {
    return analysisCode;
  }

  public void setAnalysisCode(String analysisCode) {
    this.analysisCode = analysisCode;
  }

  public SubGraphImpactRequest sourceId(Long sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Source identifier
   * @return sourceId
  **/
  @ApiModelProperty(example = "5463", required = true, value = "Source identifier")
  public Long getSourceId() {
    return sourceId;
  }

  public void setSourceId(Long sourceId) {
    this.sourceId = sourceId;
  }

  public SubGraphImpactRequest targetId(Long targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * Target identifier
   * @return targetId
  **/
  @ApiModelProperty(example = "5467", required = true, value = "Target identifier")
  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }

  public SubGraphImpactRequest navigationFilter(NavigationFilterData navigationFilter) {
    this.navigationFilter = navigationFilter;
    return this;
  }

   /**
   * Navigation filter
   * @return navigationFilter
  **/
  @ApiModelProperty(required = true, value = "Navigation filter")
  public NavigationFilterData getNavigationFilter() {
    return navigationFilter;
  }

  public void setNavigationFilter(NavigationFilterData navigationFilter) {
    this.navigationFilter = navigationFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubGraphImpactRequest subGraphImpactRequest = (SubGraphImpactRequest) o;
    return Objects.equals(this.applicationName, subGraphImpactRequest.applicationName) &&
        Objects.equals(this.analysisCode, subGraphImpactRequest.analysisCode) &&
        Objects.equals(this.sourceId, subGraphImpactRequest.sourceId) &&
        Objects.equals(this.targetId, subGraphImpactRequest.targetId) &&
        Objects.equals(this.navigationFilter, subGraphImpactRequest.navigationFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, analysisCode, sourceId, targetId, navigationFilter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubGraphImpactRequest {\n");
    
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    analysisCode: ").append(toIndentedString(analysisCode)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    navigationFilter: ").append(toIndentedString(navigationFilter)).append("\n");
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

