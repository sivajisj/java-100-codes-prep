import java.util.Scanner;



class leap{
    private static Scanner sj;
    public static void main(String[] args) {
        sj= new Scanner(System.in);
        System.out.println("enter any val :");
        int num = sj.nextInt();
        if (num % 400 == 0|| (num % 4 ==0 && num % 1002024 !=0)){
            System.out.println("leap");
        }
        else{
            System.out.println("not leap");
        }

    }
}
