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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class ListAppTableFieldReq {
    /**
     * 视图 ID
     * <p> 示例值：vewOVMEXPF
     */
    @Query
    @SerializedName("view_id")
    private String viewId;
    /**
     * 控制字段描述（多行文本格式）数据的返回格式, true 表示以数组富文本形式返回
     * <p> 示例值：true
     */
    @Query
    @SerializedName("text_field_as_array")
    private Boolean textFieldAsArray;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
     * <p> 示例值：fldwJ4YrtB
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 分页大小
     * <p> 示例值：10
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * bitable app token
     * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
     */
    @Path
    @SerializedName("app_token")
    private String appToken;
    /**
     * table id
     * <p> 示例值：tblsRc9GRRXKqhvW
     */
    @Path
    @SerializedName("table_id")
    private String tableId;

    // builder 开始
    public ListAppTableFieldReq() {
    }

    public ListAppTableFieldReq(Builder builder) {
        /**
         * 视图 ID
         * <p> 示例值：vewOVMEXPF
         */
        this.viewId = builder.viewId;
        /**
         * 控制字段描述（多行文本格式）数据的返回格式, true 表示以数组富文本形式返回
         * <p> 示例值：true
         */
        this.textFieldAsArray = builder.textFieldAsArray;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
         * <p> 示例值：fldwJ4YrtB
         */
        this.pageToken = builder.pageToken;
        /**
         * 分页大小
         * <p> 示例值：10
         */
        this.pageSize = builder.pageSize;
        /**
         * bitable app token
         * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
         */
        this.appToken = builder.appToken;
        /**
         * table id
         * <p> 示例值：tblsRc9GRRXKqhvW
         */
        this.tableId = builder.tableId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getViewId() {
        return this.viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public Boolean getTextFieldAsArray() {
        return this.textFieldAsArray;
    }

    public void setTextFieldAsArray(Boolean textFieldAsArray) {
        this.textFieldAsArray = textFieldAsArray;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getAppToken() {
        return this.appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public static class Builder {
        private String viewId; // 视图 ID
        private Boolean textFieldAsArray; // 控制字段描述（多行文本格式）数据的返回格式, true 表示以数组富文本形式返回
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
        private Integer pageSize; // 分页大小
        private String appToken; // bitable app token
        private String tableId; // table id

        /**
         * 视图 ID
         * <p> 示例值：vewOVMEXPF
         *
         * @param viewId
         * @return
         */
        public Builder viewId(String viewId) {
            this.viewId = viewId;
            return this;
        }

        /**
         * 控制字段描述（多行文本格式）数据的返回格式, true 表示以数组富文本形式返回
         * <p> 示例值：true
         *
         * @param textFieldAsArray
         * @return
         */
        public Builder textFieldAsArray(Boolean textFieldAsArray) {
            this.textFieldAsArray = textFieldAsArray;
            return this;
        }

        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
         * <p> 示例值：fldwJ4YrtB
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

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
         * bitable app token
         * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
         *
         * @param appToken
         * @return
         */
        public Builder appToken(String appToken) {
            this.appToken = appToken;
            return this;
        }


        /**
         * table id
         * <p> 示例值：tblsRc9GRRXKqhvW
         *
         * @param tableId
         * @return
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }

        public ListAppTableFieldReq build() {
            return new ListAppTableFieldReq(this);
        }
    }
}
