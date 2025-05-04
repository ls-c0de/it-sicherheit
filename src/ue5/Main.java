package ue5;

import java.util.Random;

public class Main {
	private static int bitlength = 8;
	private static int maxZahlen = 10;
	private static int maxTrys = 10000;

	public static void main(String[] args) {
		int[] collisioncnt = new int[maxTrys];
		
		for (int trys = 0; trys < maxTrys; trys++) {

			int[] numbers = new int[maxZahlen];
			int collisions = 0;
			// generate X random numbers
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = createRandomNumber(bitlength);

				// check for collisions
				for (int j = 0; j < i; j++) {
					if (numbers[j] == numbers[i]) {
						collisions++;
					}
				}
			}
			collisioncnt[trys] = collisions;
			System.out.println("Try " + trys + ": " + collisions);
		}
		
		//Auswertung
		System.out.println("\n %: " + (double) maxTrys/ (double) auswertung(collisioncnt));
	}

	private static int auswertung(int[] collisioncnt) {
		int totalColl = 0;
		for (int i = 0; i < collisioncnt.length; i++) {
			if(collisioncnt[i] != 0) {
				totalColl++;
			}
		}
		
		return totalColl;
	}
	
	private static int createRandomNumber(int bitlength) {
		Random rng = new Random();
		int number = rng.nextInt((int) Math.pow(2, bitlength));
		return number;
	}
}