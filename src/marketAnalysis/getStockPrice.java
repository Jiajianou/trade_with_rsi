package marketAnalysis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class getStockPrice {
	
	private double currentPrice;
	
	
	
	
	
	public static void main (String args[]) throws IOException {
		
		final String SYM = "AAPL";
		
		URL url = new URL("https://finance.google.com/finance?q=NASDAQ%3AAAPL&ei=EOqxWdiYCpOWeaz2mKgP");
		URLConnection urlConn = url.openConnection();
		
		InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
		
		BufferedReader buff = new BufferedReader(inStream);
		
		String line = buff.readLine();
		
		while(line != null) {
				if (line.contains("content="))
				System.out.println(line);
				
				
			
				line = buff.readLine();
		}
	}
	
	

}
