package nix.education.java.chatbot;

import java.util.Scanner;


public class ChatBot {

    public static void main(String[] args) {
        System.out.println("Hello! My name is Obema.");
        System.out.println("I was created in 2021.");

        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("What a greate name you have, " + name + "!");
        System.out.println("Let me guess your age.");

        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();

        int remainder5 = scanner.nextInt();

        int remainder7 = scanner.nextInt();


        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!.");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int number1 = scanner.nextInt();
        for (int i = 0; i <= number1; i++) {
            System.out.println(i + " !");
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int response;
        while (true) {
            response = scanner.nextInt();

            if (response == 2) {
                System.out.println("Great, you right!\n");
                break;
            }
            System.out.println("Plaese, try again.");
        }

        System.out.println("What is a class in Java?");
        System.out.println("1. The level of complexity of the program. All operators are divided into classes depending on the complexity of their use.");
        System.out.println("2. This concept exists only in C ++, in Java there is no such concept.");
        System.out.println("3. Just one of the standard names.");
        System.out.println("4. The basic element of oop in the Java language.");

        int response2;
        while (true) {
            response2 = scanner.nextInt();

            if (response2 == 4) {
                System.out.println("Great, you right!\n");
                break;
            }
            System.out.println("Plaese, try again.");
        }

        System.out.println("How do I declare a CLASS in code?");
        System.out.println("1. class MyClass {}.");
        System.out.println("2. new class MyClass {}.");
        System.out.println("3. select * from class MyClass {}.");
        System.out.println("4. MyClass extends class {}.");

        int response3;
        while (true) {
            response3 = scanner.nextInt();

            if (response3 == 1) {
                System.out.println("Great, you right!\n");
                break;
            }
            System.out.println("Plaese, try again.");
        }

        System.out.println("Goodbye, have a nice day!");
    }
}


