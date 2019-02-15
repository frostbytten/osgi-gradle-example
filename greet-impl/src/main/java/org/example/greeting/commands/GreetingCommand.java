package org.example.greeting.commands;

import org.apache.felix.service.command.CommandProcessor;
import org.example.greeting.api.Greeting;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(property = {
        CommandProcessor.COMMAND_SCOPE + ":String=example",
        CommandProcessor.COMMAND_FUNCTION + ":String=greet"},
        service = Object.class
)
public class GreetingCommand {
    private Greeting greetingSvc;

    @Reference
    public void setGreeting(Greeting greetingSvc) {
        this.greetingSvc = greetingSvc;
    }

    public void greet(String name) {
        System.out.println(greetingSvc.sayHello(name));
    }
}
