package request.Services;

import request.Request;
import request.Model.Applepay;
import request.Model.Application;
import request.Model.Card;
import request.Model.Credentials;
import request.Model.DemandDepositAccount;
import request.Model.Reports;
import request.Model.Transaction;

public class PaymentAccountCreate extends Request<PaymentAccountCreate>  {
	private Applepay applepay = null;
	private Application application = null;
	private Card card = null;
	private Credentials credentials = null;
	private DemandDepositAccount demandDepositAccount = null;
	private Reports reports = null;
	private Transaction transaction = null;

    public PaymentAccountCreate() {
        super("payment", "services", "paymentAccountCreate", "POST");
        
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
	public DemandDepositAccount getDemandDepositAccount() {
		return demandDepositAccount;
	}
	public void setDemandDepositAccount(DemandDepositAccount demandDepositAccount) {
		this.demandDepositAccount = demandDepositAccount;
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