import java.nio.file.ProviderMismatchException;

public class Swap {
    public static void main(String args[]){
        int a = 6;
        int b = 5;
        a = a - b;
        b = b + a;
        a = b - a;
        System.out.println(a);
        System.out.println(b);
    }
}
