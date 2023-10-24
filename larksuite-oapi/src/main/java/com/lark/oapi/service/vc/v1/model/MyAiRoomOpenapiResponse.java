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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class MyAiRoomOpenapiResponse {
    /**
     * openapi 返回的意图类型，不同 tool 的不同值都不一样
     * <p> 示例值：0
     */
    @SerializedName("response_type")
    private Integer responseType;
    /**
     * 日程 id
     * <p> 示例值：111111111
     */
    @SerializedName("schedule_event_id")
    private String scheduleEventId;

    // builder 开始
    public MyAiRoomOpenapiResponse() {
    }

    public MyAiRoomOpenapiResponse(Builder builder) {
        /**
         * openapi 返回的意图类型，不同 tool 的不同值都不一样
         * <p> 示例值：0
         */
        this.responseType = builder.responseType;
        /**
         * 日程 id
         * <p> 示例值：111111111
         */
        this.scheduleEventId = builder.scheduleEventId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getResponseType() {
        return this.responseType;
    }

    public void setResponseType(Integer responseType) {
        this.responseType = responseType;
    }

    public String getScheduleEventId() {
        return this.scheduleEventId;
    }

    public void setScheduleEventId(String scheduleEventId) {
        this.scheduleEventId = scheduleEventId;
    }

    public static class Builder {
        /**
         * openapi 返回的意图类型，不同 tool 的不同值都不一样
         * <p> 示例值：0
         */
        private Integer responseType;
        /**
         * 日程 id
         * <p> 示例值：111111111
         */
        private String scheduleEventId;

        /**
         * openapi 返回的意图类型，不同 tool 的不同值都不一样
         * <p> 示例值：0
         *
         * @param responseType
         * @return
         */
        public Builder responseType(Integer responseType) {
            this.responseType = responseType;
            return this;
        }


        /**
         * 日程 id
         * <p> 示例值：111111111
         *
         * @param scheduleEventId
         * @return
         */
        public Builder scheduleEventId(String scheduleEventId) {
            this.scheduleEventId = scheduleEventId;
            return this;
        }


        public MyAiRoomOpenapiResponse build() {
            return new MyAiRoomOpenapiResponse(this);
        }
    }
}