package com.cognizant.springdiapp;

public class GreetingController {
    private GreetingService greetingService;

    // Setter-based Dependency Injection
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sendGreeting() {
        greetingService.greet();
    }
}
