package request.Model;


public class Header {
    private String applicationData = null;
	private String ephemeralPublicKey = null;
	private String publicKeyHash = null;
	private String transactionID = null;
    

	public String getApplicationData() {
		return applicationData;
	}
	public void setApplicationData(String applicationData) {
		this.applicationData = applicationData;
	}
	public String getEphemeralPublicKey() {
		return ephemeralPublicKey;
	}
	public void setEphemeralPublicKey(String ephemeralPublicKey) {
		this.ephemeralPublicKey = ephemeralPublicKey;
	}
	public String getPublicKeyHash() {
		return publicKeyHash;
	}
	public void setPublicKeyHash(String publicKeyHash) {
		this.publicKeyHash = publicKeyHash;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	
	
}