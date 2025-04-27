package entropie;

public class SymbolPair {
	private char symbol;
	private int anzahl = 1;
	
	public SymbolPair(char symbol) {
		this.symbol = symbol;
	}
	
	public boolean compare(char s) {
		if (symbol == s) {
			return true;
		}
		return false;
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
		return "Symbol: " + symbol + ", Anzahl: " + anzahl;
	}

}
