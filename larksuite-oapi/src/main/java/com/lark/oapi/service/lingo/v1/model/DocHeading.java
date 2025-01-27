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

package com.lark.oapi.service.lingo.v1.model;

import com.google.gson.annotations.SerializedName;

public class DocHeading {
    /**
     * 标题文本内容
     * <p> 示例值：这是一段标题内容
     */
    @SerializedName("text")
    private String text;
    /**
     * 标题等级
     * <p> 示例值：1
     */
    @SerializedName("heading_level")
    private Integer headingLevel;

    // builder 开始
    public DocHeading() {
    }

    public DocHeading(Builder builder) {
        /**
         * 标题文本内容
         * <p> 示例值：这是一段标题内容
         */
        this.text = builder.text;
        /**
         * 标题等级
         * <p> 示例值：1
         */
        this.headingLevel = builder.headingLevel;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getHeadingLevel() {
        return this.headingLevel;
    }

    public void setHeadingLevel(Integer headingLevel) {
        this.headingLevel = headingLevel;
    }

    public static class Builder {
        /**
         * 标题文本内容
         * <p> 示例值：这是一段标题内容
         */
        private String text;
        /**
         * 标题等级
         * <p> 示例值：1
         */
        private Integer headingLevel;

        /**
         * 标题文本内容
         * <p> 示例值：这是一段标题内容
         *
         * @param text
         * @return
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }


        /**
         * 标题等级
         * <p> 示例值：1
         *
         * @param headingLevel
         * @return
         */
        public Builder headingLevel(Integer headingLevel) {
            this.headingLevel = headingLevel;
            return this;
        }


        public DocHeading build() {
            return new DocHeading(this);
        }
    }
}
