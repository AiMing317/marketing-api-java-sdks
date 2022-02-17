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
 * 场景定向
 */
public class SceneTargetingForWrite {
  @SerializedName("mobile_union")
  private List<String> mobileUnion = null;

  @SerializedName("exclude_mobile_union")
  private List<String> excludeMobileUnion = null;

  @SerializedName("mobile_union_industry")
  private List<String> mobileUnionIndustry = null;

  @SerializedName("union_position_package")
  private List<Long> unionPositionPackage = null;

  @SerializedName("exclude_union_position_package")
  private List<Long> excludeUnionPositionPackage = null;

  @SerializedName("tencent_news")
  private List<String> tencentNews = null;

  @SerializedName("display_scene")
  private List<String> displayScene = null;

  public SceneTargetingForWrite mobileUnion(List<String> mobileUnion) {
    this.mobileUnion = mobileUnion;
    return this;
  }

  public SceneTargetingForWrite addMobileUnionItem(String mobileUnionItem) {
    if (this.mobileUnion == null) {
      this.mobileUnion = new ArrayList<String>();
    }
    this.mobileUnion.add(mobileUnionItem);
    return this;
  }

  /**
   * Get mobileUnion
   *
   * @return mobileUnion
   */
  public List<String> getMobileUnion() {
    return mobileUnion;
  }

  public void setMobileUnion(List<String> mobileUnion) {
    this.mobileUnion = mobileUnion;
  }

  public SceneTargetingForWrite excludeMobileUnion(List<String> excludeMobileUnion) {
    this.excludeMobileUnion = excludeMobileUnion;
    return this;
  }

  public SceneTargetingForWrite addExcludeMobileUnionItem(String excludeMobileUnionItem) {
    if (this.excludeMobileUnion == null) {
      this.excludeMobileUnion = new ArrayList<String>();
    }
    this.excludeMobileUnion.add(excludeMobileUnionItem);
    return this;
  }

  /**
   * Get excludeMobileUnion
   *
   * @return excludeMobileUnion
   */
  public List<String> getExcludeMobileUnion() {
    return excludeMobileUnion;
  }

  public void setExcludeMobileUnion(List<String> excludeMobileUnion) {
    this.excludeMobileUnion = excludeMobileUnion;
  }

  public SceneTargetingForWrite mobileUnionIndustry(List<String> mobileUnionIndustry) {
    this.mobileUnionIndustry = mobileUnionIndustry;
    return this;
  }

  public SceneTargetingForWrite addMobileUnionIndustryItem(String mobileUnionIndustryItem) {
    if (this.mobileUnionIndustry == null) {
      this.mobileUnionIndustry = new ArrayList<String>();
    }
    this.mobileUnionIndustry.add(mobileUnionIndustryItem);
    return this;
  }

  /**
   * Get mobileUnionIndustry
   *
   * @return mobileUnionIndustry
   */
  public List<String> getMobileUnionIndustry() {
    return mobileUnionIndustry;
  }

  public void setMobileUnionIndustry(List<String> mobileUnionIndustry) {
    this.mobileUnionIndustry = mobileUnionIndustry;
  }

  public SceneTargetingForWrite unionPositionPackage(List<Long> unionPositionPackage) {
    this.unionPositionPackage = unionPositionPackage;
    return this;
  }

  public SceneTargetingForWrite addUnionPositionPackageItem(Long unionPositionPackageItem) {
    if (this.unionPositionPackage == null) {
      this.unionPositionPackage = new ArrayList<Long>();
    }
    this.unionPositionPackage.add(unionPositionPackageItem);
    return this;
  }

  /**
   * Get unionPositionPackage
   *
   * @return unionPositionPackage
   */
  public List<Long> getUnionPositionPackage() {
    return unionPositionPackage;
  }

  public void setUnionPositionPackage(List<Long> unionPositionPackage) {
    this.unionPositionPackage = unionPositionPackage;
  }

  public SceneTargetingForWrite excludeUnionPositionPackage(
          List<Long> excludeUnionPositionPackage) {
    this.excludeUnionPositionPackage = excludeUnionPositionPackage;
    return this;
  }

  public SceneTargetingForWrite addExcludeUnionPositionPackageItem(
          Long excludeUnionPositionPackageItem) {
    if (this.excludeUnionPositionPackage == null) {
      this.excludeUnionPositionPackage = new ArrayList<Long>();
    }
    this.excludeUnionPositionPackage.add(excludeUnionPositionPackageItem);
    return this;
  }

  /**
   * Get excludeUnionPositionPackage
   *
   * @return excludeUnionPositionPackage
   */
  public List<Long> getExcludeUnionPositionPackage() {
    return excludeUnionPositionPackage;
  }

  public void setExcludeUnionPositionPackage(List<Long> excludeUnionPositionPackage) {
    this.excludeUnionPositionPackage = excludeUnionPositionPackage;
  }

  public SceneTargetingForWrite tencentNews(List<String> tencentNews) {
    this.tencentNews = tencentNews;
    return this;
  }

  public SceneTargetingForWrite addTencentNewsItem(String tencentNewsItem) {
    if (this.tencentNews == null) {
      this.tencentNews = new ArrayList<String>();
    }
    this.tencentNews.add(tencentNewsItem);
    return this;
  }

  /**
   * Get tencentNews
   *
   * @return tencentNews
   */
  public List<String> getTencentNews() {
    return tencentNews;
  }

  public void setTencentNews(List<String> tencentNews) {
    this.tencentNews = tencentNews;
  }

  public SceneTargetingForWrite displayScene(List<String> displayScene) {
    this.displayScene = displayScene;
    return this;
  }

  public SceneTargetingForWrite addDisplaySceneItem(String displaySceneItem) {
    if (this.displayScene == null) {
      this.displayScene = new ArrayList<String>();
    }
    this.displayScene.add(displaySceneItem);
    return this;
  }

  /**
   * Get displayScene
   *
   * @return displayScene
   */
  public List<String> getDisplayScene() {
    return displayScene;
  }

  public void setDisplayScene(List<String> displayScene) {
    this.displayScene = displayScene;
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
