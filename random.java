import java.util.Random;
public class random {
    public static void main(String[] args){
      Random sanket = new Random();
      int x = sanket.nextInt(1,100);
      int y = sanket.nextInt(1,100);// [1,100) yaad rakhiyo
      int z = sanket.nextInt(1,100);

      System.out.println(x);
      System.out.println(y);
      System.out.println(z);

      boolean isStudent = sanket.nextBoolean();
      if(isStudent){
        System.out.println("Heads");
      }
      else{
        System.out.println("Tails");
      }
      double sanku = sanket.nextDouble(); //0 to 1
      System.out.println(sanku);
    }
}
