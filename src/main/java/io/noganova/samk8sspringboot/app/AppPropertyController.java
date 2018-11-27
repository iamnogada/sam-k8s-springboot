package io.noganova.samk8sspringboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.noganova.samk8sspringboot.model.AppProperty;

/**
 * AppPropertyController
 */
@Controller
public class AppPropertyController {
    @Autowired
    Environment env;

    @RequestMapping(value="/")
    String home(Model model){
        
        AppProperty info = new AppProperty();
        info.setComkey01(env.getProperty("application.comkey01"));
        info.setComkey02(env.getProperty("application.comkey02"));
        info.setProfilekey03(env.getProperty("application.profilekey03"));
        info.setProfilekey04(env.getProperty("application.profilekey04"));
        model.addAttribute("appinfo",info);
        return "index";
    }
}