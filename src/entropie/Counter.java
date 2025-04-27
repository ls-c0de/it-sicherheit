package entropie;

public class Counter {
	private final int MAXPAIRS = 100;
	private SymbolPair[] arr = new SymbolPair[MAXPAIRS];
	char[] dough;
	
	public void countText(String text) {
		dough = text.toCharArray();

		for (int i = 0; i < dough.length; i++) {
			einordnen(dough[i]);
		}
	}

	public void output() {
		for (SymbolPair s : arr) {
			System.out.println(s.toString());
		}
	}
	
	private void einordnen(char symbol) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = new SymbolPair(symbol);
				break;
			}
			if (arr[i].compare(symbol)) {
				arr[i].addOne();
			}
		}
	}
}
