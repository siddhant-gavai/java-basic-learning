import java.util.*;

public class javaBasic {

    public static void main (String args[]){
        
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // int a = 10 ; 
        // int b = 45 ; 
        // int sum = a + b ; 

        // System.out.println(sum); 

        
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int userInput = sc.nextInt();
        // System.out.println("You entered: " + userInput);
        
        System.out.print("enter a First number : ");
        int a = sc.nextInt();
        System.out.print("enter a Second  number : ");
        int b = sc.nextInt();
        int sum = a + b  ;  

        System.out.println("Sum of two numbers is : " + sum);
        sc.close();

         
    }

}