package request.Boarding;

import request.Request;
import request.Model.Credentials;
import request.Model.Application;
import request.Model.Transaction;
import request.Model.Reports;
import request.Model.Address;
import request.Model.LegalEntity;
import request.Model.Principal;
import request.Model.BackgroundCheckFields;

public class UpdateLegalEntity extends Request<UpdateLegalEntity>  {
	private Credentials credentials = null;
	private Application application = null;
	private Transaction transaction = null;
	private Reports reports = null;
	private Address address = null;
	private LegalEntity legalEntity = null;
	private Principal principal = null;
	private Principal[] principalArray = null;
	private BackgroundCheckFields backgroundCheckFields = null;

    public UpdateLegalEntity(String entityID) {
        super("boarding", "services", "updateLegalEntity", "PUT");
        super.queryParams.put("entityID",entityID);
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public LegalEntity getLegalEntity() {
		return legalEntity;
	}
	public void setLegalEntity(LegalEntity legalEntity) {
		this.legalEntity = legalEntity;
	}
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public Principal[] getPrincipalArray() {
		return principalArray;
	}
	public void setPrincipalArray(Principal[] principalArray) {
		this.principalArray = principalArray;
	}
	public BackgroundCheckFields getBackgroundCheckFields() {
		return backgroundCheckFields;
	}
	public void setBackgroundCheckFields(BackgroundCheckFields backgroundCheckFields) {
		this.backgroundCheckFields = backgroundCheckFields;
	}
}