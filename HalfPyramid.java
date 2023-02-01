import java.util.*;
public class HalfPyramid{
   public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }   
        for(int i=n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }   
    
             for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }  
    
    for(int i = n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        }   
    
        int number = 1;
    for(int i=1;i<=n;i++){
        for(int j = 1;j<=i;j++){
            System.out.print(number+" ");
            number++;
        }  
        System.out.println(); 
    }


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


            for(int i=1;i<=n;i++){
                int spaces=n-i;
                for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();

            }


            for(int i=1;i<=n;i++){
                int space=n-i;
                for(int j=1;j<=space;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }

            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //for first half
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();

            }


            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                
                System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                
                System.out.println();
            }



    }
}
    

