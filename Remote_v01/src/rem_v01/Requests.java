package rem_v01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/**
 * @author Cieœlak Jacek 29487|
 * 			Karol Maciej 29687
 *
 */
public class Requests extends Main{
	
	static int r1, r2, r3, r4;
	static String parametry;
	public static HttpsURLConnection conn;
	
	/*METODA USTAWIAJ¥CA PARAMETRY DO PRZEKAZANIA METOD¥ GET*/
	public static void ustaw (String txt1, String txt2, String txt3, String txt4) {
		
		if (txt1.equals("W£¥CZONE")) r1=1;
		if (txt1.equals("WY£¥CZONE")) r1=0;
		
		if (txt2.equals("W£¥CZONE")) r2=1;
		if (txt2.equals("WY£¥CZONE")) r2=0;
		
		if (txt3.equals("W£¥CZONE")) r3=1;
		if (txt3.equals("WY£¥CZONE")) r3=0;
		
		if (txt4.equals("W£¥CZONE")) r4=1;
		if (txt4.equals("WY£¥CZONE")) r4=0;
		
		parametry = ("p1="+r1+"&p2="+r2+"&p3="+r3+"&p4="+r4);
	}
	
	/*METODA WYSY£AJ¥CA ZAPYTANIA NA SERWER*/
	public static void sendRequest() throws Exception {
		
		String server_url = ("http://192.168.1.64/light.php?"+parametry);		
		URL url = new URL (server_url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("GET");
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
	}

}
