package request.Boarding;

import request.Request;
import request.Model.Credentials;
import request.Model.LegalEntity;
import request.Model.Address;
import request.Model.Principal;

public class CreateLegalEntity extends Request<CreateLegalEntity>  {
	private Credentials credentials = null;
	private LegalEntity legalEntity = null;
	private Address address = null;
	private Principal principal = null;
	private Principal[] principalArray = null;

    public CreateLegalEntity() {
        super("boarding", "services", "createLegalEntity", "POST");
        
    }

	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	public LegalEntity getLegalEntity() {
		return legalEntity;
	}
	public void setLegalEntity(LegalEntity legalEntity) {
		this.legalEntity = legalEntity;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
}