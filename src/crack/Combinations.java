package crack;

import java.util.Arrays;

public class Combinations {
	
	public static void generateCombinations(char[] alphabet, int[] sha1Hash, int maxStellen) {
        int cnt = 0;
        
		for (int len = 1; len <= maxStellen; len++) { // Alle Längen durchlaufen
            int totalCombinations = (int) Math.pow(alphabet.length, len);

            for (int i = 0; i < totalCombinations; i++) {
                StringBuilder combination = new StringBuilder();

                int num = i;
                for (int j = 0; j < len; j++) { // Kombination für aktuelle Länge generieren
                    combination.insert(0, alphabet[num % alphabet.length]);
                    num /= alphabet.length;
                    
                    cnt++;
                }

                //System.out.println(combination); //compare
            }
            
            double progress = (double) totalCombinations / (double) cnt;
            System.out.println("Progress: " + progress);
        }
		
    }
    
	
	private boolean compArr(int[] a, int[] b) {
		if(Arrays.equals(a, b)) return true;
		return false;
	}
	
	/*
	 * legacy DONT USE THIS!
	 */
	private static String combinations(char[] alphabet, int[]sha1Hash, int maxStellen) {
		int totalPossibilities = maxStellen * alphabet.length;
		int cnt = 0;
		
		for (int i = 0; i < maxStellen; i++) {
			String concat = ""+ alphabet[i];
			for (int j = 0; j < alphabet.length; j++) {
				System.out.println(concat + alphabet[j]);
			}
		}
		
//		for (int lvl = 0; lvl < maxStellen; lvl++) {
//			for (int j = 0; j < alphabet.length; j++) {
//				char temp;
//				for (int h = 0; h < alphabet.length; h++) {
//					cnt++;
//					System.out.println(alphabet[h]);
//				}
//				
//			}
//		}
		
		for (int i = 0; i < maxStellen; i++) {
			String concat = ""+ alphabet[i];
			for (int j = 0; j < alphabet.length; j++) {
				System.out.println(concat + alphabet[j]);
			}
		}
		
		
		return "";
	}

}
