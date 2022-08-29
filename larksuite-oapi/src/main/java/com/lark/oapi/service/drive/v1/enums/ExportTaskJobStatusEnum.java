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

package com.lark.oapi.service.drive.v1.enums;

/**
 * 任务状态
 */
public enum ExportTaskJobStatusEnum {
  SUCCESS(0), // 成功
  NEW(1), // 初始化
  PROCESSING(2), // 处理中
  INTERNALERROR(3), // 内部错误
  EXPORTSIZELIMIT(107), // 导出文档过大
  TIMEOUT(108), // 处理超时
  INTERNALERROR1(109), // 内部错误
  NOPERMISSION(110), // 无权限
  DOCSDELETED(111), // 导出文档已删除
  EXPORTDENIEDONCOPYING(122), // 创建副本中禁止导出
  DOCSNOTEXIST(123), // 导出文档不存在
  EXPORTIMAGESEXCEEDLIMIT(6000), // 导出文档图片太多
  ;
  private Integer value;

  ExportTaskJobStatusEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return this.value;
  }
}