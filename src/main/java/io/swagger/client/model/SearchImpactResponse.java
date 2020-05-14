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
import io.swagger.client.model.ComponentDetailResponse;
import io.swagger.client.model.PaginationData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchImpactResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class SearchImpactResponse {
  @SerializedName("pagination")
  private PaginationData pagination = null;

  @SerializedName("data")
  private List<ComponentDetailResponse> data = null;

  @SerializedName("analysisImpactCode")
  private String analysisImpactCode = null;

  public SearchImpactResponse pagination(PaginationData pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "Pagination")
  public PaginationData getPagination() {
    return pagination;
  }

  public void setPagination(PaginationData pagination) {
    this.pagination = pagination;
  }

  public SearchImpactResponse data(List<ComponentDetailResponse> data) {
    this.data = data;
    return this;
  }

  public SearchImpactResponse addDataItem(ComponentDetailResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<ComponentDetailResponse>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of components
   * @return data
  **/
  @ApiModelProperty(value = "List of components")
  public List<ComponentDetailResponse> getData() {
    return data;
  }

  public void setData(List<ComponentDetailResponse> data) {
    this.data = data;
  }

  public SearchImpactResponse analysisImpactCode(String analysisImpactCode) {
    this.analysisImpactCode = analysisImpactCode;
    return this;
  }

   /**
   * Analysis impact code
   * @return analysisImpactCode
  **/
  @ApiModelProperty(example = "0143dde8-3d81-44ac-ab77-fb5132c0f3b0", value = "Analysis impact code")
  public String getAnalysisImpactCode() {
    return analysisImpactCode;
  }

  public void setAnalysisImpactCode(String analysisImpactCode) {
    this.analysisImpactCode = analysisImpactCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchImpactResponse searchImpactResponse = (SearchImpactResponse) o;
    return Objects.equals(this.pagination, searchImpactResponse.pagination) &&
        Objects.equals(this.data, searchImpactResponse.data) &&
        Objects.equals(this.analysisImpactCode, searchImpactResponse.analysisImpactCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, data, analysisImpactCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchImpactResponse {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    analysisImpactCode: ").append(toIndentedString(analysisImpactCode)).append("\n");
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

