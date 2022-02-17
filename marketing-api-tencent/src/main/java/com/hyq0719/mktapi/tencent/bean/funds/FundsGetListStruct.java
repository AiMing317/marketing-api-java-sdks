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

package com.hyq0719.mktapi.tencent.bean.funds;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * 返回结构
 */
public class FundsGetListStruct {
  @SerializedName("balance")
  private Long balance = null;

  @SerializedName("fund_status")
  private String fundStatus = null;

  @SerializedName("realtime_cost")
  private Long realtimeCost = null;

  @SerializedName("fund_type")
  private String fundType = null;

  public FundsGetListStruct balance(Long balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   *
   * @return balance
   */
  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public FundsGetListStruct fundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    return this;
  }

  /**
   * Get fundStatus
   *
   * @return fundStatus
   */
  public String getFundStatus() {
    return fundStatus;
  }

  public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
  }

  public FundsGetListStruct realtimeCost(Long realtimeCost) {
    this.realtimeCost = realtimeCost;
    return this;
  }

  /**
   * Get realtimeCost
   *
   * @return realtimeCost
   */
  public Long getRealtimeCost() {
    return realtimeCost;
  }

  public void setRealtimeCost(Long realtimeCost) {
    this.realtimeCost = realtimeCost;
  }

  public FundsGetListStruct fundType(String fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * Get fundType
   *
   * @return fundType
   */
  public String getFundType() {
    return fundType;
  }

  public void setFundType(String fundType) {
    this.fundType = fundType;
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