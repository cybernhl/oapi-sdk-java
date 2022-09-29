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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;

public class GetTicketCustomizedFieldRespBody {

  /**
   * ticket customized field id
   * <p> 示例值：
   */
  @SerializedName("ticket_customized_field_id")
  private String ticketCustomizedFieldId;
  /**
   * help desk id
   * <p> 示例值：
   */
  @SerializedName("helpdesk_id")
  private String helpdeskId;
  /**
   * key name
   * <p> 示例值：
   */
  @SerializedName("key_name")
  private String keyName;
  /**
   * display name
   * <p> 示例值：
   */
  @SerializedName("display_name")
  private String displayName;
  /**
   * the position of ticket customized field in the page
   * <p> 示例值：
   */
  @SerializedName("position")
  private String position;
  /**
   * type of the field
   * <p> 示例值：
   */
  @SerializedName("field_type")
  private String fieldType;
  /**
   * description of the field
   * <p> 示例值：
   */
  @SerializedName("description")
  private String description;
  /**
   * if the field is visible
   * <p> 示例值：
   */
  @SerializedName("visible")
  private Boolean visible;
  /**
   * if the field is editable
   * <p> 示例值：
   */
  @SerializedName("editable")
  private Boolean editable;
  /**
   * if the field is required
   * <p> 示例值：
   */
  @SerializedName("required")
  private Boolean required;
  /**
   * the time when the field is created
   * <p> 示例值：
   */
  @SerializedName("created_at")
  private String createdAt;
  /**
   * the time when the field is updated
   * <p> 示例值：
   */
  @SerializedName("updated_at")
  private String updatedAt;
  /**
   * the user who created the ticket customized field
   * <p> 示例值：
   */
  @SerializedName("created_by")
  private TicketUser createdBy;
  /**
   * the user who recently updated the ticket customized field
   * <p> 示例值：
   */
  @SerializedName("updated_by")
  private TicketUser updatedBy;
  /**
   * if the dropdown field supports multi-select
   * <p> 示例值：
   */
  @SerializedName("dropdown_allow_multiple")
  private Boolean dropdownAllowMultiple;

  public String getTicketCustomizedFieldId() {
    return this.ticketCustomizedFieldId;
  }

  public void setTicketCustomizedFieldId(String ticketCustomizedFieldId) {
    this.ticketCustomizedFieldId = ticketCustomizedFieldId;
  }

  public String getHelpdeskId() {
    return this.helpdeskId;
  }

  public void setHelpdeskId(String helpdeskId) {
    this.helpdeskId = helpdeskId;
  }

  public String getKeyName() {
    return this.keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getPosition() {
    return this.position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getFieldType() {
    return this.fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getVisible() {
    return this.visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public Boolean getEditable() {
    return this.editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public Boolean getRequired() {
    return this.required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public String getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public TicketUser getCreatedBy() {
    return this.createdBy;
  }

  public void setCreatedBy(TicketUser createdBy) {
    this.createdBy = createdBy;
  }

  public TicketUser getUpdatedBy() {
    return this.updatedBy;
  }

  public void setUpdatedBy(TicketUser updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Boolean getDropdownAllowMultiple() {
    return this.dropdownAllowMultiple;
  }

  public void setDropdownAllowMultiple(Boolean dropdownAllowMultiple) {
    this.dropdownAllowMultiple = dropdownAllowMultiple;
  }

}