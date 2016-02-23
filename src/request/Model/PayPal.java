package request.Model;


public class PayPal {
    private String payerID = null;
	private String token = null;
	private String transactionID = null;
	private String payPalOrderComplete = null;
	private String payPalNotes = null;
    

	public String getPayerID() {
		return payerID;
	}
	public void setPayerID(String payerID) {
		this.payerID = payerID;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getPayPalOrderComplete() {
		return payPalOrderComplete;
	}
	public void setPayPalOrderComplete(String payPalOrderComplete) {
		this.payPalOrderComplete = payPalOrderComplete;
	}
	public String getPayPalNotes() {
		return payPalNotes;
	}
	public void setPayPalNotes(String payPalNotes) {
		this.payPalNotes = payPalNotes;
	}
	
	
}