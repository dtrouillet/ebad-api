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
import org.joda.time.DateTime;
/**
 * CompleteIdentityDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-04T22:32:11.845Z[GMT]")
public class CompleteIdentityDto {
  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("createdDate")
  private DateTime createdDate = null;

  @JsonProperty("lastModifiedBy")
  private String lastModifiedBy = null;

  @JsonProperty("lastModifiedDate")
  private DateTime lastModifiedDate = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("privatekey")
  private String privatekey = null;

  @JsonProperty("privatekeyPath")
  private String privatekeyPath = null;

  @JsonProperty("passphrase")
  private String passphrase = null;

  @JsonProperty("availableApplication")
  private Long availableApplication = null;

  public CompleteIdentityDto createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public CompleteIdentityDto createdDate(DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @Schema(description = "")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTime createdDate) {
    this.createdDate = createdDate;
  }

  public CompleteIdentityDto lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @Schema(description = "")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public CompleteIdentityDto lastModifiedDate(DateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @Schema(description = "")
  public DateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(DateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public CompleteIdentityDto id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CompleteIdentityDto login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @Schema(required = true, description = "")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public CompleteIdentityDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompleteIdentityDto password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CompleteIdentityDto privatekey(String privatekey) {
    this.privatekey = privatekey;
    return this;
  }

   /**
   * Get privatekey
   * @return privatekey
  **/
  @Schema(description = "")
  public String getPrivatekey() {
    return privatekey;
  }

  public void setPrivatekey(String privatekey) {
    this.privatekey = privatekey;
  }

  public CompleteIdentityDto privatekeyPath(String privatekeyPath) {
    this.privatekeyPath = privatekeyPath;
    return this;
  }

   /**
   * Get privatekeyPath
   * @return privatekeyPath
  **/
  @Schema(description = "")
  public String getPrivatekeyPath() {
    return privatekeyPath;
  }

  public void setPrivatekeyPath(String privatekeyPath) {
    this.privatekeyPath = privatekeyPath;
  }

  public CompleteIdentityDto passphrase(String passphrase) {
    this.passphrase = passphrase;
    return this;
  }

   /**
   * Get passphrase
   * @return passphrase
  **/
  @Schema(description = "")
  public String getPassphrase() {
    return passphrase;
  }

  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }

  public CompleteIdentityDto availableApplication(Long availableApplication) {
    this.availableApplication = availableApplication;
    return this;
  }

   /**
   * Get availableApplication
   * @return availableApplication
  **/
  @Schema(description = "")
  public Long getAvailableApplication() {
    return availableApplication;
  }

  public void setAvailableApplication(Long availableApplication) {
    this.availableApplication = availableApplication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteIdentityDto completeIdentityDto = (CompleteIdentityDto) o;
    return Objects.equals(this.createdBy, completeIdentityDto.createdBy) &&
        Objects.equals(this.createdDate, completeIdentityDto.createdDate) &&
        Objects.equals(this.lastModifiedBy, completeIdentityDto.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, completeIdentityDto.lastModifiedDate) &&
        Objects.equals(this.id, completeIdentityDto.id) &&
        Objects.equals(this.login, completeIdentityDto.login) &&
        Objects.equals(this.name, completeIdentityDto.name) &&
        Objects.equals(this.password, completeIdentityDto.password) &&
        Objects.equals(this.privatekey, completeIdentityDto.privatekey) &&
        Objects.equals(this.privatekeyPath, completeIdentityDto.privatekeyPath) &&
        Objects.equals(this.passphrase, completeIdentityDto.passphrase) &&
        Objects.equals(this.availableApplication, completeIdentityDto.availableApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, lastModifiedBy, lastModifiedDate, id, login, name, password, privatekey, privatekeyPath, passphrase, availableApplication);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteIdentityDto {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    privatekey: ").append(toIndentedString(privatekey)).append("\n");
    sb.append("    privatekeyPath: ").append(toIndentedString(privatekeyPath)).append("\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
    sb.append("    availableApplication: ").append(toIndentedString(availableApplication)).append("\n");
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