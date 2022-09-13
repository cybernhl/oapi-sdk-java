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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class LanguageInfo {

  /**
   * 语言
   * <p> 示例值：
   */
  @SerializedName("language")
  private Integer language;
  /**
   * 熟练程度
   * <p> 示例值：
   */
  @SerializedName("proficiency")
  private Integer proficiency;

  // builder 开始
  public LanguageInfo() {
  }

  public LanguageInfo(Builder builder) {
    /**
     * 语言
     * <p> 示例值：
     */
    this.language = builder.language;
    /**
     * 熟练程度
     * <p> 示例值：
     */
    this.proficiency = builder.proficiency;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getLanguage() {
    return this.language;
  }

  public void setLanguage(Integer language) {
    this.language = language;
  }

  public Integer getProficiency() {
    return this.proficiency;
  }

  public void setProficiency(Integer proficiency) {
    this.proficiency = proficiency;
  }

  public static class Builder {

    /**
     * 语言
     * <p> 示例值：
     */
    private Integer language;
    /**
     * 熟练程度
     * <p> 示例值：
     */
    private Integer proficiency;

    /**
     * 语言
     * <p> 示例值：
     *
     * @param language
     * @return
     */
    public Builder language(Integer language) {
      this.language = language;
      return this;
    }


    /**
     * 熟练程度
     * <p> 示例值：
     *
     * @param proficiency
     * @return
     */
    public Builder proficiency(Integer proficiency) {
      this.proficiency = proficiency;
      return this;
    }


    public LanguageInfo build() {
      return new LanguageInfo(this);
    }
  }
}