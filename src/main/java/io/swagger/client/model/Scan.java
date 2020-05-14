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
import io.swagger.client.model.Finding;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Scan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class Scan {
  @SerializedName("collectionType")
  private String collectionType = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("exported")
  private String exported = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("findings")
  private List<Finding> findings = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("executiveSummary")
  private String executiveSummary = null;

  public Scan collectionType(String collectionType) {
    this.collectionType = collectionType;
    return this;
  }

   /**
   * Collection type
   * @return collectionType
  **/
  @ApiModelProperty(example = "SAST", value = "Collection type")
  public String getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  public Scan created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Creation date in format yyyy-MM-dd&#39;T&#39;HH:mm:ssZZ
   * @return created
  **/
  @ApiModelProperty(example = "2020-01-15T11:23:45", value = "Creation date in format yyyy-MM-dd'T'HH:mm:ssZZ")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Scan exported(String exported) {
    this.exported = exported;
    return this;
  }

   /**
   * Export date in format yyyy-MM-dd&#39;T&#39;HH:mm:ssZZ
   * @return exported
  **/
  @ApiModelProperty(example = "2020-02-17T11:23:45", value = "Export date in format yyyy-MM-dd'T'HH:mm:ssZZ")
  public String getExported() {
    return exported;
  }

  public void setExported(String exported) {
    this.exported = exported;
  }

  public Scan source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Export source
   * @return source
  **/
  @ApiModelProperty(example = "kiuwan", value = "Export source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Scan findings(List<Finding> findings) {
    this.findings = findings;
    return this;
  }

  public Scan addFindingsItem(Finding findingsItem) {
    if (this.findings == null) {
      this.findings = new ArrayList<Finding>();
    }
    this.findings.add(findingsItem);
    return this;
  }

   /**
   * Findings found in this analysis
   * @return findings
  **/
  @ApiModelProperty(value = "Findings found in this analysis")
  public List<Finding> getFindings() {
    return findings;
  }

  public void setFindings(List<Finding> findings) {
    this.findings = findings;
  }

  public Scan metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Scan putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata information with agent version, engine version, model name, model version and execution time
   * @return metadata
  **/
  @ApiModelProperty(value = "Metadata information with agent version, engine version, model name, model version and execution time")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public Scan executiveSummary(String executiveSummary) {
    this.executiveSummary = executiveSummary;
    return this;
  }

   /**
   * Executive summary
   * @return executiveSummary
  **/
  @ApiModelProperty(example = "After an automated Kiuwan analysis of myApp, it was found to be...", value = "Executive summary")
  public String getExecutiveSummary() {
    return executiveSummary;
  }

  public void setExecutiveSummary(String executiveSummary) {
    this.executiveSummary = executiveSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scan scan = (Scan) o;
    return Objects.equals(this.collectionType, scan.collectionType) &&
        Objects.equals(this.created, scan.created) &&
        Objects.equals(this.exported, scan.exported) &&
        Objects.equals(this.source, scan.source) &&
        Objects.equals(this.findings, scan.findings) &&
        Objects.equals(this.metadata, scan.metadata) &&
        Objects.equals(this.executiveSummary, scan.executiveSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionType, created, exported, source, findings, metadata, executiveSummary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scan {\n");
    
    sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    exported: ").append(toIndentedString(exported)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    findings: ").append(toIndentedString(findings)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    executiveSummary: ").append(toIndentedString(executiveSummary)).append("\n");
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

