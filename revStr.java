import java.util.Scanner;

public class revStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str [] = new String[size];
        int len = str.length;
        for(int i =0;i<len;i++){
            str[i]=sc.next();
        }
        for(int i = len-1;i >= 0;i--){
            System.out.print(str[i]+" ");
        }
    }
    
}
