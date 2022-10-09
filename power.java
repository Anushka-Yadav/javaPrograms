/* Program to calculate power of given number */
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number ");
    long n = sc.nextLong();
    System.out.println("Enter power ");
    long pow = sc.nextLong();
    long r=1;
    if(pow==1 && n>=0){
        r=1;
    }
    else if(pow>=0 && n==0){
        r=0;
    }
    else{
        for (int i=1;i<=pow;i++){
            r = r*n;
        }
        System.out.println(n+"num to the power "+pow+" is "+r);
    }
    }
    
}

