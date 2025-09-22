import java.util.Scanner;

public class Questionpractice {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();  // Correct capitalization
        System.out.println("Your name is: " + name);
        input.close(); 
    }
    
}
