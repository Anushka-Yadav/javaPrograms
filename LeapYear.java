import java.util.Scanner;
public class LeapYear {
    public static boolean isLeap(int n) {
        
        if(n%4 == 0 ){
            if(n%100 == 0 && n%400 == 0){
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        
            System.out.println("Enter Year : ");
            int n = sc.nextInt();  
        if(isLeap(n)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    
    }
}
