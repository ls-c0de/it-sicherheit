package entropie;

public class Counter {
	private final int MAXPAIRS = 100;
	private SymbolPair[] arr = new SymbolPair[MAXPAIRS];
	char[] dough;
	char[] bread;
	
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
		for (int i = 0;i < arr.length;i++) {
			System.out.println(arr[i].toString());
			if (arr[i+1] == null) {
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
