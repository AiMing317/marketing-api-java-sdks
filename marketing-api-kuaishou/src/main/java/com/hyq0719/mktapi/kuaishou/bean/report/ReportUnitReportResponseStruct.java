package com.hyq0719.mktapi.kuaishou.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ReportUnitReportResponseStruct {
  @SerializedName("event_pay_first_day")
  private Long eventPayFirstDay = null;

  @SerializedName("event_new_user_pay_ratio")
  private Double eventNewUserPayRatio = null;

  @SerializedName("bclick")
  private Long bclick = null;

  @SerializedName("event_register_cost")
  private Double eventRegisterCost = null;

  @SerializedName("event_get_through")
  private Long eventGetThrough = null;

  @SerializedName("event_new_user_credit_grant_app")
  private Long eventNewUserCreditGrantApp = null;

  @SerializedName("event_button_click_ratio")
  private Double eventButtonClickRatio = null;

  @SerializedName("event_credit_grant_app_cost")
  private Double eventCreditGrantAppCost = null;

  @SerializedName("event_order_paid")
  private Long eventOrderPaid = null;

  @SerializedName("stat_hour")
  private Integer statHour = null;

  @SerializedName("event_new_user_jinjian_page_cost")
  private Double eventNewUserJinjianPageCost = null;

  @SerializedName("event_pay_first_day_roi")
  private Double eventPayFirstDayRoi = null;

  @SerializedName("event_pay_roi")
  private Double eventPayRoi = null;

  @SerializedName("event_goods_view_cost")
  private Double eventGoodsViewCost = null;

  @SerializedName("photo_click")
  private Long photoClick = null;

  @SerializedName("event_next_day_stay_cost")
  private Double eventNextDayStayCost = null;

  @SerializedName("block")
  private Long block = null;

  @SerializedName("event_order_paid_purchase_amount")
  private Double eventOrderPaidPurchaseAmount = null;

  @SerializedName("event_credit_grant_landing_page")
  private Long eventCreditGrantLandingPage = null;

  @SerializedName("event_new_user_credit_grant_page_cost")
  private Double eventNewUserCreditGrantPageCost = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("event_valid_clues")
  private Long eventValidClues = null;

  @SerializedName("like")
  private Long like = null;

  @SerializedName("event_order_paid_roi")
  private Double eventOrderPaidRoi = null;

  @SerializedName("event_add_wechat_cost")
  private Double eventAddWechatCost = null;

  @SerializedName("event_next_day_stay_ratio")
  private Double eventNextDayStayRatio = null;

  @SerializedName("event_register_ratio")
  private Double eventRegisterRatio = null;

  @SerializedName("event_valid_clues_cost")
  private Double eventValidCluesCost = null;

  @SerializedName("event_order_amount_roi")
  private Long eventOrderAmountRoi = null;

  @SerializedName("unit_name")
  private String unitName = null;

  @SerializedName("event_button_click")
  private Long eventButtonClick = null;

  @SerializedName("merchant_reco_fans_cost")
  private Double merchantRecoFansCost = null;

  @SerializedName("download_completed")
  private Long downloadCompleted = null;

  @SerializedName("event_jin_jian_app_cost")
  private Double eventJinJianAppCost = null;

  @SerializedName("play_3s_ratio")
  private Double play3sRatio = null;

  @SerializedName("form_action_ratio")
  private Double formActionRatio = null;

  @SerializedName("play_5s_ratio")
  private Double play5sRatio = null;

  @SerializedName("activation")
  private Long activation = null;

  @SerializedName("ad_product_cnt")
  private Long adProductCnt = null;

  @SerializedName("event_new_user_jinjian_page")
  private Long eventNewUserJinjianPage = null;

  @SerializedName("form_cost")
  private Double formCost = null;

  @SerializedName("event_next_day_stay")
  private Long eventNextDayStay = null;

  @SerializedName("event_get_through_ratio")
  private Double eventGetThroughRatio = null;

  @SerializedName("submit")
  private Long submit = null;

  @SerializedName("show")
  private Long show = null;

  @SerializedName("event_credit_grant_app_ratio")
  private Double eventCreditGrantAppRatio = null;

  @SerializedName("event_jin_jian_app")
  private Long eventJinJianApp = null;

  @SerializedName("event_pay_purchase_amount")
  private Double eventPayPurchaseAmount = null;

  @SerializedName("campaign_name")
  private String campaignName = null;

  @SerializedName("negative")
  private Long negative = null;

  @SerializedName("form_count")
  private Long formCount = null;

  @SerializedName("event_add_wechat")
  private Long eventAddWechat = null;

  @SerializedName("event_button_click_cost")
  private Double eventButtonClickCost = null;

  @SerializedName("photo_click_ratio")
  private Double photoClickRatio = null;

  @SerializedName("event_new_user_pay_cost")
  private Double eventNewUserPayCost = null;

  @SerializedName("share")
  private Long share = null;

  @SerializedName("event_new_user_jinjian_app_cost")
  private Double eventNewUserJinjianAppCost = null;

  @SerializedName("event_new_user_credit_grant_page")
  private Long eventNewUserCreditGrantPage = null;

  @SerializedName("impression_1k_cost")
  private Double impression1kCost = null;

  @SerializedName("photo_click_cost")
  private Double photoClickCost = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("event_get_through_cost")
  private Double eventGetThroughCost = null;

  @SerializedName("event_goods_view")
  private Long eventGoodsView = null;

  @SerializedName("event_new_user_jinjian_page_roi")
  private Double eventNewUserJinjianPageRoi = null;

  @SerializedName("event_register")
  private Long eventRegister = null;

  @SerializedName("event_new_user_jinjian_app")
  private Long eventNewUserJinjianApp = null;

  @SerializedName("download_started")
  private Long downloadStarted = null;

  @SerializedName("event_new_user_credit_grant_page_roi")
  private Double eventNewUserCreditGrantPageRoi = null;

  @SerializedName("charge")
  private Double charge = null;

  @SerializedName("event_jin_jian_landing_page_cost")
  private Double eventJinJianLandingPageCost = null;

  @SerializedName("cancel_follow")
  private Long cancelFollow = null;

  @SerializedName("play_end_ratio")
  private Double playEndRatio = null;

  @SerializedName("stat_date")
  private String statDate = null;

  @SerializedName("event_pay")
  private Long eventPay = null;

  @SerializedName("event_new_user_jinjian_app_roi")
  private Double eventNewUserJinjianAppRoi = null;

  @SerializedName("event_new_user_credit_grant_app_roi")
  private Double eventNewUserCreditGrantAppRoi = null;

  @SerializedName("action_cost")
  private Double actionCost = null;

  @SerializedName("event_new_user_credit_grant_app_cost")
  private Double eventNewUserCreditGrantAppCost = null;

  @SerializedName("event_credit_grant_landing_page_cost")
  private Double eventCreditGrantLandingPageCost = null;

  @SerializedName("aclick")
  private Long aclick = null;

  @SerializedName("follow")
  private Long follow = null;

  @SerializedName("event_credit_grant_app")
  private Long eventCreditGrantApp = null;

  @SerializedName("event_new_user_pay")
  private Long eventNewUserPay = null;

  @SerializedName("event_jin_jian_landing_page")
  private Long eventJinJianLandingPage = null;

  @SerializedName("action_ratio")
  private Double actionRatio = null;

  @SerializedName("report")
  private Long report = null;

  @SerializedName("event_pay_purchase_amount_first_day")
  private Double eventPayPurchaseAmountFirstDay = null;

  @SerializedName("comment")
  private Long comment = null;

  @SerializedName("event_order_paid_cost")
  private Double eventOrderPaidCost = null;

  @SerializedName("merchant_reco_fans")
  private Long merchantRecoFans = null;

  @SerializedName("event_add_wechat_ratio")
  private Double eventAddWechatRatio = null;


  public ReportUnitReportResponseStruct eventPayFirstDay(Long eventPayFirstDay) {
    this.eventPayFirstDay = eventPayFirstDay;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserPayRatio(Double eventNewUserPayRatio) {
    this.eventNewUserPayRatio = eventNewUserPayRatio;
    return this;
  }

  public ReportUnitReportResponseStruct bclick(Long bclick) {
    this.bclick = bclick;
    return this;
  }

  public ReportUnitReportResponseStruct eventRegisterCost(Double eventRegisterCost) {
    this.eventRegisterCost = eventRegisterCost;
    return this;
  }

  public ReportUnitReportResponseStruct eventGetThrough(Long eventGetThrough) {
    this.eventGetThrough = eventGetThrough;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserCreditGrantApp(Long eventNewUserCreditGrantApp) {
    this.eventNewUserCreditGrantApp = eventNewUserCreditGrantApp;
    return this;
  }

  public ReportUnitReportResponseStruct eventButtonClickRatio(Double eventButtonClickRatio) {
    this.eventButtonClickRatio = eventButtonClickRatio;
    return this;
  }

  public ReportUnitReportResponseStruct eventCreditGrantAppCost(Double eventCreditGrantAppCost) {
    this.eventCreditGrantAppCost = eventCreditGrantAppCost;
    return this;
  }

  public ReportUnitReportResponseStruct eventOrderPaid(Long eventOrderPaid) {
    this.eventOrderPaid = eventOrderPaid;
    return this;
  }

  public ReportUnitReportResponseStruct statHour(Integer statHour) {
    this.statHour = statHour;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserJinjianPageCost(Double eventNewUserJinjianPageCost) {
    this.eventNewUserJinjianPageCost = eventNewUserJinjianPageCost;
    return this;
  }

  public ReportUnitReportResponseStruct eventPayFirstDayRoi(Double eventPayFirstDayRoi) {
    this.eventPayFirstDayRoi = eventPayFirstDayRoi;
    return this;
  }

  public ReportUnitReportResponseStruct eventPayRoi(Double eventPayRoi) {
    this.eventPayRoi = eventPayRoi;
    return this;
  }

  public ReportUnitReportResponseStruct eventGoodsViewCost(Double eventGoodsViewCost) {
    this.eventGoodsViewCost = eventGoodsViewCost;
    return this;
  }

  public ReportUnitReportResponseStruct photoClick(Long photoClick) {
    this.photoClick = photoClick;
    return this;
  }

  public ReportUnitReportResponseStruct eventNextDayStayCost(Double eventNextDayStayCost) {
    this.eventNextDayStayCost = eventNextDayStayCost;
    return this;
  }

  public ReportUnitReportResponseStruct block(Long block) {
    this.block = block;
    return this;
  }

  public ReportUnitReportResponseStruct eventOrderPaidPurchaseAmount(Double eventOrderPaidPurchaseAmount) {
    this.eventOrderPaidPurchaseAmount = eventOrderPaidPurchaseAmount;
    return this;
  }

  public ReportUnitReportResponseStruct eventCreditGrantLandingPage(Long eventCreditGrantLandingPage) {
    this.eventCreditGrantLandingPage = eventCreditGrantLandingPage;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserCreditGrantPageCost(Double eventNewUserCreditGrantPageCost) {
    this.eventNewUserCreditGrantPageCost = eventNewUserCreditGrantPageCost;
    return this;
  }

  public ReportUnitReportResponseStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public ReportUnitReportResponseStruct eventValidClues(Long eventValidClues) {
    this.eventValidClues = eventValidClues;
    return this;
  }

  public ReportUnitReportResponseStruct like(Long like) {
    this.like = like;
    return this;
  }

  public ReportUnitReportResponseStruct eventOrderPaidRoi(Double eventOrderPaidRoi) {
    this.eventOrderPaidRoi = eventOrderPaidRoi;
    return this;
  }

  public ReportUnitReportResponseStruct eventAddWechatCost(Double eventAddWechatCost) {
    this.eventAddWechatCost = eventAddWechatCost;
    return this;
  }

  public ReportUnitReportResponseStruct eventNextDayStayRatio(Double eventNextDayStayRatio) {
    this.eventNextDayStayRatio = eventNextDayStayRatio;
    return this;
  }

  public ReportUnitReportResponseStruct eventRegisterRatio(Double eventRegisterRatio) {
    this.eventRegisterRatio = eventRegisterRatio;
    return this;
  }

  public ReportUnitReportResponseStruct eventValidCluesCost(Double eventValidCluesCost) {
    this.eventValidCluesCost = eventValidCluesCost;
    return this;
  }

  public ReportUnitReportResponseStruct eventOrderAmountRoi(Long eventOrderAmountRoi) {
    this.eventOrderAmountRoi = eventOrderAmountRoi;
    return this;
  }

  public ReportUnitReportResponseStruct unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

  public ReportUnitReportResponseStruct eventButtonClick(Long eventButtonClick) {
    this.eventButtonClick = eventButtonClick;
    return this;
  }

  public ReportUnitReportResponseStruct merchantRecoFansCost(Double merchantRecoFansCost) {
    this.merchantRecoFansCost = merchantRecoFansCost;
    return this;
  }

  public ReportUnitReportResponseStruct downloadCompleted(Long downloadCompleted) {
    this.downloadCompleted = downloadCompleted;
    return this;
  }

  public ReportUnitReportResponseStruct eventJinJianAppCost(Double eventJinJianAppCost) {
    this.eventJinJianAppCost = eventJinJianAppCost;
    return this;
  }

  public ReportUnitReportResponseStruct play3sRatio(Double play3sRatio) {
    this.play3sRatio = play3sRatio;
    return this;
  }

  public ReportUnitReportResponseStruct formActionRatio(Double formActionRatio) {
    this.formActionRatio = formActionRatio;
    return this;
  }

  public ReportUnitReportResponseStruct play5sRatio(Double play5sRatio) {
    this.play5sRatio = play5sRatio;
    return this;
  }

  public ReportUnitReportResponseStruct activation(Long activation) {
    this.activation = activation;
    return this;
  }

  public ReportUnitReportResponseStruct adProductCnt(Long adProductCnt) {
    this.adProductCnt = adProductCnt;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserJinjianPage(Long eventNewUserJinjianPage) {
    this.eventNewUserJinjianPage = eventNewUserJinjianPage;
    return this;
  }

  public ReportUnitReportResponseStruct formCost(Double formCost) {
    this.formCost = formCost;
    return this;
  }

  public ReportUnitReportResponseStruct eventNextDayStay(Long eventNextDayStay) {
    this.eventNextDayStay = eventNextDayStay;
    return this;
  }

  public ReportUnitReportResponseStruct eventGetThroughRatio(Double eventGetThroughRatio) {
    this.eventGetThroughRatio = eventGetThroughRatio;
    return this;
  }

  public ReportUnitReportResponseStruct submit(Long submit) {
    this.submit = submit;
    return this;
  }

  public ReportUnitReportResponseStruct show(Long show) {
    this.show = show;
    return this;
  }

  public ReportUnitReportResponseStruct eventCreditGrantAppRatio(Double eventCreditGrantAppRatio) {
    this.eventCreditGrantAppRatio = eventCreditGrantAppRatio;
    return this;
  }

  public ReportUnitReportResponseStruct eventJinJianApp(Long eventJinJianApp) {
    this.eventJinJianApp = eventJinJianApp;
    return this;
  }

  public ReportUnitReportResponseStruct eventPayPurchaseAmount(Double eventPayPurchaseAmount) {
    this.eventPayPurchaseAmount = eventPayPurchaseAmount;
    return this;
  }

  public ReportUnitReportResponseStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public ReportUnitReportResponseStruct negative(Long negative) {
    this.negative = negative;
    return this;
  }

  public ReportUnitReportResponseStruct formCount(Long formCount) {
    this.formCount = formCount;
    return this;
  }

  public ReportUnitReportResponseStruct eventAddWechat(Long eventAddWechat) {
    this.eventAddWechat = eventAddWechat;
    return this;
  }

  public ReportUnitReportResponseStruct eventButtonClickCost(Double eventButtonClickCost) {
    this.eventButtonClickCost = eventButtonClickCost;
    return this;
  }

  public ReportUnitReportResponseStruct photoClickRatio(Double photoClickRatio) {
    this.photoClickRatio = photoClickRatio;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserPayCost(Double eventNewUserPayCost) {
    this.eventNewUserPayCost = eventNewUserPayCost;
    return this;
  }

  public ReportUnitReportResponseStruct share(Long share) {
    this.share = share;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserJinjianAppCost(Double eventNewUserJinjianAppCost) {
    this.eventNewUserJinjianAppCost = eventNewUserJinjianAppCost;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserCreditGrantPage(Long eventNewUserCreditGrantPage) {
    this.eventNewUserCreditGrantPage = eventNewUserCreditGrantPage;
    return this;
  }

  public ReportUnitReportResponseStruct impression1kCost(Double impression1kCost) {
    this.impression1kCost = impression1kCost;
    return this;
  }

  public ReportUnitReportResponseStruct photoClickCost(Double photoClickCost) {
    this.photoClickCost = photoClickCost;
    return this;
  }

  public ReportUnitReportResponseStruct unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public ReportUnitReportResponseStruct eventGetThroughCost(Double eventGetThroughCost) {
    this.eventGetThroughCost = eventGetThroughCost;
    return this;
  }

  public ReportUnitReportResponseStruct eventGoodsView(Long eventGoodsView) {
    this.eventGoodsView = eventGoodsView;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserJinjianPageRoi(Double eventNewUserJinjianPageRoi) {
    this.eventNewUserJinjianPageRoi = eventNewUserJinjianPageRoi;
    return this;
  }

  public ReportUnitReportResponseStruct eventRegister(Long eventRegister) {
    this.eventRegister = eventRegister;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserJinjianApp(Long eventNewUserJinjianApp) {
    this.eventNewUserJinjianApp = eventNewUserJinjianApp;
    return this;
  }

  public ReportUnitReportResponseStruct downloadStarted(Long downloadStarted) {
    this.downloadStarted = downloadStarted;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserCreditGrantPageRoi(Double eventNewUserCreditGrantPageRoi) {
    this.eventNewUserCreditGrantPageRoi = eventNewUserCreditGrantPageRoi;
    return this;
  }

  public ReportUnitReportResponseStruct charge(Double charge) {
    this.charge = charge;
    return this;
  }

  public ReportUnitReportResponseStruct eventJinJianLandingPageCost(Double eventJinJianLandingPageCost) {
    this.eventJinJianLandingPageCost = eventJinJianLandingPageCost;
    return this;
  }

  public ReportUnitReportResponseStruct cancelFollow(Long cancelFollow) {
    this.cancelFollow = cancelFollow;
    return this;
  }

  public ReportUnitReportResponseStruct playEndRatio(Double playEndRatio) {
    this.playEndRatio = playEndRatio;
    return this;
  }

  public ReportUnitReportResponseStruct statDate(String statDate) {
    this.statDate = statDate;
    return this;
  }

  public ReportUnitReportResponseStruct eventPay(Long eventPay) {
    this.eventPay = eventPay;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserJinjianAppRoi(Double eventNewUserJinjianAppRoi) {
    this.eventNewUserJinjianAppRoi = eventNewUserJinjianAppRoi;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserCreditGrantAppRoi(Double eventNewUserCreditGrantAppRoi) {
    this.eventNewUserCreditGrantAppRoi = eventNewUserCreditGrantAppRoi;
    return this;
  }

  public ReportUnitReportResponseStruct actionCost(Double actionCost) {
    this.actionCost = actionCost;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserCreditGrantAppCost(Double eventNewUserCreditGrantAppCost) {
    this.eventNewUserCreditGrantAppCost = eventNewUserCreditGrantAppCost;
    return this;
  }

  public ReportUnitReportResponseStruct eventCreditGrantLandingPageCost(Double eventCreditGrantLandingPageCost) {
    this.eventCreditGrantLandingPageCost = eventCreditGrantLandingPageCost;
    return this;
  }

  public ReportUnitReportResponseStruct aclick(Long aclick) {
    this.aclick = aclick;
    return this;
  }

  public ReportUnitReportResponseStruct follow(Long follow) {
    this.follow = follow;
    return this;
  }

  public ReportUnitReportResponseStruct eventCreditGrantApp(Long eventCreditGrantApp) {
    this.eventCreditGrantApp = eventCreditGrantApp;
    return this;
  }

  public ReportUnitReportResponseStruct eventNewUserPay(Long eventNewUserPay) {
    this.eventNewUserPay = eventNewUserPay;
    return this;
  }

  public ReportUnitReportResponseStruct eventJinJianLandingPage(Long eventJinJianLandingPage) {
    this.eventJinJianLandingPage = eventJinJianLandingPage;
    return this;
  }

  public ReportUnitReportResponseStruct actionRatio(Double actionRatio) {
    this.actionRatio = actionRatio;
    return this;
  }

  public ReportUnitReportResponseStruct report(Long report) {
    this.report = report;
    return this;
  }

  public ReportUnitReportResponseStruct eventPayPurchaseAmountFirstDay(Double eventPayPurchaseAmountFirstDay) {
    this.eventPayPurchaseAmountFirstDay = eventPayPurchaseAmountFirstDay;
    return this;
  }

  public ReportUnitReportResponseStruct comment(Long comment) {
    this.comment = comment;
    return this;
  }

  public ReportUnitReportResponseStruct eventOrderPaidCost(Double eventOrderPaidCost) {
    this.eventOrderPaidCost = eventOrderPaidCost;
    return this;
  }

  public ReportUnitReportResponseStruct merchantRecoFans(Long merchantRecoFans) {
    this.merchantRecoFans = merchantRecoFans;
    return this;
  }

  public ReportUnitReportResponseStruct eventAddWechatRatio(Double eventAddWechatRatio) {
    this.eventAddWechatRatio = eventAddWechatRatio;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
