
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Menu {
    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("Selamat datang di PizzaHot, pilih topping: \n1. Daging ($2.00) \n2. Ikan ($1.50)\n3. Jamur ($1.00) \n4. Done");
    }

    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            // daging= $2.00
            System.out.println("Kamu memesan pizza topping Daging");
            itemPrice = 2.00;
        }
        if (foodItem == 2) {
            // ikan = $1.50
            System.out.println("Kamu memesan pizza topping Ikan");
            itemPrice = 1.50;
        }
        if (foodItem == 3) {
            // jamur = $1.00
            System.out.println("Kamu memesan pizza topping Jamur");
            itemPrice = 1.00;
        }
        //quantity();
        return itemPrice;
    }

    public static double quantity() {
        System.out.println("Masukkan jumlah pizza yang ingin dipesan :");
        double quantity = input.nextDouble();
        //subTotal(quantity, itemPrice);
        return quantity;
    }

    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: " + subTotal);
        return subTotal;
    }

    public static void done(double runningTotal) {
        ordering = false;
        System.out.println(runningTotal);
        System.out.println("Selamat menikmati hidangan :)");
    }

    public static void main(String[] args) {
        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);
        double runningTotal=0;
        double jml = 0;
        do{
            menu();
            menuOption = input.nextInt();
            switch(menuOption){
                case 1:
                    foodItem = 1;
                    //runningTotal += itemPrice(foodItem);
                    jml = quantity();
                    runningTotal += subTotal(jml, itemPrice(foodItem));
                    break;
                case 2:
                    foodItem = 2;
                    //runningTotal += itemPrice(foodItem);
                    jml = quantity();
                    runningTotal += subTotal(jml, itemPrice(foodItem));
                    break;
                case 3:
                    foodItem = 3;
                    //runningTotal += itemPrice(foodItem);
                    jml = quantity();
                    runningTotal += subTotal(jml, itemPrice(foodItem));
                    break;
                case 4:
                    done(runningTotal);
                    break;
                default:
                System.out.println("Pilihan tidak tersedia.");
            }
        } while(ordering);
        System.out.println("Total yang harus dibayarkan: " + runningTotal);
    }
}
