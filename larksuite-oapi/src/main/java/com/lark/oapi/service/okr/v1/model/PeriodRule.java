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

package com.lark.oapi.service.okr.v1.model;

import com.google.gson.annotations.SerializedName;

public class PeriodRule {
    /**
     * 周期规则ID
     * <p> 示例值：134
     */
    @SerializedName("period_rule_id")
    private String periodRuleId;
    /**
     * 周期类型;- year: 年度周期;- month: 月度周期
     * <p> 示例值：year
     */
    @SerializedName("type")
    private String type;
    /**
     * 周期长度（月)
     * <p> 示例值：12
     */
    @SerializedName("length")
    private Integer length;
    /**
     * 每年首个开始月份
     * <p> 示例值：12
     */
    @SerializedName("first_month")
    private Integer firstMonth;

    // builder 开始
    public PeriodRule() {
    }

    public PeriodRule(Builder builder) {
        /**
         * 周期规则ID
         * <p> 示例值：134
         */
        this.periodRuleId = builder.periodRuleId;
        /**
         * 周期类型;- year: 年度周期;- month: 月度周期
         * <p> 示例值：year
         */
        this.type = builder.type;
        /**
         * 周期长度（月)
         * <p> 示例值：12
         */
        this.length = builder.length;
        /**
         * 每年首个开始月份
         * <p> 示例值：12
         */
        this.firstMonth = builder.firstMonth;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPeriodRuleId() {
        return this.periodRuleId;
    }

    public void setPeriodRuleId(String periodRuleId) {
        this.periodRuleId = periodRuleId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLength() {
        return this.length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getFirstMonth() {
        return this.firstMonth;
    }

    public void setFirstMonth(Integer firstMonth) {
        this.firstMonth = firstMonth;
    }

    public static class Builder {
        /**
         * 周期规则ID
         * <p> 示例值：134
         */
        private String periodRuleId;
        /**
         * 周期类型;- year: 年度周期;- month: 月度周期
         * <p> 示例值：year
         */
        private String type;
        /**
         * 周期长度（月)
         * <p> 示例值：12
         */
        private Integer length;
        /**
         * 每年首个开始月份
         * <p> 示例值：12
         */
        private Integer firstMonth;

        /**
         * 周期规则ID
         * <p> 示例值：134
         *
         * @param periodRuleId
         * @return
         */
        public Builder periodRuleId(String periodRuleId) {
            this.periodRuleId = periodRuleId;
            return this;
        }


        /**
         * 周期类型;- year: 年度周期;- month: 月度周期
         * <p> 示例值：year
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * 周期长度（月)
         * <p> 示例值：12
         *
         * @param length
         * @return
         */
        public Builder length(Integer length) {
            this.length = length;
            return this;
        }


        /**
         * 每年首个开始月份
         * <p> 示例值：12
         *
         * @param firstMonth
         * @return
         */
        public Builder firstMonth(Integer firstMonth) {
            this.firstMonth = firstMonth;
            return this;
        }


        public PeriodRule build() {
            return new PeriodRule(this);
        }
    }
}