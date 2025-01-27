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

package com.lark.oapi.service.application.v6;

import com.lark.oapi.core.Config;
import com.lark.oapi.service.application.v6.resource.*;

public class V6 {
    private final AppBadge appBadge; // 应用红点
    private final AppRecommendRule appRecommendRule; // 我的常用推荐规则
    private final Application application; // 应用
    private final ApplicationAppUsage applicationAppUsage; // 应用使用情况
    private final ApplicationAppVersion applicationAppVersion; // 事件
    private final ApplicationContactsRange applicationContactsRange; // application.contacts_range
    private final ApplicationFeedback applicationFeedback; // 应用反馈
    private final ApplicationVisibility applicationVisibility; // 事件
    private final Bot bot; // 事件

    public V6(Config config) {
        this.appBadge = new AppBadge(config);
        this.appRecommendRule = new AppRecommendRule(config);
        this.application = new Application(config);
        this.applicationAppUsage = new ApplicationAppUsage(config);
        this.applicationAppVersion = new ApplicationAppVersion(config);
        this.applicationContactsRange = new ApplicationContactsRange(config);
        this.applicationFeedback = new ApplicationFeedback(config);
        this.applicationVisibility = new ApplicationVisibility(config);
        this.bot = new Bot(config);
    }

    public AppBadge appBadge() {
        return appBadge;
    }

    public AppRecommendRule appRecommendRule() {
        return appRecommendRule;
    }

    public Application application() {
        return application;
    }

    public ApplicationAppUsage applicationAppUsage() {
        return applicationAppUsage;
    }

    public ApplicationAppVersion applicationAppVersion() {
        return applicationAppVersion;
    }

    public ApplicationContactsRange applicationContactsRange() {
        return applicationContactsRange;
    }

    public ApplicationFeedback applicationFeedback() {
        return applicationFeedback;
    }

    public ApplicationVisibility applicationVisibility() {
        return applicationVisibility;
    }

    public Bot bot() {
        return bot;
    }
}