/* Program to calculate sum of n natural numbers */
import java.util.Scanner;
public class sumN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number to find sum");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of numbers found is ");
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("Sum is "+sum);


    }
}