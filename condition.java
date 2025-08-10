public class condition {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 5;
        int largest;
        if (a >= b && a >= c) { //  && DONO BHI STATEMENT TRUE HONI CHAHIYE TABHI RESULT MILEGA 
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("The largest number is: " + largest);

    }
}
