package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingServiceTest {

    @Test
    public void testGetGreeting() {
        GreetingService greetingService = new GreetingService();
        String result = greetingService.getGreeting("John");
        assertEquals("Hello, John!", result);
    }

    @Test
    public void testGetGreetingDefault() {
        GreetingService greetingService = new GreetingService();
        String result = greetingService.getGreeting("World");
        assertEquals("Hello, World!", result);
    }
}
