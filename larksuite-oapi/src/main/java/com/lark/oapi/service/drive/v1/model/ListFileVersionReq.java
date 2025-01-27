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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class ListFileVersionReq {
    /**
     * 分页大小
     * <p> 示例值：10
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：1665739388
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 原文档类型
     * <p> 示例值：doc/docx/sheet/bitable
     */
    @Query
    @SerializedName("obj_type")
    private String objType;
    /**
     * 用户id类型
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 源文档token
     * <p> 示例值：shtbcpM2mm3znrLfWnf4browTYp23
     */
    @Path
    @SerializedName("file_token")
    private String fileToken;

    // builder 开始
    public ListFileVersionReq() {
    }

    public ListFileVersionReq(Builder builder) {
        /**
         * 分页大小
         * <p> 示例值：10
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：1665739388
         */
        this.pageToken = builder.pageToken;
        /**
         * 原文档类型
         * <p> 示例值：doc/docx/sheet/bitable
         */
        this.objType = builder.objType;
        /**
         * 用户id类型
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 源文档token
         * <p> 示例值：shtbcpM2mm3znrLfWnf4browTYp23
         */
        this.fileToken = builder.fileToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public String getObjType() {
        return this.objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public static class Builder {
        private Integer pageSize; // 分页大小
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
        private String objType; // 原文档类型
        private String userIdType; // 用户id类型
        private String fileToken; // 源文档token

        /**
         * 分页大小
         * <p> 示例值：10
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：1665739388
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * 原文档类型
         * <p> 示例值：doc/docx/sheet/bitable
         *
         * @param objType
         * @return
         */
        public Builder objType(String objType) {
            this.objType = objType;
            return this;
        }

        /**
         * 原文档类型
         * <p> 示例值：doc/docx/sheet/bitable
         *
         * @param objType {@link com.lark.oapi.service.drive.v1.enums.ListFileVersionObjTypeEnum}
         * @return
         */
        public Builder objType(com.lark.oapi.service.drive.v1.enums.ListFileVersionObjTypeEnum objType) {
            this.objType = objType.getValue();
            return this;
        }

        /**
         * 用户id类型
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
         * 用户id类型
         * <p> 示例值：open_id
         *
         * @param userIdType {@link com.lark.oapi.service.drive.v1.enums.ListFileVersionUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.drive.v1.enums.ListFileVersionUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 源文档token
         * <p> 示例值：shtbcpM2mm3znrLfWnf4browTYp23
         *
         * @param fileToken
         * @return
         */
        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }

        public ListFileVersionReq build() {
            return new ListFileVersionReq(this);
        }
    }
}
