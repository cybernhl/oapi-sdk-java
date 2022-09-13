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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class ProjectInfo {

  /**
   * 描述
   * <p> 示例值：
   */
  @SerializedName("desc")
  private String desc;
  /**
   * 结束时间
   * <p> 示例值：
   */
  @SerializedName("end_time")
  private Integer endTime;
  /**
   * 项目链接
   * <p> 示例值：
   */
  @SerializedName("link")
  private String link;
  /**
   * 项目名称
   * <p> 示例值：
   */
  @SerializedName("name")
  private String name;
  /**
   * 项目角色
   * <p> 示例值：
   */
  @SerializedName("role")
  private String role;
  /**
   * 开始时间
   * <p> 示例值：
   */
  @SerializedName("start_time")
  private Integer startTime;

  // builder 开始
  public ProjectInfo() {
  }

  public ProjectInfo(Builder builder) {
    /**
     * 描述
     * <p> 示例值：
     */
    this.desc = builder.desc;
    /**
     * 结束时间
     * <p> 示例值：
     */
    this.endTime = builder.endTime;
    /**
     * 项目链接
     * <p> 示例值：
     */
    this.link = builder.link;
    /**
     * 项目名称
     * <p> 示例值：
     */
    this.name = builder.name;
    /**
     * 项目角色
     * <p> 示例值：
     */
    this.role = builder.role;
    /**
     * 开始时间
     * <p> 示例值：
     */
    this.startTime = builder.startTime;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getDesc() {
    return this.desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Integer getEndTime() {
    return this.endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public String getLink() {
    return this.link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return this.role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Integer getStartTime() {
    return this.startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public static class Builder {

    /**
     * 描述
     * <p> 示例值：
     */
    private String desc;
    /**
     * 结束时间
     * <p> 示例值：
     */
    private Integer endTime;
    /**
     * 项目链接
     * <p> 示例值：
     */
    private String link;
    /**
     * 项目名称
     * <p> 示例值：
     */
    private String name;
    /**
     * 项目角色
     * <p> 示例值：
     */
    private String role;
    /**
     * 开始时间
     * <p> 示例值：
     */
    private Integer startTime;

    /**
     * 描述
     * <p> 示例值：
     *
     * @param desc
     * @return
     */
    public Builder desc(String desc) {
      this.desc = desc;
      return this;
    }


    /**
     * 结束时间
     * <p> 示例值：
     *
     * @param endTime
     * @return
     */
    public Builder endTime(Integer endTime) {
      this.endTime = endTime;
      return this;
    }


    /**
     * 项目链接
     * <p> 示例值：
     *
     * @param link
     * @return
     */
    public Builder link(String link) {
      this.link = link;
      return this;
    }


    /**
     * 项目名称
     * <p> 示例值：
     *
     * @param name
     * @return
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }


    /**
     * 项目角色
     * <p> 示例值：
     *
     * @param role
     * @return
     */
    public Builder role(String role) {
      this.role = role;
      return this;
    }


    /**
     * 开始时间
     * <p> 示例值：
     *
     * @param startTime
     * @return
     */
    public Builder startTime(Integer startTime) {
      this.startTime = startTime;
      return this;
    }


    public ProjectInfo build() {
      return new ProjectInfo(this);
    }
  }
}