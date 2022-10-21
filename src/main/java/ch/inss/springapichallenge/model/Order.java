package ch.inss.springapichallenge.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Order
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-26T19:49:48.701044+01:00[Europe/Zurich]")
public class Order   {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("petId")
  private Long petId;

  @JsonProperty("pricebrutto")
  private Float pricebrutto;

  @JsonProperty("pricenetto")
  private Float pricenetto;

  @JsonProperty("rabatt")
  private Float rabatt;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("shipDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime shipDate;

  /**
   * Order Status
   */
  public enum StatusEnum {
    PLACED("placed"),
    
    APPROVED("approved"),
    
    DELIVERED("delivered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("complete")
  private Boolean complete;

  public Order id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the order.
   * @return id
  */
  
  @Schema(name = "id", example = "10", description = "Id of the order.", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Order petId(Long petId) {
    this.petId = petId;
    return this;
  }

  /**
   * PetId
   * @return petId
  */
  
  @Schema(name = "petId", example = "198772", description = "PetId", required = false)
  public Long getPetId() {
    return petId;
  }

  public void setPetId(Long petId) {
    this.petId = petId;
  }

  public Order pricebrutto(Float pricebrutto) {
    this.pricebrutto = pricebrutto;
    return this;
  }

  /**
   * Brutto price
   * @return pricebrutto
  */
  
  @Schema(name = "pricebrutto", example = "345.45", description = "Brutto price", required = false)
  public Float getPricebrutto() {
    return pricebrutto;
  }

  public void setPricebrutto(Float pricebrutto) {
    this.pricebrutto = pricebrutto;
  }

  public Order pricenetto(Float pricenetto) {
    this.pricenetto = pricenetto;
    return this;
  }

  /**
   * Netto price
   * @return pricenetto
  */
  
  @Schema(name = "pricenetto", example = "300.0", description = "Netto price", required = false)
  public Float getPricenetto() {
    return pricenetto;
  }

  public void setPricenetto(Float pricenetto) {
    this.pricenetto = pricenetto;
  }

  public Order rabatt(Float rabatt) {
    this.rabatt = rabatt;
    return this;
  }

  /**
   * Rabatt reduction.
   * @return rabatt
  */
  
  @Schema(name = "rabatt", example = "25.9", description = "Rabatt reduction.", required = false)
  public Float getRabatt() {
    return rabatt;
  }

  public void setRabatt(Float rabatt) {
    this.rabatt = rabatt;
  }

  public Order quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity
   * @return quantity
  */
  
  @Schema(name = "quantity", example = "7", description = "Quantity", required = false)
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Order shipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  /**
   * Shipping date.
   * @return shipDate
  */
  @Valid 
  @Schema(name = "shipDate", example = "2017-07-21T17:32:28Z", description = "Shipping date.", required = false)
  public OffsetDateTime getShipDate() {
    return shipDate;
  }

  public void setShipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Order Status
   * @return status
  */
  
  @Schema(name = "status", example = "approved", description = "Order Status", required = false)
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Order complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Order completed.
   * @return complete
  */
  
  @Schema(name = "complete", example = "true", description = "Order completed.", required = false)
  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.petId, order.petId) &&
        Objects.equals(this.pricebrutto, order.pricebrutto) &&
        Objects.equals(this.pricenetto, order.pricenetto) &&
        Objects.equals(this.rabatt, order.rabatt) &&
        Objects.equals(this.quantity, order.quantity) &&
        Objects.equals(this.shipDate, order.shipDate) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.complete, order.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, petId, pricebrutto, pricenetto, rabatt, quantity, shipDate, status, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
    sb.append("    pricebrutto: ").append(toIndentedString(pricebrutto)).append("\n");
    sb.append("    pricenetto: ").append(toIndentedString(pricenetto)).append("\n");
    sb.append("    rabatt: ").append(toIndentedString(rabatt)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

