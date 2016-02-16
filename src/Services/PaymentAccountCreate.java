package request.Services;

import request.Request;
import request.Model.Credentials;
import request.Model.Application;
import request.Model.Transaction;
import request.Model.Reports;
import request.Model.Card;
import request.Model.DemandDepositAccount;
import request.Model.Applepay;

public class PaymentAccountCreate extends Request<PaymentAccountCreate>  {
	private Credentials credentials = null;
	private Application application = null;
	private Transaction transaction = null;
	private Reports reports = null;
	private Card card = null;
	private DemandDepositAccount demandDepositAccount = null;
	private Applepay applepay = null;

    public PaymentAccountCreate() {
        super("payment", "services", "paymentAccountCreate", "POST");
        
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
	public DemandDepositAccount getDemandDepositAccount() {
		return demandDepositAccount;
	}
	public void setDemandDepositAccount(DemandDepositAccount demandDepositAccount) {
		this.demandDepositAccount = demandDepositAccount;
	}
	public Applepay getApplepay() {
		return applepay;
	}
	public void setApplepay(Applepay applepay) {
		this.applepay = applepay;
	}
}