package request.Credit;

import request.Request;
import request.Model.Credentials;
import request.Model.Application;
import request.Model.Reports;
import request.Model.Transaction;

public class Void extends Request<Void>  {
	private Credentials credentials = null;
	private Application application = null;
	private Reports reports = null;
	private Transaction transaction = null;

    public Void() {
        super("payment", "credit", "void_", "POST");
        
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
}