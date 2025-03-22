import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
         Scanner sanket = new Scanner(System.in);
         System.out.print("Enter you name : ");
         String name = sanket.nextLine();
         //Group1
         //Group 2
         System.out.print("\nEnter your age : ");
         int age = sanket.nextInt();
         //Group 3
         System.out.println("Are you a Student (true/false) : ");
         boolean isStudent = sanket.nextBoolean();
         if(name.isEmpty()){
            System.out.print("You have not entered you name 🤬");
         }
         else{
            System.out.println("Hello " + name + " 😊");
         }
         if(age >= 65){
            System.out.println("You are a Senior Citizen 🧓");
         }
         else if(age >= 18){
            System.out.println("You are an adult 🧑");
         }
         else if(age >= 0){
            System.out.println("You are a baby 👶");
         }
         else if(age <= -1){
              System.out.println("You have been not born yet 🤣");
         }
         if(isStudent){
            System.out.println("You are a Student 🧑‍🎓");
         }
         else{
            System.out.println("you are not a Student 🏠");
         }
         sanket.close();
    }
}
