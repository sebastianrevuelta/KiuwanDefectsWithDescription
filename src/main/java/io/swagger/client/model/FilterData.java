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
import io.swagger.client.model.GroupTagData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FilterData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class FilterData {
  @SerializedName("contains")
  private String contains = null;

  @SerializedName("notContains")
  private String notContains = null;

  @SerializedName("languages")
  private String languages = null;

  @SerializedName("types")
  private String types = null;

  @SerializedName("analyzed")
  private Boolean analyzed = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("groupTags")
  private List<GroupTagData> groupTags = null;

  public FilterData contains(String contains) {
    this.contains = contains;
    return this;
  }

   /**
   * Contains filter
   * @return contains
  **/
  @ApiModelProperty(example = "custom.js", value = "Contains filter")
  public String getContains() {
    return contains;
  }

  public void setContains(String contains) {
    this.contains = contains;
  }

  public FilterData notContains(String notContains) {
    this.notContains = notContains;
    return this;
  }

   /**
   * Not contains filter
   * @return notContains
  **/
  @ApiModelProperty(example = "testFactory", value = "Not contains filter")
  public String getNotContains() {
    return notContains;
  }

  public void setNotContains(String notContains) {
    this.notContains = notContains;
  }

  public FilterData languages(String languages) {
    this.languages = languages;
    return this;
  }

   /**
   * Languages filter, comma-separated list of languages to filter by (List of supported technologies in https://www.kiuwan.com/docs/display/K5/Kiuwan+Supported+Technologies)
   * @return languages
  **/
  @ApiModelProperty(example = "java,javascript", value = "Languages filter, comma-separated list of languages to filter by (List of supported technologies in https://www.kiuwan.com/docs/display/K5/Kiuwan+Supported+Technologies)")
  public String getLanguages() {
    return languages;
  }

  public void setLanguages(String languages) {
    this.languages = languages;
  }

  public FilterData types(String types) {
    this.types = types;
    return this;
  }

   /**
   * Types filter, comma-separated list of types to filter by
   * @return types
  **/
  @ApiModelProperty(example = "program,element,map,class", value = "Types filter, comma-separated list of types to filter by")
  public String getTypes() {
    return types;
  }

  public void setTypes(String types) {
    this.types = types;
  }

  public FilterData analyzed(Boolean analyzed) {
    this.analyzed = analyzed;
    return this;
  }

   /**
   * Is analyzed filter
   * @return analyzed
  **/
  @ApiModelProperty(example = "true", value = "Is analyzed filter")
  public Boolean isAnalyzed() {
    return analyzed;
  }

  public void setAnalyzed(Boolean analyzed) {
    this.analyzed = analyzed;
  }

  public FilterData fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * File name filter
   * @return fileName
  **/
  @ApiModelProperty(example = "custom.js", value = "File name filter")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public FilterData tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Tags filter, Comma-separated list of tags to filter by
   * @return tags
  **/
  @ApiModelProperty(example = "myTag1,myTag2", value = "Tags filter, Comma-separated list of tags to filter by")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public FilterData groupTags(List<GroupTagData> groupTags) {
    this.groupTags = groupTags;
    return this;
  }

  public FilterData addGroupTagsItem(GroupTagData groupTagsItem) {
    if (this.groupTags == null) {
      this.groupTags = new ArrayList<GroupTagData>();
    }
    this.groupTags.add(groupTagsItem);
    return this;
  }

   /**
   * List of group tags filter
   * @return groupTags
  **/
  @ApiModelProperty(value = "List of group tags filter")
  public List<GroupTagData> getGroupTags() {
    return groupTags;
  }

  public void setGroupTags(List<GroupTagData> groupTags) {
    this.groupTags = groupTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterData filterData = (FilterData) o;
    return Objects.equals(this.contains, filterData.contains) &&
        Objects.equals(this.notContains, filterData.notContains) &&
        Objects.equals(this.languages, filterData.languages) &&
        Objects.equals(this.types, filterData.types) &&
        Objects.equals(this.analyzed, filterData.analyzed) &&
        Objects.equals(this.fileName, filterData.fileName) &&
        Objects.equals(this.tags, filterData.tags) &&
        Objects.equals(this.groupTags, filterData.groupTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contains, notContains, languages, types, analyzed, fileName, tags, groupTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterData {\n");
    
    sb.append("    contains: ").append(toIndentedString(contains)).append("\n");
    sb.append("    notContains: ").append(toIndentedString(notContains)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    analyzed: ").append(toIndentedString(analyzed)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    groupTags: ").append(toIndentedString(groupTags)).append("\n");
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

