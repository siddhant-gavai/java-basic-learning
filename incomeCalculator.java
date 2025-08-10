import java.util.Scanner;

public class incomeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();
        double tax = calculateTax(income);
        System.out.printf("Your income tax is: %.2f\n", tax);
        sc.close();
    }

    
    public static double calculateTax(double income) {
        double tax = 0;
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (250000 * 0.05) + (income - 500000) * 0.2;
        } else {
            tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3;
        }
        return tax;
    }
}
