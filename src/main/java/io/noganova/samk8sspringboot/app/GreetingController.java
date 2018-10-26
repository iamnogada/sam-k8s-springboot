package io.noganova.samk8sspringboot.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * GreetingController
 */
@Controller
public class GreetingController {

    @Value("${application.name}")
    String appName;
    @Value("${application.apiname}")
    String apiName;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",required=false,defaultValue="world")String name, Model map){
        map.addAttribute("name",appName +":"+apiName);
        return "greeting";
    }
}