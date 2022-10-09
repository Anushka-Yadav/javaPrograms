/* Program to find price of a product after discount */
import java.util.Scanner;
public class discount{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double price = sc.nextDouble();
    double discount = sc.nextDouble();
    double rest = (price*discount)/100;
    price = price - rest;
    System.out.println("discount is " + discount);
    System.out.println("price after discont is " + price);

}
}