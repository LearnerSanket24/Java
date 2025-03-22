import java.util.Scanner;
public class area {
    public static void main(String[] args){
        double a,b,area;
        Scanner sanket = new Scanner(System.in);
        System.out.print("Enter Length : ");
        a = sanket.nextDouble();
        System.out.print("Enter Breath : ");
        b = sanket.nextDouble();
        area = a * b;
        System.out.println("Area is : " + area);
        sanket.close();
    }
}
