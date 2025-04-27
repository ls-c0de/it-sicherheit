package entropie;

public class Counter {
	private final int MAXPAIRS = 100;
	private SymbolPair[] arr = new SymbolPair[MAXPAIRS];
	char[] dough;
	char[] bread;
	int anzahlSymbole = 0;
	
	public void countText(String text) {
		String bereinigterText = text.replaceAll("[\\n\\r\\t ]", "");
		
		bread = bereinigterText.toCharArray();
		
		for (int i = 0; i < bread.length; i++) {
			einordnen(bread[i]);
		}
	}

	public void output() {
//		for (SymbolPair s : arr) {
//			System.out.println(s.toString());
//		}
		int zeichenGes = bread.length;
		
		for (int i = 0;i < arr.length;i++) {
			arr[i].compute(zeichenGes);
			System.out.println(arr[i].toString());
			if (arr[i+1] == null) {
				anzahlSymbole = i+1;
				break;
			}
		}
		System.out.println("\n\n Zeichen gesamt: " + bread.length);
	}

//	private void einordnenOLD(char symbol) {
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].compare(symbol)) {
//				arr[i].addOne();
//			}
//			if (arr[i] == null) {
//				arr[i].addOne();
//				break;
//			} else
//				arr[i] = new SymbolPair(symbol);
//		}
//	}
	
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
