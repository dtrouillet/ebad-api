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
import io.swagger.client.model.BatchEnvironnementDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
/**
 * BatchDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-10T21:22:29.539Z[GMT]")
public class BatchDto {
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

  @JsonProperty("environnements")
  private List<BatchEnvironnementDto> environnements = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("defaultParam")
  private String defaultParam = null;

  @JsonProperty("params")
  private String params = null;

  public BatchDto createdBy(String createdBy) {
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

  public BatchDto createdDate(DateTime createdDate) {
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

  public BatchDto lastModifiedBy(String lastModifiedBy) {
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

  public BatchDto lastModifiedDate(DateTime lastModifiedDate) {
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

  public BatchDto id(Long id) {
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

  public BatchDto name(String name) {
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

  public BatchDto environnements(List<BatchEnvironnementDto> environnements) {
    this.environnements = environnements;
    return this;
  }

  public BatchDto addEnvironnementsItem(BatchEnvironnementDto environnementsItem) {
    if (this.environnements == null) {
      this.environnements = new ArrayList<BatchEnvironnementDto>();
    }
    this.environnements.add(environnementsItem);
    return this;
  }

   /**
   * Get environnements
   * @return environnements
  **/
  @Schema(description = "")
  public List<BatchEnvironnementDto> getEnvironnements() {
    return environnements;
  }

  public void setEnvironnements(List<BatchEnvironnementDto> environnements) {
    this.environnements = environnements;
  }

  public BatchDto path(String path) {
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

  public BatchDto defaultParam(String defaultParam) {
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

  public BatchDto params(String params) {
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
    BatchDto batchDto = (BatchDto) o;
    return Objects.equals(this.createdBy, batchDto.createdBy) &&
        Objects.equals(this.createdDate, batchDto.createdDate) &&
        Objects.equals(this.lastModifiedBy, batchDto.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, batchDto.lastModifiedDate) &&
        Objects.equals(this.id, batchDto.id) &&
        Objects.equals(this.name, batchDto.name) &&
        Objects.equals(this.environnements, batchDto.environnements) &&
        Objects.equals(this.path, batchDto.path) &&
        Objects.equals(this.defaultParam, batchDto.defaultParam) &&
        Objects.equals(this.params, batchDto.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, lastModifiedBy, lastModifiedDate, id, name, environnements, path, defaultParam, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDto {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    environnements: ").append(toIndentedString(environnements)).append("\n");
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
