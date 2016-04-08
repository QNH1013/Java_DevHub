package request.Services;

import request.Request;
import request.Model.Application;
import request.Model.Card;
import request.Model.Credentials;
import request.Model.PaymentAccount;
import request.Model.Reports;
import request.Model.Transaction;

public class PaymentAccountUpdate extends Request<PaymentAccountUpdate>  {
	private Application application = null;
	private Card card = null;
	private Credentials credentials = null;
	private PaymentAccount paymentAccount = null;
	private Reports reports = null;
	private Transaction transaction = null;

    public PaymentAccountUpdate() {
        super("payment", "services", "paymentAccountUpdate", "POST");
        
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
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
}