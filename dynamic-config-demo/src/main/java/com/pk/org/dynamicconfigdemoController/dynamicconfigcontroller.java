package com.pk.org.dynamicconfigdemoController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dynamicconfigcontroller {

    private static final Logger logger = LogManager.getLogger(dynamicconfigcontroller.class);

    @Autowired
    //private ClassMasterRepo classMasterRepo;

    @RequestMapping("/demo")
    public String hello()

    {
     return "Dynamic config server demo";
    }

}






