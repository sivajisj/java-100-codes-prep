import java.util.Scanner;
import javax.security.sasl.SaslException;
class prime{
    private static Scanner sj;
    public static void main(String[] args) {
        sj= new Scanner(System.in);
        System.out.println("enter any val :");
        int num = sj.nextInt();
       // int num = 22;
        boolean isPrime=true;
        //optimized solutioin. iterations are redused to n/2 times

        if(num<2){
            isPrime=false;
        }
        else{
            for (int i=2;i<=num/2;i++){
                if (num % i == 0){
                    isPrime=false;
                    break;
                }
            }
        }
        String res = isPrime ? " is Prime":"not prime" ;
        System.out.println("the number "+num+" is "+res);
      }
        
    }