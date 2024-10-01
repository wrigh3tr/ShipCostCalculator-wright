import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double itemPrice = 0.00;
        final double Ship_Rate = .02;
        final double FREE_Ship = 100.00;
        double shipCost = 0.00;
        double totalCost = 0;
        String trash = "";
        System.out.println("Enter the item Price: ");
        if (console.hasNextInt()) {
            itemPrice = console.nextDouble();
            console.nextLine();
            if (itemPrice >= FREE_Ship) {
                shipCost = 0;
                System.out.println("Your Shipping Cost is " + shipCost + " and Price is " + itemPrice);

            } else {
                shipCost = Ship_Rate * itemPrice;
                totalCost = itemPrice + shipCost;
            }
        } else {
            trash = console.nextLine();
            System.out.println("Enter a Valid Input " + trash + " is not a Number");
            System.out.println("Run the Program again ");
        }
    }
}





