package request.Model;


public class DemandDepositAccount {
    private String dDAAccountType = null;
	private String accountNumber = null;
	private String routingNumber = null;
	private String checkNumber = null;
	private String cCDPaymentInformation = null;
    

	public String getDDAAccountType() {
		return dDAAccountType;
	}
	public void setDDAAccountType(String dDAAccountType) {
		this.dDAAccountType = dDAAccountType;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}
	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	public String getCCDPaymentInformation() {
		return cCDPaymentInformation;
	}
	public void setCCDPaymentInformation(String cCDPaymentInformation) {
		this.cCDPaymentInformation = cCDPaymentInformation;
	}
	
	
}