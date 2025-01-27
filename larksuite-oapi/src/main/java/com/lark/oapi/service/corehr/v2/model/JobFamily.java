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

package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;

public class JobFamily {
    /**
     * 序列 ID
     * <p> 示例值：4698019107896524633
     */
    @SerializedName("job_family_id")
    private String jobFamilyId;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n[] name;
    /**
     * 启用
     * <p> 示例值：true
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 上级序列
     * <p> 示例值：4698020757495316313
     */
    @SerializedName("parent_id")
    private String parentId;
    /**
     * 生效时间
     * <p> 示例值：2020-05-01 00:00:00
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 失效时间
     * <p> 示例值：2020-05-02 00:00:00
     */
    @SerializedName("expiration_time")
    private String expirationTime;
    /**
     * 编码
     * <p> 示例值：123456
     */
    @SerializedName("code")
    private String code;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private CustomFieldData[] customFields;

    // builder 开始
    public JobFamily() {
    }

    public JobFamily(Builder builder) {
        /**
         * 序列 ID
         * <p> 示例值：4698019107896524633
         */
        this.jobFamilyId = builder.jobFamilyId;
        /**
         * 名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 启用
         * <p> 示例值：true
         */
        this.active = builder.active;
        /**
         * 上级序列
         * <p> 示例值：4698020757495316313
         */
        this.parentId = builder.parentId;
        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         */
        this.expirationTime = builder.expirationTime;
        /**
         * 编码
         * <p> 示例值：123456
         */
        this.code = builder.code;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getJobFamilyId() {
        return this.jobFamilyId;
    }

    public void setJobFamilyId(String jobFamilyId) {
        this.jobFamilyId = jobFamilyId;
    }

    public I18n[] getName() {
        return this.name;
    }

    public void setName(I18n[] name) {
        this.name = name;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getExpirationTime() {
        return this.expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CustomFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(CustomFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 序列 ID
         * <p> 示例值：4698019107896524633
         */
        private String jobFamilyId;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n[] name;
        /**
         * 启用
         * <p> 示例值：true
         */
        private Boolean active;
        /**
         * 上级序列
         * <p> 示例值：4698020757495316313
         */
        private String parentId;
        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         */
        private String effectiveTime;
        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         */
        private String expirationTime;
        /**
         * 编码
         * <p> 示例值：123456
         */
        private String code;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private CustomFieldData[] customFields;

        /**
         * 序列 ID
         * <p> 示例值：4698019107896524633
         *
         * @param jobFamilyId
         * @return
         */
        public Builder jobFamilyId(String jobFamilyId) {
            this.jobFamilyId = jobFamilyId;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n[] name) {
            this.name = name;
            return this;
        }


        /**
         * 启用
         * <p> 示例值：true
         *
         * @param active
         * @return
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }


        /**
         * 上级序列
         * <p> 示例值：4698020757495316313
         *
         * @param parentId
         * @return
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }


        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         *
         * @param expirationTime
         * @return
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }


        /**
         * 编码
         * <p> 示例值：123456
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(CustomFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public JobFamily build() {
            return new JobFamily(this);
        }
    }
}
