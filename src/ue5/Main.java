package ue5;

import java.util.HashSet;
import java.util.Random;

public class Main {
	private static int bits = 8;
	private static int maxZahlen = 10;
	private static final int MAX_TRIES = 10000;
	private static final Random rng = new Random();
	
	
	public static void main(String[] args) {
		int[] collisionsPerTry = new int[MAX_TRIES];
		
		for (int trys = 0; trys < MAX_TRIES; trys++) {

			HashSet<Integer> hash = new HashSet<>();
			int[] numbers = new int[maxZahlen];
			int collisions = 0;
			
			// generate X random numbers
			for (int i = 0; i < numbers.length; i++) {
				int number = createRandomNumber(bits);
				
				// check for collisions 
				if (hash.contains(number)) {
					collisions++;
				}

				hash.add(number);
			}
			collisionsPerTry[trys] = collisions;
			System.out.println("Try " + trys + ": " + collisions);
		}
		
		//Auswertung
		System.out.println("\n %: " + (double) auswertung(collisionsPerTry) / (double) MAX_TRIES );
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
		//Random rng = new Random();
		int number = rng.nextInt(1 << bitlength);
		return number;
	}
}