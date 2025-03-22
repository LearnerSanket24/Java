import java.util.Scanner;
public class madlib {
    public static void main(String[] args){
    String adjective1,noun1,adjective2,verb1,adjective3;
    Scanner sanket = new Scanner(System.in);
    System.out.print("Enter a adjective1 : ");
    adjective1 = sanket.nextLine();
    System.out.print("Enter a noun (animal or person): ");
    noun1 = sanket.nextLine();
    System.out.print("Enter a adjective  : ");
    adjective2 = sanket.nextLine();
    System.out.print("Enter a verb with ing: ");
    verb1 = sanket.nextLine();
    System.out.print("Enter a adjective :  ");
    adjective3 = sanket.nextLine();
    System.out.println("I went to " + adjective1 + " zoo");
    System.out.println(noun1 + " was very " + adjective2 + ".");
    System.out.println(noun1 + " was " + verb1 + " and very " + adjective3 + ".");
    sanket.close();
    }

}
