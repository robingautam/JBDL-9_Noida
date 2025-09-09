package org.gfg.JBDL9_SpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postman")
public class PostmanController {


    Logger LOGGER = LoggerFactory.getLogger(PostmanController.class);


    @GetMapping("/get/params")
    public String ParamsType(@RequestParam("name") String name){
        return name;
    }

    @GetMapping("/get/form/data")
    public String FormType(/*@RequestParam("name") String name, @RequestParam("email") String email*/
              @RequestParam MultiValueMap<String,String> map){
        String ans = "";
        for (String key: map.keySet()){
            ans = ans+map.get(key)+",";
        }
        return ans;
    }

    @PostMapping("/request/body")
    public String getBody(@RequestBody String data){
        LOGGER.info("This is the info log");
        LOGGER.trace("This is the TRACE log");
        LOGGER.warn("This is the WARN log");
        LOGGER.error("This is the ERROR log");
        LOGGER.debug("This is DEBUG log");
        return data;
    }


}
