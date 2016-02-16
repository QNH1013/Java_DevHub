package request.Model;


public class FraudCheck {
    private String authenticationValue = null;
	private String authenticationTransactionID = null;
	private String customerIpAddress = null;
	private String authenticatedByMerchant = null;
    

	public String getAuthenticationValue() {
		return authenticationValue;
	}
	public void setAuthenticationValue(String authenticationValue) {
		this.authenticationValue = authenticationValue;
	}
	public String getAuthenticationTransactionID() {
		return authenticationTransactionID;
	}
	public void setAuthenticationTransactionID(String authenticationTransactionID) {
		this.authenticationTransactionID = authenticationTransactionID;
	}
	public String getCustomerIpAddress() {
		return customerIpAddress;
	}
	public void setCustomerIpAddress(String customerIpAddress) {
		this.customerIpAddress = customerIpAddress;
	}
	public String getAuthenticatedByMerchant() {
		return authenticatedByMerchant;
	}
	public void setAuthenticatedByMerchant(String authenticatedByMerchant) {
		this.authenticatedByMerchant = authenticatedByMerchant;
	}
	
	
}