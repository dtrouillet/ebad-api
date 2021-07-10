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
 * FluxCurrentJobDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-10T21:22:29.539Z[GMT]")
public class FluxCurrentJobDto {
  @JsonProperty("prefetch")
  private Integer prefetch = null;

  public FluxCurrentJobDto prefetch(Integer prefetch) {
    this.prefetch = prefetch;
    return this;
  }

   /**
   * Get prefetch
   * @return prefetch
  **/
  @Schema(description = "")
  public Integer getPrefetch() {
    return prefetch;
  }

  public void setPrefetch(Integer prefetch) {
    this.prefetch = prefetch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FluxCurrentJobDto fluxCurrentJobDto = (FluxCurrentJobDto) o;
    return Objects.equals(this.prefetch, fluxCurrentJobDto.prefetch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefetch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FluxCurrentJobDto {\n");
    
    sb.append("    prefetch: ").append(toIndentedString(prefetch)).append("\n");
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
