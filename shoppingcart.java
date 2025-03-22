import java.util.Scanner;
public class shoppingcart{
    public static void main(String[] args){
        char currency = '$';
        System.out.print("What you want : ");
        Scanner sanket = new Scanner(System.in);
        String item = sanket.nextLine();
        System.out.print("Of how much : ");
        double price = sanket.nextDouble();
        System.out.print("How many : ");
        int quantity = sanket.nextInt();
        System.out.println("Your have bought " + quantity + " "+ item + "/s." );
        System.out.println("Your bill for "+  item +  " is " + currency + price * quantity);
        sanket.close();
    }

}
