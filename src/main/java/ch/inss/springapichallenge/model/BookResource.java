package ch.inss.springapichallenge.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BookResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-26T19:49:48.701044+01:00[Europe/Zurich]")
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

