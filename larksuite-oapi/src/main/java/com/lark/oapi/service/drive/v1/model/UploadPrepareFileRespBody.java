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

public class UploadPrepareFileRespBody {

  /**
   * 分片上传事务ID
   * <p> 示例值：7111211691345512356
   */
  @SerializedName("upload_id")
  private String uploadId;
  /**
   * 分片大小策略
   * <p> 示例值：4194304
   */
  @SerializedName("block_size")
  private Integer blockSize;
  /**
   * 分片数量
   * <p> 示例值：1
   */
  @SerializedName("block_num")
  private Integer blockNum;

  public String getUploadId() {
    return this.uploadId;
  }

  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }

  public Integer getBlockSize() {
    return this.blockSize;
  }

  public void setBlockSize(Integer blockSize) {
    this.blockSize = blockSize;
  }

  public Integer getBlockNum() {
    return this.blockNum;
  }

  public void setBlockNum(Integer blockNum) {
    this.blockNum = blockNum;
  }

}
