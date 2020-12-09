import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter amount of USD");
        float amount = scanner.nextFloat();
        final int RATE = 23000;
        System.out.println(amount + " USD = "+ 23000*amount+ " VND");
    }
}
