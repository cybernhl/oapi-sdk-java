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

package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class MentionDoc {

  @SerializedName("token")
  private String token;
  @SerializedName("obj_type")
  private Integer objType;
  @SerializedName("url")
  private String url;
  @SerializedName("title")
  private String title;

  // builder 开始
  public MentionDoc() {
  }

  public MentionDoc(Builder builder) {
    this.token = builder.token;
    this.objType = builder.objType;
    this.url = builder.url;
    this.title = builder.title;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getToken() {
    return this.token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Integer getObjType() {
    return this.objType;
  }

  public void setObjType(Integer objType) {
    this.objType = objType;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public static class Builder {

    private String token;
    private Integer objType;
    private String url;
    private String title;

    public Builder token(String token) {
      this.token = token;
      return this;
    }

    public Builder objType(Integer objType) {
      this.objType = objType;
      return this;
    }

    public Builder objType(com.lark.oapi.service.docx.v1.enums.MentionObjTypeEnum objType) {
      this.objType = objType.getValue();
      return this;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }


    public MentionDoc build() {
      return new MentionDoc(this);
    }
  }
}