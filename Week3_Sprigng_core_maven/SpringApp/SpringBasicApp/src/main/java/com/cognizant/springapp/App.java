package com.cognizant.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MessageService messageService = context.getBean("messageService", MessageService.class);
        System.out.println(messageService.getMessage());
    }
}
