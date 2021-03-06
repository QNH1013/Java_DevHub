package request.Check;

import request.Request;
import request.Model.Application;
import request.Model.Credentials;
import request.Model.Reports;
import request.Model.Transaction;

public class Void extends Request<Void>  {
	private Application application = null;
	private Credentials credentials = null;
	private Reports reports = null;
	private Transaction transaction = null;

    public Void() {
        super("payment", "check", "void", "POST");
        
    }

	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
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