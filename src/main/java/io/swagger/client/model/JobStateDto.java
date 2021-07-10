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
import io.swagger.client.model.LogBatchDto;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * JobStateDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-10T21:22:29.539Z[GMT]")
public class JobStateDto {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("log")
  private LogBatchDto log = null;

  public JobStateDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JobStateDto state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public JobStateDto log(LogBatchDto log) {
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @Schema(description = "")
  public LogBatchDto getLog() {
    return log;
  }

  public void setLog(LogBatchDto log) {
    this.log = log;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStateDto jobStateDto = (JobStateDto) o;
    return Objects.equals(this.id, jobStateDto.id) &&
        Objects.equals(this.state, jobStateDto.state) &&
        Objects.equals(this.log, jobStateDto.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, log);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStateDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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
