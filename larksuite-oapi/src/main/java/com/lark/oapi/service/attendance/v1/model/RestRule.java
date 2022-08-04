// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class RestRule {

  @SerializedName("rest_begin_time")
  private String restBeginTime;
  @SerializedName("rest_end_time")
  private String restEndTime;

  // builder 开始
  public RestRule() {
  }

  public RestRule(Builder builder) {
    this.restBeginTime = builder.restBeginTime;
    this.restEndTime = builder.restEndTime;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getRestBeginTime() {
    return this.restBeginTime;
  }

  public void setRestBeginTime(String restBeginTime) {
    this.restBeginTime = restBeginTime;
  }

  public String getRestEndTime() {
    return this.restEndTime;
  }

  public void setRestEndTime(String restEndTime) {
    this.restEndTime = restEndTime;
  }

  public static class Builder {

    private String restBeginTime;
    private String restEndTime;

    public Builder restBeginTime(String restBeginTime) {
      this.restBeginTime = restBeginTime;
      return this;
    }

    public Builder restEndTime(String restEndTime) {
      this.restEndTime = restEndTime;
      return this;
    }


    public RestRule build() {
      return new RestRule(this);
    }
  }
}