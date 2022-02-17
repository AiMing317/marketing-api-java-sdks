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
import com.hyq0719.mktapi.tencent.bean.TokenKey;

import java.util.ArrayList;
import java.util.List;

/**
 * CampaignsUpdateConfiguredStatusRequest
 */
public class CampaignsUpdateConfiguredStatusRequest implements TokenKey {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("update_configured_status_spec")
  private List<CampaignsUpdateConfiguredStatusUpdateConfiguredStatusStruct>
          updateConfiguredStatusSpec = null;

  public CampaignsUpdateConfiguredStatusRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignsUpdateConfiguredStatusRequest updateConfiguredStatusSpec(
          List<CampaignsUpdateConfiguredStatusUpdateConfiguredStatusStruct>
                  updateConfiguredStatusSpec) {
    this.updateConfiguredStatusSpec = updateConfiguredStatusSpec;
    return this;
  }

  public CampaignsUpdateConfiguredStatusRequest addUpdateConfiguredStatusSpecItem(
          CampaignsUpdateConfiguredStatusUpdateConfiguredStatusStruct updateConfiguredStatusSpecItem) {
    if (this.updateConfiguredStatusSpec == null) {
      this.updateConfiguredStatusSpec =
              new ArrayList<CampaignsUpdateConfiguredStatusUpdateConfiguredStatusStruct>();
    }
    this.updateConfiguredStatusSpec.add(updateConfiguredStatusSpecItem);
    return this;
  }

  /**
   * Get updateConfiguredStatusSpec
   *
   * @return updateConfiguredStatusSpec
   */
  public List<CampaignsUpdateConfiguredStatusUpdateConfiguredStatusStruct>
  getUpdateConfiguredStatusSpec() {
    return updateConfiguredStatusSpec;
  }

  public void setUpdateConfiguredStatusSpec(
          List<CampaignsUpdateConfiguredStatusUpdateConfiguredStatusStruct>
                  updateConfiguredStatusSpec) {
    this.updateConfiguredStatusSpec = updateConfiguredStatusSpec;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(accountId);
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
