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

package com.lark.oapi.service.tenant.v2.model;

import com.google.gson.annotations.SerializedName;

public class ProductI18nName {
    /**
     * 商业化产品的中文名
     * <p> 示例值：zh_cn_name
     */
    @SerializedName("zh_cn")
    private String zhCn;
    /**
     * 商业化产品的日文名
     * <p> 示例值：ja_jp_name
     */
    @SerializedName("ja_jp")
    private String jaJp;
    /**
     * 商业化产品的英文名
     * <p> 示例值：en_name
     */
    @SerializedName("en_us")
    private String enUs;

    // builder 开始
    public ProductI18nName() {
    }

    public ProductI18nName(Builder builder) {
        /**
         * 商业化产品的中文名
         * <p> 示例值：zh_cn_name
         */
        this.zhCn = builder.zhCn;
        /**
         * 商业化产品的日文名
         * <p> 示例值：ja_jp_name
         */
        this.jaJp = builder.jaJp;
        /**
         * 商业化产品的英文名
         * <p> 示例值：en_name
         */
        this.enUs = builder.enUs;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getZhCn() {
        return this.zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    public String getJaJp() {
        return this.jaJp;
    }

    public void setJaJp(String jaJp) {
        this.jaJp = jaJp;
    }

    public String getEnUs() {
        return this.enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    public static class Builder {
        /**
         * 商业化产品的中文名
         * <p> 示例值：zh_cn_name
         */
        private String zhCn;
        /**
         * 商业化产品的日文名
         * <p> 示例值：ja_jp_name
         */
        private String jaJp;
        /**
         * 商业化产品的英文名
         * <p> 示例值：en_name
         */
        private String enUs;

        /**
         * 商业化产品的中文名
         * <p> 示例值：zh_cn_name
         *
         * @param zhCn
         * @return
         */
        public Builder zhCn(String zhCn) {
            this.zhCn = zhCn;
            return this;
        }


        /**
         * 商业化产品的日文名
         * <p> 示例值：ja_jp_name
         *
         * @param jaJp
         * @return
         */
        public Builder jaJp(String jaJp) {
            this.jaJp = jaJp;
            return this;
        }


        /**
         * 商业化产品的英文名
         * <p> 示例值：en_name
         *
         * @param enUs
         * @return
         */
        public Builder enUs(String enUs) {
            this.enUs = enUs;
            return this;
        }


        public ProductI18nName build() {
            return new ProductI18nName(this);
        }
    }
}