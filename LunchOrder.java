package LunchOrder;

import java.util.Scanner;

public class LunchOrder {

	public static void main(String[] args) {
		double numHam = 0;
		double numSalad=0;
		double numFries=0;
		double numSoda=0;
		
		Scanner scan = new Scanner(System.in);
		Food food = new Food();
		Food ham = new Food("1.85", "9.0g of Fat", "33.0 g of Carbs", "1.0g of Fiber");
		Food salad = new Food("2.00", "1.0g of Fat", "11.0 g of Carbs", "5.0g of Fiber");
		Food fries = new Food("1.30", "11.0g of Fat", "36.0g of Carbs", "4.0g of Fiber");
		Food soda = new Food("0.95", "0g of Fat","38.0g of Carbs","0g of Fiber");

		boolean repeat = true;
		
		while(repeat ==true) {
			System.out.print("Enter number of Hamburgers: ");
			String hamNumber = scan.nextLine();
			if(food.validateNum(hamNumber, 0, 99) == true) {
				System.out.println("Each Hamburger has " + ham.getFat() + " , " + ham.getCarbs() + " , " + ham.getFiber());
				numHam = Integer.parseInt(hamNumber);
				repeat = false;
			}
			else {
				repeat = true;
			}
		}
		boolean repeat1 = true;
		while(repeat1 ==true) {
		System.out.print("Enter number of Salad: ");
		String saladNumber = scan.nextLine();
		if(food.validateNum(saladNumber, 0, 99) == true) {
			System.out.println("Each Salad has " + salad.getFat() + " , " + salad.getCarbs() + " , " + salad.getFiber());
			numSalad = Integer.parseInt(saladNumber);
		repeat1 = false;
		}
		else {
			repeat1 = true;
			}
		}
		boolean repeat2 = true;
		while(repeat2 ==true) {
		System.out.print("Enter number of Fries: ");
		String friesNumber = scan.nextLine();
		if(food.validateNum(friesNumber, 0, 99) == true) {
		System.out.println("Each French fries has "+ fries.getFat() + " , " + fries.getCarbs() + " , " + fries.getFiber());
		numFries = Integer.parseInt(friesNumber);
		repeat2 = false;
		}
		else {
			repeat2 = true;
			}
		}
		boolean repeat3 = true;
		while(repeat3 ==true) {
		System.out.print("Enter number of Soda: ");
		String sodaNumber = scan.nextLine();
		if(food.validateNum(sodaNumber, 0, 99) == true) {
		System.out.println("Each Soda has " + soda.getFat() + " , " + soda.getCarbs() + " , " + soda.getFiber());
		numSoda = Integer.parseInt(sodaNumber);
		repeat3 = false;
		}
		else {
			repeat3 = true;
			}
		}
		double hamPrice = Double.parseDouble(ham.getPrice());
		double saladPrice = Double.parseDouble(salad.getPrice());
		double friesPrice = Double.parseDouble(fries.getPrice());
		double sodaPrice = Double.parseDouble(soda.getPrice());
		
		
		double total = (numHam * hamPrice)+(numSalad * saladPrice)+(numFries * friesPrice) + (numSoda * sodaPrice);
		double totalPrice = Math.round(total*100.0)/100.0;		
		System.out.println("\nYour order comes to: $" + totalPrice);
		scan.close();
	}
}
