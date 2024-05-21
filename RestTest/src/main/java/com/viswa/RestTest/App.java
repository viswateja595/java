package com.viswa.RestTest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Map;

import org.json.JSONObject;
/**
 * Hello world!
 *
 */
public class App 
{
	
	private static HttpURLConnection connection;
	
	public static void doBarcodeDiscount(int barcode) {
		BufferedReader reader;
		String line;
		StringBuffer responseContent=new StringBuffer();
		try {
			URL url=new URL("https://jsonmock.hackerrank.com/api/inventory?barcode="+barcode);
			connection=(HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.setReadTimeout(5000);
			connection.setConnectTimeout(5000);
			
			int status=connection.getResponseCode();
			System.out.println(status);
			if(status>299)
			{
				reader=new BufferedReader(new InputStreamReader(connection.getErrorStream()));
				while ((line=reader.readLine())!=null) {
					responseContent.append(line);
				}
				reader.close();
			}
			else {
				reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while ((line=reader.readLine())!=null) {
					responseContent.append(line);
				}
				reader.close();
			}
			
		}
		catch (UnknownHostException e) {
			System.out.println("Network Unavailable");
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println(responseContent.toString());
		
	}
	
	public static void main(String[] args) {
		
		doBarcodeDiscount(74001755);
	}
}
