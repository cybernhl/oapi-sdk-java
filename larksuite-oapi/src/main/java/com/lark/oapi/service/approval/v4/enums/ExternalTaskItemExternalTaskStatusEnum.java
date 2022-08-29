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

package com.lark.oapi.service.approval.v4.enums;

/**
 * 审批任务状态
 */
public enum ExternalTaskItemExternalTaskStatusEnum {
  PENDING("PENDING"), // 审批中
  APPROVED("APPROVED"), // 审批流程结束，结果为同意
  REJECTED("REJECTED"), // 审批流程结束，结果为拒绝
  TRANSFERRED("TRANSFERRED"), // 任务转交
  DONE("DONE"), // 任务通过但审批人未操作；审批人看不到这个任务, 若想要看到, 可以通过抄送该人.
  ;
  private String value;

  ExternalTaskItemExternalTaskStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}