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
 * ApplicationSimpleDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-11T21:08:45.148Z[GMT]")
public class ApplicationSimpleDto {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("dateFichierPattern")
  private String dateFichierPattern = null;

  @JsonProperty("dateParametrePattern")
  private String dateParametrePattern = null;

  public ApplicationSimpleDto id(Long id) {
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

  public ApplicationSimpleDto name(String name) {
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

  public ApplicationSimpleDto code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ApplicationSimpleDto dateFichierPattern(String dateFichierPattern) {
    this.dateFichierPattern = dateFichierPattern;
    return this;
  }

   /**
   * Get dateFichierPattern
   * @return dateFichierPattern
  **/
  @Schema(description = "")
  public String getDateFichierPattern() {
    return dateFichierPattern;
  }

  public void setDateFichierPattern(String dateFichierPattern) {
    this.dateFichierPattern = dateFichierPattern;
  }

  public ApplicationSimpleDto dateParametrePattern(String dateParametrePattern) {
    this.dateParametrePattern = dateParametrePattern;
    return this;
  }

   /**
   * Get dateParametrePattern
   * @return dateParametrePattern
  **/
  @Schema(description = "")
  public String getDateParametrePattern() {
    return dateParametrePattern;
  }

  public void setDateParametrePattern(String dateParametrePattern) {
    this.dateParametrePattern = dateParametrePattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSimpleDto applicationSimpleDto = (ApplicationSimpleDto) o;
    return Objects.equals(this.id, applicationSimpleDto.id) &&
        Objects.equals(this.name, applicationSimpleDto.name) &&
        Objects.equals(this.code, applicationSimpleDto.code) &&
        Objects.equals(this.dateFichierPattern, applicationSimpleDto.dateFichierPattern) &&
        Objects.equals(this.dateParametrePattern, applicationSimpleDto.dateParametrePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, dateFichierPattern, dateParametrePattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSimpleDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    dateFichierPattern: ").append(toIndentedString(dateFichierPattern)).append("\n");
    sb.append("    dateParametrePattern: ").append(toIndentedString(dateParametrePattern)).append("\n");
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
