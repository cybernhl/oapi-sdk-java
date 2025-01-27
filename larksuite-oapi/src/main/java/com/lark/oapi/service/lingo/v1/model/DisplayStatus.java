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

public class DisplayStatus {
    /**
     * 是否允许在 IM 和 Doc 等场景进行高亮提示
     * <p> 示例值：true
     */
    @SerializedName("allow_highlight")
    private Boolean allowHighlight;
    /**
     * 是否允许在飞书中被搜索到
     * <p> 示例值：true
     */
    @SerializedName("allow_search")
    private Boolean allowSearch;

    // builder 开始
    public DisplayStatus() {
    }

    public DisplayStatus(Builder builder) {
        /**
         * 是否允许在 IM 和 Doc 等场景进行高亮提示
         * <p> 示例值：true
         */
        this.allowHighlight = builder.allowHighlight;
        /**
         * 是否允许在飞书中被搜索到
         * <p> 示例值：true
         */
        this.allowSearch = builder.allowSearch;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getAllowHighlight() {
        return this.allowHighlight;
    }

    public void setAllowHighlight(Boolean allowHighlight) {
        this.allowHighlight = allowHighlight;
    }

    public Boolean getAllowSearch() {
        return this.allowSearch;
    }

    public void setAllowSearch(Boolean allowSearch) {
        this.allowSearch = allowSearch;
    }

    public static class Builder {
        /**
         * 是否允许在 IM 和 Doc 等场景进行高亮提示
         * <p> 示例值：true
         */
        private Boolean allowHighlight;
        /**
         * 是否允许在飞书中被搜索到
         * <p> 示例值：true
         */
        private Boolean allowSearch;

        /**
         * 是否允许在 IM 和 Doc 等场景进行高亮提示
         * <p> 示例值：true
         *
         * @param allowHighlight
         * @return
         */
        public Builder allowHighlight(Boolean allowHighlight) {
            this.allowHighlight = allowHighlight;
            return this;
        }


        /**
         * 是否允许在飞书中被搜索到
         * <p> 示例值：true
         *
         * @param allowSearch
         * @return
         */
        public Builder allowSearch(Boolean allowSearch) {
            this.allowSearch = allowSearch;
            return this;
        }


        public DisplayStatus build() {
            return new DisplayStatus(this);
        }
    }
}
