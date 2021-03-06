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
import io.swagger.client.model.Mapping;
import io.swagger.client.model.StaticDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Finding
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class Finding {
  @SerializedName("nativeId")
  private String nativeId = null;

  /**
   * Threadfix severity
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    UNKNOWN("UNKNOWN"),
    
    INFO("INFO"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CRITICAL("CRITICAL");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SeverityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("severity")
  private SeverityEnum severity = null;

  @SerializedName("nativeSeverity")
  private String nativeSeverity = null;

  @SerializedName("summary")
  private String summary = null;

  @SerializedName("mappings")
  private List<Mapping> mappings = null;

  @SerializedName("scannerDetail")
  private String scannerDetail = null;

  @SerializedName("scannerRecommendation")
  private String scannerRecommendation = null;

  @SerializedName("staticDetails")
  private StaticDetails staticDetails = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("comments")
  private List<String> comments = null;

  public Finding nativeId(String nativeId) {
    this.nativeId = nativeId;
    return this;
  }

   /**
   * Native id
   * @return nativeId
  **/
  @ApiModelProperty(example = "1", value = "Native id")
  public String getNativeId() {
    return nativeId;
  }

  public void setNativeId(String nativeId) {
    this.nativeId = nativeId;
  }

  public Finding severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Threadfix severity
   * @return severity
  **/
  @ApiModelProperty(example = "MEDIUM", value = "Threadfix severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Finding nativeSeverity(String nativeSeverity) {
    this.nativeSeverity = nativeSeverity;
    return this;
  }

   /**
   * Kiuwan severity
   * @return nativeSeverity
  **/
  @ApiModelProperty(example = "MEDIUM", value = "Kiuwan severity")
  public String getNativeSeverity() {
    return nativeSeverity;
  }

  public void setNativeSeverity(String nativeSeverity) {
    this.nativeSeverity = nativeSeverity;
  }

  public Finding summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Rule name
   * @return summary
  **/
  @ApiModelProperty(example = "CORS policy (Cross-origin resource sharing) too broad", value = "Rule name")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Finding mappings(List<Mapping> mappings) {
    this.mappings = mappings;
    return this;
  }

  public Finding addMappingsItem(Mapping mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<Mapping>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * Mapping with different codes as CWE or kiuwan code
   * @return mappings
  **/
  @ApiModelProperty(value = "Mapping with different codes as CWE or kiuwan code")
  public List<Mapping> getMappings() {
    return mappings;
  }

  public void setMappings(List<Mapping> mappings) {
    this.mappings = mappings;
  }

  public Finding scannerDetail(String scannerDetail) {
    this.scannerDetail = scannerDetail;
    return this;
  }

   /**
   * Rule description
   * @return scannerDetail
  **/
  @ApiModelProperty(example = "Too much allowed origins in HTML5 Access-Control-Allow-Origin header. Traditionally, web browsers...", value = "Rule description")
  public String getScannerDetail() {
    return scannerDetail;
  }

  public void setScannerDetail(String scannerDetail) {
    this.scannerDetail = scannerDetail;
  }

  public Finding scannerRecommendation(String scannerRecommendation) {
    this.scannerRecommendation = scannerRecommendation;
    return this;
  }

   /**
   * Rule remediation
   * @return scannerRecommendation
  **/
  @ApiModelProperty(example = "Do not use Access-Control-Allow-Origin: * in CORS headers. This permits any origin to read data from...", value = "Rule remediation")
  public String getScannerRecommendation() {
    return scannerRecommendation;
  }

  public void setScannerRecommendation(String scannerRecommendation) {
    this.scannerRecommendation = scannerRecommendation;
  }

  public Finding staticDetails(StaticDetails staticDetails) {
    this.staticDetails = staticDetails;
    return this;
  }

   /**
   * Violation details
   * @return staticDetails
  **/
  @ApiModelProperty(value = "Violation details")
  public StaticDetails getStaticDetails() {
    return staticDetails;
  }

  public void setStaticDetails(StaticDetails staticDetails) {
    this.staticDetails = staticDetails;
  }

  public Finding metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Finding putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata information with language, characteristic, vulnerability type, effort, status and muted
   * @return metadata
  **/
  @ApiModelProperty(value = "Metadata information with language, characteristic, vulnerability type, effort, status and muted")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public Finding tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Finding addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags list
   * @return tags
  **/
  @ApiModelProperty(value = "Tags list")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Finding comments(List<String> comments) {
    this.comments = comments;
    return this;
  }

  public Finding addCommentsItem(String commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<String>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Comments list
   * @return comments
  **/
  @ApiModelProperty(value = "Comments list")
  public List<String> getComments() {
    return comments;
  }

  public void setComments(List<String> comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Finding finding = (Finding) o;
    return Objects.equals(this.nativeId, finding.nativeId) &&
        Objects.equals(this.severity, finding.severity) &&
        Objects.equals(this.nativeSeverity, finding.nativeSeverity) &&
        Objects.equals(this.summary, finding.summary) &&
        Objects.equals(this.mappings, finding.mappings) &&
        Objects.equals(this.scannerDetail, finding.scannerDetail) &&
        Objects.equals(this.scannerRecommendation, finding.scannerRecommendation) &&
        Objects.equals(this.staticDetails, finding.staticDetails) &&
        Objects.equals(this.metadata, finding.metadata) &&
        Objects.equals(this.tags, finding.tags) &&
        Objects.equals(this.comments, finding.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nativeId, severity, nativeSeverity, summary, mappings, scannerDetail, scannerRecommendation, staticDetails, metadata, tags, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Finding {\n");
    
    sb.append("    nativeId: ").append(toIndentedString(nativeId)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    nativeSeverity: ").append(toIndentedString(nativeSeverity)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    scannerDetail: ").append(toIndentedString(scannerDetail)).append("\n");
    sb.append("    scannerRecommendation: ").append(toIndentedString(scannerRecommendation)).append("\n");
    sb.append("    staticDetails: ").append(toIndentedString(staticDetails)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

