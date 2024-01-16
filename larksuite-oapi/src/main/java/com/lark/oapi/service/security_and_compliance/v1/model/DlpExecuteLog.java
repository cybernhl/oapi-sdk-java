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

package com.lark.oapi.service.security_and_compliance.v1.model;

import com.google.gson.annotations.SerializedName;

public class DlpExecuteLog {
    /**
     * 应用业务线
     * <p> 示例值：即时消息
     */
    @SerializedName("applicable_service")
    private String applicableService;
    /**
     * 用户名
     * <p> 示例值：张三
     */
    @SerializedName("user_name")
    private String userName;
    /**
     * 用户id
     * <p> 示例值：934791734918
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 触发条件
     * <p> 示例值：下载/打印
     */
    @SerializedName("trigger")
    private String trigger;
    /**
     * 时间
     * <p> 示例值：16894002
     */
    @SerializedName("time")
    private String time;
    /**
     * 系统执行动作
     * <p> 示例值：拦截
     */
    @SerializedName("system_action")
    private String systemAction;
    /**
     * 消息发送者名称
     * <p> 示例值：张三
     */
    @SerializedName("sender_name")
    private String senderName;
    /**
     * 消息发送者ID
     * <p> 示例值：983749203223
     */
    @SerializedName("sender_id")
    private String senderId;
    /**
     * 消息接收者名称
     * <p> 示例值：李四
     */
    @SerializedName("recipient_name")
    private String recipientName;
    /**
     * 消息接收者ID
     * <p> 示例值：96382734927001
     */
    @SerializedName("recipient_id")
    private String recipientId;
    /**
     * 会话名称
     * <p> 示例值：张三的群聊
     */
    @SerializedName("chat_name")
    private String chatName;
    /**
     * 会话ID
     * <p> 示例值：9374819371047
     */
    @SerializedName("chat_id")
    private String chatId;
    /**
     * 消息ID
     * <p> 示例值：9237481847832
     */
    @SerializedName("message_id")
    private String messageId;
    /**
     * 消息内容
     * <p> 示例值：这是一则消息
     */
    @SerializedName("message_content")
    private String messageContent;
    /**
     * 群昵称
     * <p> 示例值：李四的昵称
     */
    @SerializedName("alias_ingroup")
    private String aliasIngroup;
    /**
     * 群描述
     * <p> 示例值：这是一个群描述
     */
    @SerializedName("group_description")
    private String groupDescription;
    /**
     * 群标签页内容
     * <p> 示例值：文档标签页
     */
    @SerializedName("group_tab_content")
    private String groupTabContent;
    /**
     * 文件名称
     * <p> 示例值：文件1
     */
    @SerializedName("file_name")
    private String fileName;
    /**
     * 文件key
     * <p> 示例值：key-skjfldljbf
     */
    @SerializedName("file_key")
    private String fileKey;
    /**
     * 文档所有者名称
     * <p> 示例值：王五
     */
    @SerializedName("document_owner_name")
    private String documentOwnerName;
    /**
     * 文档所有者ID
     * <p> 示例值：93743293493
     */
    @SerializedName("document_owner_id")
    private String documentOwnerId;
    /**
     * 文档名称
     * <p> 示例值：文档名称一
     */
    @SerializedName("document_name")
    private String documentName;
    /**
     * 云文档类型，如文档、电子表格等
     * <p> 示例值：doc
     */
    @SerializedName("document_type")
    private String documentType;
    /**
     * 文档链接
     * <p> 示例值：http://example.test/testdoc
     */
    @SerializedName("document_link")
    private String documentLink;
    /**
     * 证据详情
     * <p> 示例值：
     */
    @SerializedName("evidence_detail")
    private DlpEvidenceDetail evidenceDetail;
    /**
     * 命中策略
     * <p> 示例值：
     */
    @SerializedName("hit_policies")
    private DlpHitPolicy[] hitPolicies;
    /**
     * 文件token
     * <p> 示例值：token-aaddtken
     */
    @SerializedName("file_token")
    private String fileToken;

    // builder 开始
    public DlpExecuteLog() {
    }

    public DlpExecuteLog(Builder builder) {
        /**
         * 应用业务线
         * <p> 示例值：即时消息
         */
        this.applicableService = builder.applicableService;
        /**
         * 用户名
         * <p> 示例值：张三
         */
        this.userName = builder.userName;
        /**
         * 用户id
         * <p> 示例值：934791734918
         */
        this.userId = builder.userId;
        /**
         * 触发条件
         * <p> 示例值：下载/打印
         */
        this.trigger = builder.trigger;
        /**
         * 时间
         * <p> 示例值：16894002
         */
        this.time = builder.time;
        /**
         * 系统执行动作
         * <p> 示例值：拦截
         */
        this.systemAction = builder.systemAction;
        /**
         * 消息发送者名称
         * <p> 示例值：张三
         */
        this.senderName = builder.senderName;
        /**
         * 消息发送者ID
         * <p> 示例值：983749203223
         */
        this.senderId = builder.senderId;
        /**
         * 消息接收者名称
         * <p> 示例值：李四
         */
        this.recipientName = builder.recipientName;
        /**
         * 消息接收者ID
         * <p> 示例值：96382734927001
         */
        this.recipientId = builder.recipientId;
        /**
         * 会话名称
         * <p> 示例值：张三的群聊
         */
        this.chatName = builder.chatName;
        /**
         * 会话ID
         * <p> 示例值：9374819371047
         */
        this.chatId = builder.chatId;
        /**
         * 消息ID
         * <p> 示例值：9237481847832
         */
        this.messageId = builder.messageId;
        /**
         * 消息内容
         * <p> 示例值：这是一则消息
         */
        this.messageContent = builder.messageContent;
        /**
         * 群昵称
         * <p> 示例值：李四的昵称
         */
        this.aliasIngroup = builder.aliasIngroup;
        /**
         * 群描述
         * <p> 示例值：这是一个群描述
         */
        this.groupDescription = builder.groupDescription;
        /**
         * 群标签页内容
         * <p> 示例值：文档标签页
         */
        this.groupTabContent = builder.groupTabContent;
        /**
         * 文件名称
         * <p> 示例值：文件1
         */
        this.fileName = builder.fileName;
        /**
         * 文件key
         * <p> 示例值：key-skjfldljbf
         */
        this.fileKey = builder.fileKey;
        /**
         * 文档所有者名称
         * <p> 示例值：王五
         */
        this.documentOwnerName = builder.documentOwnerName;
        /**
         * 文档所有者ID
         * <p> 示例值：93743293493
         */
        this.documentOwnerId = builder.documentOwnerId;
        /**
         * 文档名称
         * <p> 示例值：文档名称一
         */
        this.documentName = builder.documentName;
        /**
         * 云文档类型，如文档、电子表格等
         * <p> 示例值：doc
         */
        this.documentType = builder.documentType;
        /**
         * 文档链接
         * <p> 示例值：http://example.test/testdoc
         */
        this.documentLink = builder.documentLink;
        /**
         * 证据详情
         * <p> 示例值：
         */
        this.evidenceDetail = builder.evidenceDetail;
        /**
         * 命中策略
         * <p> 示例值：
         */
        this.hitPolicies = builder.hitPolicies;
        /**
         * 文件token
         * <p> 示例值：token-aaddtken
         */
        this.fileToken = builder.fileToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApplicableService() {
        return this.applicableService;
    }

    public void setApplicableService(String applicableService) {
        this.applicableService = applicableService;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTrigger() {
        return this.trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSystemAction() {
        return this.systemAction;
    }

    public void setSystemAction(String systemAction) {
        this.systemAction = systemAction;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getRecipientName() {
        return this.recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientId() {
        return this.recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getChatName() {
        return this.chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageContent() {
        return this.messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getAliasIngroup() {
        return this.aliasIngroup;
    }

    public void setAliasIngroup(String aliasIngroup) {
        this.aliasIngroup = aliasIngroup;
    }

    public String getGroupDescription() {
        return this.groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public String getGroupTabContent() {
        return this.groupTabContent;
    }

    public void setGroupTabContent(String groupTabContent) {
        this.groupTabContent = groupTabContent;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileKey() {
        return this.fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    public String getDocumentOwnerName() {
        return this.documentOwnerName;
    }

    public void setDocumentOwnerName(String documentOwnerName) {
        this.documentOwnerName = documentOwnerName;
    }

    public String getDocumentOwnerId() {
        return this.documentOwnerId;
    }

    public void setDocumentOwnerId(String documentOwnerId) {
        this.documentOwnerId = documentOwnerId;
    }

    public String getDocumentName() {
        return this.documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentType() {
        return this.documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentLink() {
        return this.documentLink;
    }

    public void setDocumentLink(String documentLink) {
        this.documentLink = documentLink;
    }

    public DlpEvidenceDetail getEvidenceDetail() {
        return this.evidenceDetail;
    }

    public void setEvidenceDetail(DlpEvidenceDetail evidenceDetail) {
        this.evidenceDetail = evidenceDetail;
    }

    public DlpHitPolicy[] getHitPolicies() {
        return this.hitPolicies;
    }

    public void setHitPolicies(DlpHitPolicy[] hitPolicies) {
        this.hitPolicies = hitPolicies;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public static class Builder {
        /**
         * 应用业务线
         * <p> 示例值：即时消息
         */
        private String applicableService;
        /**
         * 用户名
         * <p> 示例值：张三
         */
        private String userName;
        /**
         * 用户id
         * <p> 示例值：934791734918
         */
        private String userId;
        /**
         * 触发条件
         * <p> 示例值：下载/打印
         */
        private String trigger;
        /**
         * 时间
         * <p> 示例值：16894002
         */
        private String time;
        /**
         * 系统执行动作
         * <p> 示例值：拦截
         */
        private String systemAction;
        /**
         * 消息发送者名称
         * <p> 示例值：张三
         */
        private String senderName;
        /**
         * 消息发送者ID
         * <p> 示例值：983749203223
         */
        private String senderId;
        /**
         * 消息接收者名称
         * <p> 示例值：李四
         */
        private String recipientName;
        /**
         * 消息接收者ID
         * <p> 示例值：96382734927001
         */
        private String recipientId;
        /**
         * 会话名称
         * <p> 示例值：张三的群聊
         */
        private String chatName;
        /**
         * 会话ID
         * <p> 示例值：9374819371047
         */
        private String chatId;
        /**
         * 消息ID
         * <p> 示例值：9237481847832
         */
        private String messageId;
        /**
         * 消息内容
         * <p> 示例值：这是一则消息
         */
        private String messageContent;
        /**
         * 群昵称
         * <p> 示例值：李四的昵称
         */
        private String aliasIngroup;
        /**
         * 群描述
         * <p> 示例值：这是一个群描述
         */
        private String groupDescription;
        /**
         * 群标签页内容
         * <p> 示例值：文档标签页
         */
        private String groupTabContent;
        /**
         * 文件名称
         * <p> 示例值：文件1
         */
        private String fileName;
        /**
         * 文件key
         * <p> 示例值：key-skjfldljbf
         */
        private String fileKey;
        /**
         * 文档所有者名称
         * <p> 示例值：王五
         */
        private String documentOwnerName;
        /**
         * 文档所有者ID
         * <p> 示例值：93743293493
         */
        private String documentOwnerId;
        /**
         * 文档名称
         * <p> 示例值：文档名称一
         */
        private String documentName;
        /**
         * 云文档类型，如文档、电子表格等
         * <p> 示例值：doc
         */
        private String documentType;
        /**
         * 文档链接
         * <p> 示例值：http://example.test/testdoc
         */
        private String documentLink;
        /**
         * 证据详情
         * <p> 示例值：
         */
        private DlpEvidenceDetail evidenceDetail;
        /**
         * 命中策略
         * <p> 示例值：
         */
        private DlpHitPolicy[] hitPolicies;
        /**
         * 文件token
         * <p> 示例值：token-aaddtken
         */
        private String fileToken;

        /**
         * 应用业务线
         * <p> 示例值：即时消息
         *
         * @param applicableService
         * @return
         */
        public Builder applicableService(String applicableService) {
            this.applicableService = applicableService;
            return this;
        }


        /**
         * 用户名
         * <p> 示例值：张三
         *
         * @param userName
         * @return
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }


        /**
         * 用户id
         * <p> 示例值：934791734918
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 触发条件
         * <p> 示例值：下载/打印
         *
         * @param trigger
         * @return
         */
        public Builder trigger(String trigger) {
            this.trigger = trigger;
            return this;
        }


        /**
         * 时间
         * <p> 示例值：16894002
         *
         * @param time
         * @return
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }


        /**
         * 系统执行动作
         * <p> 示例值：拦截
         *
         * @param systemAction
         * @return
         */
        public Builder systemAction(String systemAction) {
            this.systemAction = systemAction;
            return this;
        }


        /**
         * 消息发送者名称
         * <p> 示例值：张三
         *
         * @param senderName
         * @return
         */
        public Builder senderName(String senderName) {
            this.senderName = senderName;
            return this;
        }


        /**
         * 消息发送者ID
         * <p> 示例值：983749203223
         *
         * @param senderId
         * @return
         */
        public Builder senderId(String senderId) {
            this.senderId = senderId;
            return this;
        }


        /**
         * 消息接收者名称
         * <p> 示例值：李四
         *
         * @param recipientName
         * @return
         */
        public Builder recipientName(String recipientName) {
            this.recipientName = recipientName;
            return this;
        }


        /**
         * 消息接收者ID
         * <p> 示例值：96382734927001
         *
         * @param recipientId
         * @return
         */
        public Builder recipientId(String recipientId) {
            this.recipientId = recipientId;
            return this;
        }


        /**
         * 会话名称
         * <p> 示例值：张三的群聊
         *
         * @param chatName
         * @return
         */
        public Builder chatName(String chatName) {
            this.chatName = chatName;
            return this;
        }


        /**
         * 会话ID
         * <p> 示例值：9374819371047
         *
         * @param chatId
         * @return
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }


        /**
         * 消息ID
         * <p> 示例值：9237481847832
         *
         * @param messageId
         * @return
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }


        /**
         * 消息内容
         * <p> 示例值：这是一则消息
         *
         * @param messageContent
         * @return
         */
        public Builder messageContent(String messageContent) {
            this.messageContent = messageContent;
            return this;
        }


        /**
         * 群昵称
         * <p> 示例值：李四的昵称
         *
         * @param aliasIngroup
         * @return
         */
        public Builder aliasIngroup(String aliasIngroup) {
            this.aliasIngroup = aliasIngroup;
            return this;
        }


        /**
         * 群描述
         * <p> 示例值：这是一个群描述
         *
         * @param groupDescription
         * @return
         */
        public Builder groupDescription(String groupDescription) {
            this.groupDescription = groupDescription;
            return this;
        }


        /**
         * 群标签页内容
         * <p> 示例值：文档标签页
         *
         * @param groupTabContent
         * @return
         */
        public Builder groupTabContent(String groupTabContent) {
            this.groupTabContent = groupTabContent;
            return this;
        }


        /**
         * 文件名称
         * <p> 示例值：文件1
         *
         * @param fileName
         * @return
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }


        /**
         * 文件key
         * <p> 示例值：key-skjfldljbf
         *
         * @param fileKey
         * @return
         */
        public Builder fileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }


        /**
         * 文档所有者名称
         * <p> 示例值：王五
         *
         * @param documentOwnerName
         * @return
         */
        public Builder documentOwnerName(String documentOwnerName) {
            this.documentOwnerName = documentOwnerName;
            return this;
        }


        /**
         * 文档所有者ID
         * <p> 示例值：93743293493
         *
         * @param documentOwnerId
         * @return
         */
        public Builder documentOwnerId(String documentOwnerId) {
            this.documentOwnerId = documentOwnerId;
            return this;
        }


        /**
         * 文档名称
         * <p> 示例值：文档名称一
         *
         * @param documentName
         * @return
         */
        public Builder documentName(String documentName) {
            this.documentName = documentName;
            return this;
        }


        /**
         * 云文档类型，如文档、电子表格等
         * <p> 示例值：doc
         *
         * @param documentType
         * @return
         */
        public Builder documentType(String documentType) {
            this.documentType = documentType;
            return this;
        }


        /**
         * 文档链接
         * <p> 示例值：http://example.test/testdoc
         *
         * @param documentLink
         * @return
         */
        public Builder documentLink(String documentLink) {
            this.documentLink = documentLink;
            return this;
        }


        /**
         * 证据详情
         * <p> 示例值：
         *
         * @param evidenceDetail
         * @return
         */
        public Builder evidenceDetail(DlpEvidenceDetail evidenceDetail) {
            this.evidenceDetail = evidenceDetail;
            return this;
        }


        /**
         * 命中策略
         * <p> 示例值：
         *
         * @param hitPolicies
         * @return
         */
        public Builder hitPolicies(DlpHitPolicy[] hitPolicies) {
            this.hitPolicies = hitPolicies;
            return this;
        }


        /**
         * 文件token
         * <p> 示例值：token-aaddtken
         *
         * @param fileToken
         * @return
         */
        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }


        public DlpExecuteLog build() {
            return new DlpExecuteLog(this);
        }
    }
}
