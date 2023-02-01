import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] Array  = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                Array[i][j]=sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i=1;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(x==Array[i][j]){
                    System.out.println("found at "+i+","+j);
                }
            }
        

        }


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
        
        }
        


    }
    

