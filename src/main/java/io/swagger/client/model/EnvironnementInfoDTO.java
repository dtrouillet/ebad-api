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
 * EnvironnementInfoDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-11T21:08:45.148Z[GMT]")
public class EnvironnementInfoDTO {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("diskSpace")
  private String diskSpace = null;

  @JsonProperty("dateTraitement")
  private DateTime dateTraitement = null;

  public EnvironnementInfoDTO id(Long id) {
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

  public EnvironnementInfoDTO diskSpace(String diskSpace) {
    this.diskSpace = diskSpace;
    return this;
  }

   /**
   * Get diskSpace
   * @return diskSpace
  **/
  @Schema(description = "")
  public String getDiskSpace() {
    return diskSpace;
  }

  public void setDiskSpace(String diskSpace) {
    this.diskSpace = diskSpace;
  }

  public EnvironnementInfoDTO dateTraitement(DateTime dateTraitement) {
    this.dateTraitement = dateTraitement;
    return this;
  }

   /**
   * Get dateTraitement
   * @return dateTraitement
  **/
  @Schema(description = "")
  public DateTime getDateTraitement() {
    return dateTraitement;
  }

  public void setDateTraitement(DateTime dateTraitement) {
    this.dateTraitement = dateTraitement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironnementInfoDTO environnementInfoDTO = (EnvironnementInfoDTO) o;
    return Objects.equals(this.id, environnementInfoDTO.id) &&
        Objects.equals(this.diskSpace, environnementInfoDTO.diskSpace) &&
        Objects.equals(this.dateTraitement, environnementInfoDTO.dateTraitement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, diskSpace, dateTraitement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironnementInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    diskSpace: ").append(toIndentedString(diskSpace)).append("\n");
    sb.append("    dateTraitement: ").append(toIndentedString(dateTraitement)).append("\n");
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
