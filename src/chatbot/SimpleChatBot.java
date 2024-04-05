package chatbot;

import java.util.Scanner;

public class SimpleChatBot {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Dear What's your name?");
        
        // Read user's name
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "! How can I assist you today?");
        
        // Chat loop
        while (true) {
            // Read user input
            String userInput = scanner.nextLine();
            
            // Check if user wants to quit
            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye, " + name + "! Have a great day!");
                break;
            }
            else if (userInput.equalsIgnoreCase("no")) {
                System.out.println("Goodbye, " + name + "! Have a great day!");
                break;
            }
            
            // Echo the user input
            System.out.println("Sorry We don't provide the answer for this. Any other queries?");
        }
        
        // Close scanner
        scanner.close();
    }
}
