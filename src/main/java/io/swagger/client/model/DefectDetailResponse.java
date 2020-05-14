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
import io.swagger.client.model.VulnerabilityData;
import java.io.IOException;

/**
 * DefectDetailResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class DefectDetailResponse {
  @SerializedName("defectId")
  private Long defectId = null;

  @SerializedName("file")
  private String file = null;

  @SerializedName("line")
  private Integer line = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("muted")
  private Boolean muted = null;

  @SerializedName("vulnerabilityType")
  private String vulnerabilityType = null;

  @SerializedName("explanation")
  private String explanation = null;

  /**
   * Defect status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NONE("None"),
    
    TO_REVIEW("To review"),
    
    REVIEWED("Reviewed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("cweId")
  private Integer cweId = null;

  @SerializedName("ruleCode")
  private String ruleCode = null;

  @SerializedName("rule")
  private String rule = null;

  @SerializedName("language")
  private String language = null;

  /**
   * Characteristic
   */
  @JsonAdapter(CharacteristicEnum.Adapter.class)
  public enum CharacteristicEnum {
    EFFICIENCY("Efficiency"),
    
    MAINTAINABILITY("Maintainability"),
    
    PORTABILITY("Portability"),
    
    RELIABILITY("Reliability"),
    
    SECURITY("Security");

    private String value;

    CharacteristicEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CharacteristicEnum fromValue(String text) {
      for (CharacteristicEnum b : CharacteristicEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CharacteristicEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CharacteristicEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CharacteristicEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CharacteristicEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("characteristic")
  private CharacteristicEnum characteristic = null;

  /**
   * Priority
   */
  @JsonAdapter(PriorityEnum.Adapter.class)
  public enum PriorityEnum {
    VERY_LOW("Very Low"),
    
    LOW("Low"),
    
    NORMAL("Normal"),
    
    HIGH("High"),
    
    VERY_HIGH("Very High");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PriorityEnum fromValue(String text) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriorityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PriorityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("priority")
  private PriorityEnum priority = null;

  @SerializedName("effort")
  private String effort = null;

  @SerializedName("modelId")
  private Long modelId = null;

  @SerializedName("securityDetail")
  private VulnerabilityData securityDetail = null;

  public DefectDetailResponse defectId(Long defectId) {
    this.defectId = defectId;
    return this;
  }

   /**
   * Defect identifier
   * @return defectId
  **/
  @ApiModelProperty(example = "16558118", value = "Defect identifier")
  public Long getDefectId() {
    return defectId;
  }

  public void setDefectId(Long defectId) {
    this.defectId = defectId;
  }

  public DefectDetailResponse file(String file) {
    this.file = file;
    return this;
  }

   /**
   * Defect file
   * @return file
  **/
  @ApiModelProperty(example = "FileSystemRepository.java", value = "Defect file")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public DefectDetailResponse line(Integer line) {
    this.line = line;
    return this;
  }

   /**
   * Defect line
   * @return line
  **/
  @ApiModelProperty(example = "368", value = "Defect line")
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }

  public DefectDetailResponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code
   * @return code
  **/
  @ApiModelProperty(example = "   out.println(sql);", value = "Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DefectDetailResponse muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

   /**
   * Indicates if the defect is muted
   * @return muted
  **/
  @ApiModelProperty(example = "false", value = "Indicates if the defect is muted")
  public Boolean isMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  public DefectDetailResponse vulnerabilityType(String vulnerabilityType) {
    this.vulnerabilityType = vulnerabilityType;
    return this;
  }

   /**
   * Vulnerability type (More info in https://www.kiuwan.com/docs/display/K5/Kiuwan+Vulnerability+Types)
   * @return vulnerabilityType
  **/
  @ApiModelProperty(example = "Injection", value = "Vulnerability type (More info in https://www.kiuwan.com/docs/display/K5/Kiuwan+Vulnerability+Types)")
  public String getVulnerabilityType() {
    return vulnerabilityType;
  }

  public void setVulnerabilityType(String vulnerabilityType) {
    this.vulnerabilityType = vulnerabilityType;
  }

  public DefectDetailResponse explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

   /**
   * Defect explanation
   * @return explanation
  **/
  @ApiModelProperty(example = "Reflected XSS: user_input", value = "Defect explanation")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public DefectDetailResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Defect status
   * @return status
  **/
  @ApiModelProperty(example = "None", value = "Defect status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DefectDetailResponse cweId(Integer cweId) {
    this.cweId = cweId;
    return this;
  }

   /**
   * CWE identifier
   * @return cweId
  **/
  @ApiModelProperty(example = "79", value = "CWE identifier")
  public Integer getCweId() {
    return cweId;
  }

  public void setCweId(Integer cweId) {
    this.cweId = cweId;
  }

  public DefectDetailResponse ruleCode(String ruleCode) {
    this.ruleCode = ruleCode;
    return this;
  }

   /**
   * Rule code
   * @return ruleCode
  **/
  @ApiModelProperty(example = "OPT.JAVA.SEC_JAVA.CrossSiteScriptingRule", value = "Rule code")
  public String getRuleCode() {
    return ruleCode;
  }

  public void setRuleCode(String ruleCode) {
    this.ruleCode = ruleCode;
  }

  public DefectDetailResponse rule(String rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Broken rule
   * @return rule
  **/
  @ApiModelProperty(example = "Improper Neutralization of Input During Web Page Generation ('Cross-site Scripting')", value = "Broken rule")
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public DefectDetailResponse language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Technology (List of supported technologies in https://www.kiuwan.com/docs/display/K5/Kiuwan+Supported+Technologies)
   * @return language
  **/
  @ApiModelProperty(example = "java", value = "Technology (List of supported technologies in https://www.kiuwan.com/docs/display/K5/Kiuwan+Supported+Technologies)")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public DefectDetailResponse characteristic(CharacteristicEnum characteristic) {
    this.characteristic = characteristic;
    return this;
  }

   /**
   * Characteristic
   * @return characteristic
  **/
  @ApiModelProperty(example = "Security", value = "Characteristic")
  public CharacteristicEnum getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(CharacteristicEnum characteristic) {
    this.characteristic = characteristic;
  }

  public DefectDetailResponse priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Priority
   * @return priority
  **/
  @ApiModelProperty(example = "Very High", value = "Priority")
  public PriorityEnum getPriority() {
    return priority;
  }

  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  public DefectDetailResponse effort(String effort) {
    this.effort = effort;
    return this;
  }

   /**
   * Effort
   * @return effort
  **/
  @ApiModelProperty(example = "30m", value = "Effort")
  public String getEffort() {
    return effort;
  }

  public void setEffort(String effort) {
    this.effort = effort;
  }

  public DefectDetailResponse modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Model identifier
   * @return modelId
  **/
  @ApiModelProperty(example = "6252", value = "Model identifier")
  public Long getModelId() {
    return modelId;
  }

  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  public DefectDetailResponse securityDetail(VulnerabilityData securityDetail) {
    this.securityDetail = securityDetail;
    return this;
  }

   /**
   * Security detail
   * @return securityDetail
  **/
  @ApiModelProperty(value = "Security detail")
  public VulnerabilityData getSecurityDetail() {
    return securityDetail;
  }

  public void setSecurityDetail(VulnerabilityData securityDetail) {
    this.securityDetail = securityDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefectDetailResponse defectDetailResponse = (DefectDetailResponse) o;
    return Objects.equals(this.defectId, defectDetailResponse.defectId) &&
        Objects.equals(this.file, defectDetailResponse.file) &&
        Objects.equals(this.line, defectDetailResponse.line) &&
        Objects.equals(this.code, defectDetailResponse.code) &&
        Objects.equals(this.muted, defectDetailResponse.muted) &&
        Objects.equals(this.vulnerabilityType, defectDetailResponse.vulnerabilityType) &&
        Objects.equals(this.explanation, defectDetailResponse.explanation) &&
        Objects.equals(this.status, defectDetailResponse.status) &&
        Objects.equals(this.cweId, defectDetailResponse.cweId) &&
        Objects.equals(this.ruleCode, defectDetailResponse.ruleCode) &&
        Objects.equals(this.rule, defectDetailResponse.rule) &&
        Objects.equals(this.language, defectDetailResponse.language) &&
        Objects.equals(this.characteristic, defectDetailResponse.characteristic) &&
        Objects.equals(this.priority, defectDetailResponse.priority) &&
        Objects.equals(this.effort, defectDetailResponse.effort) &&
        Objects.equals(this.modelId, defectDetailResponse.modelId) &&
        Objects.equals(this.securityDetail, defectDetailResponse.securityDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defectId, file, line, code, muted, vulnerabilityType, explanation, status, cweId, ruleCode, rule, language, characteristic, priority, effort, modelId, securityDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefectDetailResponse {\n");
    
    sb.append("    defectId: ").append(toIndentedString(defectId)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    vulnerabilityType: ").append(toIndentedString(vulnerabilityType)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cweId: ").append(toIndentedString(cweId)).append("\n");
    sb.append("    ruleCode: ").append(toIndentedString(ruleCode)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    securityDetail: ").append(toIndentedString(securityDetail)).append("\n");
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

