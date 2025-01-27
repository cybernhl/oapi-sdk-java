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

public class DeviceBindRuleExternalReqBody {
    /**
     * 设备id
     * <p> 示例值：6939433228970082593
     */
    @SerializedName("device_id")
    private String deviceId;
    /**
     * 权限组id列表
     * <p> 示例值：
     */
    @SerializedName("rule_ids")
    private String[] ruleIds;

    // builder 开始
    public DeviceBindRuleExternalReqBody() {
    }

    public DeviceBindRuleExternalReqBody(Builder builder) {
        /**
         * 设备id
         * <p> 示例值：6939433228970082593
         */
        this.deviceId = builder.deviceId;
        /**
         * 权限组id列表
         * <p> 示例值：
         */
        this.ruleIds = builder.ruleIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String[] getRuleIds() {
        return this.ruleIds;
    }

    public void setRuleIds(String[] ruleIds) {
        this.ruleIds = ruleIds;
    }

    public static class Builder {
        /**
         * 设备id
         * <p> 示例值：6939433228970082593
         */
        private String deviceId;
        /**
         * 权限组id列表
         * <p> 示例值：
         */
        private String[] ruleIds;

        /**
         * 设备id
         * <p> 示例值：6939433228970082593
         *
         * @param deviceId
         * @return
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }


        /**
         * 权限组id列表
         * <p> 示例值：
         *
         * @param ruleIds
         * @return
         */
        public Builder ruleIds(String[] ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }


        public DeviceBindRuleExternalReqBody build() {
            return new DeviceBindRuleExternalReqBody(this);
        }
    }
}
