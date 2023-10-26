import java.util.Scanner;



class leap{
    private static Scanner sj;
    public static void main(String[] args) {
        sj= new Scanner(System.in);
        System.out.println("enter any val :");
        int year = sj.nextInt();
        if (year % 400 == 0|| (year % 4 ==0 && year % 100 !=0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }

    }
}
