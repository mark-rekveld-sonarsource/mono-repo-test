package com.mycompany.app;

/**
 * Hello world!
 */
public class App1
{

    private final String message = "Hello Mars?";

    public App1() {}

    public static void main(String[] args) {
if (true) {
        System.out.println(new App1().getMessage());
} else if (false) {
        System.out.println(new App1().getMessage());
} else {
        System.out.println(new App1().getMessage());
}
    }

    private final String getMessage() {
        return message;
    }

}
