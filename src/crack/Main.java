package crack;

public class Main {
	public static void main(String[] args) {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] easy = "abc".toCharArray();
		
		//Combinations.generateCombinations(alphabet, null, 6);
		Combinations2.generateCombinations(alphabet, null, 3);
	}
}
