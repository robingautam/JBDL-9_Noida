package org.gfg.JBDL9_SpringBoot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {


    @RequestMapping("/get/hello")
    public String getHello(){
        return "This is api";
    }

    @RequestMapping(value = "/get/hello/html", produces = MediaType.TEXT_HTML_VALUE)
    public String getHelloHTML(){
        return "<html><body><h1>This is H1 Tag</h1></body></html>";
    }


    // @RequestMapping(value = "/get/student", produces = MediaType.APPLICATION_XML_VALUE)
    @RequestMapping("/get/student")
    public Student getStudent(){
        Student student = new Student(1, "Robin", "robin@gmail.com");
        return student;
    }


    @GetMapping("/get/path/{pincode}")
    public String readPathVariables(@PathVariable("pincode") String pincode){
        return pincode;
    }

    @GetMapping("/get/request")
    public String readPathVariables(@RequestParam("category") String category, @RequestParam("type") String type){
        return category+" "+type;
    }

    @GetMapping("/get/request/{category}/{type}")
    public String readPathVariablesOR(@PathVariable("category") String category, @PathVariable("type") String type){
        return category+" "+type;
    }
}
