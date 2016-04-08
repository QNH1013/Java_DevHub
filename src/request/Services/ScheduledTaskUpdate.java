package request.Services;

import request.Request;
import request.Model.Address;
import request.Model.Application;
import request.Model.Card;
import request.Model.Credentials;
import request.Model.PaymentAccount;
import request.Model.Reports;
import request.Model.ScheduledTask;
import request.Model.Transaction;

public class ScheduledTaskUpdate extends Request<ScheduledTaskUpdate>  {
	private Address address = null;
	private Application application = null;
	private Card card = null;
	private Credentials credentials = null;
	private PaymentAccount paymentAccount = null;
	private Reports reports = null;
	private ScheduledTask scheduledTask = null;
	private Transaction transaction = null;

    public ScheduledTaskUpdate() {
        super("payment", "services", "scheduledTaskUpdate", "POST");
        
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
	public ScheduledTask getScheduledTask() {
		return scheduledTask;
	}
	public void setScheduledTask(ScheduledTask scheduledTask) {
		this.scheduledTask = scheduledTask;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
}