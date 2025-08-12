public class forLoop {
    public static void main(String[] args) {
        // for(int line = 1 ; line <= 4 ; line ++ ) {
        //     System.out.println("****");
        // }

// reverse counting

// for(int number = 100 ; number >= 1 ; number--){
//   System.out.println(number);
  
//         }

        
// print reaverse of a number 

int n = 3104 ; 

while(n > 0) {
    int lastDigit = n%10 ; 
    System.out.print(lastDigit);
    n = n/10 ; // or  n/=10 ; 

}
  System.out.println();
    
    }
}

 
