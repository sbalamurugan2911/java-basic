package Project;

import java.util.Scanner;

public class EB_calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double units, balanceUnits, amount = 0;
		char wish;
		do {
			System.out.println(
					"\n===================TNEB Bill calculator===================\n\n Enter consumed units : ");
			units = sc.nextDouble();

			if (units >= 0 && units <= 100) {

			} else if (units >= 101 && units <= 200) {
				balanceUnits = units - 100;
				amount = balanceUnits * 2.25;
			} else if (units >= 201 && units <= 400) {
				balanceUnits = units - 200;
				amount = 225 + (balanceUnits * 4.50);
			} else if (units >= 401 && units <= 500) {
				balanceUnits = units - 400;
				amount = 225 + 900 + (balanceUnits * 6);
			} else if (units >= 501 && units <= 600) {
				balanceUnits = units - 500;
				amount = 1350 + 600 + (balanceUnits * 8);
			} else if (units >= 601 && units <= 800) {
				balanceUnits = units - 600;
				amount = 1350 + 600 + 800 + (balanceUnits * 9);
			} else if (units >= 801 && units <= 1000) {
				balanceUnits = units - 800;
				amount = 1350 + 600 + 800 + 1800 + (balanceUnits * 10);
			} else if (units >= 1001) {
				balanceUnits = units - 1000;
				amount = 1350 + 600 + 800 + 1800 + 2000 + (balanceUnits * 11);
			} else {
				System.out.println("enter valid number.");
				break;
			}
			System.out.println(" Your bill amount is : " + amount);
			System.out.println("\n Do you want to continue?  press(y/n)");
			wish=sc.next().charAt(0);
		
		} while (wish == 'y' || wish == 'Y');
	}
}
