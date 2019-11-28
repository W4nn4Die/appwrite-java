import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MakeCall {
  public static void MakeCall(String[] args) {
	try {
	  URL url = new URL("http://localhost/v1/users");
	  HttpURLConnection c = (HttpURLConnection) url.openConnection();
	  c.setRequestMethod("GET");
	  c.setRequestProperty("Accept", "applicaction/json");
	  BufferedReader b = new BufferedReader(new InputStreamReader(c.getInputStream()));
	  String output;
	  System.out.println("Output from server:");
	  while ((output = b.readLine()) != null) {
		System.out.println(output);
	  }
	  
	} catch (MalformedURLException e) {
	  e.printStackTrace();
	} catch (IOException e) {
	  e.printStackTrace();
	}
  }
}