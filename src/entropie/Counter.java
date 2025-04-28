package entropie;

public class Counter {
	private final int MAXPAIRS = 100;
	private SymbolPair[] arr = new SymbolPair[MAXPAIRS];
	private char[] bread;
	private int anzahlSymbole = 0;
	private double avgiFromS;

	private void computeShannon(int anz) {
		double sum = 0;
		for (int i = 0;i<anz;i++) {
			sum += arr[i].getiFromS();
		}
		
		avgiFromS = sum/anz;
	}
	
	public void countText(String text) {
		String bereinigterText = text.replaceAll("[\\n\\r\\t ]", "");
		
		bread = bereinigterText.toCharArray();
		
		for (int i = 0; i < bread.length; i++) {
			einordnen(bread[i]);
		}
	}

	public void output() {

		int zeichenGes = bread.length;
		
		for (int i = 0;i < arr.length;i++) {
			arr[i].compute(zeichenGes);
			System.out.println(arr[i].toString());
			if (arr[i+1] == null) {
				computeShannon(i);
				anzahlSymbole = i+1;
				break;
			}
		}
		System.out.println("\n\n Zeichen gesamt: " + bread.length);
		System.out.println(" Shannon-Entropie in bit: " + SymbolPair.getEntropie());
		System.out.println(" zeichenbasierte Shannon Entropie: " + avgiFromS);
		System.out.println(" Min-Entropie: " + arr[6].getiFromS());
	}
	
	private void einordnen(char symbol) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = new SymbolPair(symbol);
				break;
			}
			if (arr[i].compare(symbol)) {
				arr[i].addOne();
				break;
			}
		}
	}

}
