package org.example.greeting.impl;

import org.example.greeting.api.Greeting;
import org.osgi.service.component.annotations.Component;

@Component
public class GreetingImpl implements Greeting {
    public String sayHello(String name) {
        return "Hallo, " + name;
    }
}
