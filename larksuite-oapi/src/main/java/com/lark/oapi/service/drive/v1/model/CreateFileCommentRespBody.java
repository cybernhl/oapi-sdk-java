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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateFileCommentRespBody {

  /**
   * 评论ID
   * <p> 示例值：
   */
  @SerializedName("comment_id")
  private String commentId;
  /**
   * 用户ID
   * <p> 示例值：
   */
  @SerializedName("user_id")
  private String userId;
  /**
   * 创建时间
   * <p> 示例值：
   */
  @SerializedName("create_time")
  private Integer createTime;
  /**
   * 更新时间
   * <p> 示例值：
   */
  @SerializedName("update_time")
  private Integer updateTime;
  /**
   * 是否已解决
   * <p> 示例值：
   */
  @SerializedName("is_solved")
  private Boolean isSolved;
  /**
   * 解决评论时间
   * <p> 示例值：
   */
  @SerializedName("solved_time")
  private Integer solvedTime;
  /**
   * 解决评论者的用户ID
   * <p> 示例值：
   */
  @SerializedName("solver_user_id")
  private String solverUserId;
  /**
   * 是否有更多回复
   * <p> 示例值：
   */
  @SerializedName("has_more")
  private Boolean hasMore;
  /**
   * 回复分页标记
   * <p> 示例值：
   */
  @SerializedName("page_token")
  private String pageToken;
  /**
   * 是否是全文评论
   * <p> 示例值：
   */
  @SerializedName("is_whole")
  private Boolean isWhole;
  /**
   * 如果是局部评论，引用字段
   * <p> 示例值：
   */
  @SerializedName("quote")
  private String quote;
  /**
   * 评论里的回复列表
   * <p> 示例值：
   */
  @SerializedName("reply_list")
  private ReplyList replyList;

  public String getCommentId() {
    return this.commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Integer getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public Integer getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(Integer updateTime) {
    this.updateTime = updateTime;
  }

  public Boolean getIsSolved() {
    return this.isSolved;
  }

  public void setIsSolved(Boolean isSolved) {
    this.isSolved = isSolved;
  }

  public Integer getSolvedTime() {
    return this.solvedTime;
  }

  public void setSolvedTime(Integer solvedTime) {
    this.solvedTime = solvedTime;
  }

  public String getSolverUserId() {
    return this.solverUserId;
  }

  public void setSolverUserId(String solverUserId) {
    this.solverUserId = solverUserId;
  }

  public Boolean getHasMore() {
    return this.hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Boolean getIsWhole() {
    return this.isWhole;
  }

  public void setIsWhole(Boolean isWhole) {
    this.isWhole = isWhole;
  }

  public String getQuote() {
    return this.quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }

  public ReplyList getReplyList() {
    return this.replyList;
  }

  public void setReplyList(ReplyList replyList) {
    this.replyList = replyList;
  }

}
