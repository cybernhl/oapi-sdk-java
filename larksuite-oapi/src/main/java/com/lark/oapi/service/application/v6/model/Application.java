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

public class Application {
    /**
     * 应用的 app_id
     * <p> 示例值：cli_9b445f5258795107
     */
    @SerializedName("app_id")
    private String appId;
    /**
     * 应用创建者（所有者）
     * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
     */
    @SerializedName("creator_id")
    private String creatorId;
    /**
     * 应用状态
     * <p> 示例值：1
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 应用类型
     * <p> 示例值：0
     */
    @SerializedName("scene_type")
    private Integer sceneType;
    /**
     * 付费类型
     * <p> 示例值：0
     */
    @SerializedName("payment_type")
    private Integer paymentType;
    /**
     * 应用创建来源(目前仅Base应用返回)
     * <p> 示例值：base
     */
    @SerializedName("create_source")
    private String createSource;
    /**
     * 安全设置中的重定向 URL
     * <p> 示例值：
     */
    @SerializedName("redirect_urls")
    private String[] redirectUrls;
    /**
     * 发布在线上的应用版本 ID，若没有则为空
     * <p> 示例值：oav_d317f090b7258ad0372aa53963cda70d
     */
    @SerializedName("online_version_id")
    private String onlineVersionId;
    /**
     * 在审核中的版本 ID，若没有则为空
     * <p> 示例值：oav_d317f090b7258ad0372aa53963cda70d
     */
    @SerializedName("unaudit_version_id")
    private String unauditVersionId;
    /**
     * 应用名称
     * <p> 示例值：应用名称
     */
    @SerializedName("app_name")
    private String appName;
    /**
     * 应用图标 url
     * <p> 示例值：https://sf1-ttcdn-tos.pstatp.com/img/avatar/d279000ca4d3f7f6aaff~72x72.jpg
     */
    @SerializedName("avatar_url")
    private String avatarUrl;
    /**
     * 应用默认描述
     * <p> 示例值：应用描述
     */
    @SerializedName("description")
    private String description;
    /**
     * 应用权限列表
     * <p> 示例值：
     */
    @SerializedName("scopes")
    private AppScope[] scopes;
    /**
     * 后台主页地址
     * <p> 示例值：https://www.example.com
     */
    @SerializedName("back_home_url")
    private String backHomeUrl;
    /**
     * 应用的国际化信息列表
     * <p> 示例值：
     */
    @SerializedName("i18n")
    private AppI18nInfo[] i18n;
    /**
     * 应用主语言
     * <p> 示例值：zh_cn
     */
    @SerializedName("primary_language")
    private String primaryLanguage;
    /**
     * 应用分类的国际化描述
     * <p> 示例值：["办公效率"]
     */
    @SerializedName("common_categories")
    private String[] commonCategories;
    /**
     * 应用的所有者信息
     * <p> 示例值：
     */
    @SerializedName("owner")
    private ApplicationOwner owner;

    // builder 开始
    public Application() {
    }

    public Application(Builder builder) {
        /**
         * 应用的 app_id
         * <p> 示例值：cli_9b445f5258795107
         */
        this.appId = builder.appId;
        /**
         * 应用创建者（所有者）
         * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
         */
        this.creatorId = builder.creatorId;
        /**
         * 应用状态
         * <p> 示例值：1
         */
        this.status = builder.status;
        /**
         * 应用类型
         * <p> 示例值：0
         */
        this.sceneType = builder.sceneType;
        /**
         * 付费类型
         * <p> 示例值：0
         */
        this.paymentType = builder.paymentType;
        /**
         * 应用创建来源(目前仅Base应用返回)
         * <p> 示例值：base
         */
        this.createSource = builder.createSource;
        /**
         * 安全设置中的重定向 URL
         * <p> 示例值：
         */
        this.redirectUrls = builder.redirectUrls;
        /**
         * 发布在线上的应用版本 ID，若没有则为空
         * <p> 示例值：oav_d317f090b7258ad0372aa53963cda70d
         */
        this.onlineVersionId = builder.onlineVersionId;
        /**
         * 在审核中的版本 ID，若没有则为空
         * <p> 示例值：oav_d317f090b7258ad0372aa53963cda70d
         */
        this.unauditVersionId = builder.unauditVersionId;
        /**
         * 应用名称
         * <p> 示例值：应用名称
         */
        this.appName = builder.appName;
        /**
         * 应用图标 url
         * <p> 示例值：https://sf1-ttcdn-tos.pstatp.com/img/avatar/d279000ca4d3f7f6aaff~72x72.jpg
         */
        this.avatarUrl = builder.avatarUrl;
        /**
         * 应用默认描述
         * <p> 示例值：应用描述
         */
        this.description = builder.description;
        /**
         * 应用权限列表
         * <p> 示例值：
         */
        this.scopes = builder.scopes;
        /**
         * 后台主页地址
         * <p> 示例值：https://www.example.com
         */
        this.backHomeUrl = builder.backHomeUrl;
        /**
         * 应用的国际化信息列表
         * <p> 示例值：
         */
        this.i18n = builder.i18n;
        /**
         * 应用主语言
         * <p> 示例值：zh_cn
         */
        this.primaryLanguage = builder.primaryLanguage;
        /**
         * 应用分类的国际化描述
         * <p> 示例值：["办公效率"]
         */
        this.commonCategories = builder.commonCategories;
        /**
         * 应用的所有者信息
         * <p> 示例值：
         */
        this.owner = builder.owner;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSceneType() {
        return this.sceneType;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public Integer getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getCreateSource() {
        return this.createSource;
    }

    public void setCreateSource(String createSource) {
        this.createSource = createSource;
    }

    public String[] getRedirectUrls() {
        return this.redirectUrls;
    }

    public void setRedirectUrls(String[] redirectUrls) {
        this.redirectUrls = redirectUrls;
    }

    public String getOnlineVersionId() {
        return this.onlineVersionId;
    }

    public void setOnlineVersionId(String onlineVersionId) {
        this.onlineVersionId = onlineVersionId;
    }

    public String getUnauditVersionId() {
        return this.unauditVersionId;
    }

    public void setUnauditVersionId(String unauditVersionId) {
        this.unauditVersionId = unauditVersionId;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppScope[] getScopes() {
        return this.scopes;
    }

    public void setScopes(AppScope[] scopes) {
        this.scopes = scopes;
    }

    public String getBackHomeUrl() {
        return this.backHomeUrl;
    }

    public void setBackHomeUrl(String backHomeUrl) {
        this.backHomeUrl = backHomeUrl;
    }

    public AppI18nInfo[] getI18n() {
        return this.i18n;
    }

    public void setI18n(AppI18nInfo[] i18n) {
        this.i18n = i18n;
    }

    public String getPrimaryLanguage() {
        return this.primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public String[] getCommonCategories() {
        return this.commonCategories;
    }

    public void setCommonCategories(String[] commonCategories) {
        this.commonCategories = commonCategories;
    }

    public ApplicationOwner getOwner() {
        return this.owner;
    }

    public void setOwner(ApplicationOwner owner) {
        this.owner = owner;
    }

    public static class Builder {
        /**
         * 应用的 app_id
         * <p> 示例值：cli_9b445f5258795107
         */
        private String appId;
        /**
         * 应用创建者（所有者）
         * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
         */
        private String creatorId;
        /**
         * 应用状态
         * <p> 示例值：1
         */
        private Integer status;
        /**
         * 应用类型
         * <p> 示例值：0
         */
        private Integer sceneType;
        /**
         * 付费类型
         * <p> 示例值：0
         */
        private Integer paymentType;
        /**
         * 应用创建来源(目前仅Base应用返回)
         * <p> 示例值：base
         */
        private String createSource;
        /**
         * 安全设置中的重定向 URL
         * <p> 示例值：
         */
        private String[] redirectUrls;
        /**
         * 发布在线上的应用版本 ID，若没有则为空
         * <p> 示例值：oav_d317f090b7258ad0372aa53963cda70d
         */
        private String onlineVersionId;
        /**
         * 在审核中的版本 ID，若没有则为空
         * <p> 示例值：oav_d317f090b7258ad0372aa53963cda70d
         */
        private String unauditVersionId;
        /**
         * 应用名称
         * <p> 示例值：应用名称
         */
        private String appName;
        /**
         * 应用图标 url
         * <p> 示例值：https://sf1-ttcdn-tos.pstatp.com/img/avatar/d279000ca4d3f7f6aaff~72x72.jpg
         */
        private String avatarUrl;
        /**
         * 应用默认描述
         * <p> 示例值：应用描述
         */
        private String description;
        /**
         * 应用权限列表
         * <p> 示例值：
         */
        private AppScope[] scopes;
        /**
         * 后台主页地址
         * <p> 示例值：https://www.example.com
         */
        private String backHomeUrl;
        /**
         * 应用的国际化信息列表
         * <p> 示例值：
         */
        private AppI18nInfo[] i18n;
        /**
         * 应用主语言
         * <p> 示例值：zh_cn
         */
        private String primaryLanguage;
        /**
         * 应用分类的国际化描述
         * <p> 示例值：["办公效率"]
         */
        private String[] commonCategories;
        /**
         * 应用的所有者信息
         * <p> 示例值：
         */
        private ApplicationOwner owner;

        /**
         * 应用的 app_id
         * <p> 示例值：cli_9b445f5258795107
         *
         * @param appId
         * @return
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }


        /**
         * 应用创建者（所有者）
         * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
         *
         * @param creatorId
         * @return
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }


        /**
         * 应用状态
         * <p> 示例值：1
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 应用状态
         * <p> 示例值：1
         *
         * @param status {@link com.lark.oapi.service.application.v6.enums.ApplicationAppStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.application.v6.enums.ApplicationAppStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * 应用类型
         * <p> 示例值：0
         *
         * @param sceneType
         * @return
         */
        public Builder sceneType(Integer sceneType) {
            this.sceneType = sceneType;
            return this;
        }

        /**
         * 应用类型
         * <p> 示例值：0
         *
         * @param sceneType {@link com.lark.oapi.service.application.v6.enums.ApplicationAppSceneTypeEnum}
         * @return
         */
        public Builder sceneType(com.lark.oapi.service.application.v6.enums.ApplicationAppSceneTypeEnum sceneType) {
            this.sceneType = sceneType.getValue();
            return this;
        }


        /**
         * 付费类型
         * <p> 示例值：0
         *
         * @param paymentType
         * @return
         */
        public Builder paymentType(Integer paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * 付费类型
         * <p> 示例值：0
         *
         * @param paymentType {@link com.lark.oapi.service.application.v6.enums.ApplicationPaymentTypeEnum}
         * @return
         */
        public Builder paymentType(com.lark.oapi.service.application.v6.enums.ApplicationPaymentTypeEnum paymentType) {
            this.paymentType = paymentType.getValue();
            return this;
        }


        /**
         * 应用创建来源(目前仅Base应用返回)
         * <p> 示例值：base
         *
         * @param createSource
         * @return
         */
        public Builder createSource(String createSource) {
            this.createSource = createSource;
            return this;
        }

        /**
         * 应用创建来源(目前仅Base应用返回)
         * <p> 示例值：base
         *
         * @param createSource {@link com.lark.oapi.service.application.v6.enums.ApplicationCreateSourceEnum}
         * @return
         */
        public Builder createSource(com.lark.oapi.service.application.v6.enums.ApplicationCreateSourceEnum createSource) {
            this.createSource = createSource.getValue();
            return this;
        }


        /**
         * 安全设置中的重定向 URL
         * <p> 示例值：
         *
         * @param redirectUrls
         * @return
         */
        public Builder redirectUrls(String[] redirectUrls) {
            this.redirectUrls = redirectUrls;
            return this;
        }


        /**
         * 发布在线上的应用版本 ID，若没有则为空
         * <p> 示例值：oav_d317f090b7258ad0372aa53963cda70d
         *
         * @param onlineVersionId
         * @return
         */
        public Builder onlineVersionId(String onlineVersionId) {
            this.onlineVersionId = onlineVersionId;
            return this;
        }


        /**
         * 在审核中的版本 ID，若没有则为空
         * <p> 示例值：oav_d317f090b7258ad0372aa53963cda70d
         *
         * @param unauditVersionId
         * @return
         */
        public Builder unauditVersionId(String unauditVersionId) {
            this.unauditVersionId = unauditVersionId;
            return this;
        }


        /**
         * 应用名称
         * <p> 示例值：应用名称
         *
         * @param appName
         * @return
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }


        /**
         * 应用图标 url
         * <p> 示例值：https://sf1-ttcdn-tos.pstatp.com/img/avatar/d279000ca4d3f7f6aaff~72x72.jpg
         *
         * @param avatarUrl
         * @return
         */
        public Builder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }


        /**
         * 应用默认描述
         * <p> 示例值：应用描述
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 应用权限列表
         * <p> 示例值：
         *
         * @param scopes
         * @return
         */
        public Builder scopes(AppScope[] scopes) {
            this.scopes = scopes;
            return this;
        }


        /**
         * 后台主页地址
         * <p> 示例值：https://www.example.com
         *
         * @param backHomeUrl
         * @return
         */
        public Builder backHomeUrl(String backHomeUrl) {
            this.backHomeUrl = backHomeUrl;
            return this;
        }


        /**
         * 应用的国际化信息列表
         * <p> 示例值：
         *
         * @param i18n
         * @return
         */
        public Builder i18n(AppI18nInfo[] i18n) {
            this.i18n = i18n;
            return this;
        }


        /**
         * 应用主语言
         * <p> 示例值：zh_cn
         *
         * @param primaryLanguage
         * @return
         */
        public Builder primaryLanguage(String primaryLanguage) {
            this.primaryLanguage = primaryLanguage;
            return this;
        }

        /**
         * 应用主语言
         * <p> 示例值：zh_cn
         *
         * @param primaryLanguage {@link com.lark.oapi.service.application.v6.enums.ApplicationI18nKeyEnum}
         * @return
         */
        public Builder primaryLanguage(com.lark.oapi.service.application.v6.enums.ApplicationI18nKeyEnum primaryLanguage) {
            this.primaryLanguage = primaryLanguage.getValue();
            return this;
        }


        /**
         * 应用分类的国际化描述
         * <p> 示例值：["办公效率"]
         *
         * @param commonCategories
         * @return
         */
        public Builder commonCategories(String[] commonCategories) {
            this.commonCategories = commonCategories;
            return this;
        }


        /**
         * 应用的所有者信息
         * <p> 示例值：
         *
         * @param owner
         * @return
         */
        public Builder owner(ApplicationOwner owner) {
            this.owner = owner;
            return this;
        }


        public Application build() {
            return new Application(this);
        }
    }
}
