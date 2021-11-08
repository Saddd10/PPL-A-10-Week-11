package farm;

import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);
	
	public static int quantity() {
        System.out.println("Input Quantity :");
        int quantity = input.nextInt();
        //subTotal(quantity, itemPrice);
        return quantity;
    }
	
	public static void printAnimal(int jml,String name) {
		int i=1;
		do {
			System.out.println(name + " " + i++);
		}while(i<=jml);
    }
	
	public static void main(String[] args) {
		String name = null;
        int jml = 0;
		Scanner scn = new Scanner(System.in);
        int ch1,ch2;
		System.out.println("\nChoose Animal :\n1.Sheep \n2.Chicken\n");
        ch1 = scn.nextInt();
        switch(ch1){
            case 1: 
	            //runningTotal += itemPrice(foodItem);
	            jml = quantity();
	            name = "Sheep";
	            printAnimal(jml,name);
                break;
            case 2:
	            //runningTotal += itemPrice(foodItem);
	            jml = quantity();
	            name = "Chicken";
	            printAnimal(jml,name);
                break;
            case 3: break;
        }
	}
}
