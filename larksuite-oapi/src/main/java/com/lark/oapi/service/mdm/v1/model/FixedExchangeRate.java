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

package com.lark.oapi.service.mdm.v1.model;

import com.google.gson.annotations.SerializedName;

public class FixedExchangeRate {
    /**
     * 原始币种代码
     * <p> 示例值：USD
     */
    @SerializedName("source_currency")
    private String sourceCurrency;
    /**
     * 目标币种代码
     * <p> 示例值：CNY
     */
    @SerializedName("target_currency")
    private String targetCurrency;
    /**
     * 换算日期
     * <p> 示例值：2022-02-13
     */
    @SerializedName("effective_date")
    private String effectiveDate;
    /**
     * 汇率值，保留10位小数
     * <p> 示例值：0.1720000000
     */
    @SerializedName("exchange_rate")
    private String exchangeRate;
    /**
     * 状态，枚举值：1_生效，0_失效
     * <p> 示例值：1
     */
    @SerializedName("status")
    private Integer status;

    // builder 开始
    public FixedExchangeRate() {
    }

    public FixedExchangeRate(Builder builder) {
        /**
         * 原始币种代码
         * <p> 示例值：USD
         */
        this.sourceCurrency = builder.sourceCurrency;
        /**
         * 目标币种代码
         * <p> 示例值：CNY
         */
        this.targetCurrency = builder.targetCurrency;
        /**
         * 换算日期
         * <p> 示例值：2022-02-13
         */
        this.effectiveDate = builder.effectiveDate;
        /**
         * 汇率值，保留10位小数
         * <p> 示例值：0.1720000000
         */
        this.exchangeRate = builder.exchangeRate;
        /**
         * 状态，枚举值：1_生效，0_失效
         * <p> 示例值：1
         */
        this.status = builder.status;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSourceCurrency() {
        return this.sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getTargetCurrency() {
        return this.targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public static class Builder {
        /**
         * 原始币种代码
         * <p> 示例值：USD
         */
        private String sourceCurrency;
        /**
         * 目标币种代码
         * <p> 示例值：CNY
         */
        private String targetCurrency;
        /**
         * 换算日期
         * <p> 示例值：2022-02-13
         */
        private String effectiveDate;
        /**
         * 汇率值，保留10位小数
         * <p> 示例值：0.1720000000
         */
        private String exchangeRate;
        /**
         * 状态，枚举值：1_生效，0_失效
         * <p> 示例值：1
         */
        private Integer status;

        /**
         * 原始币种代码
         * <p> 示例值：USD
         *
         * @param sourceCurrency
         * @return
         */
        public Builder sourceCurrency(String sourceCurrency) {
            this.sourceCurrency = sourceCurrency;
            return this;
        }


        /**
         * 目标币种代码
         * <p> 示例值：CNY
         *
         * @param targetCurrency
         * @return
         */
        public Builder targetCurrency(String targetCurrency) {
            this.targetCurrency = targetCurrency;
            return this;
        }


        /**
         * 换算日期
         * <p> 示例值：2022-02-13
         *
         * @param effectiveDate
         * @return
         */
        public Builder effectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }


        /**
         * 汇率值，保留10位小数
         * <p> 示例值：0.1720000000
         *
         * @param exchangeRate
         * @return
         */
        public Builder exchangeRate(String exchangeRate) {
            this.exchangeRate = exchangeRate;
            return this;
        }


        /**
         * 状态，枚举值：1_生效，0_失效
         * <p> 示例值：1
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }


        public FixedExchangeRate build() {
            return new FixedExchangeRate(this);
        }
    }
}