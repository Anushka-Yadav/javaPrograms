/* Program to find average of n numbers */
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int res=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            res = res + arr[i];
        }
        System.out.println("Average is "+ res/n);
    }
    
}
