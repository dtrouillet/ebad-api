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
 * BatchLogDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-11T21:08:45.148Z[GMT]")
public class BatchLogDto {
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

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("defaultParam")
  private String defaultParam = null;

  @JsonProperty("params")
  private String params = null;

  public BatchLogDto createdBy(String createdBy) {
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

  public BatchLogDto createdDate(DateTime createdDate) {
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

  public BatchLogDto lastModifiedBy(String lastModifiedBy) {
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

  public BatchLogDto lastModifiedDate(DateTime lastModifiedDate) {
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

  public BatchLogDto id(Long id) {
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

  public BatchLogDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BatchLogDto path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public BatchLogDto defaultParam(String defaultParam) {
    this.defaultParam = defaultParam;
    return this;
  }

   /**
   * Get defaultParam
   * @return defaultParam
  **/
  @Schema(description = "")
  public String getDefaultParam() {
    return defaultParam;
  }

  public void setDefaultParam(String defaultParam) {
    this.defaultParam = defaultParam;
  }

  public BatchLogDto params(String params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @Schema(description = "")
  public String getParams() {
    return params;
  }

  public void setParams(String params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchLogDto batchLogDto = (BatchLogDto) o;
    return Objects.equals(this.createdBy, batchLogDto.createdBy) &&
        Objects.equals(this.createdDate, batchLogDto.createdDate) &&
        Objects.equals(this.lastModifiedBy, batchLogDto.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, batchLogDto.lastModifiedDate) &&
        Objects.equals(this.id, batchLogDto.id) &&
        Objects.equals(this.name, batchLogDto.name) &&
        Objects.equals(this.path, batchLogDto.path) &&
        Objects.equals(this.defaultParam, batchLogDto.defaultParam) &&
        Objects.equals(this.params, batchLogDto.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, lastModifiedBy, lastModifiedDate, id, name, path, defaultParam, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchLogDto {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    defaultParam: ").append(toIndentedString(defaultParam)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
