import java.util.Scanner;
public class AreaRect{
    public static int Area(int l, int b){
        int ar = l * b;
        return ar;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Area(l , b));

    }
}