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
 * UnparsedFileData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class UnparsedFileData {
  @SerializedName("file")
  private String file = null;

  @SerializedName("cause")
  private String cause = null;

  public UnparsedFileData file(String file) {
    this.file = file;
    return this;
  }

   /**
   * Unparsed file name
   * @return file
  **/
  @ApiModelProperty(example = "FileSystemSQL.java", value = "Unparsed file name")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public UnparsedFileData cause(String cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Cause
   * @return cause
  **/
  @ApiModelProperty(example = "com.als.core.parser.ParseException: Cannot parse FileSystemSQL.java, due to: com.als.parsers.plsql.ParseException: Parse error at line 18, column 1.  Encountered: ALTER", value = "Cause")
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnparsedFileData unparsedFileData = (UnparsedFileData) o;
    return Objects.equals(this.file, unparsedFileData.file) &&
        Objects.equals(this.cause, unparsedFileData.cause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, cause);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnparsedFileData {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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

