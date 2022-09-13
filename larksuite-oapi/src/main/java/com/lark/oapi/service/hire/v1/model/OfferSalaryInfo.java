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

public class OfferSalaryInfo {

  /**
   * 币种
   * <p> 示例值：CNY
   */
  @SerializedName("currency")
  private String currency;
  /**
   * 基本工资，当启用 Offer 申请表中的「薪资信息」模块时，「基本工资」字段为必传项
   * <p> 示例值：1000000
   */
  @SerializedName("basic_salary")
  private String basicSalary;
  /**
   * 试用期百分比
   * <p> 示例值：0.8
   */
  @SerializedName("probation_salary_percentage")
  private String probationSalaryPercentage;
  /**
   * 年终奖月数
   * <p> 示例值：3
   */
  @SerializedName("award_salary_multiple")
  private String awardSalaryMultiple;
  /**
   * 期权股数
   * <p> 示例值：30
   */
  @SerializedName("option_shares")
  private String optionShares;
  /**
   * 季度奖金额
   * <p> 示例值：3000
   */
  @SerializedName("quarterly_bonus")
  private String quarterlyBonus;
  /**
   * 半年奖金额
   * <p> 示例值：10000
   */
  @SerializedName("half_year_bonus")
  private String halfYearBonus;

  // builder 开始
  public OfferSalaryInfo() {
  }

  public OfferSalaryInfo(Builder builder) {
    /**
     * 币种
     * <p> 示例值：CNY
     */
    this.currency = builder.currency;
    /**
     * 基本工资，当启用 Offer 申请表中的「薪资信息」模块时，「基本工资」字段为必传项
     * <p> 示例值：1000000
     */
    this.basicSalary = builder.basicSalary;
    /**
     * 试用期百分比
     * <p> 示例值：0.8
     */
    this.probationSalaryPercentage = builder.probationSalaryPercentage;
    /**
     * 年终奖月数
     * <p> 示例值：3
     */
    this.awardSalaryMultiple = builder.awardSalaryMultiple;
    /**
     * 期权股数
     * <p> 示例值：30
     */
    this.optionShares = builder.optionShares;
    /**
     * 季度奖金额
     * <p> 示例值：3000
     */
    this.quarterlyBonus = builder.quarterlyBonus;
    /**
     * 半年奖金额
     * <p> 示例值：10000
     */
    this.halfYearBonus = builder.halfYearBonus;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getBasicSalary() {
    return this.basicSalary;
  }

  public void setBasicSalary(String basicSalary) {
    this.basicSalary = basicSalary;
  }

  public String getProbationSalaryPercentage() {
    return this.probationSalaryPercentage;
  }

  public void setProbationSalaryPercentage(String probationSalaryPercentage) {
    this.probationSalaryPercentage = probationSalaryPercentage;
  }

  public String getAwardSalaryMultiple() {
    return this.awardSalaryMultiple;
  }

  public void setAwardSalaryMultiple(String awardSalaryMultiple) {
    this.awardSalaryMultiple = awardSalaryMultiple;
  }

  public String getOptionShares() {
    return this.optionShares;
  }

  public void setOptionShares(String optionShares) {
    this.optionShares = optionShares;
  }

  public String getQuarterlyBonus() {
    return this.quarterlyBonus;
  }

  public void setQuarterlyBonus(String quarterlyBonus) {
    this.quarterlyBonus = quarterlyBonus;
  }

  public String getHalfYearBonus() {
    return this.halfYearBonus;
  }

  public void setHalfYearBonus(String halfYearBonus) {
    this.halfYearBonus = halfYearBonus;
  }

  public static class Builder {

    /**
     * 币种
     * <p> 示例值：CNY
     */
    private String currency;
    /**
     * 基本工资，当启用 Offer 申请表中的「薪资信息」模块时，「基本工资」字段为必传项
     * <p> 示例值：1000000
     */
    private String basicSalary;
    /**
     * 试用期百分比
     * <p> 示例值：0.8
     */
    private String probationSalaryPercentage;
    /**
     * 年终奖月数
     * <p> 示例值：3
     */
    private String awardSalaryMultiple;
    /**
     * 期权股数
     * <p> 示例值：30
     */
    private String optionShares;
    /**
     * 季度奖金额
     * <p> 示例值：3000
     */
    private String quarterlyBonus;
    /**
     * 半年奖金额
     * <p> 示例值：10000
     */
    private String halfYearBonus;

    /**
     * 币种
     * <p> 示例值：CNY
     *
     * @param currency
     * @return
     */
    public Builder currency(String currency) {
      this.currency = currency;
      return this;
    }


    /**
     * 基本工资，当启用 Offer 申请表中的「薪资信息」模块时，「基本工资」字段为必传项
     * <p> 示例值：1000000
     *
     * @param basicSalary
     * @return
     */
    public Builder basicSalary(String basicSalary) {
      this.basicSalary = basicSalary;
      return this;
    }


    /**
     * 试用期百分比
     * <p> 示例值：0.8
     *
     * @param probationSalaryPercentage
     * @return
     */
    public Builder probationSalaryPercentage(String probationSalaryPercentage) {
      this.probationSalaryPercentage = probationSalaryPercentage;
      return this;
    }


    /**
     * 年终奖月数
     * <p> 示例值：3
     *
     * @param awardSalaryMultiple
     * @return
     */
    public Builder awardSalaryMultiple(String awardSalaryMultiple) {
      this.awardSalaryMultiple = awardSalaryMultiple;
      return this;
    }


    /**
     * 期权股数
     * <p> 示例值：30
     *
     * @param optionShares
     * @return
     */
    public Builder optionShares(String optionShares) {
      this.optionShares = optionShares;
      return this;
    }


    /**
     * 季度奖金额
     * <p> 示例值：3000
     *
     * @param quarterlyBonus
     * @return
     */
    public Builder quarterlyBonus(String quarterlyBonus) {
      this.quarterlyBonus = quarterlyBonus;
      return this;
    }


    /**
     * 半年奖金额
     * <p> 示例值：10000
     *
     * @param halfYearBonus
     * @return
     */
    public Builder halfYearBonus(String halfYearBonus) {
      this.halfYearBonus = halfYearBonus;
      return this;
    }


    public OfferSalaryInfo build() {
      return new OfferSalaryInfo(this);
    }
  }
}