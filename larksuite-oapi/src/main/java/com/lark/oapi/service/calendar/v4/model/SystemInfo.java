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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class SystemInfo {
    /**
     * session_id
     * <p> 示例值：56786545678765456785345678
     */
    @SerializedName("session_id")
    private String sessionId;

    // builder 开始
    public SystemInfo() {
    }

    public SystemInfo(Builder builder) {
        /**
         * session_id
         * <p> 示例值：56786545678765456785345678
         */
        this.sessionId = builder.sessionId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public static class Builder {
        /**
         * session_id
         * <p> 示例值：56786545678765456785345678
         */
        private String sessionId;

        /**
         * session_id
         * <p> 示例值：56786545678765456785345678
         *
         * @param sessionId
         * @return
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }


        public SystemInfo build() {
            return new SystemInfo(this);
        }
    }
}
