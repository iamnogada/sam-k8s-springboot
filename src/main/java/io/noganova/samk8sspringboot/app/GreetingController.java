package io.noganova.samk8sspringboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * GreetingController
 */
@Controller
public class GreetingController {

    // @Value("${application.name}")
    // String appName;
    // @Value("${application.apiname}")
    // String apiName;

    @Autowired
    Environment env;

    // @GetMapping("/greeting")
    // public String greeting(@RequestParam(name="name",required=false,defaultValue="world")String name, Model map){
    //     map.addAttribute("name",appName +":"+apiName);
    //     return "greeting";
    // }

    

    @RequestMapping(value="/properties")
    public String getHeader(Model map){
        String properties = "application.location:" + env.getProperty("application.location");
        map.addAttribute("properties", properties);
        return "properties";
    }
}