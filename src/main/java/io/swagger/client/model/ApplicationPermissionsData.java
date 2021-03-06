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
 * ApplicationPermissionsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-14T08:41:48.057Z")
public class ApplicationPermissionsData {
  @SerializedName("applicationName")
  private String applicationName = null;

  @SerializedName("roleName")
  private String roleName = null;

  @SerializedName("override")
  private Boolean override = null;

  @SerializedName("deleteActionPlans")
  private Boolean deleteActionPlans = null;

  @SerializedName("deleteAnalysis")
  private Boolean deleteAnalysis = null;

  @SerializedName("deleteDeliveries")
  private Boolean deleteDeliveries = null;

  @SerializedName("executeAnalysis")
  private Boolean executeAnalysis = null;

  @SerializedName("executeDeliveries")
  private Boolean executeDeliveries = null;

  @SerializedName("exportActionPlansJira")
  private Boolean exportActionPlansJira = null;

  @SerializedName("muteDefects")
  private Boolean muteDefects = null;

  @SerializedName("changeDefectStatus")
  private Boolean changeDefectStatus = null;

  @SerializedName("saveActionPlans")
  private Boolean saveActionPlans = null;

  @SerializedName("viewApplicationData")
  private Boolean viewApplicationData = null;

  @SerializedName("viewDeliveries")
  private Boolean viewDeliveries = null;

  public ApplicationPermissionsData applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Application name
   * @return applicationName
  **/
  @ApiModelProperty(example = "myApp", value = "Application name")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public ApplicationPermissionsData roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Name of the role assigned to user
   * @return roleName
  **/
  @ApiModelProperty(example = "None", value = "Name of the role assigned to user")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public ApplicationPermissionsData override(Boolean override) {
    this.override = override;
    return this;
  }

   /**
   * Indicates if override the configuration or not
   * @return override
  **/
  @ApiModelProperty(example = "true", value = "Indicates if override the configuration or not")
  public Boolean isOverride() {
    return override;
  }

  public void setOverride(Boolean override) {
    this.override = override;
  }

  public ApplicationPermissionsData deleteActionPlans(Boolean deleteActionPlans) {
    this.deleteActionPlans = deleteActionPlans;
    return this;
  }

   /**
   * If the user can delete action plan for this application
   * @return deleteActionPlans
  **/
  @ApiModelProperty(example = "true", value = "If the user can delete action plan for this application")
  public Boolean isDeleteActionPlans() {
    return deleteActionPlans;
  }

  public void setDeleteActionPlans(Boolean deleteActionPlans) {
    this.deleteActionPlans = deleteActionPlans;
  }

  public ApplicationPermissionsData deleteAnalysis(Boolean deleteAnalysis) {
    this.deleteAnalysis = deleteAnalysis;
    return this;
  }

   /**
   * If the user can delete analysis for this application
   * @return deleteAnalysis
  **/
  @ApiModelProperty(example = "true", value = "If the user can delete analysis for this application")
  public Boolean isDeleteAnalysis() {
    return deleteAnalysis;
  }

  public void setDeleteAnalysis(Boolean deleteAnalysis) {
    this.deleteAnalysis = deleteAnalysis;
  }

  public ApplicationPermissionsData deleteDeliveries(Boolean deleteDeliveries) {
    this.deleteDeliveries = deleteDeliveries;
    return this;
  }

   /**
   * If the user can delete deliveries for this application
   * @return deleteDeliveries
  **/
  @ApiModelProperty(example = "true", value = "If the user can delete deliveries for this application")
  public Boolean isDeleteDeliveries() {
    return deleteDeliveries;
  }

  public void setDeleteDeliveries(Boolean deleteDeliveries) {
    this.deleteDeliveries = deleteDeliveries;
  }

  public ApplicationPermissionsData executeAnalysis(Boolean executeAnalysis) {
    this.executeAnalysis = executeAnalysis;
    return this;
  }

   /**
   * If the user can execute analysis for this application
   * @return executeAnalysis
  **/
  @ApiModelProperty(example = "true", value = "If the user can execute analysis for this application")
  public Boolean isExecuteAnalysis() {
    return executeAnalysis;
  }

  public void setExecuteAnalysis(Boolean executeAnalysis) {
    this.executeAnalysis = executeAnalysis;
  }

  public ApplicationPermissionsData executeDeliveries(Boolean executeDeliveries) {
    this.executeDeliveries = executeDeliveries;
    return this;
  }

   /**
   * If the user can execute deliveries plan for this application
   * @return executeDeliveries
  **/
  @ApiModelProperty(example = "true", value = "If the user can execute deliveries plan for this application")
  public Boolean isExecuteDeliveries() {
    return executeDeliveries;
  }

  public void setExecuteDeliveries(Boolean executeDeliveries) {
    this.executeDeliveries = executeDeliveries;
  }

  public ApplicationPermissionsData exportActionPlansJira(Boolean exportActionPlansJira) {
    this.exportActionPlansJira = exportActionPlansJira;
    return this;
  }

   /**
   * If the user can export action plan to JIRA for this application
   * @return exportActionPlansJira
  **/
  @ApiModelProperty(example = "true", value = "If the user can export action plan to JIRA for this application")
  public Boolean isExportActionPlansJira() {
    return exportActionPlansJira;
  }

  public void setExportActionPlansJira(Boolean exportActionPlansJira) {
    this.exportActionPlansJira = exportActionPlansJira;
  }

  public ApplicationPermissionsData muteDefects(Boolean muteDefects) {
    this.muteDefects = muteDefects;
    return this;
  }

   /**
   * If the user can mute defects for this application
   * @return muteDefects
  **/
  @ApiModelProperty(example = "true", value = "If the user can mute defects for this application")
  public Boolean isMuteDefects() {
    return muteDefects;
  }

  public void setMuteDefects(Boolean muteDefects) {
    this.muteDefects = muteDefects;
  }

  public ApplicationPermissionsData changeDefectStatus(Boolean changeDefectStatus) {
    this.changeDefectStatus = changeDefectStatus;
    return this;
  }

   /**
   * If the user can change the status of a defect in this application
   * @return changeDefectStatus
  **/
  @ApiModelProperty(example = "true", value = "If the user can change the status of a defect in this application")
  public Boolean isChangeDefectStatus() {
    return changeDefectStatus;
  }

  public void setChangeDefectStatus(Boolean changeDefectStatus) {
    this.changeDefectStatus = changeDefectStatus;
  }

  public ApplicationPermissionsData saveActionPlans(Boolean saveActionPlans) {
    this.saveActionPlans = saveActionPlans;
    return this;
  }

   /**
   * If the user can save action plan for this application
   * @return saveActionPlans
  **/
  @ApiModelProperty(example = "true", value = "If the user can save action plan for this application")
  public Boolean isSaveActionPlans() {
    return saveActionPlans;
  }

  public void setSaveActionPlans(Boolean saveActionPlans) {
    this.saveActionPlans = saveActionPlans;
  }

  public ApplicationPermissionsData viewApplicationData(Boolean viewApplicationData) {
    this.viewApplicationData = viewApplicationData;
    return this;
  }

   /**
   * If the user can see application data for this application
   * @return viewApplicationData
  **/
  @ApiModelProperty(example = "true", value = "If the user can see application data for this application")
  public Boolean isViewApplicationData() {
    return viewApplicationData;
  }

  public void setViewApplicationData(Boolean viewApplicationData) {
    this.viewApplicationData = viewApplicationData;
  }

  public ApplicationPermissionsData viewDeliveries(Boolean viewDeliveries) {
    this.viewDeliveries = viewDeliveries;
    return this;
  }

   /**
   * If the user can see deliveries for this application
   * @return viewDeliveries
  **/
  @ApiModelProperty(example = "true", value = "If the user can see deliveries for this application")
  public Boolean isViewDeliveries() {
    return viewDeliveries;
  }

  public void setViewDeliveries(Boolean viewDeliveries) {
    this.viewDeliveries = viewDeliveries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationPermissionsData applicationPermissionsData = (ApplicationPermissionsData) o;
    return Objects.equals(this.applicationName, applicationPermissionsData.applicationName) &&
        Objects.equals(this.roleName, applicationPermissionsData.roleName) &&
        Objects.equals(this.override, applicationPermissionsData.override) &&
        Objects.equals(this.deleteActionPlans, applicationPermissionsData.deleteActionPlans) &&
        Objects.equals(this.deleteAnalysis, applicationPermissionsData.deleteAnalysis) &&
        Objects.equals(this.deleteDeliveries, applicationPermissionsData.deleteDeliveries) &&
        Objects.equals(this.executeAnalysis, applicationPermissionsData.executeAnalysis) &&
        Objects.equals(this.executeDeliveries, applicationPermissionsData.executeDeliveries) &&
        Objects.equals(this.exportActionPlansJira, applicationPermissionsData.exportActionPlansJira) &&
        Objects.equals(this.muteDefects, applicationPermissionsData.muteDefects) &&
        Objects.equals(this.changeDefectStatus, applicationPermissionsData.changeDefectStatus) &&
        Objects.equals(this.saveActionPlans, applicationPermissionsData.saveActionPlans) &&
        Objects.equals(this.viewApplicationData, applicationPermissionsData.viewApplicationData) &&
        Objects.equals(this.viewDeliveries, applicationPermissionsData.viewDeliveries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, roleName, override, deleteActionPlans, deleteAnalysis, deleteDeliveries, executeAnalysis, executeDeliveries, exportActionPlansJira, muteDefects, changeDefectStatus, saveActionPlans, viewApplicationData, viewDeliveries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationPermissionsData {\n");
    
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
    sb.append("    deleteActionPlans: ").append(toIndentedString(deleteActionPlans)).append("\n");
    sb.append("    deleteAnalysis: ").append(toIndentedString(deleteAnalysis)).append("\n");
    sb.append("    deleteDeliveries: ").append(toIndentedString(deleteDeliveries)).append("\n");
    sb.append("    executeAnalysis: ").append(toIndentedString(executeAnalysis)).append("\n");
    sb.append("    executeDeliveries: ").append(toIndentedString(executeDeliveries)).append("\n");
    sb.append("    exportActionPlansJira: ").append(toIndentedString(exportActionPlansJira)).append("\n");
    sb.append("    muteDefects: ").append(toIndentedString(muteDefects)).append("\n");
    sb.append("    changeDefectStatus: ").append(toIndentedString(changeDefectStatus)).append("\n");
    sb.append("    saveActionPlans: ").append(toIndentedString(saveActionPlans)).append("\n");
    sb.append("    viewApplicationData: ").append(toIndentedString(viewApplicationData)).append("\n");
    sb.append("    viewDeliveries: ").append(toIndentedString(viewDeliveries)).append("\n");
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

