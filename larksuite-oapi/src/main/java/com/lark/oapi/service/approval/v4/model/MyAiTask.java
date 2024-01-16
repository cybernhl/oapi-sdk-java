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

public class MyAiTask {
    /**
     * 用户姓名
     * <p> 示例值：张三
     */
    @SerializedName("user_name")
    private String userName;
    /**
     * 操作类型
     * <p> 示例值：同意
     */
    @SerializedName("type")
    private String type;
    /**
     * 节点名称
     * <p> 示例值：财务审批
     */
    @SerializedName("node_name")
    private String nodeName;

    // builder 开始
    public MyAiTask() {
    }

    public MyAiTask(Builder builder) {
        /**
         * 用户姓名
         * <p> 示例值：张三
         */
        this.userName = builder.userName;
        /**
         * 操作类型
         * <p> 示例值：同意
         */
        this.type = builder.type;
        /**
         * 节点名称
         * <p> 示例值：财务审批
         */
        this.nodeName = builder.nodeName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNodeName() {
        return this.nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public static class Builder {
        /**
         * 用户姓名
         * <p> 示例值：张三
         */
        private String userName;
        /**
         * 操作类型
         * <p> 示例值：同意
         */
        private String type;
        /**
         * 节点名称
         * <p> 示例值：财务审批
         */
        private String nodeName;

        /**
         * 用户姓名
         * <p> 示例值：张三
         *
         * @param userName
         * @return
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }


        /**
         * 操作类型
         * <p> 示例值：同意
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * 节点名称
         * <p> 示例值：财务审批
         *
         * @param nodeName
         * @return
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }


        public MyAiTask build() {
            return new MyAiTask(this);
        }
    }
}
