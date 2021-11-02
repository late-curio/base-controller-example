package com.newrelic.basecontrollerexample.inheritance2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/inherited2/v1")
public class FirstChildController2 extends ParentController2 {
    Logger logger = Logger.getLogger(FirstChildController2.class.getName());

    public FirstChildController2() {
        logger.log(Level.FINEST, "A FINEST Message");
        logger.log(Level.FINE, "A FINE Message");
        logger.info("An INFO Message");
        logger.log(Level.WARNING, "A WARN Message");
        logger.log(Level.SEVERE, "An ERROR Message");
    }

    @PostMapping
    public String doStuff() {
        logger.log(Level.FINEST, "A FINEST Message");
        logger.log(Level.FINE, "A FINE Message");
        logger.info("An INFO Message");
        logger.log(Level.WARNING, "A WARN Message");
        logger.log(Level.SEVERE, "An ERROR Message");
        return "First child done doing stuff";
    }
}
