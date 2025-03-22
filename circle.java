import java.util.Scanner;
public class circle {
    public static void main(String[] args){
        System.out.print("Enter radius : ");
        Scanner sanket = new Scanner(System.in);
        double radius = sanket.nextDouble();
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);
        double vol = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        System.out.println("The circumference of circle is : "+ circumference + "cm");
        System.out.println("the area of circle is : "+ area + "cm²");
        System.out.println("Volume is : " + vol + "cm³");




        System.out.printf("The circumference of circle is : %.5f\n",circumference);
        System.out.printf("the area of circle is : %.0f\n",area);
        System.out.printf("Volume is : %.3f\n",vol);
        sanket.close();
    }
}
