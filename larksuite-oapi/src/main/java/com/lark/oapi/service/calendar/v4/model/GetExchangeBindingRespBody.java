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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class GetExchangeBindingRespBody {

  /**
   * admin账户
   * <p> 示例值：
   */
  @SerializedName("admin_account")
  private String adminAccount;
  /**
   * 用户绑定的Exchange账户
   * <p> 示例值：
   */
  @SerializedName("exchange_account")
  private String exchangeAccount;
  /**
   * Exchange账户绑定user唯一标识id
   * <p> 示例值：
   */
  @SerializedName("user_id")
  private String userId;
  /**
   * Exchange账户同步状态
   * <p> 示例值：
   */
  @SerializedName("status")
  private String status;
  /**
   * Exchange绑定关系唯一标识ID
   * <p> 示例值：
   */
  @SerializedName("exchange_binding_id")
  private String exchangeBindingId;

  public String getAdminAccount() {
    return this.adminAccount;
  }

  public void setAdminAccount(String adminAccount) {
    this.adminAccount = adminAccount;
  }

  public String getExchangeAccount() {
    return this.exchangeAccount;
  }

  public void setExchangeAccount(String exchangeAccount) {
    this.exchangeAccount = exchangeAccount;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getExchangeBindingId() {
    return this.exchangeBindingId;
  }

  public void setExchangeBindingId(String exchangeBindingId) {
    this.exchangeBindingId = exchangeBindingId;
  }

}
