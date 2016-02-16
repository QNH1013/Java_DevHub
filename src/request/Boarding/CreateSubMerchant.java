package request.Boarding;

import request.Request;
import request.Model.Credentials;
import request.Model.Application;
import request.Model.Transaction;
import request.Model.Reports;
import request.Model.Address;
import request.Model.Merchant;
import request.Model.PrimaryContact;
import request.Model.ECheck;
import request.Model.SubMerchantFunding;

public class CreateSubMerchant extends Request<CreateSubMerchant>  {
	private Credentials credentials = null;
	private Application application = null;
	private Transaction transaction = null;
	private Reports reports = null;
	private Address address = null;
	private Merchant merchant = null;
	private PrimaryContact primaryContact = null;
	private ECheck eCheck = null;
	private SubMerchantFunding subMerchantFunding = null;

    public CreateSubMerchant(String entityID) {
        super("boarding", "services", "createSubMerchant", "POST");
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
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public PrimaryContact getPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(PrimaryContact primaryContact) {
		this.primaryContact = primaryContact;
	}
	public ECheck getECheck() {
		return eCheck;
	}
	public void setECheck(ECheck eCheck) {
		this.eCheck = eCheck;
	}
	public SubMerchantFunding getSubMerchantFunding() {
		return subMerchantFunding;
	}
	public void setSubMerchantFunding(SubMerchantFunding subMerchantFunding) {
		this.subMerchantFunding = subMerchantFunding;
	}
}