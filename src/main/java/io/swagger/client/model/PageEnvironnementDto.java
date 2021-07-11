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
import io.swagger.client.model.EnvironnementDto;
import io.swagger.client.model.Pageable;
import io.swagger.client.model.Sort;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * PageEnvironnementDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-11T21:08:45.148Z[GMT]")
public class PageEnvironnementDto {
  @JsonProperty("totalPages")
  private Integer totalPages = null;

  @JsonProperty("totalElements")
  private Long totalElements = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("content")
  private List<EnvironnementDto> content = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("sort")
  private Sort sort = null;

  @JsonProperty("first")
  private Boolean first = null;

  @JsonProperty("last")
  private Boolean last = null;

  @JsonProperty("numberOfElements")
  private Integer numberOfElements = null;

  @JsonProperty("pageable")
  private Pageable pageable = null;

  @JsonProperty("empty")
  private Boolean empty = null;

  public PageEnvironnementDto totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @Schema(description = "")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public PageEnvironnementDto totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Get totalElements
   * @return totalElements
  **/
  @Schema(description = "")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PageEnvironnementDto size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PageEnvironnementDto content(List<EnvironnementDto> content) {
    this.content = content;
    return this;
  }

  public PageEnvironnementDto addContentItem(EnvironnementDto contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<EnvironnementDto>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(description = "")
  public List<EnvironnementDto> getContent() {
    return content;
  }

  public void setContent(List<EnvironnementDto> content) {
    this.content = content;
  }

  public PageEnvironnementDto number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @Schema(description = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PageEnvironnementDto sort(Sort sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @Schema(description = "")
  public Sort getSort() {
    return sort;
  }

  public void setSort(Sort sort) {
    this.sort = sort;
  }

  public PageEnvironnementDto first(Boolean first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @Schema(description = "")
  public Boolean isFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public PageEnvironnementDto last(Boolean last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @Schema(description = "")
  public Boolean isLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public PageEnvironnementDto numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

   /**
   * Get numberOfElements
   * @return numberOfElements
  **/
  @Schema(description = "")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public PageEnvironnementDto pageable(Pageable pageable) {
    this.pageable = pageable;
    return this;
  }

   /**
   * Get pageable
   * @return pageable
  **/
  @Schema(description = "")
  public Pageable getPageable() {
    return pageable;
  }

  public void setPageable(Pageable pageable) {
    this.pageable = pageable;
  }

  public PageEnvironnementDto empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @Schema(description = "")
  public Boolean isEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageEnvironnementDto pageEnvironnementDto = (PageEnvironnementDto) o;
    return Objects.equals(this.totalPages, pageEnvironnementDto.totalPages) &&
        Objects.equals(this.totalElements, pageEnvironnementDto.totalElements) &&
        Objects.equals(this.size, pageEnvironnementDto.size) &&
        Objects.equals(this.content, pageEnvironnementDto.content) &&
        Objects.equals(this.number, pageEnvironnementDto.number) &&
        Objects.equals(this.sort, pageEnvironnementDto.sort) &&
        Objects.equals(this.first, pageEnvironnementDto.first) &&
        Objects.equals(this.last, pageEnvironnementDto.last) &&
        Objects.equals(this.numberOfElements, pageEnvironnementDto.numberOfElements) &&
        Objects.equals(this.pageable, pageEnvironnementDto.pageable) &&
        Objects.equals(this.empty, pageEnvironnementDto.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, totalElements, size, content, number, sort, first, last, numberOfElements, pageable, empty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageEnvironnementDto {\n");
    
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    pageable: ").append(toIndentedString(pageable)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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
