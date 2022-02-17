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

package com.hyq0719.mktapi.tencent.bean.adgroups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * AdgroupsUpdateDatetimeResponseData
 */
public class AdgroupsUpdateDatetimeResponseData {
  @SerializedName("list")
  private List<AdgroupsUpdateDatetimeListStruct> list = null;

  public AdgroupsUpdateDatetimeResponseData list(List<AdgroupsUpdateDatetimeListStruct> list) {
    this.list = list;
    return this;
  }

  public AdgroupsUpdateDatetimeResponseData addListItem(AdgroupsUpdateDatetimeListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<AdgroupsUpdateDatetimeListStruct>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  public List<AdgroupsUpdateDatetimeListStruct> getList() {
    return list;
  }

  public void setList(List<AdgroupsUpdateDatetimeListStruct> list) {
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
