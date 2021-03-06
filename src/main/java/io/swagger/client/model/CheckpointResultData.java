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
import io.swagger.client.model.ViolatedRuleResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CheckpointResultData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class CheckpointResultData {
  @SerializedName("checkpoint")
  private String checkpoint = null;

  /**
   * Checkpoint result
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    OK("OK"),
    
    FAIL("FAIL");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultEnum fromValue(String text) {
      for (ResultEnum b : ResultEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResultEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("result")
  private ResultEnum result = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("mandatory")
  private Boolean mandatory = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("score")
  private Double score = null;

  @SerializedName("violatedRules")
  private List<ViolatedRuleResponse> violatedRules = null;

  public CheckpointResultData checkpoint(String checkpoint) {
    this.checkpoint = checkpoint;
    return this;
  }

   /**
   * Checkpoint
   * @return checkpoint
  **/
  @ApiModelProperty(example = "1", value = "Checkpoint")
  public String getCheckpoint() {
    return checkpoint;
  }

  public void setCheckpoint(String checkpoint) {
    this.checkpoint = checkpoint;
  }

  public CheckpointResultData result(ResultEnum result) {
    this.result = result;
    return this;
  }

   /**
   * Checkpoint result
   * @return result
  **/
  @ApiModelProperty(example = "FAIL", value = "Checkpoint result")
  public ResultEnum getResult() {
    return result;
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }

  public CheckpointResultData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Checkpoint name
   * @return name
  **/
  @ApiModelProperty(example = "No new defects", value = "Checkpoint name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CheckpointResultData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Checkpont decription
   * @return description
  **/
  @ApiModelProperty(example = "If a new defect is detected, the checkpoint will not pass.", value = "Checkpont decription")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CheckpointResultData weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Weight
   * @return weight
  **/
  @ApiModelProperty(example = "1", value = "Weight")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public CheckpointResultData mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Indicates if the checkpoint is mandatory or not
   * @return mandatory
  **/
  @ApiModelProperty(example = "true", value = "Indicates if the checkpoint is mandatory or not")
  public Boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public CheckpointResultData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Checkpoint type
   * @return type
  **/
  @ApiModelProperty(example = "Threshold for maximum new defects", value = "Checkpoint type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CheckpointResultData score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Checkpoint score
   * @return score
  **/
  @ApiModelProperty(example = "0.0", value = "Checkpoint score")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public CheckpointResultData violatedRules(List<ViolatedRuleResponse> violatedRules) {
    this.violatedRules = violatedRules;
    return this;
  }

  public CheckpointResultData addViolatedRulesItem(ViolatedRuleResponse violatedRulesItem) {
    if (this.violatedRules == null) {
      this.violatedRules = new ArrayList<ViolatedRuleResponse>();
    }
    this.violatedRules.add(violatedRulesItem);
    return this;
  }

   /**
   * List of violated rules
   * @return violatedRules
  **/
  @ApiModelProperty(value = "List of violated rules")
  public List<ViolatedRuleResponse> getViolatedRules() {
    return violatedRules;
  }

  public void setViolatedRules(List<ViolatedRuleResponse> violatedRules) {
    this.violatedRules = violatedRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckpointResultData checkpointResultData = (CheckpointResultData) o;
    return Objects.equals(this.checkpoint, checkpointResultData.checkpoint) &&
        Objects.equals(this.result, checkpointResultData.result) &&
        Objects.equals(this.name, checkpointResultData.name) &&
        Objects.equals(this.description, checkpointResultData.description) &&
        Objects.equals(this.weight, checkpointResultData.weight) &&
        Objects.equals(this.mandatory, checkpointResultData.mandatory) &&
        Objects.equals(this.type, checkpointResultData.type) &&
        Objects.equals(this.score, checkpointResultData.score) &&
        Objects.equals(this.violatedRules, checkpointResultData.violatedRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkpoint, result, name, description, weight, mandatory, type, score, violatedRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckpointResultData {\n");
    
    sb.append("    checkpoint: ").append(toIndentedString(checkpoint)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    violatedRules: ").append(toIndentedString(violatedRules)).append("\n");
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

