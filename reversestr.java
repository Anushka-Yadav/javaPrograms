/* Program to print reverse string of a given string */
import java.util.Scanner;
public class reversestr {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the String:-)");
    String str = sc.nextLine();
    char[] ch = str.toCharArray();
    int j = ch.length;
    for( int i=j;i >0 ; i--){
        System.out.println((ch[i-1]));
    }

}
    
}
