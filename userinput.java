import java.util.Scanner;
public class userinput {
    
    public static void main(String[] args){
      Scanner sanket = new Scanner(System.in);
      System.out.print("Enter your Name : ");
      String jaan = sanket.nextLine();
      System.out.print("Enter your Age : ");
      int x = sanket.nextInt();
      System.out.print("Enter your CGPA : ");
      double y = sanket.nextDouble();
      System.out.print("Are you a Student (true/false): ");
      boolean isStudent = sanket.nextBoolean();
      System.out.println( "Age is : "+ x);
      System.out.println("CGPA : " + y);
      System.out.println("Name : " + jaan);
      System.out.println(isStudent);
      if(isStudent){
        System.out.println("You are admitted");
      }
      else{
        System.out.println("You are not admitted");
      }
      sanket.close();
    }
}
