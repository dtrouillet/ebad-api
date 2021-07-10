/*
 * EBAD API
 * This documentation describe EBAD API.
 *
 * OpenAPI spec version: 2.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * CreationAccreditationRequestDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-10T21:22:29.539Z[GMT]")
public class CreationAccreditationRequestDto {
  @JsonProperty("wantManage")
  private Boolean wantManage = null;

  @JsonProperty("wantUse")
  private Boolean wantUse = null;

  @JsonProperty("applicationId")
  private Long applicationId = null;

  public CreationAccreditationRequestDto wantManage(Boolean wantManage) {
    this.wantManage = wantManage;
    return this;
  }

   /**
   * Get wantManage
   * @return wantManage
  **/
  @Schema(required = true, description = "")
  public Boolean isWantManage() {
    return wantManage;
  }

  public void setWantManage(Boolean wantManage) {
    this.wantManage = wantManage;
  }

  public CreationAccreditationRequestDto wantUse(Boolean wantUse) {
    this.wantUse = wantUse;
    return this;
  }

   /**
   * Get wantUse
   * @return wantUse
  **/
  @Schema(required = true, description = "")
  public Boolean isWantUse() {
    return wantUse;
  }

  public void setWantUse(Boolean wantUse) {
    this.wantUse = wantUse;
  }

  public CreationAccreditationRequestDto applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @Schema(required = true, description = "")
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreationAccreditationRequestDto creationAccreditationRequestDto = (CreationAccreditationRequestDto) o;
    return Objects.equals(this.wantManage, creationAccreditationRequestDto.wantManage) &&
        Objects.equals(this.wantUse, creationAccreditationRequestDto.wantUse) &&
        Objects.equals(this.applicationId, creationAccreditationRequestDto.applicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wantManage, wantUse, applicationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreationAccreditationRequestDto {\n");
    
    sb.append("    wantManage: ").append(toIndentedString(wantManage)).append("\n");
    sb.append("    wantUse: ").append(toIndentedString(wantUse)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
