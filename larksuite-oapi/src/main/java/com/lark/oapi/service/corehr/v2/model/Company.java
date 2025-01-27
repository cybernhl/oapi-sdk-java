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

public class Company {
    /**
     * 公司 ID
     * <p> 示例值：4692472714243080020
     */
    @SerializedName("company_id")
    private String companyId;
    /**
     * 公司基本信息
     * <p> 示例值：
     */
    @SerializedName("hiberarchy_common")
    private HiberarchyCommon hiberarchyCommon;
    /**
     * 性质
     * <p> 示例值：
     */
    @SerializedName("type")
    private Enum type;
    /**
     * 行业
     * <p> 示例值：
     */
    @SerializedName("industry_list")
    private Enum[] industryList;
    /**
     * 法定代表人
     * <p> 示例值：
     */
    @SerializedName("legal_representative")
    private I18n[] legalRepresentative;
    /**
     * 邮编
     * <p> 示例值：邮编
     */
    @SerializedName("post_code")
    private String postCode;
    /**
     * 纳税人识别号
     * <p> 示例值：123456840
     */
    @SerializedName("tax_payer_id")
    private String taxPayerId;
    /**
     * confidential
     * <p> 示例值：true
     */
    @SerializedName("confidential")
    private Boolean confidential;
    /**
     * 主体类型
     * <p> 示例值：
     */
    @SerializedName("sub_type_list")
    private Enum[] subTypeList;
    /**
     * 是否为分公司
     * <p> 示例值：true
     */
    @SerializedName("branch_company")
    private Boolean branchCompany;
    /**
     * 主要负责人
     * <p> 示例值：
     */
    @SerializedName("primary_manager")
    private I18n[] primaryManager;
    /**
     * 默认币种
     * <p> 示例值：
     */
    @SerializedName("currency")
    private Currency currency;
    /**
     * 电话
     * <p> 示例值：
     */
    @SerializedName("phone")
    private PhoneNumberAndAreaCode phone;
    /**
     * 传真
     * <p> 示例值：
     */
    @SerializedName("fax")
    private PhoneNumberAndAreaCode fax;
    /**
     * 完整注册地址
     * <p> 示例值：
     */
    @SerializedName("registered_office_address")
    private I18n[] registeredOfficeAddress;
    /**
     * 完整办公地址
     * <p> 示例值：
     */
    @SerializedName("office_address")
    private I18n[] officeAddress;
    /**
     * 注册地址
     * <p> 示例值：
     */
    @SerializedName("registered_office_address_info")
    private Address registeredOfficeAddressInfo;
    /**
     * 办公地址
     * <p> 示例值：
     */
    @SerializedName("office_address_info")
    private Address officeAddressInfo;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private CustomFieldData[] customFields;

    // builder 开始
    public Company() {
    }

    public Company(Builder builder) {
        /**
         * 公司 ID
         * <p> 示例值：4692472714243080020
         */
        this.companyId = builder.companyId;
        /**
         * 公司基本信息
         * <p> 示例值：
         */
        this.hiberarchyCommon = builder.hiberarchyCommon;
        /**
         * 性质
         * <p> 示例值：
         */
        this.type = builder.type;
        /**
         * 行业
         * <p> 示例值：
         */
        this.industryList = builder.industryList;
        /**
         * 法定代表人
         * <p> 示例值：
         */
        this.legalRepresentative = builder.legalRepresentative;
        /**
         * 邮编
         * <p> 示例值：邮编
         */
        this.postCode = builder.postCode;
        /**
         * 纳税人识别号
         * <p> 示例值：123456840
         */
        this.taxPayerId = builder.taxPayerId;
        /**
         * confidential
         * <p> 示例值：true
         */
        this.confidential = builder.confidential;
        /**
         * 主体类型
         * <p> 示例值：
         */
        this.subTypeList = builder.subTypeList;
        /**
         * 是否为分公司
         * <p> 示例值：true
         */
        this.branchCompany = builder.branchCompany;
        /**
         * 主要负责人
         * <p> 示例值：
         */
        this.primaryManager = builder.primaryManager;
        /**
         * 默认币种
         * <p> 示例值：
         */
        this.currency = builder.currency;
        /**
         * 电话
         * <p> 示例值：
         */
        this.phone = builder.phone;
        /**
         * 传真
         * <p> 示例值：
         */
        this.fax = builder.fax;
        /**
         * 完整注册地址
         * <p> 示例值：
         */
        this.registeredOfficeAddress = builder.registeredOfficeAddress;
        /**
         * 完整办公地址
         * <p> 示例值：
         */
        this.officeAddress = builder.officeAddress;
        /**
         * 注册地址
         * <p> 示例值：
         */
        this.registeredOfficeAddressInfo = builder.registeredOfficeAddressInfo;
        /**
         * 办公地址
         * <p> 示例值：
         */
        this.officeAddressInfo = builder.officeAddressInfo;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public HiberarchyCommon getHiberarchyCommon() {
        return this.hiberarchyCommon;
    }

    public void setHiberarchyCommon(HiberarchyCommon hiberarchyCommon) {
        this.hiberarchyCommon = hiberarchyCommon;
    }

    public Enum getType() {
        return this.type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public Enum[] getIndustryList() {
        return this.industryList;
    }

    public void setIndustryList(Enum[] industryList) {
        this.industryList = industryList;
    }

    public I18n[] getLegalRepresentative() {
        return this.legalRepresentative;
    }

    public void setLegalRepresentative(I18n[] legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTaxPayerId() {
        return this.taxPayerId;
    }

    public void setTaxPayerId(String taxPayerId) {
        this.taxPayerId = taxPayerId;
    }

    public Boolean getConfidential() {
        return this.confidential;
    }

    public void setConfidential(Boolean confidential) {
        this.confidential = confidential;
    }

    public Enum[] getSubTypeList() {
        return this.subTypeList;
    }

    public void setSubTypeList(Enum[] subTypeList) {
        this.subTypeList = subTypeList;
    }

    public Boolean getBranchCompany() {
        return this.branchCompany;
    }

    public void setBranchCompany(Boolean branchCompany) {
        this.branchCompany = branchCompany;
    }

    public I18n[] getPrimaryManager() {
        return this.primaryManager;
    }

    public void setPrimaryManager(I18n[] primaryManager) {
        this.primaryManager = primaryManager;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public PhoneNumberAndAreaCode getPhone() {
        return this.phone;
    }

    public void setPhone(PhoneNumberAndAreaCode phone) {
        this.phone = phone;
    }

    public PhoneNumberAndAreaCode getFax() {
        return this.fax;
    }

    public void setFax(PhoneNumberAndAreaCode fax) {
        this.fax = fax;
    }

    public I18n[] getRegisteredOfficeAddress() {
        return this.registeredOfficeAddress;
    }

    public void setRegisteredOfficeAddress(I18n[] registeredOfficeAddress) {
        this.registeredOfficeAddress = registeredOfficeAddress;
    }

    public I18n[] getOfficeAddress() {
        return this.officeAddress;
    }

    public void setOfficeAddress(I18n[] officeAddress) {
        this.officeAddress = officeAddress;
    }

    public Address getRegisteredOfficeAddressInfo() {
        return this.registeredOfficeAddressInfo;
    }

    public void setRegisteredOfficeAddressInfo(Address registeredOfficeAddressInfo) {
        this.registeredOfficeAddressInfo = registeredOfficeAddressInfo;
    }

    public Address getOfficeAddressInfo() {
        return this.officeAddressInfo;
    }

    public void setOfficeAddressInfo(Address officeAddressInfo) {
        this.officeAddressInfo = officeAddressInfo;
    }

    public CustomFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(CustomFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 公司 ID
         * <p> 示例值：4692472714243080020
         */
        private String companyId;
        /**
         * 公司基本信息
         * <p> 示例值：
         */
        private HiberarchyCommon hiberarchyCommon;
        /**
         * 性质
         * <p> 示例值：
         */
        private Enum type;
        /**
         * 行业
         * <p> 示例值：
         */
        private Enum[] industryList;
        /**
         * 法定代表人
         * <p> 示例值：
         */
        private I18n[] legalRepresentative;
        /**
         * 邮编
         * <p> 示例值：邮编
         */
        private String postCode;
        /**
         * 纳税人识别号
         * <p> 示例值：123456840
         */
        private String taxPayerId;
        /**
         * confidential
         * <p> 示例值：true
         */
        private Boolean confidential;
        /**
         * 主体类型
         * <p> 示例值：
         */
        private Enum[] subTypeList;
        /**
         * 是否为分公司
         * <p> 示例值：true
         */
        private Boolean branchCompany;
        /**
         * 主要负责人
         * <p> 示例值：
         */
        private I18n[] primaryManager;
        /**
         * 默认币种
         * <p> 示例值：
         */
        private Currency currency;
        /**
         * 电话
         * <p> 示例值：
         */
        private PhoneNumberAndAreaCode phone;
        /**
         * 传真
         * <p> 示例值：
         */
        private PhoneNumberAndAreaCode fax;
        /**
         * 完整注册地址
         * <p> 示例值：
         */
        private I18n[] registeredOfficeAddress;
        /**
         * 完整办公地址
         * <p> 示例值：
         */
        private I18n[] officeAddress;
        /**
         * 注册地址
         * <p> 示例值：
         */
        private Address registeredOfficeAddressInfo;
        /**
         * 办公地址
         * <p> 示例值：
         */
        private Address officeAddressInfo;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private CustomFieldData[] customFields;

        /**
         * 公司 ID
         * <p> 示例值：4692472714243080020
         *
         * @param companyId
         * @return
         */
        public Builder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }


        /**
         * 公司基本信息
         * <p> 示例值：
         *
         * @param hiberarchyCommon
         * @return
         */
        public Builder hiberarchyCommon(HiberarchyCommon hiberarchyCommon) {
            this.hiberarchyCommon = hiberarchyCommon;
            return this;
        }


        /**
         * 性质
         * <p> 示例值：
         *
         * @param type
         * @return
         */
        public Builder type(Enum type) {
            this.type = type;
            return this;
        }


        /**
         * 行业
         * <p> 示例值：
         *
         * @param industryList
         * @return
         */
        public Builder industryList(Enum[] industryList) {
            this.industryList = industryList;
            return this;
        }


        /**
         * 法定代表人
         * <p> 示例值：
         *
         * @param legalRepresentative
         * @return
         */
        public Builder legalRepresentative(I18n[] legalRepresentative) {
            this.legalRepresentative = legalRepresentative;
            return this;
        }


        /**
         * 邮编
         * <p> 示例值：邮编
         *
         * @param postCode
         * @return
         */
        public Builder postCode(String postCode) {
            this.postCode = postCode;
            return this;
        }


        /**
         * 纳税人识别号
         * <p> 示例值：123456840
         *
         * @param taxPayerId
         * @return
         */
        public Builder taxPayerId(String taxPayerId) {
            this.taxPayerId = taxPayerId;
            return this;
        }


        /**
         * confidential
         * <p> 示例值：true
         *
         * @param confidential
         * @return
         */
        public Builder confidential(Boolean confidential) {
            this.confidential = confidential;
            return this;
        }


        /**
         * 主体类型
         * <p> 示例值：
         *
         * @param subTypeList
         * @return
         */
        public Builder subTypeList(Enum[] subTypeList) {
            this.subTypeList = subTypeList;
            return this;
        }


        /**
         * 是否为分公司
         * <p> 示例值：true
         *
         * @param branchCompany
         * @return
         */
        public Builder branchCompany(Boolean branchCompany) {
            this.branchCompany = branchCompany;
            return this;
        }


        /**
         * 主要负责人
         * <p> 示例值：
         *
         * @param primaryManager
         * @return
         */
        public Builder primaryManager(I18n[] primaryManager) {
            this.primaryManager = primaryManager;
            return this;
        }


        /**
         * 默认币种
         * <p> 示例值：
         *
         * @param currency
         * @return
         */
        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }


        /**
         * 电话
         * <p> 示例值：
         *
         * @param phone
         * @return
         */
        public Builder phone(PhoneNumberAndAreaCode phone) {
            this.phone = phone;
            return this;
        }


        /**
         * 传真
         * <p> 示例值：
         *
         * @param fax
         * @return
         */
        public Builder fax(PhoneNumberAndAreaCode fax) {
            this.fax = fax;
            return this;
        }


        /**
         * 完整注册地址
         * <p> 示例值：
         *
         * @param registeredOfficeAddress
         * @return
         */
        public Builder registeredOfficeAddress(I18n[] registeredOfficeAddress) {
            this.registeredOfficeAddress = registeredOfficeAddress;
            return this;
        }


        /**
         * 完整办公地址
         * <p> 示例值：
         *
         * @param officeAddress
         * @return
         */
        public Builder officeAddress(I18n[] officeAddress) {
            this.officeAddress = officeAddress;
            return this;
        }


        /**
         * 注册地址
         * <p> 示例值：
         *
         * @param registeredOfficeAddressInfo
         * @return
         */
        public Builder registeredOfficeAddressInfo(Address registeredOfficeAddressInfo) {
            this.registeredOfficeAddressInfo = registeredOfficeAddressInfo;
            return this;
        }


        /**
         * 办公地址
         * <p> 示例值：
         *
         * @param officeAddressInfo
         * @return
         */
        public Builder officeAddressInfo(Address officeAddressInfo) {
            this.officeAddressInfo = officeAddressInfo;
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


        public Company build() {
            return new Company(this);
        }
    }
}
