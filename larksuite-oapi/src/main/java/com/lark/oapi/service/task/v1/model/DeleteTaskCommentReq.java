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

package com.lark.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class DeleteTaskCommentReq {
    /**
     * 任务ID
     * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
     */
    @Path
    @SerializedName("task_id")
    private String taskId;
    /**
     * 评论ID
     * <p> 示例值：6937231762296684564
     */
    @Path
    @SerializedName("comment_id")
    private String commentId;

    // builder 开始
    public DeleteTaskCommentReq() {
    }

    public DeleteTaskCommentReq(Builder builder) {
        /**
         * 任务ID
         * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
         */
        this.taskId = builder.taskId;
        /**
         * 评论ID
         * <p> 示例值：6937231762296684564
         */
        this.commentId = builder.commentId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public static class Builder {

        private String taskId; // 任务ID
        private String commentId; // 评论ID

        /**
         * 任务ID
         * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
         *
         * @param taskId
         * @return
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }


        /**
         * 评论ID
         * <p> 示例值：6937231762296684564
         *
         * @param commentId
         * @return
         */
        public Builder commentId(String commentId) {
            this.commentId = commentId;
            return this;
        }

        public DeleteTaskCommentReq build() {
            return new DeleteTaskCommentReq(this);
        }
    }
}
