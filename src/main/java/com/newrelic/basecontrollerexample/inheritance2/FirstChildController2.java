package com.newrelic.basecontrollerexample.inheritance2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inherited2/v1")
public class FirstChildController2 extends ParentController2 {
    Logger logger = LoggerFactory.getLogger(FirstChildController2.class);

    public FirstChildController2() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

    }

    @PostMapping
    public String doStuff() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "First child done doing stuff";
    }
}
