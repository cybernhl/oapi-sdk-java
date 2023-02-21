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
import com.lark.oapi.core.annotation.Query;

public class GetScopeConfigReq {
    /**
     * 查询节点范围
     * <p> 示例值：1
     */
    @Query
    @SerializedName("scope_type")
    private Integer scopeType;
    /**
     * 查询节点ID：如果scope_type为1，则为层级ID，如果scope_type为2，则为会议室ID
     * <p> 示例值：omm_608d34d82d531b27fa993902d350a307
     */
    @Query
    @SerializedName("scope_id")
    private String scopeId;
    /**
     * 此次调用中使用的用户ID的类型，默认使用open_id可不填
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;

    // builder 开始
    public GetScopeConfigReq() {
    }

    public GetScopeConfigReq(Builder builder) {
        /**
         * 查询节点范围
         * <p> 示例值：1
         */
        this.scopeType = builder.scopeType;
        /**
         * 查询节点ID：如果scope_type为1，则为层级ID，如果scope_type为2，则为会议室ID
         * <p> 示例值：omm_608d34d82d531b27fa993902d350a307
         */
        this.scopeId = builder.scopeId;
        /**
         * 此次调用中使用的用户ID的类型，默认使用open_id可不填
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getScopeType() {
        return this.scopeType;
    }

    public void setScopeType(Integer scopeType) {
        this.scopeType = scopeType;
    }

    public String getScopeId() {
        return this.scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public static class Builder {
        private Integer scopeType; // 查询节点范围
        private String scopeId; // 查询节点ID：如果scope_type为1，则为层级ID，如果scope_type为2，则为会议室ID
        private String userIdType; // 此次调用中使用的用户ID的类型，默认使用open_id可不填


        /**
         * 查询节点范围
         * <p> 示例值：1
         *
         * @param scopeType
         * @return
         */
        public Builder scopeType(Integer scopeType) {
            this.scopeType = scopeType;
            return this;
        }

        /**
         * 查询节点范围
         * <p> 示例值：1
         *
         * @param scopeType {@link com.lark.oapi.service.vc.v1.enums.GetScopeConfigScopeTypeEnum}
         * @return
         */
        public Builder scopeType(com.lark.oapi.service.vc.v1.enums.GetScopeConfigScopeTypeEnum scopeType) {
            this.scopeType = scopeType.getValue();
            return this;
        }


        /**
         * 查询节点ID：如果scope_type为1，则为层级ID，如果scope_type为2，则为会议室ID
         * <p> 示例值：omm_608d34d82d531b27fa993902d350a307
         *
         * @param scopeId
         * @return
         */
        public Builder scopeId(String scopeId) {
            this.scopeId = scopeId;
            return this;
        }


        /**
         * 此次调用中使用的用户ID的类型，默认使用open_id可不填
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型，默认使用open_id可不填
         * <p> 示例值：
         *
         * @param userIdType {@link com.lark.oapi.service.vc.v1.enums.GetScopeConfigUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.vc.v1.enums.GetScopeConfigUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        public GetScopeConfigReq build() {
            return new GetScopeConfigReq(this);
        }
    }
}