package ch.inss.springapichallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-26T19:49:48.701044+01:00[Europe/Zurich]")
@Controller
@RequestMapping("${openapi.petstoretroublemaker.base-path:/api/v3}")
public class StoreApiController implements StoreApi {

    private final NativeWebRequest request;

    @Autowired
    public StoreApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Map<String, Integer>> getInventory() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int r = new Double(Math.random() * 3).intValue();
        System.out.println("R = " + r);
        for (int i=0;i<=3;i++){
            if (r > 3) r = 0;
            map.put("additionalProp" + r,r);
            r++;
        }
        return new ResponseEntity<Map<String, Integer>>(map, HttpStatus.OK);
    }
}
