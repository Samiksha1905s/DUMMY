import java.util.HashMap;
import java.util.Scanner;

public class LoginCredentialsManager {

    // Method to display menu options
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add key-value pair");
        System.out.println("2. Retrieve value for a given key");
        System.out.println("3. Retrieve all keys");
        System.out.println("4. Retrieve all values");
        System.out.println("5. Retrieve all key-value pairs");
        System.out.println("6. Update value for a given key");
        System.out.println("7. Remove entry by key");
        System.out.println("8. Remove entry by key-value pair");
        System.out.println("9. Check if a value exists");
        System.out.println("10. Display entire HashMap");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> loginCredentials = new HashMap<>();
        int choice;

        do {
            displayMenu();
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add key-value pair
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    loginCredentials.put(username, password);
                    System.out.println("Credentials added successfully!");
                    break;

                case 2: // Retrieve value for a given key
                    System.out.print("Enter username: ");
                    username = sc.nextLine();
                    if (loginCredentials.containsKey(username)) {
                        System.out.println("Password: " + loginCredentials.get(username));
                    } else {
                        System.out.println("Username not found.");
                    }
                    break;

                case 3: // Retrieve all keys
                    System.out.println("Keys: " + loginCredentials.keySet());
                    break;

                case 4: // Retrieve all values
                    System.out.println("Values: " + loginCredentials.values());
                    break;

                case 5: // Retrieve all key-value pairs
                    System.out.println("Key-Value pairs: " + loginCredentials.entrySet());
                    break;

                case 6: // Update value for a given key
                    System.out.print("Enter username: ");
                    username = sc.nextLine();
                    if (loginCredentials.containsKey(username)) {
                        System.out.print("Enter new password: ");
                        password = sc.nextLine();
                        loginCredentials.put(username, password);
                        System.out.println("Password updated successfully!");
                    } else {
                        System.out.println("Username not found.");
                    }
                    break;

                case 7: // Remove entry by key
                    System.out.print("Enter username: ");
                    username = sc.nextLine();
                    if (loginCredentials.remove(username) != null) {
                        System.out.println("Username removed successfully!");
                    } else {
                        System.out.println("Username not found.");
                    }
                    break;

                case 8: // Remove entry by key-value pair
                    System.out.print("Enter username: ");
                    username = sc.nextLine();
                    System.out.print("Enter password: ");
                    password = sc.nextLine();
                    if (loginCredentials.remove(username, password)) {
                        System.out.println("Credentials removed successfully!");
                    } else {
                        System.out.println("Username and password do not match.");
                    }
                    break;

                case 9: // Check if a value exists
                    System.out.print("Enter password to check: ");
                    password = sc.nextLine();
                    if (loginCredentials.containsValue(password)) {
                        System.out.println("Password exists.");
                    } else {
                        System.out.println("Password not found.");
                    }
                    break;

                case 10: // Display entire HashMap
                    System.out.println("HashMap contents: " + loginCredentials);
                    break;

                case 0: // Exit
                    System.out.println("Exiting program...");
                    break;

                default: // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
