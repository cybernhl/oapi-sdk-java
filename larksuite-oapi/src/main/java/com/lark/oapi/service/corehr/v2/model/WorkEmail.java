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

package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;

public class WorkEmail {
    /**
     * 邮箱地址
     * <p> 示例值：1234567@bytedance.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 邮箱用途，枚举值可通过文档【飞书人事枚举常量】邮箱用途（email_usage）枚举定义获得
     * <p> 示例值：
     */
    @SerializedName("email_usage")
    private Enum emailUsage;

    // builder 开始
    public WorkEmail() {
    }

    public WorkEmail(Builder builder) {
        /**
         * 邮箱地址
         * <p> 示例值：1234567@bytedance.com
         */
        this.email = builder.email;
        /**
         * 邮箱用途，枚举值可通过文档【飞书人事枚举常量】邮箱用途（email_usage）枚举定义获得
         * <p> 示例值：
         */
        this.emailUsage = builder.emailUsage;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enum getEmailUsage() {
        return this.emailUsage;
    }

    public void setEmailUsage(Enum emailUsage) {
        this.emailUsage = emailUsage;
    }

    public static class Builder {
        /**
         * 邮箱地址
         * <p> 示例值：1234567@bytedance.com
         */
        private String email;
        /**
         * 邮箱用途，枚举值可通过文档【飞书人事枚举常量】邮箱用途（email_usage）枚举定义获得
         * <p> 示例值：
         */
        private Enum emailUsage;

        /**
         * 邮箱地址
         * <p> 示例值：1234567@bytedance.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 邮箱用途，枚举值可通过文档【飞书人事枚举常量】邮箱用途（email_usage）枚举定义获得
         * <p> 示例值：
         *
         * @param emailUsage
         * @return
         */
        public Builder emailUsage(Enum emailUsage) {
            this.emailUsage = emailUsage;
            return this;
        }


        public WorkEmail build() {
            return new WorkEmail(this);
        }
    }
}
