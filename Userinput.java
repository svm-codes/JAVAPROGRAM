 import java.util.Scanner;
 public class Userinput {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("please enter your name=");
    String name = input.nextLine();
    System.out.print("gud morning...." + name);
     input.close();

    }
}
