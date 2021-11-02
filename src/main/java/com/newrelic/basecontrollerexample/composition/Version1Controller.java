package com.newrelic.basecontrollerexample.composition;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/composed/v1")
public class Version1Controller {

    private final Logger logger = Logger.getLogger(Version1Controller.class.getName());

    private final GetStuffAndDoThingsService service;

    public Version1Controller(GetStuffAndDoThingsService service) {
        this.service = service;
    }

    @GetMapping("/method")
    public String getStuff() {
        String stuff = service.getStuffAndDoThings();
        logger.log(Level.FINEST, "A FINEST Message");
        logger.log(Level.FINE, "A FINE Message");
        logger.info("An INFO Message");
        logger.log(Level.WARNING, "A WARN Message");
        logger.log(Level.SEVERE, "An ERROR Message");
        return stuff;
    }

    @PostMapping
    public String doStuff() {
        // do things
        return "First version done doing stuff";
    }
}
