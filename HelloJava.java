import java.util.Random;

public class HelloJava {

    public static void main(String[] args) {
      Random randomNum = new Random();
      int showMe = randomNum.nextInt(100);
      System.out.println("Random number between 1 and 100 " + "\n My random number is " + showMe);
    }
}
