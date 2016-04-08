package request.Credit;

import request.Request;
import request.Model.Address;
import request.Model.AdvancedFraudChecks;
import request.Model.Applepay;
import request.Model.Application;
import request.Model.Bml;
import request.Model.Card;
import request.Model.CardholderAuthentication;
import request.Model.Credentials;
import request.Model.CustomBilling;
import request.Model.EnhancedData;
import request.Model.Identification;
import request.Model.PayPal;
import request.Model.PaymentAccount;
import request.Model.RecyclingRequest;
import request.Model.Reports;
import request.Model.ScheduledTask;
import request.Model.Terminal;
import request.Model.Transaction;
import request.Model.Visa;
import request.Model.Wallet;

public class Authorization extends Request<Authorization>  {
	private Address address = null;
	private AdvancedFraudChecks advancedFraudChecks = null;
	private Applepay applepay = null;
	private Application application = null;
	private Bml bml = null;
	private Card card = null;
	private CardholderAuthentication cardholderAuthentication = null;
	private Credentials credentials = null;
	private CustomBilling customBilling = null;
	private EnhancedData enhancedData = null;
	private Identification identification = null;
	private PayPal payPal = null;
	private PaymentAccount paymentAccount = null;
	private RecyclingRequest recyclingRequest = null;
	private Reports reports = null;
	private ScheduledTask scheduledTask = null;
	private Terminal terminal = null;
	private Transaction transaction = null;
	private Visa visa = null;
	private Wallet wallet = null;

    public Authorization() {
        super("payment", "credit", "authorization", "POST");
        
    }

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public AdvancedFraudChecks getAdvancedFraudChecks() {
		return advancedFraudChecks;
	}
	public void setAdvancedFraudChecks(AdvancedFraudChecks advancedFraudChecks) {
		this.advancedFraudChecks = advancedFraudChecks;
	}
	public Applepay getApplepay() {
		return applepay;
	}
	public void setApplepay(Applepay applepay) {
		this.applepay = applepay;
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
	public CardholderAuthentication getCardholderAuthentication() {
		return cardholderAuthentication;
	}
	public void setCardholderAuthentication(CardholderAuthentication cardholderAuthentication) {
		this.cardholderAuthentication = cardholderAuthentication;
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
	public Identification getIdentification() {
		return identification;
	}
	public void setIdentification(Identification identification) {
		this.identification = identification;
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
	public RecyclingRequest getRecyclingRequest() {
		return recyclingRequest;
	}
	public void setRecyclingRequest(RecyclingRequest recyclingRequest) {
		this.recyclingRequest = recyclingRequest;
	}
	public Reports getReports() {
		return reports;
	}
	public void setReports(Reports reports) {
		this.reports = reports;
	}
	public ScheduledTask getScheduledTask() {
		return scheduledTask;
	}
	public void setScheduledTask(ScheduledTask scheduledTask) {
		this.scheduledTask = scheduledTask;
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
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
}