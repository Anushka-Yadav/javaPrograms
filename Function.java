import java.util.Scanner;

public class Function {
//     public static void sumNumbers(int a,int b){
//         int sum=a+b;
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         sumNumbers(a,b);


    // public static int Product(int a,int b){
        
    //    return a*b;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //    System.out.println(Product(a,b));
        
    // }


    public static void Factorial(int n){
        int f=1;
        if(n<0){
            System.out.println("factorial of negative numbernot exist");
            return;
        }
        else if(n==0 || n==1){
            System.out.println("1");
        }
        else{
        
        for(int i=1;i<=n;i++){
            f*=i;  
        }
        }
        System.out.println(f);
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial(n);
    }
    
}
