import java.util.Scanner;
public class compundinyerest {
    public static void main(String [] args){
        Scanner sanket = new Scanner(System.in);
        System.out.print("Enter principle : ");
        double principle = sanket.nextDouble();
        System.out.print("Enter rate : ");
        double rate = sanket.nextDouble() / 100;
        System.out.print("Enter timescompounded : ");
        double timescompounded = sanket.nextDouble();
        System.out.print("Enter years : ");
        double years = sanket.nextDouble();
        double amount = principle * Math.pow(1 + (rate/timescompounded),timescompounded * years);
        System.out.printf("Your amount is ₹%,3.3f",amount);
    }
}
