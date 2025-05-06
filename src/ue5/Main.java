package ue5;

import java.util.HashSet;
import java.util.Random;

public class Main {
	private static int bits = 8;
	private static int maxZahlen = 10;
	private static int maxTrys = 1000000;

	public static void main(String[] args) {
		int[] collisioncnt = new int[maxTrys];
		
		for (int trys = 0; trys < maxTrys; trys++) {

			HashSet<Integer> hash = new HashSet<>();
			int[] numbers = new int[maxZahlen];
			int collisions = 0;
			
			// generate X random numbers
			for (int i = 0; i < numbers.length; i++) {
				int number = createRandomNumber(bits);
				hash.add(number);

				// check for collisions
				// Hashset, Kollision checken 
				if (hash.contains(number)) {
					collisions++;
				}
				
			}
			collisioncnt[trys] = collisions;
			System.out.println("Try " + trys + ": " + collisions);
		}
		
		//Auswertung
		System.out.println("\n %: " + (double) auswertung(collisioncnt) / (double) maxTrys );
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