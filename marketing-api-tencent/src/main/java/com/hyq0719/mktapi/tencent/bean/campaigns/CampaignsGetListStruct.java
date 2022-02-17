/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.hyq0719.mktapi.tencent.bean.campaigns;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * 返回结构
 */
public class CampaignsGetListStruct {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("campaign_name")
  private String campaignName = null;

  @SerializedName("configured_status")
  private String configuredStatus = null;

  @SerializedName("campaign_type")
  private String campaignType = null;

  @SerializedName("promoted_object_type")
  private String promotedObjectType = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("budget_reach_date")
  private Long budgetReachDate = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("speed_mode")
  private String speedMode = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("is_auto_replenish")
  private Long isAutoReplenish = null;

  public CampaignsGetListStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   *
   * @return campaignId
   */
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignsGetListStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * Get campaignName
   *
   * @return campaignName
   */
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public CampaignsGetListStruct configuredStatus(String configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   */
  public String getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(String configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  public CampaignsGetListStruct campaignType(String campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  /**
   * Get campaignType
   *
   * @return campaignType
   */
  public String getCampaignType() {
    return campaignType;
  }

  public void setCampaignType(String campaignType) {
    this.campaignType = campaignType;
  }

  public CampaignsGetListStruct promotedObjectType(String promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  /**
   * Get promotedObjectType
   *
   * @return promotedObjectType
   */
  public String getPromotedObjectType() {
    return promotedObjectType;
  }

  public void setPromotedObjectType(String promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
  }

  public CampaignsGetListStruct dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  /**
   * Get dailyBudget
   *
   * @return dailyBudget
   */
  public Long getDailyBudget() {
    return dailyBudget;
  }

  public void setDailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
  }

  public CampaignsGetListStruct budgetReachDate(Long budgetReachDate) {
    this.budgetReachDate = budgetReachDate;
    return this;
  }

  /**
   * Get budgetReachDate
   *
   * @return budgetReachDate
   */
  public Long getBudgetReachDate() {
    return budgetReachDate;
  }

  public void setBudgetReachDate(Long budgetReachDate) {
    this.budgetReachDate = budgetReachDate;
  }

  public CampaignsGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public CampaignsGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public CampaignsGetListStruct speedMode(String speedMode) {
    this.speedMode = speedMode;
    return this;
  }

  /**
   * Get speedMode
   *
   * @return speedMode
   */
  public String getSpeedMode() {
    return speedMode;
  }

  public void setSpeedMod(String speedMode) {
    this.speedMode = speedMode;
  }

  public CampaignsGetListStruct isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   *
   * @return isDeleted
   */
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public CampaignsGetListStruct isAutoReplenish(Long isAutoReplenish) {
    this.isAutoReplenish = isAutoReplenish;
    return this;
  }

  /**
   * Get isAutoReplenish
   *
   * @return isAutoReplenish
   */
  public Long getIsAutoReplenish() {
    return isAutoReplenish;
  }

  public void setIsAutoReplenish(Long isAutoReplenish) {
    this.isAutoReplenish = isAutoReplenish;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}