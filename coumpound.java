/* Program to found compound intrest */               /*   A = P(1+r/n)^t */
import java.util.Scanner;
public class coumpound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("principal rate ");
        double p = sc.nextInt();
        System.out.println("rate ");
        double r = sc.nextDouble();
        System.out.println("time of compound intrest in years ");
        double t = sc.nextDouble();
        double store = 1+r/100;
        double res = 1;
        if(t==1 && store>=0){
            res = 1;

        }
        else if (t>=0 && store==0){
            res = 0;
        }
        else{
            for(double i=0;i<t;i++){
                res = res * store;
            }
        }
        double a = p*res;
        System.out.println("Compound interet is "+a);
    }
    
}
