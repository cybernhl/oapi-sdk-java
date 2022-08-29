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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class DepartmentLeader {

  /**
   * 负责人类型
   * <p> 示例值：1
   */
  @SerializedName("leaderType")
  private Integer leaderType;
  /**
   * 负责人ID
   * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
   */
  @SerializedName("leaderID")
  private String leaderID;

  // builder 开始
  public DepartmentLeader() {
  }

  public DepartmentLeader(Builder builder) {
    /**
     * 负责人类型
     * <p> 示例值：1
     */
    this.leaderType = builder.leaderType;
    /**
     * 负责人ID
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    this.leaderID = builder.leaderID;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getLeaderType() {
    return this.leaderType;
  }

  public void setLeaderType(Integer leaderType) {
    this.leaderType = leaderType;
  }

  public String getLeaderID() {
    return this.leaderID;
  }

  public void setLeaderID(String leaderID) {
    this.leaderID = leaderID;
  }

  public static class Builder {

    /**
     * 负责人类型
     * <p> 示例值：1
     */
    private Integer leaderType;
    /**
     * 负责人ID
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    private String leaderID;

    /**
     * 负责人类型
     * <p> 示例值：1
     *
     * @param leaderType
     * @return
     */
    public Builder leaderType(Integer leaderType) {
      this.leaderType = leaderType;
      return this;
    }

    /**
     * 负责人类型
     * <p> 示例值：1
     *
     * @param leaderType {@link com.lark.oapi.service.contact.v3.enums.DepartmentLeaderDepartmentLeaderTypeEnum}
     * @return
     */
    public Builder leaderType(
        com.lark.oapi.service.contact.v3.enums.DepartmentLeaderDepartmentLeaderTypeEnum leaderType) {
      this.leaderType = leaderType.getValue();
      return this;
    }


    /**
     * 负责人ID
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     *
     * @param leaderID
     * @return
     */
    public Builder leaderID(String leaderID) {
      this.leaderID = leaderID;
      return this;
    }


    public DepartmentLeader build() {
      return new DepartmentLeader(this);
    }
  }
}