package crack;

public class Combinations2 {
	public static void generateCombinations(char[] alphabet, int[] sha1Hash, int maxStellen) {
        int totalLength = alphabet.length * maxStellen;
        int index = 0;
        char[] scatter = new char[maxStellen];
        
        while (index <= maxStellen) {
        	for (int i = 0;i < alphabet.length;i++) {
        		scatter[index] = alphabet[i];
        	}
        	System.out.println(scatter.toString());
        	
        	index++;
        }
        
        
		
    }
}
