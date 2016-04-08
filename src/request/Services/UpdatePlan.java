package request.Services;

import request.Request;
import request.Model.Application;
import request.Model.Credentials;
import request.Model.Reports;
import request.Model.ScheduledTask;
import request.Model.Transaction;

public class UpdatePlan extends Request<UpdatePlan>  {
	private Application application = null;
	private Credentials credentials = null;
	private Reports reports = null;
	private ScheduledTask scheduledTask = null;
	private Transaction transaction = null;

    public UpdatePlan() {
        super("payment", "services", "updatePlan", "POST");
        
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