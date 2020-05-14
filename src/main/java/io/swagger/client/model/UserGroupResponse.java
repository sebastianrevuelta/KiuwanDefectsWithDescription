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
import java.util.ArrayList;
import java.util.List;

/**
 * UserGroupResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class UserGroupResponse {
  @SerializedName("name")
  private String name = null;

  @SerializedName("users")
  private List<String> users = null;

  public UserGroupResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User group name
   * @return name
  **/
  @ApiModelProperty(example = "CMSDevelopers", value = "User group name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserGroupResponse users(List<String> users) {
    this.users = users;
    return this;
  }

  public UserGroupResponse addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Group users list
   * @return users
  **/
  @ApiModelProperty(example = "\"john.smith@myCompany.com, kelly.smith@myCompany.com\"", value = "Group users list")
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroupResponse userGroupResponse = (UserGroupResponse) o;
    return Objects.equals(this.name, userGroupResponse.name) &&
        Objects.equals(this.users, userGroupResponse.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroupResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
