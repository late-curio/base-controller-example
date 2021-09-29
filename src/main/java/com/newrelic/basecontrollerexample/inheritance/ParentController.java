package com.newrelic.basecontrollerexample.inheritance;

import org.springframework.web.bind.annotation.GetMapping;

public class ParentController {
    @GetMapping
    public String getStuff() {
        String stuff = "Stuff";
        stuff = "More " + stuff;
        return stuff;
    }
}
