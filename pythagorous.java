import java.util.Scanner;
public class pythagorous {
    public static void main(String[] args){
      Scanner sanket = new Scanner(System.in);
      System.out.print("Enter value of A : ");
      double a = sanket.nextDouble();
      System.out.print("Enter value of B : ");
      double b = sanket.nextDouble();
      double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
      System.out.println("Value of hypotenuse is : " + c);
      sanket.close();
    }
}
