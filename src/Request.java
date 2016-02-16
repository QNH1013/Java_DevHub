package request;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class Request<T extends Request<?>> {

	private transient String url;
	private transient String method;
	protected transient HashMap<String,String> queryParams = new HashMap<String,String>();

	public Request(String category, String proxy, String endpoint, String method) {

		this.url = "https://" + Config.baseEndpoint + "/" + category + "/sp2/" + proxy + "/v" + Config.version + "/" + endpoint;
		this.method = method;
	}

	public String send() {
		if (Config.doNotSend) {
			return this.toJSON();
		}
		HttpsURLConnection connection = null;
		try {
			String queryParamString = "";
			if(!queryParams.isEmpty()) {
				queryParamString = "?";
				for(String key : queryParams.keySet()) {
					queryParamString += key + "=" + queryParams.get(key) + "&";
				}
				queryParamString = queryParamString.substring(0,queryParamString.length()-1);
			}
			URL url = new URL(this.url + queryParamString);
			if (Config.proxy != null) {
				connection = (HttpsURLConnection) url.openConnection(Config.proxy);
				if (Config.proxyAuth != null) {
					connection.setRequestProperty("Proxy-Authorization", "Basic " + Config.proxyAuth);
				}
			} else {
				connection = (HttpsURLConnection) url.openConnection();
			}
			connection.setDoOutput(true);
			connection.setRequestMethod(method);
			connection.setRequestProperty("Authorization", "VANTIV license=\"" + Config.license + "\"");
			if(!method.equals("GET")) {
				connection.setDoInput(true);
				connection.setRequestProperty("Content-Type", "application/json");
				DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
				wr.writeBytes(this.toJSON());
				wr.close();
			}

			return getResponse(connection.getInputStream());
		} catch (Exception e) {
			try {
				return getResponse(connection.getErrorStream());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		return null;
	}

	private String getResponse(InputStream is) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(is));
		StringBuilder response = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			response.append(line);
			response.append('\r');
		}
		rd.close();
		String responseString = response.toString();
		if (Config.printResponse)
			System.out.println(responseString);
		return responseString;
	}

	@SuppressWarnings("unchecked")
	public String toJSON() {
		Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
		String request = gson.toJson((T) this);
		if (Config.printRequest)
			System.out.println(request);
		return request;
	}

}
