package com.coresparker.core;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route extends RouteBuilder {

    public void configure() throws Exception {
        from("file:C://inputFolder?noop=true").to("file:C://outputFolder");
    }
}
