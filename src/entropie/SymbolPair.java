package entropie;

public class SymbolPair {
	private char symbol;
	private int anzahl = 1;
	private double relHauf;
	private double iFromS;
	
	private static int maxAnzahl;
	private static double entropie;
	
	public SymbolPair(char symbol) {
		this.symbol = symbol;
	}
	
	public boolean compare(char s) {
		if (symbol == s) {
			return true;
		}
		return false;
	}
	
	public void compute(int anz) {
		maxAnzahl = anz;
		relHauf =  (double) anzahl / (double) maxAnzahl;
		iFromS = - (Math.log10(relHauf) / Math.log10(2));
		entropie += relHauf * iFromS;
	}
	/**
	 * Adds 1 to the anzahl count.
	 * 
	 * not threadsafe!
	 */
	public void addOne() {
		anzahl++;
	}
	
	public int getAnzahl() {
		return anzahl;
	}
	
	public char getSymbol() {
		return symbol;
	}
	
	public String toString() {
		return "Symbol: " + symbol + ", Anzahl: " + anzahl + ", Wsl: " + relHauf + ", i(s): " + iFromS;
	}

	public double getRelHauf() {
		return relHauf;
	}
	
	public double getiFromS() {
		return iFromS;
	}

	public static double getEntropie() {
		return entropie;
	}

}
