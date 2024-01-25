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

package com.lark.oapi.service.task.v2.model;

import com.google.gson.annotations.SerializedName;

public class Resource {
    /**
     * 资源类型
     * <p> 示例值：task
     */
    @SerializedName("type")
    private String type;
    /**
     * 资源ID
     * <p> 示例值：e6e37dcc-f75a-5936-f589-12fb4b5c80c2
     */
    @SerializedName("id")
    private String id;

    // builder 开始
    public Resource() {
    }

    public Resource(Builder builder) {
        /**
         * 资源类型
         * <p> 示例值：task
         */
        this.type = builder.type;
        /**
         * 资源ID
         * <p> 示例值：e6e37dcc-f75a-5936-f589-12fb4b5c80c2
         */
        this.id = builder.id;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static class Builder {
        /**
         * 资源类型
         * <p> 示例值：task
         */
        private String type;
        /**
         * 资源ID
         * <p> 示例值：e6e37dcc-f75a-5936-f589-12fb4b5c80c2
         */
        private String id;

        /**
         * 资源类型
         * <p> 示例值：task
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * 资源ID
         * <p> 示例值：e6e37dcc-f75a-5936-f589-12fb4b5c80c2
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        public Resource build() {
            return new Resource(this);
        }
    }
}