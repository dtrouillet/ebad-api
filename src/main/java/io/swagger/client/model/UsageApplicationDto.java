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
import io.swagger.client.model.ApplicationDto;
import io.swagger.client.model.UserPublicDto;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * UsageApplicationDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-04T22:32:11.845Z[GMT]")
public class UsageApplicationDto {
  @JsonProperty("user")
  private UserPublicDto user = null;

  @JsonProperty("application")
  private ApplicationDto application = null;

  @JsonProperty("canManage")
  private Boolean canManage = null;

  @JsonProperty("canUse")
  private Boolean canUse = null;

  public UsageApplicationDto user(UserPublicDto user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public UserPublicDto getUser() {
    return user;
  }

  public void setUser(UserPublicDto user) {
    this.user = user;
  }

  public UsageApplicationDto application(ApplicationDto application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @Schema(description = "")
  public ApplicationDto getApplication() {
    return application;
  }

  public void setApplication(ApplicationDto application) {
    this.application = application;
  }

  public UsageApplicationDto canManage(Boolean canManage) {
    this.canManage = canManage;
    return this;
  }

   /**
   * Get canManage
   * @return canManage
  **/
  @Schema(description = "")
  public Boolean isCanManage() {
    return canManage;
  }

  public void setCanManage(Boolean canManage) {
    this.canManage = canManage;
  }

  public UsageApplicationDto canUse(Boolean canUse) {
    this.canUse = canUse;
    return this;
  }

   /**
   * Get canUse
   * @return canUse
  **/
  @Schema(description = "")
  public Boolean isCanUse() {
    return canUse;
  }

  public void setCanUse(Boolean canUse) {
    this.canUse = canUse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageApplicationDto usageApplicationDto = (UsageApplicationDto) o;
    return Objects.equals(this.user, usageApplicationDto.user) &&
        Objects.equals(this.application, usageApplicationDto.application) &&
        Objects.equals(this.canManage, usageApplicationDto.canManage) &&
        Objects.equals(this.canUse, usageApplicationDto.canUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, application, canManage, canUse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageApplicationDto {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    canManage: ").append(toIndentedString(canManage)).append("\n");
    sb.append("    canUse: ").append(toIndentedString(canUse)).append("\n");
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
