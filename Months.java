import java.util.Scanner;

import javax.xml.transform.Source;
public class Months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        
       
        if(c == 11 || c == 1 || c == 12 || c == 2 ){
            System.out.println("Winter");
        }
        else if(c == 3 || c == 4 || c == 5 || c == 6){
            System.out.println("summer");
        }
        else if(c == 7 || c == 8 || c == 9 || c == 10){
            System.out.println("Rainy");
        }
        else{
            System.out.println("Wrong Input");
        }
    
    }
    
}
