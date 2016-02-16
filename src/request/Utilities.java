package request;

import java.util.Map;
import java.util.Set;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Utilities {
	
	/**
	 * Converts a JSON formatted string to a Gson JsonObject.
	 * @param input The string to be converted
	 * @return the JsonObject
	 */
	public static JsonObject toJson(String input) {
		JsonParser parser = new JsonParser();
		return parser.parse(input).getAsJsonObject();
	}
	
	/**
	 * Extracts the transactionID from a response object
	 * @param response must be the response of a transaction
	 * @return the transactionID as a String or null if not found
	 */
	public static String getTransactionID(String response) {
		return getTransactionID(toJson(response));
	}
	
	/**
	 * Extracts the transactionID from a response object
	 * @param response must be the response of a transaction
	 * @return the transactionID as a String or null if not found
	 */
	public static String getTransactionID(JsonObject response) {
		JsonElement litleOnlineResponse = response.get("litleOnlineResponse");
		if(litleOnlineResponse!=null) {
			response = litleOnlineResponse.getAsJsonObject();
			Set<Map.Entry<String,JsonElement>> entrySet=response.entrySet();
			for(Map.Entry<String,JsonElement> entry:entrySet){
				if(entry.getKey().matches("[^@].*")) {
					response = entry.getValue().getAsJsonObject();
					JsonElement transactionID = response.get("TransactionID");
					if(transactionID!=null) {
						return transactionID.getAsString();
					}
				}
			}
		}
		return null;
	}
	
	

}