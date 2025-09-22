
import java.util.Scanner;

public class userinputsum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" WELCOME TO OUR CALCULATOR :");
        System.out.println("Please enter your first number : ");
        int firstNum = input.nextInt();
        System.out.println("Please enter your second number : ");
        int secondNum = input.nextInt();
        int Sum = firstNum+secondNum;
        System.out.println("Sum of your number is : " + Sum);
        
       
        input.close();
        
        
    }
    
}
