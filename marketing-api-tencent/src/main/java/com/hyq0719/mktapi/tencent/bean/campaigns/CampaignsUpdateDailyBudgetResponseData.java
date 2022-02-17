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

import java.util.ArrayList;
import java.util.List;

/**
 * CampaignsUpdateDailyBudgetResponseData
 */
public class CampaignsUpdateDailyBudgetResponseData {
  @SerializedName("list")
  private List<CampaignsUpdateDailyBudgetListStruct> list = null;

  public CampaignsUpdateDailyBudgetResponseData list(
          List<CampaignsUpdateDailyBudgetListStruct> list) {
    this.list = list;
    return this;
  }

  public CampaignsUpdateDailyBudgetResponseData addListItem(
          CampaignsUpdateDailyBudgetListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<CampaignsUpdateDailyBudgetListStruct>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  public List<CampaignsUpdateDailyBudgetListStruct> getList() {
    return list;
  }

  public void setList(List<CampaignsUpdateDailyBudgetListStruct> list) {
    this.list = list;
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