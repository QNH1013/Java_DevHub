package request.Check;

import request.Request;
import request.Model.Application;
import request.Model.Credentials;
import request.Model.CustomBilling;
import request.Model.Reports;
import request.Model.Transaction;

public class Credit extends Request<Credit>  {
	private Application application = null;
	private Credentials credentials = null;
	private CustomBilling customBilling = null;
	private Reports reports = null;
	private Transaction transaction = null;

    public Credit() {
        super("payment", "check", "credit", "POST");
        
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
	public CustomBilling getCustomBilling() {
		return customBilling;
	}
	public void setCustomBilling(CustomBilling customBilling) {
		this.customBilling = customBilling;
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