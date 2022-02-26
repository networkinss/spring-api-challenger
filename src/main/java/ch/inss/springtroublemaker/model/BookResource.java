package ch.inss.springtroublemaker.model;

import java.net.URI;
import java.util.Objects;
import ch.inss.springtroublemaker.model.Book;
import ch.inss.springtroublemaker.model.Link;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BookResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-26T18:39:00.977440+01:00[Europe/Zurich]")
public class BookResource   {

  @JsonProperty("_links")
  @Valid
  private List<Link> links = null;

  @JsonProperty("book")
  private Book book;

  public BookResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public BookResource addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", required = false)
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public BookResource book(Book book) {
    this.book = book;
    return this;
  }

  /**
   * Get book
   * @return book
  */
  @Valid 
  @Schema(name = "book", required = false)
  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookResource bookResource = (BookResource) o;
    return Objects.equals(this.links, bookResource.links) &&
        Objects.equals(this.book, bookResource.book);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, book);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookResource {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

