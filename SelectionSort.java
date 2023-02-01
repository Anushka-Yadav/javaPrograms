import java.util.Scanner;

public class SelectionSort {

    public static void Print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n-1;i++){
            int smallest = i;
            for(int j=i+1;j<n-1;j++){
                if(arr[smallest] > arr[j])
                    smallest = j;
            }
        
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }
    
Print(arr);
}
}