package entropie;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {
		String text = init();
		Counter c = new Counter();
		
		c.countText(text);
		c.output();
	}
	
	public static String init() {
		try {
			String input = new String(Files.readAllBytes(Paths.get("text.txt")), "UTF-8");
			return input;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
