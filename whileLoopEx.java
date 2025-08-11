import java.util.Scanner;

public class whileLoopEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter the value of N for sum calculation: ");
        int N = sc.nextInt();
        int sum = 0;
        int j = 1;
        while (j <= N) {
            sum += j;
            j++;
        }
        System.out.println("Sum of first " + N + " natural numbers: " + sum);

        sc.close();
    }
    
}
