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

package com.lark.oapi.service.report.v1.model;

import com.google.gson.annotations.SerializedName;

public class Rule {
    /**
     * 规则唯一标识
     * <p> 示例值：6894788526240432147
     */
    @SerializedName("rule_id")
    private String ruleId;
    /**
     * 规则名称
     * <p> 示例值：工作月报
     */
    @SerializedName("name")
    private String name;
    /**
     * 规则图标
     * <p> 示例值：日报
     */
    @SerializedName("icon_name")
    private String iconName;
    /**
     * 创建时间
     * <p> 示例值：1622427266
     */
    @SerializedName("created_at")
    private Integer createdAt;
    /**
     * 创建人ID
     * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb110
     */
    @SerializedName("creator_user_id")
    private String creatorUserId;
    /**
     * 创建人名称
     * <p> 示例值：张三
     */
    @SerializedName("creator_user_name")
    private String creatorUserName;
    /**
     * 规则所有者ID
     * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb111
     */
    @SerializedName("owner_user_id")
    private String ownerUserId;
    /**
     * 规则所有者名称
     * <p> 示例值：张三
     */
    @SerializedName("owner_user_name")
    private String ownerUserName;
    /**
     * 表单定义
     * <p> 示例值：
     */
    @SerializedName("form_schema")
    private FormField[] formSchema;
    /**
     * 规则是否已删除
     * <p> 示例值：0
     */
    @SerializedName("is_deleted")
    private Integer isDeleted;
    /**
     * 需要汇报的用户ID列表
     * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902ffsd']
     */
    @SerializedName("need_report_user_ids")
    private String[] needReportUserIds;
    /**
     * 需要汇报的部门ID列表（如果id为0，表示全员）
     * <p> 示例值：
     */
    @SerializedName("need_report_department_ids")
    private String[] needReportDepartmentIds;
    /**
     * 需要汇报的群ID列表
     * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54ffref']
     */
    @SerializedName("need_report_chat_ids")
    private String[] needReportChatIds;
    /**
     * 抄送用户ID列表
     * <p> 示例值：['ou_45454c20ef2c92c173445abf6f4955rf']
     */
    @SerializedName("cc_user_ids")
    private String[] ccUserIds;
    /**
     * 抄送部门ID列表
     * <p> 示例值：['od-251480c0bfb8c5c8784ea194ef8b734d']
     */
    @SerializedName("cc_department_ids")
    private String[] ccDepartmentIds;
    /**
     * 汇报对象用户ID列表
     * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902fdfe']
     */
    @SerializedName("to_user_ids")
    private String[] toUserIds;
    /**
     * 汇报对象群ID列表
     * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54fcerf']
     */
    @SerializedName("to_chat_ids")
    private String[] toChatIds;
    /**
     * 上级汇报对象，0表示第一级，依次类推，最大为5表示第六级
     * <p> 示例值：[0]
     */
    @SerializedName("to_leaders")
    private Integer[] toLeaders;
    /**
     * 部门负责人汇报对象，0表示第一级，依次类推，最大为5表示第六级
     * <p> 示例值：[0]
     */
    @SerializedName("to_department_owners")
    private Integer[] toDepartmentOwners;
    /**
     * 规则管理员用户ID列表
     * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902sseb']
     */
    @SerializedName("manager_user_ids")
    private String[] managerUserIds;
    /**
     * 抄送群ID列表
     * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54fffsf']
     */
    @SerializedName("cc_chat_ids")
    private String[] ccChatIds;

    // builder 开始
    public Rule() {
    }

    public Rule(Builder builder) {
        /**
         * 规则唯一标识
         * <p> 示例值：6894788526240432147
         */
        this.ruleId = builder.ruleId;
        /**
         * 规则名称
         * <p> 示例值：工作月报
         */
        this.name = builder.name;
        /**
         * 规则图标
         * <p> 示例值：日报
         */
        this.iconName = builder.iconName;
        /**
         * 创建时间
         * <p> 示例值：1622427266
         */
        this.createdAt = builder.createdAt;
        /**
         * 创建人ID
         * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb110
         */
        this.creatorUserId = builder.creatorUserId;
        /**
         * 创建人名称
         * <p> 示例值：张三
         */
        this.creatorUserName = builder.creatorUserName;
        /**
         * 规则所有者ID
         * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb111
         */
        this.ownerUserId = builder.ownerUserId;
        /**
         * 规则所有者名称
         * <p> 示例值：张三
         */
        this.ownerUserName = builder.ownerUserName;
        /**
         * 表单定义
         * <p> 示例值：
         */
        this.formSchema = builder.formSchema;
        /**
         * 规则是否已删除
         * <p> 示例值：0
         */
        this.isDeleted = builder.isDeleted;
        /**
         * 需要汇报的用户ID列表
         * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902ffsd']
         */
        this.needReportUserIds = builder.needReportUserIds;
        /**
         * 需要汇报的部门ID列表（如果id为0，表示全员）
         * <p> 示例值：
         */
        this.needReportDepartmentIds = builder.needReportDepartmentIds;
        /**
         * 需要汇报的群ID列表
         * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54ffref']
         */
        this.needReportChatIds = builder.needReportChatIds;
        /**
         * 抄送用户ID列表
         * <p> 示例值：['ou_45454c20ef2c92c173445abf6f4955rf']
         */
        this.ccUserIds = builder.ccUserIds;
        /**
         * 抄送部门ID列表
         * <p> 示例值：['od-251480c0bfb8c5c8784ea194ef8b734d']
         */
        this.ccDepartmentIds = builder.ccDepartmentIds;
        /**
         * 汇报对象用户ID列表
         * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902fdfe']
         */
        this.toUserIds = builder.toUserIds;
        /**
         * 汇报对象群ID列表
         * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54fcerf']
         */
        this.toChatIds = builder.toChatIds;
        /**
         * 上级汇报对象，0表示第一级，依次类推，最大为5表示第六级
         * <p> 示例值：[0]
         */
        this.toLeaders = builder.toLeaders;
        /**
         * 部门负责人汇报对象，0表示第一级，依次类推，最大为5表示第六级
         * <p> 示例值：[0]
         */
        this.toDepartmentOwners = builder.toDepartmentOwners;
        /**
         * 规则管理员用户ID列表
         * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902sseb']
         */
        this.managerUserIds = builder.managerUserIds;
        /**
         * 抄送群ID列表
         * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54fffsf']
         */
        this.ccChatIds = builder.ccChatIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getRuleId() {
        return this.ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconName() {
        return this.iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public Integer getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatorUserId() {
        return this.creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public String getCreatorUserName() {
        return this.creatorUserName;
    }

    public void setCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName;
    }

    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getOwnerUserName() {
        return this.ownerUserName;
    }

    public void setOwnerUserName(String ownerUserName) {
        this.ownerUserName = ownerUserName;
    }

    public FormField[] getFormSchema() {
        return this.formSchema;
    }

    public void setFormSchema(FormField[] formSchema) {
        this.formSchema = formSchema;
    }

    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String[] getNeedReportUserIds() {
        return this.needReportUserIds;
    }

    public void setNeedReportUserIds(String[] needReportUserIds) {
        this.needReportUserIds = needReportUserIds;
    }

    public String[] getNeedReportDepartmentIds() {
        return this.needReportDepartmentIds;
    }

    public void setNeedReportDepartmentIds(String[] needReportDepartmentIds) {
        this.needReportDepartmentIds = needReportDepartmentIds;
    }

    public String[] getNeedReportChatIds() {
        return this.needReportChatIds;
    }

    public void setNeedReportChatIds(String[] needReportChatIds) {
        this.needReportChatIds = needReportChatIds;
    }

    public String[] getCcUserIds() {
        return this.ccUserIds;
    }

    public void setCcUserIds(String[] ccUserIds) {
        this.ccUserIds = ccUserIds;
    }

    public String[] getCcDepartmentIds() {
        return this.ccDepartmentIds;
    }

    public void setCcDepartmentIds(String[] ccDepartmentIds) {
        this.ccDepartmentIds = ccDepartmentIds;
    }

    public String[] getToUserIds() {
        return this.toUserIds;
    }

    public void setToUserIds(String[] toUserIds) {
        this.toUserIds = toUserIds;
    }

    public String[] getToChatIds() {
        return this.toChatIds;
    }

    public void setToChatIds(String[] toChatIds) {
        this.toChatIds = toChatIds;
    }

    public Integer[] getToLeaders() {
        return this.toLeaders;
    }

    public void setToLeaders(Integer[] toLeaders) {
        this.toLeaders = toLeaders;
    }

    public Integer[] getToDepartmentOwners() {
        return this.toDepartmentOwners;
    }

    public void setToDepartmentOwners(Integer[] toDepartmentOwners) {
        this.toDepartmentOwners = toDepartmentOwners;
    }

    public String[] getManagerUserIds() {
        return this.managerUserIds;
    }

    public void setManagerUserIds(String[] managerUserIds) {
        this.managerUserIds = managerUserIds;
    }

    public String[] getCcChatIds() {
        return this.ccChatIds;
    }

    public void setCcChatIds(String[] ccChatIds) {
        this.ccChatIds = ccChatIds;
    }

    public static class Builder {
        /**
         * 规则唯一标识
         * <p> 示例值：6894788526240432147
         */
        private String ruleId;
        /**
         * 规则名称
         * <p> 示例值：工作月报
         */
        private String name;
        /**
         * 规则图标
         * <p> 示例值：日报
         */
        private String iconName;
        /**
         * 创建时间
         * <p> 示例值：1622427266
         */
        private Integer createdAt;
        /**
         * 创建人ID
         * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb110
         */
        private String creatorUserId;
        /**
         * 创建人名称
         * <p> 示例值：张三
         */
        private String creatorUserName;
        /**
         * 规则所有者ID
         * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb111
         */
        private String ownerUserId;
        /**
         * 规则所有者名称
         * <p> 示例值：张三
         */
        private String ownerUserName;
        /**
         * 表单定义
         * <p> 示例值：
         */
        private FormField[] formSchema;
        /**
         * 规则是否已删除
         * <p> 示例值：0
         */
        private Integer isDeleted;
        /**
         * 需要汇报的用户ID列表
         * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902ffsd']
         */
        private String[] needReportUserIds;
        /**
         * 需要汇报的部门ID列表（如果id为0，表示全员）
         * <p> 示例值：
         */
        private String[] needReportDepartmentIds;
        /**
         * 需要汇报的群ID列表
         * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54ffref']
         */
        private String[] needReportChatIds;
        /**
         * 抄送用户ID列表
         * <p> 示例值：['ou_45454c20ef2c92c173445abf6f4955rf']
         */
        private String[] ccUserIds;
        /**
         * 抄送部门ID列表
         * <p> 示例值：['od-251480c0bfb8c5c8784ea194ef8b734d']
         */
        private String[] ccDepartmentIds;
        /**
         * 汇报对象用户ID列表
         * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902fdfe']
         */
        private String[] toUserIds;
        /**
         * 汇报对象群ID列表
         * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54fcerf']
         */
        private String[] toChatIds;
        /**
         * 上级汇报对象，0表示第一级，依次类推，最大为5表示第六级
         * <p> 示例值：[0]
         */
        private Integer[] toLeaders;
        /**
         * 部门负责人汇报对象，0表示第一级，依次类推，最大为5表示第六级
         * <p> 示例值：[0]
         */
        private Integer[] toDepartmentOwners;
        /**
         * 规则管理员用户ID列表
         * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902sseb']
         */
        private String[] managerUserIds;
        /**
         * 抄送群ID列表
         * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54fffsf']
         */
        private String[] ccChatIds;

        /**
         * 规则唯一标识
         * <p> 示例值：6894788526240432147
         *
         * @param ruleId
         * @return
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }


        /**
         * 规则名称
         * <p> 示例值：工作月报
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 规则图标
         * <p> 示例值：日报
         *
         * @param iconName
         * @return
         */
        public Builder iconName(String iconName) {
            this.iconName = iconName;
            return this;
        }


        /**
         * 创建时间
         * <p> 示例值：1622427266
         *
         * @param createdAt
         * @return
         */
        public Builder createdAt(Integer createdAt) {
            this.createdAt = createdAt;
            return this;
        }


        /**
         * 创建人ID
         * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb110
         *
         * @param creatorUserId
         * @return
         */
        public Builder creatorUserId(String creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }


        /**
         * 创建人名称
         * <p> 示例值：张三
         *
         * @param creatorUserName
         * @return
         */
        public Builder creatorUserName(String creatorUserName) {
            this.creatorUserName = creatorUserName;
            return this;
        }


        /**
         * 规则所有者ID
         * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb111
         *
         * @param ownerUserId
         * @return
         */
        public Builder ownerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }


        /**
         * 规则所有者名称
         * <p> 示例值：张三
         *
         * @param ownerUserName
         * @return
         */
        public Builder ownerUserName(String ownerUserName) {
            this.ownerUserName = ownerUserName;
            return this;
        }


        /**
         * 表单定义
         * <p> 示例值：
         *
         * @param formSchema
         * @return
         */
        public Builder formSchema(FormField[] formSchema) {
            this.formSchema = formSchema;
            return this;
        }


        /**
         * 规则是否已删除
         * <p> 示例值：0
         *
         * @param isDeleted
         * @return
         */
        public Builder isDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * 规则是否已删除
         * <p> 示例值：0
         *
         * @param isDeleted {@link com.lark.oapi.service.report.v1.enums.RuleIsDeletedEnum}
         * @return
         */
        public Builder isDeleted(com.lark.oapi.service.report.v1.enums.RuleIsDeletedEnum isDeleted) {
            this.isDeleted = isDeleted.getValue();
            return this;
        }


        /**
         * 需要汇报的用户ID列表
         * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902ffsd']
         *
         * @param needReportUserIds
         * @return
         */
        public Builder needReportUserIds(String[] needReportUserIds) {
            this.needReportUserIds = needReportUserIds;
            return this;
        }


        /**
         * 需要汇报的部门ID列表（如果id为0，表示全员）
         * <p> 示例值：
         *
         * @param needReportDepartmentIds
         * @return
         */
        public Builder needReportDepartmentIds(String[] needReportDepartmentIds) {
            this.needReportDepartmentIds = needReportDepartmentIds;
            return this;
        }


        /**
         * 需要汇报的群ID列表
         * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54ffref']
         *
         * @param needReportChatIds
         * @return
         */
        public Builder needReportChatIds(String[] needReportChatIds) {
            this.needReportChatIds = needReportChatIds;
            return this;
        }


        /**
         * 抄送用户ID列表
         * <p> 示例值：['ou_45454c20ef2c92c173445abf6f4955rf']
         *
         * @param ccUserIds
         * @return
         */
        public Builder ccUserIds(String[] ccUserIds) {
            this.ccUserIds = ccUserIds;
            return this;
        }


        /**
         * 抄送部门ID列表
         * <p> 示例值：['od-251480c0bfb8c5c8784ea194ef8b734d']
         *
         * @param ccDepartmentIds
         * @return
         */
        public Builder ccDepartmentIds(String[] ccDepartmentIds) {
            this.ccDepartmentIds = ccDepartmentIds;
            return this;
        }


        /**
         * 汇报对象用户ID列表
         * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902fdfe']
         *
         * @param toUserIds
         * @return
         */
        public Builder toUserIds(String[] toUserIds) {
            this.toUserIds = toUserIds;
            return this;
        }


        /**
         * 汇报对象群ID列表
         * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54fcerf']
         *
         * @param toChatIds
         * @return
         */
        public Builder toChatIds(String[] toChatIds) {
            this.toChatIds = toChatIds;
            return this;
        }


        /**
         * 上级汇报对象，0表示第一级，依次类推，最大为5表示第六级
         * <p> 示例值：[0]
         *
         * @param toLeaders
         * @return
         */
        public Builder toLeaders(Integer[] toLeaders) {
            this.toLeaders = toLeaders;
            return this;
        }


        /**
         * 部门负责人汇报对象，0表示第一级，依次类推，最大为5表示第六级
         * <p> 示例值：[0]
         *
         * @param toDepartmentOwners
         * @return
         */
        public Builder toDepartmentOwners(Integer[] toDepartmentOwners) {
            this.toDepartmentOwners = toDepartmentOwners;
            return this;
        }


        /**
         * 规则管理员用户ID列表
         * <p> 示例值：['ou_c04cebc780341ab22bd311ba6902sseb']
         *
         * @param managerUserIds
         * @return
         */
        public Builder managerUserIds(String[] managerUserIds) {
            this.managerUserIds = managerUserIds;
            return this;
        }


        /**
         * 抄送群ID列表
         * <p> 示例值：['oc_a7bb9ca5efa68ab8b4fdd2e3b54fffsf']
         *
         * @param ccChatIds
         * @return
         */
        public Builder ccChatIds(String[] ccChatIds) {
            this.ccChatIds = ccChatIds;
            return this;
        }


        public Rule build() {
            return new Rule(this);
        }
    }
}
