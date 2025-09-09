package org.gfg.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class GenericController {

   // @RequestMapping(value = "/get/generic", method = RequestMethod.GET)
    @GetMapping("/get/generic")
    public String getGenericResponse(){
        return "generic controller";
    }

    @PostMapping("/get/generic/post")
    public String getGenericResponsePost(){
        return "generic controller";
    }

    @PostMapping("/create/student")
    public ResponseEntity createStudentData(@RequestBody Student student){
        System.out.println(student);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("customHeader", "Robin");
        return new ResponseEntity( "User Created", httpHeaders, HttpStatus.CREATED);
    }

    @GetMapping("/get/header")
    public String requestHeader(@RequestHeader MultiValueMap<String, String> map){
        System.out.println(map);
        return "OK";
    }




}
