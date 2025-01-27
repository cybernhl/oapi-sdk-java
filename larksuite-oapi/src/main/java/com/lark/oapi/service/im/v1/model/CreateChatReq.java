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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Query;

public class CreateChatReq {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 如果在请求体的 ==owner_id== 字段指定了某个用户为群主，可以选择是否同时设置创建此群的机器人为管理员，此标志位用于标记是否设置创建群的机器人为管理员
     * <p> 示例值：false
     */
    @Query
    @SerializedName("set_bot_manager")
    private Boolean setBotManager;
    /**
     * 由开发者生成的唯一字符串序列，用于创建群组请求去重；持有相同uuid的请求10小时内只可成功创建1个群聊
     * <p> 示例值：b13g2t38-1jd2-458b-8djf-dtbca5104204
     */
    @Query
    @SerializedName("uuid")
    private String uuid;
    @Body
    private CreateChatReqBody body;

    // builder 开始
    public CreateChatReq() {
    }

    public CreateChatReq(Builder builder) {
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 如果在请求体的 ==owner_id== 字段指定了某个用户为群主，可以选择是否同时设置创建此群的机器人为管理员，此标志位用于标记是否设置创建群的机器人为管理员
         * <p> 示例值：false
         */
        this.setBotManager = builder.setBotManager;
        /**
         * 由开发者生成的唯一字符串序列，用于创建群组请求去重；持有相同uuid的请求10小时内只可成功创建1个群聊
         * <p> 示例值：b13g2t38-1jd2-458b-8djf-dtbca5104204
         */
        this.uuid = builder.uuid;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public Boolean getSetBotManager() {
        return this.setBotManager;
    }

    public void setSetBotManager(Boolean setBotManager) {
        this.setBotManager = setBotManager;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public CreateChatReqBody getCreateChatReqBody() {
        return this.body;
    }

    public void setCreateChatReqBody(CreateChatReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType; // 此次调用中使用的用户ID的类型
        private Boolean setBotManager; // 如果在请求体的 ==owner_id== 字段指定了某个用户为群主，可以选择是否同时设置创建此群的机器人为管理员，此标志位用于标记是否设置创建群的机器人为管理员
        private String uuid; // 由开发者生成的唯一字符串序列，用于创建群组请求去重；持有相同uuid的请求10小时内只可成功创建1个群聊
        private CreateChatReqBody body;

        /**
         * 此次调用中使用的用户ID的类型
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
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：open_id
         *
         * @param userIdType {@link com.lark.oapi.service.im.v1.enums.CreateChatUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.im.v1.enums.CreateChatUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 如果在请求体的 ==owner_id== 字段指定了某个用户为群主，可以选择是否同时设置创建此群的机器人为管理员，此标志位用于标记是否设置创建群的机器人为管理员
         * <p> 示例值：false
         *
         * @param setBotManager
         * @return
         */
        public Builder setBotManager(Boolean setBotManager) {
            this.setBotManager = setBotManager;
            return this;
        }

        /**
         * 由开发者生成的唯一字符串序列，用于创建群组请求去重；持有相同uuid的请求10小时内只可成功创建1个群聊
         * <p> 示例值：b13g2t38-1jd2-458b-8djf-dtbca5104204
         *
         * @param uuid
         * @return
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public CreateChatReqBody getCreateChatReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder createChatReqBody(CreateChatReqBody body) {
            this.body = body;
            return this;
        }

        public CreateChatReq build() {
            return new CreateChatReq(this);
        }
    }
}
