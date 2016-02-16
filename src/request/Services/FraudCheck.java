package request.Services;

import request.Request;
import request.Model.Credentials;
import request.Model.Application;
import request.Model.Transaction;
import request.Model.Reports;
import request.Model.ScheduledTask;
import request.Model.Address;
import request.Model.AdvancedFraudChecks;

public class FraudCheck extends Request<FraudCheck>  {
	private Credentials credentials = null;
	private Application application = null;
	private Transaction transaction = null;
	private Reports reports = null;
	private ScheduledTask scheduledTask = null;
	private Address address = null;
	private AdvancedFraudChecks advancedFraudChecks = null;

    public FraudCheck() {
        super("payment", "services", "fraudCheck", "POST");
        
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
	public ScheduledTask getScheduledTask() {
		return scheduledTask;
	}
	public void setScheduledTask(ScheduledTask scheduledTask) {
		this.scheduledTask = scheduledTask;
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
}