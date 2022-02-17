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

package com.hyq0719.mktapi.tencent.bean.common;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * 排除已转化用户定向
 */
public class ExcludedConvertedAudienceStruct {
  @SerializedName("excluded_dimension")
  private String excludedDimension = null;

  @SerializedName("conversion_behavior_list")
  private List<String> conversionBehaviorList = null;

  public ExcludedConvertedAudienceStruct excludedDimension(String excludedDimension) {
    this.excludedDimension = excludedDimension;
    return this;
  }

  /**
   * Get excludedDimension
   *
   * @return excludedDimension
   */
  public String getExcludedDimension() {
    return excludedDimension;
  }

  public void setExcludedDimension(String excludedDimension) {
    this.excludedDimension = excludedDimension;
  }

  public ExcludedConvertedAudienceStruct conversionBehaviorList(
          List<String> conversionBehaviorList) {
    this.conversionBehaviorList = conversionBehaviorList;
    return this;
  }

  public ExcludedConvertedAudienceStruct addConversionBehaviorListItem(
          String conversionBehaviorListItem) {
    if (this.conversionBehaviorList == null) {
      this.conversionBehaviorList = new ArrayList<String>();
    }
    this.conversionBehaviorList.add(conversionBehaviorListItem);
    return this;
  }

  /**
   * Get conversionBehaviorList
   *
   * @return conversionBehaviorList
   */
  public List<String> getConversionBehaviorList() {
    return conversionBehaviorList;
  }

  public void setConversionBehaviorList(List<String> conversionBehaviorList) {
    this.conversionBehaviorList = conversionBehaviorList;
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
