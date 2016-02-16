package request;

import java.net.Proxy;

public class Config {

	public static String license = "";
	public static String baseEndpoint = "apis.cert.vantiv.com";
	public static int version = 1;
	public static Proxy proxy = null;
	public static String proxyAuth = "";
	
	// debugging assistance
	public static boolean printRequest = false;
	public static boolean printResponse = false;
	public static boolean doNotSend = false;
}
