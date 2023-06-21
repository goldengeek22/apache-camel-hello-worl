package net.systempanic22.learn.camel.helloworld;

import org.apache.camel.builder.RouteBuilder;

/**
 * @author Alexandre AMEVOR
 */

public class HelloWorldRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:example?period=2000")
                .setBody(constant("Hello world"))
                .to("log:" + HelloWorldRoute.class.getName());
    }
}
