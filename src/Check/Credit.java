package request.Check;

import request.Request;
import request.Model.Credentials;
import request.Model.Application;
import request.Model.Reports;
import request.Model.Transaction;
import request.Model.CustomBilling;

public class Credit extends Request<Credit>  {
	private Credentials credentials = null;
	private Application application = null;
	private Reports reports = null;
	private Transaction transaction = null;
	private CustomBilling customBilling = null;

    public Credit() {
        super("payment", "check", "credit", "POST");
        
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
	public CustomBilling getCustomBilling() {
		return customBilling;
	}
	public void setCustomBilling(CustomBilling customBilling) {
		this.customBilling = customBilling;
	}
}