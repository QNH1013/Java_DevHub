package request.Services;

import request.Request;
import request.Model.Credentials;
import request.Model.Application;
import request.Model.Transaction;
import request.Model.Reports;
import request.Model.Card;
import request.Model.PaymentAccount;

public class PaymentAccountUpdate extends Request<PaymentAccountUpdate>  {
	private Credentials credentials = null;
	private Application application = null;
	private Transaction transaction = null;
	private Reports reports = null;
	private Card card = null;
	private PaymentAccount paymentAccount = null;

    public PaymentAccountUpdate() {
        super("payment", "services", "paymentAccountUpdate", "POST");
        
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
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public Reports getReports() {
		return reports;
	}
	public void setReports(Reports reports) {
		this.reports = reports;
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
}