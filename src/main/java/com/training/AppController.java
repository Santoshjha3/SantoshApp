package com.training;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppController {

       @RequestMapping("/info")

       public String gradleEndpointinfo() {

              return "Apps is Running";

       }

       @RequestMapping("/gradle")

       public String gradleEndpoint() {

              return "This is my gradle version";

       }

} 

