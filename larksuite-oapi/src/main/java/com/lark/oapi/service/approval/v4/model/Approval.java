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

public class Approval {

  /**
   * 审批定义code
   * <p> 示例值：
   */
  @SerializedName("approval_code")
  private String approvalCode;
  /**
   * 审批定义名称
   * <p> 示例值：
   */
  @SerializedName("approval_name")
  private String approvalName;
  /**
   * 审批定义状态
   * <p> 示例值：ACTIVE
   */
  @SerializedName("status")
  private String status;

  // builder 开始
  public Approval() {
  }

  public Approval(Builder builder) {
    /**
     * 审批定义code
     * <p> 示例值：
     */
    this.approvalCode = builder.approvalCode;
    /**
     * 审批定义名称
     * <p> 示例值：
     */
    this.approvalName = builder.approvalName;
    /**
     * 审批定义状态
     * <p> 示例值：ACTIVE
     */
    this.status = builder.status;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getApprovalCode() {
    return this.approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public String getApprovalName() {
    return this.approvalName;
  }

  public void setApprovalName(String approvalName) {
    this.approvalName = approvalName;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public static class Builder {

    /**
     * 审批定义code
     * <p> 示例值：
     */
    private String approvalCode;
    /**
     * 审批定义名称
     * <p> 示例值：
     */
    private String approvalName;
    /**
     * 审批定义状态
     * <p> 示例值：ACTIVE
     */
    private String status;

    /**
     * 审批定义code
     * <p> 示例值：
     *
     * @param approvalCode
     * @return
     */
    public Builder approvalCode(String approvalCode) {
      this.approvalCode = approvalCode;
      return this;
    }


    /**
     * 审批定义名称
     * <p> 示例值：
     *
     * @param approvalName
     * @return
     */
    public Builder approvalName(String approvalName) {
      this.approvalName = approvalName;
      return this;
    }


    /**
     * 审批定义状态
     * <p> 示例值：ACTIVE
     *
     * @param status
     * @return
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * 审批定义状态
     * <p> 示例值：ACTIVE
     *
     * @param status {@link com.lark.oapi.service.approval.v4.enums.ApprovalOpenApiApprovalStatusEnum}
     * @return
     */
    public Builder status(
        com.lark.oapi.service.approval.v4.enums.ApprovalOpenApiApprovalStatusEnum status) {
      this.status = status.getValue();
      return this;
    }


    public Approval build() {
      return new Approval(this);
    }
  }
}
