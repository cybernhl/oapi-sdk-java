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

public class UploadAllFileReqBody {

  @SerializedName("file_name")
  private String fileName;
  @SerializedName("parent_type")
  private String parentType;
  @SerializedName("parent_node")
  private String parentNode;
  @SerializedName("size")
  private Integer size;
  @SerializedName("checksum")
  private String checksum;
  @SerializedName("file")
  private java.io.File file;

  // builder 开始
  public UploadAllFileReqBody() {
  }

  public UploadAllFileReqBody(Builder builder) {
    this.fileName = builder.fileName;
    this.parentType = builder.parentType;
    this.parentNode = builder.parentNode;
    this.size = builder.size;
    this.checksum = builder.checksum;
    this.file = builder.file;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getParentType() {
    return this.parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  public String getParentNode() {
    return this.parentNode;
  }

  public void setParentNode(String parentNode) {
    this.parentNode = parentNode;
  }

  public Integer getSize() {
    return this.size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public String getChecksum() {
    return this.checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public java.io.File getFile() {
    return this.file;
  }

  public void setFile(java.io.File file) {
    this.file = file;
  }

  public static class Builder {

    private String fileName;
    private String parentType;
    private String parentNode;
    private Integer size;
    private String checksum;
    private java.io.File file;

    public Builder fileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    public Builder parentType(String parentType) {
      this.parentType = parentType;
      return this;
    }

    public Builder parentType(com.lark.oapi.service.drive.v1.enums.ParentTypeEnum parentType) {
      this.parentType = parentType.getValue();
      return this;
    }

    public Builder parentNode(String parentNode) {
      this.parentNode = parentNode;
      return this;
    }

    public Builder size(Integer size) {
      this.size = size;
      return this;
    }

    public Builder checksum(String checksum) {
      this.checksum = checksum;
      return this;
    }

    public Builder file(java.io.File file) {
      this.file = file;
      return this;
    }


    public UploadAllFileReqBody build() {
      return new UploadAllFileReqBody(this);
    }
  }
}
