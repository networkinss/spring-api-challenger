/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ch.inss.springapichallenge.controller;

import ch.inss.springapichallenge.model.ModelApiResponse;
import ch.inss.springapichallenge.model.Pet;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-26T19:49:48.701044+01:00[Europe/Zurich]")
@Validated
@Tag(name = "pet", description = "the pet API")
public interface PetApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /pet : Add a new pet to the store
     * Add a new pet to the store
     *
     * @param pet Create a new pet in the store (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "addPet",
        summary = "Add a new pet to the store",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Pet.class))),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Pet> addPet(
        @Parameter(name = "Pet", description = "Create a new pet in the store", required = true, schema = @Schema(description = "")) @Valid @RequestBody Pet pet
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"http://example.com/photo.png\", \"http://example.com/photo2\", \"png\" ], \"name\" : \"SChäferhund\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"tag1\", \"id\" : 1 }, { \"name\" : \"tag1\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * DELETE /pet/{petId} : Deletes a pet
     * Deletes a pet.
     *
     * @param petId Pet id to delete (required)
     * @param API_KEY Api key. (optional)
     * @return Invalid pet value (status code 400)
     */
    @Operation(
        operationId = "deletePet",
        summary = "Deletes a pet",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid pet value")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/pet/{petId}"
    )
    default ResponseEntity<Void> deletePet(
        @Parameter(name = "petId", description = "Pet id to delete", required = true, schema = @Schema(description = "")) @PathVariable("petId") Long petId,
        @Parameter(name = "API_KEY", description = "Api key.", schema = @Schema(description = "")) @RequestHeader(value = "API_KEY", required = false) String API_KEY
    ) {
        return new ResponseEntity<>(HttpStatus.OK);

    }


    /**
     * GET /pet/findbystatus : Two media types, application/json and application/xml.
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (optional, default to available)
     * @return successful operation (status code 200)
     * or Invalid status value (status code 400)
     */
    @Operation(
            operationId = "findPetsByStatus",
            summary = "Two media types, application/json and application/xml.",
            tags = {"pet"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))),
                    @ApiResponse(responseCode = "400", description = "Invalid status value")
            },
            security = {
                    @SecurityRequirement(name = "petstore_auth", scopes = {"write:pets", "read:pets"})
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/pet/findbystatus",
            produces = {"application/json", "application/xml"}
    )
    default ResponseEntity<List<Pet>> findPetsByStatus(
            @Parameter(name = "status", description = "Status values that need to be considered for filter", schema = @Schema(description = "", allowableValues = {"available", "pending", "sold"}, defaultValue = "available")) @Valid @RequestParam(value = "status", required = false, defaultValue = "available") String status
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"http://example.com/photo.png\", \"http://example.com/photo2\", \"png\" ], \"name\" : \"SChäferhund\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"tag1\", \"id\" : 1 }, { \"name\" : \"tag1\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>10</id> <name>SChäferhund</name> <photoUrls>aeiou</photoUrls> <status>available</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * GET /pet/findbytags : Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param tags Tags to filter by (optional)
     * @return successful operation (status code 200)
     *         or Invalid tag value (status code 400)
     */
    @Operation(
        operationId = "findPetsByTags",
        summary = "Finds Pets by tags",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Pet.class))),
            @ApiResponse(responseCode = "400", description = "Invalid tag value")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pet/findbytags",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Pet>> findPetsByTags(
        @Parameter(name = "tags", description = "Tags to filter by", schema = @Schema(description = "")) @Valid @RequestParam(value = "tags", required = false) List<String> tags
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"http://example.com/photo.png\", \"http://example.com/photo2\", \"png\" ], \"name\" : \"SChäferhund\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"tag1\", \"id\" : 1 }, { \"name\" : \"tag1\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * GET /pet/{petId} : Find pet by ID
     * Returns a single pet with example of a german Umlaut.
     *
     * @param petId ID of pet to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     */
    @Operation(
        operationId = "getPetById",
        summary = "Find pet by ID",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Pet.class))),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Pet not found")
        },
        security = {
            @SecurityRequirement(name = "api_key"),
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pet/{petId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Pet> getPetById(
        @Parameter(name = "petId", description = "ID of pet to return", required = true, schema = @Schema(description = "")) @PathVariable("petId") Long petId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"http://example.com/photo.png\", \"http://example.com/photo2\", \"png\" ], \"name\" : \"SChäferhund\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"tag1\", \"id\" : 1 }, { \"name\" : \"tag1\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * PUT /pet : Update an existing pet
     * Update an existing pet by Id
     *
     * @param pet Update an existent pet in the store (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(
        operationId = "updatePet",
        summary = "Update an existing pet",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Pet.class))),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Pet not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/pet",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Pet> updatePet(
        @Parameter(name = "Pet", description = "Update an existent pet in the store", required = true, schema = @Schema(description = "")) @Valid @RequestBody Pet pet
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"http://example.com/photo.png\", \"http://example.com/photo2\", \"png\" ], \"name\" : \"SChäferhund\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"tag1\", \"id\" : 1 }, { \"name\" : \"tag1\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * POST /pet/{petId} : Updates a pet in the store with form data
     * Updates a pet in the store with form data.
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name Name of pet that needs to be updated (optional)
     * @param status Status of pet that needs to be updated (optional)
     * @return Invalid input (status code 405)
     */
    @Operation(
        operationId = "updatePetWithForm",
        summary = "Updates a pet in the store with form data",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "405", description = "Invalid input")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet/{petId}"
    )
    default ResponseEntity<Void> updatePetWithForm(
        @Parameter(name = "petId", description = "ID of pet that needs to be updated", required = true, schema = @Schema(description = "")) @PathVariable("petId") Long petId,
        @Parameter(name = "name", description = "Name of pet that needs to be updated", schema = @Schema(description = "")) @Valid @RequestParam(value = "name", required = false) String name,
        @Parameter(name = "status", description = "Status of pet that needs to be updated", schema = @Schema(description = "")) @Valid @RequestParam(value = "status", required = false) String status
    ) {
        return new ResponseEntity<>(HttpStatus.OK);

    }


    /**
     * POST /pet/{petId}/uploadimage : uploads an image
     * Uploads an image.
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional Metadata (optional)
     * @param body  (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "uploadFile",
        summary = "uploads an image",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ModelApiResponse.class)))
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet/{petId}/uploadimage",
        produces = { "application/json" },
        consumes = { "application/octet-stream" }
    )
    default ResponseEntity<ModelApiResponse> uploadFile(
        @Parameter(name = "petId", description = "ID of pet to update", required = true, schema = @Schema(description = "")) @PathVariable("petId") Long petId,
        @Parameter(name = "additionalMetadata", description = "Additional Metadata", schema = @Schema(description = "")) @Valid @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata,
        @Parameter(name = "body", description = "", schema = @Schema(description = "")) @Valid @RequestBody(required = false) org.springframework.core.io.Resource body
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 123, \"type\" : \"responsetype\", \"message\" : \"Message.\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }

}
