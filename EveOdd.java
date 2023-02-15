import java.util.Scanner;
public class EveOdd{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int result;

        int x = sc.nextInt();

        if(x%2==0){

            result = 10;

        }
        else{

            result = 20;

        }

        System.out.println(result);
        
    }
}