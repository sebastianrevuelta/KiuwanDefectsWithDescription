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
 * PaginationData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class PaginationData {
  @SerializedName("page")
  private Integer page = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("total")
  private Long total = null;

  public PaginationData page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page number
   * @return page
  **/
  @ApiModelProperty(example = "1", value = "Page number")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public PaginationData count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of components per page
   * @return count
  **/
  @ApiModelProperty(example = "500", value = "Number of components per page")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaginationData total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Total Components
   * @return total
  **/
  @ApiModelProperty(example = "5654", value = "Total Components")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationData paginationData = (PaginationData) o;
    return Objects.equals(this.page, paginationData.page) &&
        Objects.equals(this.count, paginationData.count) &&
        Objects.equals(this.total, paginationData.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, count, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationData {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

