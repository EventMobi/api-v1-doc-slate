/**
 * eventmobi
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: api-v2
 * Contact: support@cloud-elements.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * CustomFieldsValues
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-25T16:18:19.244-04:00")
public class CustomFieldsValues   {
  @SerializedName("field_id")
  private String fieldId = null;

  @SerializedName("event_id")
  private String eventId = null;

  @SerializedName("deleted")
  private String deleted = null;

  @SerializedName("visibility")
  private String visibility = null;

  @SerializedName("section_id")
  private String sectionId = null;

  @SerializedName("type_id")
  private String typeId = null;

  @SerializedName("owner_id")
  private String ownerId = null;

  @SerializedName("edit_permissions")
  private String editPermissions = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("owner_type")
  private String ownerType = null;

  public CustomFieldsValues fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Get fieldId
   * @return fieldId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public CustomFieldsValues eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public CustomFieldsValues deleted(String deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDeleted() {
    return deleted;
  }

  public void setDeleted(String deleted) {
    this.deleted = deleted;
  }

  public CustomFieldsValues visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public CustomFieldsValues sectionId(String sectionId) {
    this.sectionId = sectionId;
    return this;
  }

   /**
   * Get sectionId
   * @return sectionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSectionId() {
    return sectionId;
  }

  public void setSectionId(String sectionId) {
    this.sectionId = sectionId;
  }

  public CustomFieldsValues typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public CustomFieldsValues ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public CustomFieldsValues editPermissions(String editPermissions) {
    this.editPermissions = editPermissions;
    return this;
  }

   /**
   * Get editPermissions
   * @return editPermissions
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEditPermissions() {
    return editPermissions;
  }

  public void setEditPermissions(String editPermissions) {
    this.editPermissions = editPermissions;
  }

  public CustomFieldsValues name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomFieldsValues id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomFieldsValues value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public CustomFieldsValues ownerType(String ownerType) {
    this.ownerType = ownerType;
    return this;
  }

   /**
   * Get ownerType
   * @return ownerType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldsValues customFieldsValues = (CustomFieldsValues) o;
    return Objects.equals(this.fieldId, customFieldsValues.fieldId) &&
        Objects.equals(this.eventId, customFieldsValues.eventId) &&
        Objects.equals(this.deleted, customFieldsValues.deleted) &&
        Objects.equals(this.visibility, customFieldsValues.visibility) &&
        Objects.equals(this.sectionId, customFieldsValues.sectionId) &&
        Objects.equals(this.typeId, customFieldsValues.typeId) &&
        Objects.equals(this.ownerId, customFieldsValues.ownerId) &&
        Objects.equals(this.editPermissions, customFieldsValues.editPermissions) &&
        Objects.equals(this.name, customFieldsValues.name) &&
        Objects.equals(this.id, customFieldsValues.id) &&
        Objects.equals(this.value, customFieldsValues.value) &&
        Objects.equals(this.ownerType, customFieldsValues.ownerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, eventId, deleted, visibility, sectionId, typeId, ownerId, editPermissions, name, id, value, ownerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldsValues {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    editPermissions: ").append(toIndentedString(editPermissions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

