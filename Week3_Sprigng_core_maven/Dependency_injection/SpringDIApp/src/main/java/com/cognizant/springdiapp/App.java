package com.cognizant.springdiapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        GreetingController controller = context.getBean("greetingController", GreetingController.class);
        controller.sendGreeting();
    }
}
