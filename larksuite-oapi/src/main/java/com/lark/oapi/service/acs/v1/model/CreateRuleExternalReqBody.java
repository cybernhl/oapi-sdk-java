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

package com.lark.oapi.service.acs.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateRuleExternalReqBody {
    /**
     * 权限组信息
     * <p> 示例值：
     */
    @SerializedName("rule")
    private Rule rule;

    // builder 开始
    public CreateRuleExternalReqBody() {
    }

    public CreateRuleExternalReqBody(Builder builder) {
        /**
         * 权限组信息
         * <p> 示例值：
         */
        this.rule = builder.rule;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Rule getRule() {
        return this.rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public static class Builder {
        /**
         * 权限组信息
         * <p> 示例值：
         */
        private Rule rule;

        /**
         * 权限组信息
         * <p> 示例值：
         *
         * @param rule
         * @return
         */
        public Builder rule(Rule rule) {
            this.rule = rule;
            return this;
        }


        public CreateRuleExternalReqBody build() {
            return new CreateRuleExternalReqBody(this);
        }
    }
}