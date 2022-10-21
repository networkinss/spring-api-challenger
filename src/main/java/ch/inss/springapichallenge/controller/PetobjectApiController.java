package ch.inss.springapichallenge.controller;


import ch.inss.springapichallenge.model.ModelApiResponse;
import ch.inss.springapichallenge.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Generated;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-21T20:36:18.094152+02:00[Europe/Zurich]")
@Controller
public class PetobjectApiController implements PetobjectApi {

    private final NativeWebRequest request;

    @Autowired
    public PetobjectApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadBinary(Integer orderId, Integer userId, MultipartFile fileName) {
        System.out.println("orderId: " + orderId + ", " + "userId: " + userId);
        return PetobjectApi.super.uploadBinary(orderId, userId, fileName);
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadBinaryPlusObject(Pet pet, MultipartFile fileName) {
        System.out.println("Pet object: " + pet);
        return PetobjectApi.super.uploadBinaryPlusObject(pet, fileName);
    }
}
