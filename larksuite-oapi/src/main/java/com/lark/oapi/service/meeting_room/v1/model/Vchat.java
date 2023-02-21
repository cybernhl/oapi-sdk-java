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

package com.lark.oapi.service.meeting_room.v1.model;

import com.google.gson.annotations.SerializedName;

public class Vchat {
    /**
     * 视频会议链接
     * <p> 示例值：https://vc.feishu.cn/j/935314044
     */
    @SerializedName("meeting_url")
    private String meetingUrl;
    /**
     * 视频会议类型
     * <p> 示例值：vc
     */
    @SerializedName("vc_type")
    private String vcType;

    // builder 开始
    public Vchat() {
    }

    public Vchat(Builder builder) {
        /**
         * 视频会议链接
         * <p> 示例值：https://vc.feishu.cn/j/935314044
         */
        this.meetingUrl = builder.meetingUrl;
        /**
         * 视频会议类型
         * <p> 示例值：vc
         */
        this.vcType = builder.vcType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMeetingUrl() {
        return this.meetingUrl;
    }

    public void setMeetingUrl(String meetingUrl) {
        this.meetingUrl = meetingUrl;
    }

    public String getVcType() {
        return this.vcType;
    }

    public void setVcType(String vcType) {
        this.vcType = vcType;
    }

    public static class Builder {
        /**
         * 视频会议链接
         * <p> 示例值：https://vc.feishu.cn/j/935314044
         */
        private String meetingUrl;
        /**
         * 视频会议类型
         * <p> 示例值：vc
         */
        private String vcType;

        /**
         * 视频会议链接
         * <p> 示例值：https://vc.feishu.cn/j/935314044
         *
         * @param meetingUrl
         * @return
         */
        public Builder meetingUrl(String meetingUrl) {
            this.meetingUrl = meetingUrl;
            return this;
        }


        /**
         * 视频会议类型
         * <p> 示例值：vc
         *
         * @param vcType
         * @return
         */
        public Builder vcType(String vcType) {
            this.vcType = vcType;
            return this;
        }

        /**
         * 视频会议类型
         * <p> 示例值：vc
         *
         * @param vcType {@link com.lark.oapi.service.meeting_room.v1.enums.VchatVcTypeEnum}
         * @return
         */
        public Builder vcType(com.lark.oapi.service.meeting_room.v1.enums.VchatVcTypeEnum vcType) {
            this.vcType = vcType.getValue();
            return this;
        }


        public Vchat build() {
            return new Vchat(this);
        }
    }
}