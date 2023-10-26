import java.util.Scanner;

public class Even_odd {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        //nested if else method
        if (num % 2 == 0){
            System.out.println("even number");

        }
        else{
            System.out.println("odd number");
        }
        // Ternary operator
        String res = num > 0 ? "positive" : "Negative";
        System.out.println(res);
        
    }
    
}
