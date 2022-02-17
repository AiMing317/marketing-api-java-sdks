package com.hyq0719.mktapi.tencent.bean.common;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseListData<T> {
  @SerializedName("list")
  private List<T> list;

  public ResponseListData(List<T> list) {
    this.list = list;
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }
}
