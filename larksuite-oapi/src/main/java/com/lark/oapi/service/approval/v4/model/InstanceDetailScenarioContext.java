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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class InstanceDetailScenarioContext {
    /**
     * object context
     * <p> 示例值：
     */
    @SerializedName("object")
    private ObjectContext object;
    /**
     * extra
     * <p> 示例值：
     */
    @SerializedName("extra")
    private MyAiInstanceDetailExtra extra;

    // builder 开始
    public InstanceDetailScenarioContext() {
    }

    public InstanceDetailScenarioContext(Builder builder) {
        /**
         * object context
         * <p> 示例值：
         */
        this.object = builder.object;
        /**
         * extra
         * <p> 示例值：
         */
        this.extra = builder.extra;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ObjectContext getObject() {
        return this.object;
    }

    public void setObject(ObjectContext object) {
        this.object = object;
    }

    public MyAiInstanceDetailExtra getExtra() {
        return this.extra;
    }

    public void setExtra(MyAiInstanceDetailExtra extra) {
        this.extra = extra;
    }

    public static class Builder {
        /**
         * object context
         * <p> 示例值：
         */
        private ObjectContext object;
        /**
         * extra
         * <p> 示例值：
         */
        private MyAiInstanceDetailExtra extra;

        /**
         * object context
         * <p> 示例值：
         *
         * @param object
         * @return
         */
        public Builder object(ObjectContext object) {
            this.object = object;
            return this;
        }


        /**
         * extra
         * <p> 示例值：
         *
         * @param extra
         * @return
         */
        public Builder extra(MyAiInstanceDetailExtra extra) {
            this.extra = extra;
            return this;
        }


        public InstanceDetailScenarioContext build() {
            return new InstanceDetailScenarioContext(this);
        }
    }
}
