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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class GetInstanceRespBody {

  /**
   * 审批名称
   * <p> 示例值：Payment
   */
  @SerializedName("approval_name")
  private String approvalName;
  /**
   * 审批创建时间
   * <p> 示例值：1564590532967
   */
  @SerializedName("start_time")
  private String startTime;
  /**
   * 审批完成时间，未完成为 0
   * <p> 示例值：1564590532967
   */
  @SerializedName("end_time")
  private String endTime;
  /**
   * 发起审批用户
   * <p> 示例值：f3ta757q
   */
  @SerializedName("user_id")
  private String userId;
  /**
   * 发起审批用户 open id
   * <p> 示例值：ou_3cda9c969f737aaa05e6915dce306cb9
   */
  @SerializedName("open_id")
  private String openId;
  /**
   * 审批单编号
   * <p> 示例值：202102060002
   */
  @SerializedName("serial_number")
  private String serialNumber;
  /**
   * 发起审批用户所在部门
   * <p> 示例值：od-8ec33ffec336c3a39a278bc25e931676
   */
  @SerializedName("department_id")
  private String departmentId;
  /**
   * 审批实例状态
   * <p> 示例值：PENDING
   */
  @SerializedName("status")
  private String status;
  /**
   * 用户的唯一标识id
   * <p> 示例值：1234567
   */
  @SerializedName("uuid")
  private String uuid;
  /**
   * json字符串，控件值详情见下方
   * <p> 示例值：[{\"id\": \"widget1\",\"custom_id\": \"user_info\",\"name\": \"Item
   * application\",\"type\": \"textarea\"},\"value\":\"aaaa\"]
   */
  @SerializedName("form")
  private String form;
  /**
   * 审批任务列表
   * <p> 示例值：
   */
  @SerializedName("task_list")
  private InstanceTask[] taskList;
  /**
   * 评论列表
   * <p> 示例值：
   */
  @SerializedName("comment_list")
  private InstanceComment[] commentList;
  /**
   * 审批动态
   * <p> 示例值：
   */
  @SerializedName("timeline")
  private InstanceTimeline[] timeline;
  /**
   * 修改的原实例 code,仅在查询修改实例时显示该字段
   * <p> 示例值：81D31358-93AF-92D6-7425-01A5D67C4E71
   */
  @SerializedName("modified_instance_code")
  private String modifiedInstanceCode;
  /**
   * 撤销的原实例 code,仅在查询撤销实例时显示该字段
   * <p> 示例值：81D31358-93AF-92D6-7425-01A5D67C4E71
   */
  @SerializedName("reverted_instance_code")
  private String revertedInstanceCode;
  /**
   * 审批定义 Code
   * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
   */
  @SerializedName("approval_code")
  private String approvalCode;
  /**
   * 单据是否被撤销
   * <p> 示例值：false
   */
  @SerializedName("reverted")
  private Boolean reverted;

  public String getApprovalName() {
    return this.approvalName;
  }

  public void setApprovalName(String approvalName) {
    this.approvalName = approvalName;
  }

  public String getStartTime() {
    return this.startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return this.endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getOpenId() {
    return this.openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public String getSerialNumber() {
    return this.serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getForm() {
    return this.form;
  }

  public void setForm(String form) {
    this.form = form;
  }

  public InstanceTask[] getTaskList() {
    return this.taskList;
  }

  public void setTaskList(InstanceTask[] taskList) {
    this.taskList = taskList;
  }

  public InstanceComment[] getCommentList() {
    return this.commentList;
  }

  public void setCommentList(InstanceComment[] commentList) {
    this.commentList = commentList;
  }

  public InstanceTimeline[] getTimeline() {
    return this.timeline;
  }

  public void setTimeline(InstanceTimeline[] timeline) {
    this.timeline = timeline;
  }

  public String getModifiedInstanceCode() {
    return this.modifiedInstanceCode;
  }

  public void setModifiedInstanceCode(String modifiedInstanceCode) {
    this.modifiedInstanceCode = modifiedInstanceCode;
  }

  public String getRevertedInstanceCode() {
    return this.revertedInstanceCode;
  }

  public void setRevertedInstanceCode(String revertedInstanceCode) {
    this.revertedInstanceCode = revertedInstanceCode;
  }

  public String getApprovalCode() {
    return this.approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public Boolean getReverted() {
    return this.reverted;
  }

  public void setReverted(Boolean reverted) {
    this.reverted = reverted;
  }

}
