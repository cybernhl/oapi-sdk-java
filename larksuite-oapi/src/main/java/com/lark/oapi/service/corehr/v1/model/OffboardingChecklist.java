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

public class OffboardingChecklist {
    /**
     * 离职办理状态
     * <p> 示例值：AntiBegin
     */
    @SerializedName("checklist_status")
    private String checklistStatus;
    /**
     * 离职流转开始时间
     * <p> 示例值：2022-02-03 11:22:33
     */
    @SerializedName("checklist_start_time")
    private String checklistStartTime;
    /**
     * 离职流转结束时间
     * <p> 示例值：2022-02-03 11:22:33
     */
    @SerializedName("checklist_finish_time")
    private String checklistFinishTime;
    /**
     * 离职流转流程实例 ID
     * <p> 示例值：6838119494196871234
     */
    @SerializedName("checklist_process_id")
    private String checklistProcessId;

    // builder 开始
    public OffboardingChecklist() {
    }

    public OffboardingChecklist(Builder builder) {
        /**
         * 离职办理状态
         * <p> 示例值：AntiBegin
         */
        this.checklistStatus = builder.checklistStatus;
        /**
         * 离职流转开始时间
         * <p> 示例值：2022-02-03 11:22:33
         */
        this.checklistStartTime = builder.checklistStartTime;
        /**
         * 离职流转结束时间
         * <p> 示例值：2022-02-03 11:22:33
         */
        this.checklistFinishTime = builder.checklistFinishTime;
        /**
         * 离职流转流程实例 ID
         * <p> 示例值：6838119494196871234
         */
        this.checklistProcessId = builder.checklistProcessId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getChecklistStatus() {
        return this.checklistStatus;
    }

    public void setChecklistStatus(String checklistStatus) {
        this.checklistStatus = checklistStatus;
    }

    public String getChecklistStartTime() {
        return this.checklistStartTime;
    }

    public void setChecklistStartTime(String checklistStartTime) {
        this.checklistStartTime = checklistStartTime;
    }

    public String getChecklistFinishTime() {
        return this.checklistFinishTime;
    }

    public void setChecklistFinishTime(String checklistFinishTime) {
        this.checklistFinishTime = checklistFinishTime;
    }

    public String getChecklistProcessId() {
        return this.checklistProcessId;
    }

    public void setChecklistProcessId(String checklistProcessId) {
        this.checklistProcessId = checklistProcessId;
    }

    public static class Builder {
        /**
         * 离职办理状态
         * <p> 示例值：AntiBegin
         */
        private String checklistStatus;
        /**
         * 离职流转开始时间
         * <p> 示例值：2022-02-03 11:22:33
         */
        private String checklistStartTime;
        /**
         * 离职流转结束时间
         * <p> 示例值：2022-02-03 11:22:33
         */
        private String checklistFinishTime;
        /**
         * 离职流转流程实例 ID
         * <p> 示例值：6838119494196871234
         */
        private String checklistProcessId;

        /**
         * 离职办理状态
         * <p> 示例值：AntiBegin
         *
         * @param checklistStatus
         * @return
         */
        public Builder checklistStatus(String checklistStatus) {
            this.checklistStatus = checklistStatus;
            return this;
        }


        /**
         * 离职流转开始时间
         * <p> 示例值：2022-02-03 11:22:33
         *
         * @param checklistStartTime
         * @return
         */
        public Builder checklistStartTime(String checklistStartTime) {
            this.checklistStartTime = checklistStartTime;
            return this;
        }


        /**
         * 离职流转结束时间
         * <p> 示例值：2022-02-03 11:22:33
         *
         * @param checklistFinishTime
         * @return
         */
        public Builder checklistFinishTime(String checklistFinishTime) {
            this.checklistFinishTime = checklistFinishTime;
            return this;
        }


        /**
         * 离职流转流程实例 ID
         * <p> 示例值：6838119494196871234
         *
         * @param checklistProcessId
         * @return
         */
        public Builder checklistProcessId(String checklistProcessId) {
            this.checklistProcessId = checklistProcessId;
            return this;
        }


        public OffboardingChecklist build() {
            return new OffboardingChecklist(this);
        }
    }
}