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
 * BusinessValuePortfolioRoleData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class BusinessValuePortfolioRoleData {
  /**
   * Portfolio type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SYSTEM("SYSTEM");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("portfolioValue")
  private String portfolioValue = null;

  @SerializedName("roleName")
  private String roleName = null;

  public BusinessValuePortfolioRoleData type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Portfolio type
   * @return type
  **/
  @ApiModelProperty(example = "SYSTEM", value = "Portfolio type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BusinessValuePortfolioRoleData portfolioValue(String portfolioValue) {
    this.portfolioValue = portfolioValue;
    return this;
  }

   /**
   * Portfolio value
   * @return portfolioValue
  **/
  @ApiModelProperty(example = "CRITICAL", value = "Portfolio value")
  public String getPortfolioValue() {
    return portfolioValue;
  }

  public void setPortfolioValue(String portfolioValue) {
    this.portfolioValue = portfolioValue;
  }

  public BusinessValuePortfolioRoleData roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Name of the role to assign
   * @return roleName
  **/
  @ApiModelProperty(example = "Readonly", value = "Name of the role to assign")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessValuePortfolioRoleData businessValuePortfolioRoleData = (BusinessValuePortfolioRoleData) o;
    return Objects.equals(this.type, businessValuePortfolioRoleData.type) &&
        Objects.equals(this.portfolioValue, businessValuePortfolioRoleData.portfolioValue) &&
        Objects.equals(this.roleName, businessValuePortfolioRoleData.roleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, portfolioValue, roleName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessValuePortfolioRoleData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    portfolioValue: ").append(toIndentedString(portfolioValue)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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
