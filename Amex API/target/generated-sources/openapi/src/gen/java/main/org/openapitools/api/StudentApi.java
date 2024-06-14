/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Student;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
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
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-05T17:58:43.456951Z[Etc/UTC]")
@Validated
@Tag(name = "student", description = "Everything about your Pets")
public interface StudentApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /student : Add a new pet to the store
     * Add a new pet to the store
     *
     * @param student Create a new pet in the store (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 400)
     *         or Validation exception (status code 422)
     */
    @Operation(
        operationId = "addPet",
        summary = "Add a new pet to the store",
        tags = { "student" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "422", description = "Validation exception")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/student",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Student> addPet(
        @Parameter(name = "Student", description = "Create a new pet in the store", required = true) @Valid @RequestBody Student student
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"Doe\", \"id\" : 10, \"complete\" : true, \"status\" : \"approved\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /student : Update an existing pet
     * Update an existing pet by Id
     *
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     *         or Validation exception (status code 422)
     */
    @Operation(
        operationId = "getStudent",
        summary = "Update an existing pet",
        tags = { "student" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Pet not found"),
            @ApiResponse(responseCode = "422", description = "Validation exception")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/student",
        produces = { "application/json" }
    )
    default ResponseEntity<Student> getStudent(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"Doe\", \"id\" : 10, \"complete\" : true, \"status\" : \"approved\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /student : Update an existing pet
     * Update an existing pet by Id
     *
     * @param student Update an existent pet in the store (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     *         or Validation exception (status code 422)
     */
    @Operation(
        operationId = "updatePet",
        summary = "Update an existing pet",
        tags = { "student" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Pet not found"),
            @ApiResponse(responseCode = "422", description = "Validation exception")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/student",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Student> updatePet(
        @Parameter(name = "Student", description = "Update an existent pet in the store", required = true) @Valid @RequestBody Student student
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"Doe\", \"id\" : 10, \"complete\" : true, \"status\" : \"approved\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
