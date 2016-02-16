package request.Credit;

import request.Request;
import request.Model.Credentials;
import request.Model.Application;
import request.Model.Reports;
import request.Model.Transaction;
import request.Model.Address;
import request.Model.Card;
import request.Model.PaymentAccount;
import request.Model.Terminal;
import request.Model.CustomBilling;
import request.Model.EnhancedData;
import request.Model.Visa;

public class Force extends Request<Force>  {
	private Credentials credentials = null;
	private Application application = null;
	private Reports reports = null;
	private Transaction transaction = null;
	private Address address = null;
	private Card card = null;
	private PaymentAccount paymentAccount = null;
	private Terminal terminal = null;
	private CustomBilling customBilling = null;
	private EnhancedData enhancedData = null;
	private Visa visa = null;

    public Force() {
        super("payment", "credit", "force", "POST");
        
    }

	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public Reports getReports() {
		return reports;
	}
	public void setReports(Reports reports) {
		this.reports = reports;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public PaymentAccount getPaymentAccount() {
		return paymentAccount;
	}
	public void setPaymentAccount(PaymentAccount paymentAccount) {
		this.paymentAccount = paymentAccount;
	}
	public Terminal getTerminal() {
		return terminal;
	}
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
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
	public Visa getVisa() {
		return visa;
	}
	public void setVisa(Visa visa) {
		this.visa = visa;
	}
}