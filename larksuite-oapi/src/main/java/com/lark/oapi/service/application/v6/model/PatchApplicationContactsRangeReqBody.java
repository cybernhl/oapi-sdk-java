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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class PatchApplicationContactsRangeReqBody {
    /**
     * 更新范围方式
     * <p> 示例值：some
     */
    @SerializedName("contacts_range_type")
    private String contactsRangeType;
    /**
     * 可见范围新增列表
     * <p> 示例值：
     */
    @SerializedName("add_visible_list")
    private AppContactsRangeIdList addVisibleList;
    /**
     * 删除可用名单
     * <p> 示例值：
     */
    @SerializedName("del_visible_list")
    private AppContactsRangeIdList delVisibleList;

    // builder 开始
    public PatchApplicationContactsRangeReqBody() {
    }

    public PatchApplicationContactsRangeReqBody(Builder builder) {
        /**
         * 更新范围方式
         * <p> 示例值：some
         */
        this.contactsRangeType = builder.contactsRangeType;
        /**
         * 可见范围新增列表
         * <p> 示例值：
         */
        this.addVisibleList = builder.addVisibleList;
        /**
         * 删除可用名单
         * <p> 示例值：
         */
        this.delVisibleList = builder.delVisibleList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getContactsRangeType() {
        return this.contactsRangeType;
    }

    public void setContactsRangeType(String contactsRangeType) {
        this.contactsRangeType = contactsRangeType;
    }

    public AppContactsRangeIdList getAddVisibleList() {
        return this.addVisibleList;
    }

    public void setAddVisibleList(AppContactsRangeIdList addVisibleList) {
        this.addVisibleList = addVisibleList;
    }

    public AppContactsRangeIdList getDelVisibleList() {
        return this.delVisibleList;
    }

    public void setDelVisibleList(AppContactsRangeIdList delVisibleList) {
        this.delVisibleList = delVisibleList;
    }

    public static class Builder {
        /**
         * 更新范围方式
         * <p> 示例值：some
         */
        private String contactsRangeType;
        /**
         * 可见范围新增列表
         * <p> 示例值：
         */
        private AppContactsRangeIdList addVisibleList;
        /**
         * 删除可用名单
         * <p> 示例值：
         */
        private AppContactsRangeIdList delVisibleList;

        /**
         * 更新范围方式
         * <p> 示例值：some
         *
         * @param contactsRangeType
         * @return
         */
        public Builder contactsRangeType(String contactsRangeType) {
            this.contactsRangeType = contactsRangeType;
            return this;
        }

        /**
         * 更新范围方式
         * <p> 示例值：some
         *
         * @param contactsRangeType {@link com.lark.oapi.service.application.v6.enums.PatchApplicationContactsRangeContactsRangeTypeEnum}
         * @return
         */
        public Builder contactsRangeType(com.lark.oapi.service.application.v6.enums.PatchApplicationContactsRangeContactsRangeTypeEnum contactsRangeType) {
            this.contactsRangeType = contactsRangeType.getValue();
            return this;
        }


        /**
         * 可见范围新增列表
         * <p> 示例值：
         *
         * @param addVisibleList
         * @return
         */
        public Builder addVisibleList(AppContactsRangeIdList addVisibleList) {
            this.addVisibleList = addVisibleList;
            return this;
        }


        /**
         * 删除可用名单
         * <p> 示例值：
         *
         * @param delVisibleList
         * @return
         */
        public Builder delVisibleList(AppContactsRangeIdList delVisibleList) {
            this.delVisibleList = delVisibleList;
            return this;
        }


        public PatchApplicationContactsRangeReqBody build() {
            return new PatchApplicationContactsRangeReqBody(this);
        }
    }
}