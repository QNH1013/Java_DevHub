package request.Model;
import request.Model.Header;

public class Applepay {
    private String data = null;
	private Header header = null;
	private String signature = null;
	private String version = null;
    

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	
}