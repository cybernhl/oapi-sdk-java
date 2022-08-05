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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateFileReqBody {

  @SerializedName("file_type")
  private String fileType;
  @SerializedName("file_name")
  private String fileName;
  @SerializedName("duration")
  private Integer duration;
  @SerializedName("file")
  private java.io.File file;

  // builder 开始
  public CreateFileReqBody() {
  }

  public CreateFileReqBody(Builder builder) {
    this.fileType = builder.fileType;
    this.fileName = builder.fileName;
    this.duration = builder.duration;
    this.file = builder.file;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getFileType() {
    return this.fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Integer getDuration() {
    return this.duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public java.io.File getFile() {
    return this.file;
  }

  public void setFile(java.io.File file) {
    this.file = file;
  }

  public static class Builder {

    private String fileType;
    private String fileName;
    private Integer duration;
    private java.io.File file;

    public Builder fileType(String fileType) {
      this.fileType = fileType;
      return this;
    }

    public Builder fileType(com.lark.oapi.service.im.v1.enums.FileTypeEnum fileType) {
      this.fileType = fileType.getValue();
      return this;
    }

    public Builder fileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    public Builder duration(Integer duration) {
      this.duration = duration;
      return this;
    }

    public Builder file(java.io.File file) {
      this.file = file;
      return this;
    }


    public CreateFileReqBody build() {
      return new CreateFileReqBody(this);
    }
  }
}
