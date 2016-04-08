package request.Credit;

import request.Request;
import request.Model.Address;
import request.Model.Application;
import request.Model.Bml;
import request.Model.Card;
import request.Model.Credentials;
import request.Model.CustomBilling;
import request.Model.EnhancedData;
import request.Model.FraudResult;
import request.Model.PaymentAccount;
import request.Model.Reports;
import request.Model.Terminal;
import request.Model.Transaction;
import request.Model.Visa;

public class CaptureGivenAuth extends Request<CaptureGivenAuth>  {
	private Address address = null;
	private Application application = null;
	private Bml bml = null;
	private Card card = null;
	private Credentials credentials = null;
	private CustomBilling customBilling = null;
	private EnhancedData enhancedData = null;
	private FraudResult fraudResult = null;
	private PaymentAccount paymentAccount = null;
	private Reports reports = null;
	private Terminal terminal = null;
	private Transaction transaction = null;
	private Visa visa = null;

    public CaptureGivenAuth() {
        super("payment", "credit", "captureGivenAuth", "POST");
        
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
	public FraudResult getFraudResult() {
		return fraudResult;
	}
	public void setFraudResult(FraudResult fraudResult) {
		this.fraudResult = fraudResult;
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
	public Visa getVisa() {
		return visa;
	}
	public void setVisa(Visa visa) {
		this.visa = visa;
	}
}