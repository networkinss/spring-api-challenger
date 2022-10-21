package ch.inss.springapichallenge.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The schema for all error responses.
 */

@Schema(name = "RestError", description = "The schema for all error responses.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-26T19:49:48.701044+01:00[Europe/Zurich]")
public class RestError   {

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("error")
  private String error;

  @JsonProperty("path")
  private URI path;

  @JsonProperty("timestamp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  @JsonProperty("message")
  private String message;

  @JsonProperty("trace")
  private String trace;

  public RestError status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The HTTP status code.
   * @return status
  */
  @NotNull 
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, example = "400", description = "The HTTP status code.", required = true)
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public RestError error(String error) {
    this.error = error;
    return this;
  }

  /**
   * The short error message.
   * @return error
  */
  @NotNull 
  @Schema(name = "error", accessMode = Schema.AccessMode.READ_ONLY, example = "Bad Request", description = "The short error message.", required = true)
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public RestError path(URI path) {
    this.path = path;
    return this;
  }

  /**
   * The path of the URL for this request.
   * @return path
  */
  @NotNull @Valid 
  @Schema(name = "path", accessMode = Schema.AccessMode.READ_ONLY, example = "/api/owners", description = "The path of the URL for this request.", required = true)
  public URI getPath() {
    return path;
  }

  public void setPath(URI path) {
    this.path = path;
  }

  public RestError timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The time the error occured.
   * @return timestamp
  */
  @NotNull @Valid 
  @Schema(name = "timestamp", accessMode = Schema.AccessMode.READ_ONLY, description = "The time the error occured.", required = true)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public RestError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The long error message.
   * @return message
  */
  @NotNull 
  @Schema(name = "message", accessMode = Schema.AccessMode.READ_ONLY, example = "Request failed schema validation", description = "The long error message.", required = true)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RestError trace(String trace) {
    this.trace = trace;
    return this;
  }

  /**
   * The stacktrace for this error.
   * @return trace
  */
  
  @Schema(name = "trace", accessMode = Schema.AccessMode.READ_ONLY, example = "com.atlassian.oai.validator.springmvc.InvalidRequestException...", description = "The stacktrace for this error.", required = false)
  public String getTrace() {
    return trace;
  }

  public void setTrace(String trace) {
    this.trace = trace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestError restError = (RestError) o;
    return Objects.equals(this.status, restError.status) &&
        Objects.equals(this.error, restError.error) &&
        Objects.equals(this.path, restError.path) &&
        Objects.equals(this.timestamp, restError.timestamp) &&
        Objects.equals(this.message, restError.message) &&
        Objects.equals(this.trace, restError.trace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, error, path, timestamp, message, trace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestError {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
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

