import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print "siddhant" with counter from 0 to 9
        int counter = 0;
        while (counter < 10) {
            System.out.println("siddhant " + counter);
            counter++;
        }

        // Print numbers from 1 to 10
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        // Take user input for n and print numbers from 1 to n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;

        }
          
        int number = 10889 ;
        int rev = 0 ;

         while (number > 0) {
            int lastDigit = n % 10 ; 
            rev = (rev*10) + lastDigit ;
            n = n/10 ; 
            
         }
         System.out.println(rev);

      

        sc.close();

    }
}