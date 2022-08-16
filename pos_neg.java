import java.util.Scanner;

class post{
    public static void main(String[] args) {
        Scanner uy = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = uy.nextInt();
        
    if (num>=0){
        if (num == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("positive");
        }
    }
    else{
        System.out.println("negative");
    }
    }
}