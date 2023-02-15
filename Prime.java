import java.util.Scanner;
public class Prime {
    public static boolean prime(int n){
        
        
        int i = 2;
        while ( i < n ){
            if(n%i == 0){
                return false;
            }
            i++;
            
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 11;
        if(prime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        
    
}
}
