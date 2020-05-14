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
import io.swagger.client.model.ComponentSimpleRestData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SecurityRestData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class SecurityRestData {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("cve")
  private String cve = null;

  @SerializedName("cwe")
  private String cwe = null;

  @SerializedName("lastModified")
  private String lastModified = null;

  @SerializedName("exploitabilitySubscore")
  private String exploitabilitySubscore = null;

  @SerializedName("impactSubscore")
  private String impactSubscore = null;

  @SerializedName("getcVSSv2BaseScore")
  private String getcVSSv2BaseScore = null;

  @SerializedName("securityRisk")
  private String securityRisk = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("components")
  private List<ComponentSimpleRestData> components = null;

  public SecurityRestData id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Vulnerability identifier
   * @return id
  **/
  @ApiModelProperty(example = "86896", value = "Vulnerability identifier")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SecurityRestData cve(String cve) {
    this.cve = cve;
    return this;
  }

   /**
   * CVE reference (Common Vulnerabilities and Exposures)
   * @return cve
  **/
  @ApiModelProperty(example = "CVE-2016-5007", value = "CVE reference (Common Vulnerabilities and Exposures)")
  public String getCve() {
    return cve;
  }

  public void setCve(String cve) {
    this.cve = cve;
  }

  public SecurityRestData cwe(String cwe) {
    this.cwe = cwe;
    return this;
  }

   /**
   * CWE reference (Common Weakness Enumeration Specification)
   * @return cwe
  **/
  @ApiModelProperty(example = "CWE-264", value = "CWE reference (Common Weakness Enumeration Specification)")
  public String getCwe() {
    return cwe;
  }

  public void setCwe(String cwe) {
    this.cwe = cwe;
  }

  public SecurityRestData lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Last modified date
   * @return lastModified
  **/
  @ApiModelProperty(example = "2017/05/25 19:29", value = "Last modified date")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public SecurityRestData exploitabilitySubscore(String exploitabilitySubscore) {
    this.exploitabilitySubscore = exploitabilitySubscore;
    return this;
  }

   /**
   * Vulnerability exploitable sub-score
   * @return exploitabilitySubscore
  **/
  @ApiModelProperty(example = "10", value = "Vulnerability exploitable sub-score")
  public String getExploitabilitySubscore() {
    return exploitabilitySubscore;
  }

  public void setExploitabilitySubscore(String exploitabilitySubscore) {
    this.exploitabilitySubscore = exploitabilitySubscore;
  }

  public SecurityRestData impactSubscore(String impactSubscore) {
    this.impactSubscore = impactSubscore;
    return this;
  }

   /**
   * Vulnerability impact sub-score
   * @return impactSubscore
  **/
  @ApiModelProperty(example = "2.9", value = "Vulnerability impact sub-score")
  public String getImpactSubscore() {
    return impactSubscore;
  }

  public void setImpactSubscore(String impactSubscore) {
    this.impactSubscore = impactSubscore;
  }

  public SecurityRestData getcVSSv2BaseScore(String getcVSSv2BaseScore) {
    this.getcVSSv2BaseScore = getcVSSv2BaseScore;
    return this;
  }

   /**
   * Vulnerability CVSS v2 base score
   * @return getcVSSv2BaseScore
  **/
  @ApiModelProperty(example = "5", value = "Vulnerability CVSS v2 base score")
  public String getGetcVSSv2BaseScore() {
    return getcVSSv2BaseScore;
  }

  public void setGetcVSSv2BaseScore(String getcVSSv2BaseScore) {
    this.getcVSSv2BaseScore = getcVSSv2BaseScore;
  }

  public SecurityRestData securityRisk(String securityRisk) {
    this.securityRisk = securityRisk;
    return this;
  }

   /**
   * Component security risk (high, medium, low, none, unknown)
   * @return securityRisk
  **/
  @ApiModelProperty(example = "MEDIUM", value = "Component security risk (high, medium, low, none, unknown)")
  public String getSecurityRisk() {
    return securityRisk;
  }

  public void setSecurityRisk(String securityRisk) {
    this.securityRisk = securityRisk;
  }

  public SecurityRestData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Vulnerability description
   * @return description
  **/
  @ApiModelProperty(example = "Both Spring Security 3.2.x, 4.0.x, 4.1.0 and the Spring Framework 3.2.x, 4.0.x, 4.1.x, 4.2.x rely on URL pattern mappings for authorization and for mapping requests to controllers respectively. Differences in the strictness of the pattern matching mechanisms, for example with regards to space trimming in path segments, can lead Spring Security to not recognize certain paths as not protected that are in fact mapped to Spring MVC controllers that should be protected. The problem is compounded by the fact that the Spring Framework provides richer features with regards to pattern matching as well as by the fact that pattern matching in each Spring Security and the Spring Framework can easily be customized creating additional differences.", value = "Vulnerability description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecurityRestData components(List<ComponentSimpleRestData> components) {
    this.components = components;
    return this;
  }

  public SecurityRestData addComponentsItem(ComponentSimpleRestData componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<ComponentSimpleRestData>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Components list affected by this vulnerability
   * @return components
  **/
  @ApiModelProperty(value = "Components list affected by this vulnerability")
  public List<ComponentSimpleRestData> getComponents() {
    return components;
  }

  public void setComponents(List<ComponentSimpleRestData> components) {
    this.components = components;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityRestData securityRestData = (SecurityRestData) o;
    return Objects.equals(this.id, securityRestData.id) &&
        Objects.equals(this.cve, securityRestData.cve) &&
        Objects.equals(this.cwe, securityRestData.cwe) &&
        Objects.equals(this.lastModified, securityRestData.lastModified) &&
        Objects.equals(this.exploitabilitySubscore, securityRestData.exploitabilitySubscore) &&
        Objects.equals(this.impactSubscore, securityRestData.impactSubscore) &&
        Objects.equals(this.getcVSSv2BaseScore, securityRestData.getcVSSv2BaseScore) &&
        Objects.equals(this.securityRisk, securityRestData.securityRisk) &&
        Objects.equals(this.description, securityRestData.description) &&
        Objects.equals(this.components, securityRestData.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cve, cwe, lastModified, exploitabilitySubscore, impactSubscore, getcVSSv2BaseScore, securityRisk, description, components);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityRestData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cve: ").append(toIndentedString(cve)).append("\n");
    sb.append("    cwe: ").append(toIndentedString(cwe)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    exploitabilitySubscore: ").append(toIndentedString(exploitabilitySubscore)).append("\n");
    sb.append("    impactSubscore: ").append(toIndentedString(impactSubscore)).append("\n");
    sb.append("    getcVSSv2BaseScore: ").append(toIndentedString(getcVSSv2BaseScore)).append("\n");
    sb.append("    securityRisk: ").append(toIndentedString(securityRisk)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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

