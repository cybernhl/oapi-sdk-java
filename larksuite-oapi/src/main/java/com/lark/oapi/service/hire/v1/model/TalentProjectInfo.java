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

public class TalentProjectInfo {

  /**
   * ID
   * <p> 示例值：6891560630172518670
   */
  @SerializedName("id")
  private String id;
  /**
   * 项目名称
   * <p> 示例值：测试
   */
  @SerializedName("name")
  private String name;
  /**
   * 项目角色
   * <p> 示例值：test
   */
  @SerializedName("role")
  private String role;
  /**
   * 项目链接
   * <p> 示例值：www.test.com
   */
  @SerializedName("link")
  private String link;
  /**
   * 描述
   * <p> 示例值：test
   */
  @SerializedName("desc")
  private String desc;
  /**
   * 开始时间
   * <p> 示例值：1990-01
   */
  @SerializedName("start_time")
  private String startTime;
  /**
   * 结束时间
   * <p> 示例值：1991-01
   */
  @SerializedName("end_time")
  private String endTime;
  /**
   * 自定义字段
   * <p> 示例值：
   */
  @SerializedName("customized_data_list")
  private TalentCustomizedDataChild[] customizedDataList;

  // builder 开始
  public TalentProjectInfo() {
  }

  public TalentProjectInfo(Builder builder) {
    /**
     * ID
     * <p> 示例值：6891560630172518670
     */
    this.id = builder.id;
    /**
     * 项目名称
     * <p> 示例值：测试
     */
    this.name = builder.name;
    /**
     * 项目角色
     * <p> 示例值：test
     */
    this.role = builder.role;
    /**
     * 项目链接
     * <p> 示例值：www.test.com
     */
    this.link = builder.link;
    /**
     * 描述
     * <p> 示例值：test
     */
    this.desc = builder.desc;
    /**
     * 开始时间
     * <p> 示例值：1990-01
     */
    this.startTime = builder.startTime;
    /**
     * 结束时间
     * <p> 示例值：1991-01
     */
    this.endTime = builder.endTime;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    this.customizedDataList = builder.customizedDataList;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
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

  public String getLink() {
    return this.link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getDesc() {
    return this.desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
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

  public TalentCustomizedDataChild[] getCustomizedDataList() {
    return this.customizedDataList;
  }

  public void setCustomizedDataList(TalentCustomizedDataChild[] customizedDataList) {
    this.customizedDataList = customizedDataList;
  }

  public static class Builder {

    /**
     * ID
     * <p> 示例值：6891560630172518670
     */
    private String id;
    /**
     * 项目名称
     * <p> 示例值：测试
     */
    private String name;
    /**
     * 项目角色
     * <p> 示例值：test
     */
    private String role;
    /**
     * 项目链接
     * <p> 示例值：www.test.com
     */
    private String link;
    /**
     * 描述
     * <p> 示例值：test
     */
    private String desc;
    /**
     * 开始时间
     * <p> 示例值：1990-01
     */
    private String startTime;
    /**
     * 结束时间
     * <p> 示例值：1991-01
     */
    private String endTime;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    private TalentCustomizedDataChild[] customizedDataList;

    /**
     * ID
     * <p> 示例值：6891560630172518670
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 项目名称
     * <p> 示例值：测试
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
     * <p> 示例值：test
     *
     * @param role
     * @return
     */
    public Builder role(String role) {
      this.role = role;
      return this;
    }


    /**
     * 项目链接
     * <p> 示例值：www.test.com
     *
     * @param link
     * @return
     */
    public Builder link(String link) {
      this.link = link;
      return this;
    }


    /**
     * 描述
     * <p> 示例值：test
     *
     * @param desc
     * @return
     */
    public Builder desc(String desc) {
      this.desc = desc;
      return this;
    }


    /**
     * 开始时间
     * <p> 示例值：1990-01
     *
     * @param startTime
     * @return
     */
    public Builder startTime(String startTime) {
      this.startTime = startTime;
      return this;
    }


    /**
     * 结束时间
     * <p> 示例值：1991-01
     *
     * @param endTime
     * @return
     */
    public Builder endTime(String endTime) {
      this.endTime = endTime;
      return this;
    }


    /**
     * 自定义字段
     * <p> 示例值：
     *
     * @param customizedDataList
     * @return
     */
    public Builder customizedDataList(TalentCustomizedDataChild[] customizedDataList) {
      this.customizedDataList = customizedDataList;
      return this;
    }


    public TalentProjectInfo build() {
      return new TalentProjectInfo(this);
    }
  }
}