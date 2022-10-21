package ch.inss.springapichallenge.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResourcesCustomerResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-26T19:49:48.701044+01:00[Europe/Zurich]")
public class ResourcesCustomerResource   {

  @JsonProperty("_embedded")
  @Valid
  private List<CustomerResource> embedded = null;

  @JsonProperty("_links")
  @Valid
  private List<Link> links = null;

  public ResourcesCustomerResource embedded(List<CustomerResource> embedded) {
    this.embedded = embedded;
    return this;
  }

  public ResourcesCustomerResource addEmbeddedItem(CustomerResource embeddedItem) {
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
  public List<CustomerResource> getEmbedded() {
    return embedded;
  }

  public void setEmbedded(List<CustomerResource> embedded) {
    this.embedded = embedded;
  }

  public ResourcesCustomerResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public ResourcesCustomerResource addLinksItem(Link linksItem) {
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
    ResourcesCustomerResource resourcesCustomerResource = (ResourcesCustomerResource) o;
    return Objects.equals(this.embedded, resourcesCustomerResource.embedded) &&
        Objects.equals(this.links, resourcesCustomerResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcesCustomerResource {\n");
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

