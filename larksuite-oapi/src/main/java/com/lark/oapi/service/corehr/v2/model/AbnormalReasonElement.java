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

public class AbnormalReasonElement {
    /**
     * 组件类型
     * <p> 示例值：a,text
     */
    @SerializedName("tag")
    private String tag;
    /**
     * 文本
     * <p> 示例值：这个是一个文本字段
     */
    @SerializedName("text")
    private String text;
    /**
     * 超链接
     * <p> 示例值：https://open.feishu.cn/
     */
    @SerializedName("href")
    private String href;

    // builder 开始
    public AbnormalReasonElement() {
    }

    public AbnormalReasonElement(Builder builder) {
        /**
         * 组件类型
         * <p> 示例值：a,text
         */
        this.tag = builder.tag;
        /**
         * 文本
         * <p> 示例值：这个是一个文本字段
         */
        this.text = builder.text;
        /**
         * 超链接
         * <p> 示例值：https://open.feishu.cn/
         */
        this.href = builder.href;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public static class Builder {
        /**
         * 组件类型
         * <p> 示例值：a,text
         */
        private String tag;
        /**
         * 文本
         * <p> 示例值：这个是一个文本字段
         */
        private String text;
        /**
         * 超链接
         * <p> 示例值：https://open.feishu.cn/
         */
        private String href;

        /**
         * 组件类型
         * <p> 示例值：a,text
         *
         * @param tag
         * @return
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }


        /**
         * 文本
         * <p> 示例值：这个是一个文本字段
         *
         * @param text
         * @return
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }


        /**
         * 超链接
         * <p> 示例值：https://open.feishu.cn/
         *
         * @param href
         * @return
         */
        public Builder href(String href) {
            this.href = href;
            return this;
        }


        public AbnormalReasonElement build() {
            return new AbnormalReasonElement(this);
        }
    }
}
