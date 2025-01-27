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
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class ListTasklistActivitySubscriptionReq {
    /**
     * 返回结果的最大数量
     * <p> 示例值：50
     */
    @Query
    @SerializedName("limit")
    private Integer limit;
    /**
     * 用户ID类型
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 清单GUID
     * <p> 示例值：d19e3a2a-edc0-4e4e-b7cc-950e162b53ae
     */
    @Path
    @SerializedName("tasklist_guid")
    private String tasklistGuid;

    // builder 开始
    public ListTasklistActivitySubscriptionReq() {
    }

    public ListTasklistActivitySubscriptionReq(Builder builder) {
        /**
         * 返回结果的最大数量
         * <p> 示例值：50
         */
        this.limit = builder.limit;
        /**
         * 用户ID类型
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 清单GUID
         * <p> 示例值：d19e3a2a-edc0-4e4e-b7cc-950e162b53ae
         */
        this.tasklistGuid = builder.tasklistGuid;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getTasklistGuid() {
        return this.tasklistGuid;
    }

    public void setTasklistGuid(String tasklistGuid) {
        this.tasklistGuid = tasklistGuid;
    }

    public static class Builder {
        private Integer limit; // 返回结果的最大数量
        private String userIdType; // 用户ID类型
        private String tasklistGuid; // 清单GUID

        /**
         * 返回结果的最大数量
         * <p> 示例值：50
         *
         * @param limit
         * @return
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * 用户ID类型
         * <p> 示例值：open_id
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 用户ID类型
         * <p> 示例值：open_id
         *
         * @param userIdType {@link com.lark.oapi.service.task.v2.enums.ListTasklistActivitySubscriptionUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.task.v2.enums.ListTasklistActivitySubscriptionUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 清单GUID
         * <p> 示例值：d19e3a2a-edc0-4e4e-b7cc-950e162b53ae
         *
         * @param tasklistGuid
         * @return
         */
        public Builder tasklistGuid(String tasklistGuid) {
            this.tasklistGuid = tasklistGuid;
            return this;
        }

        public ListTasklistActivitySubscriptionReq build() {
            return new ListTasklistActivitySubscriptionReq(this);
        }
    }
}
