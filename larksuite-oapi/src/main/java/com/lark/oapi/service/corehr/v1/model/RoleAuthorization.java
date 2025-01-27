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

package com.lark.oapi.service.corehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class RoleAuthorization {
    /**
     * 员工 ID
     * <p> 示例值：6967639606963471902
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 授权列表
     * <p> 示例值：
     */
    @SerializedName("permission_detail_list")
    private PermissionDetail[] permissionDetailList;
    /**
     * 实际授权管理范围
     * <p> 示例值：
     */
    @SerializedName("management_scope_list")
    private ManagementScope[] managementScopeList;

    // builder 开始
    public RoleAuthorization() {
    }

    public RoleAuthorization(Builder builder) {
        /**
         * 员工 ID
         * <p> 示例值：6967639606963471902
         */
        this.employmentId = builder.employmentId;
        /**
         * 授权列表
         * <p> 示例值：
         */
        this.permissionDetailList = builder.permissionDetailList;
        /**
         * 实际授权管理范围
         * <p> 示例值：
         */
        this.managementScopeList = builder.managementScopeList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public PermissionDetail[] getPermissionDetailList() {
        return this.permissionDetailList;
    }

    public void setPermissionDetailList(PermissionDetail[] permissionDetailList) {
        this.permissionDetailList = permissionDetailList;
    }

    public ManagementScope[] getManagementScopeList() {
        return this.managementScopeList;
    }

    public void setManagementScopeList(ManagementScope[] managementScopeList) {
        this.managementScopeList = managementScopeList;
    }

    public static class Builder {
        /**
         * 员工 ID
         * <p> 示例值：6967639606963471902
         */
        private String employmentId;
        /**
         * 授权列表
         * <p> 示例值：
         */
        private PermissionDetail[] permissionDetailList;
        /**
         * 实际授权管理范围
         * <p> 示例值：
         */
        private ManagementScope[] managementScopeList;

        /**
         * 员工 ID
         * <p> 示例值：6967639606963471902
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 授权列表
         * <p> 示例值：
         *
         * @param permissionDetailList
         * @return
         */
        public Builder permissionDetailList(PermissionDetail[] permissionDetailList) {
            this.permissionDetailList = permissionDetailList;
            return this;
        }


        /**
         * 实际授权管理范围
         * <p> 示例值：
         *
         * @param managementScopeList
         * @return
         */
        public Builder managementScopeList(ManagementScope[] managementScopeList) {
            this.managementScopeList = managementScopeList;
            return this;
        }


        public RoleAuthorization build() {
            return new RoleAuthorization(this);
        }
    }
}
