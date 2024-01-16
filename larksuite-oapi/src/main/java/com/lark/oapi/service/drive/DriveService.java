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
package com.lark.oapi.service.drive;

import com.lark.oapi.core.Config;
import com.lark.oapi.event.IEventHandler;
import com.lark.oapi.service.drive.v1.V1;
import com.lark.oapi.service.drive.v1.model.*;
import com.lark.oapi.service.drive.v1.resource.ExportTask;
import com.lark.oapi.service.drive.v1.resource.File;
import com.lark.oapi.service.drive.v1.resource.FileComment;
import com.lark.oapi.service.drive.v1.resource.FileCommentReply;
import com.lark.oapi.service.drive.v1.resource.FileStatistics;
import com.lark.oapi.service.drive.v1.resource.FileSubscription;
import com.lark.oapi.service.drive.v1.resource.FileViewRecord;
import com.lark.oapi.service.drive.v1.resource.ImportTask;
import com.lark.oapi.service.drive.v1.resource.Media;
import com.lark.oapi.service.drive.v1.resource.Meta;
import com.lark.oapi.service.drive.v1.resource.PermissionPublic;
import com.lark.oapi.service.drive.v1.resource.PermissionPublicPassword;
import com.lark.oapi.service.drive.v1.resource.*;
import com.lark.oapi.service.drive.v2.V2;

public class DriveService {
    private final V1 v1;
    private final ExportTask exportTask; // 导出
    private final File file; // 异步任务状态
    private final FileComment fileComment; // 评论
    private final FileCommentReply fileCommentReply; // 评论
    private final FileStatistics fileStatistics; // file.statistics
    private final FileSubscription fileSubscription; // 订阅
    private final FileVersion fileVersion; // 文档版本
    private final FileViewRecord fileViewRecord; // file.view_record
    private final ImportTask importTask; // 导入
    private final Media media; // 素材
    private final Meta meta; // meta
    private final PermissionMember permissionMember; // 成员
    private final PermissionPublic permissionPublic; // 设置
    private final PermissionPublicPassword permissionPublicPassword; // permission.public.password
    private final V2 v2;

    public DriveService(Config config) {
        this.v1 = new V1(config);
        this.exportTask = new ExportTask(config);
        this.file = new File(config);
        this.fileComment = new FileComment(config);
        this.fileCommentReply = new FileCommentReply(config);
        this.fileStatistics = new FileStatistics(config);
        this.fileSubscription = new FileSubscription(config);
        this.fileVersion = new FileVersion(config);
        this.fileViewRecord = new FileViewRecord(config);
        this.importTask = new ImportTask(config);
        this.media = new Media(config);
        this.meta = new Meta(config);
        this.permissionMember = new PermissionMember(config);
        this.permissionPublic = new PermissionPublic(config);
        this.permissionPublicPassword = new PermissionPublicPassword(config);
        this.v2 = new V2(config);
    }

    public V1 v1() {
        return v1;
    }

    public ExportTask exportTask() {
        return exportTask;
    }

    public File file() {
        return file;
    }

    public FileComment fileComment() {
        return fileComment;
    }

    public FileCommentReply fileCommentReply() {
        return fileCommentReply;
    }

    public FileStatistics fileStatistics() {
        return fileStatistics;
    }

    public FileSubscription fileSubscription() {
        return fileSubscription;
    }

    public FileVersion fileVersion() {
        return fileVersion;
    }

    public FileViewRecord fileViewRecord() {
        return fileViewRecord;
    }

    public ImportTask importTask() {
        return importTask;
    }

    public Media media() {
        return media;
    }

    public Meta meta() {
        return meta;
    }

    public PermissionMember permissionMember() {
        return permissionMember;
    }

    public PermissionPublic permissionPublic() {
        return permissionPublic;
    }

    public PermissionPublicPassword permissionPublicPassword() {
        return permissionPublicPassword;
    }

    public V2 v2() {
        return v2;
    }

    public abstract static class P2FileBitableFieldChangedV1Handler implements IEventHandler<P2FileBitableFieldChangedV1> {
        @Override
        public P2FileBitableFieldChangedV1 getEvent() {
            return new P2FileBitableFieldChangedV1();
        }
    }

    public abstract static class P2FileDeletedV1Handler implements IEventHandler<P2FileDeletedV1> {
        @Override
        public P2FileDeletedV1 getEvent() {
            return new P2FileDeletedV1();
        }
    }

    public abstract static class P2FileEditV1Handler implements IEventHandler<P2FileEditV1> {
        @Override
        public P2FileEditV1 getEvent() {
            return new P2FileEditV1();
        }
    }

    public abstract static class P2FilePermissionMemberAddedV1Handler implements IEventHandler<P2FilePermissionMemberAddedV1> {
        @Override
        public P2FilePermissionMemberAddedV1 getEvent() {
            return new P2FilePermissionMemberAddedV1();
        }
    }

    public abstract static class P2FilePermissionMemberRemovedV1Handler implements IEventHandler<P2FilePermissionMemberRemovedV1> {
        @Override
        public P2FilePermissionMemberRemovedV1 getEvent() {
            return new P2FilePermissionMemberRemovedV1();
        }
    }

    public abstract static class P2FileReadV1Handler implements IEventHandler<P2FileReadV1> {
        @Override
        public P2FileReadV1 getEvent() {
            return new P2FileReadV1();
        }
    }

    public abstract static class P2FileTitleUpdatedV1Handler implements IEventHandler<P2FileTitleUpdatedV1> {
        @Override
        public P2FileTitleUpdatedV1 getEvent() {
            return new P2FileTitleUpdatedV1();
        }
    }

    public abstract static class P2FileTrashedV1Handler implements IEventHandler<P2FileTrashedV1> {
        @Override
        public P2FileTrashedV1 getEvent() {
            return new P2FileTrashedV1();
        }
    }
}