package request.Credit;

import request.Request;
import request.Model.Address;
import request.Model.Application;
import request.Model.Bml;
import request.Model.Card;
import request.Model.Credentials;
import request.Model.CustomBilling;
import request.Model.EnhancedData;
import request.Model.PayPal;
import request.Model.PaymentAccount;
import request.Model.Reports;
import request.Model.Terminal;
import request.Model.Transaction;

public class Return extends Request<Return>  {
	private Address address = null;
	private Application application = null;
	private Bml bml = null;
	private Card card = null;
	private Credentials credentials = null;
	private CustomBilling customBilling = null;
	private EnhancedData enhancedData = null;
	private PayPal payPal = null;
	private PaymentAccount paymentAccount = null;
	private Reports reports = null;
	private Terminal terminal = null;
	private Transaction transaction = null;

    public Return() {
        super("payment", "credit", "return", "POST");
        
    }

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public Bml getBml() {
		return bml;
	}
	public void setBml(Bml bml) {
		this.bml = bml;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	public CustomBilling getCustomBilling() {
		return customBilling;
	}
	public void setCustomBilling(CustomBilling customBilling) {
		this.customBilling = customBilling;
	}
	public EnhancedData getEnhancedData() {
		return enhancedData;
	}
	public void setEnhancedData(EnhancedData enhancedData) {
		this.enhancedData = enhancedData;
	}
	public PayPal getPayPal() {
		return payPal;
	}
	public void setPayPal(PayPal payPal) {
		this.payPal = payPal;
	}
	public PaymentAccount getPaymentAccount() {
		return paymentAccount;
	}
	public void setPaymentAccount(PaymentAccount paymentAccount) {
		this.paymentAccount = paymentAccount;
	}
	public Reports getReports() {
		return reports;
	}
	public void setReports(Reports reports) {
		this.reports = reports;
	}
	public Terminal getTerminal() {
		return terminal;
	}
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
}