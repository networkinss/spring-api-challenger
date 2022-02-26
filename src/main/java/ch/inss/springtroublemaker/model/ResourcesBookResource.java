package ch.inss.springtroublemaker.model;

import java.net.URI;
import java.util.Objects;
import ch.inss.springtroublemaker.model.BookResource;
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
 * ResourcesBookResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-26T18:39:00.977440+01:00[Europe/Zurich]")
public class ResourcesBookResource   {

  @JsonProperty("_embedded")
  @Valid
  private List<BookResource> embedded = null;

  @JsonProperty("_links")
  @Valid
  private List<Link> links = null;

  public ResourcesBookResource embedded(List<BookResource> embedded) {
    this.embedded = embedded;
    return this;
  }

  public ResourcesBookResource addEmbeddedItem(BookResource embeddedItem) {
    if (this.embedded == null) {
      this.embedded = new ArrayList<>();
    }
    this.embedded.add(embeddedItem);
    return this;
  }

  /**
   * Get embedded
   * @return embedded
  */
  @Valid 
  @Schema(name = "_embedded", required = false)
  public List<BookResource> getEmbedded() {
    return embedded;
  }

  public void setEmbedded(List<BookResource> embedded) {
    this.embedded = embedded;
  }

  public ResourcesBookResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public ResourcesBookResource addLinksItem(Link linksItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcesBookResource resourcesBookResource = (ResourcesBookResource) o;
    return Objects.equals(this.embedded, resourcesBookResource.embedded) &&
        Objects.equals(this.links, resourcesBookResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcesBookResource {\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

