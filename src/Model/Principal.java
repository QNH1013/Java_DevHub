package request.Model;
import request.Model.Address;
import request.Model.BackgroundCheckFields;

public class Principal {
    private String title = null;
	private String firstName = null;
	private String lastName = null;
	private String email = null;
	private String sSN = null;
	private String contactPhone = null;
	private String dateOfBirth = null;
	private String driversLicense = null;
	private String driversLicenseState = null;
	private Address address = null;
	private BackgroundCheckFields backgroundCheckFields = null;
    

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSSN() {
		return sSN;
	}
	public void setSSN(String sSN) {
		this.sSN = sSN;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDriversLicense() {
		return driversLicense;
	}
	public void setDriversLicense(String driversLicense) {
		this.driversLicense = driversLicense;
	}
	public String getDriversLicenseState() {
		return driversLicenseState;
	}
	public void setDriversLicenseState(String driversLicenseState) {
		this.driversLicenseState = driversLicenseState;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public BackgroundCheckFields getBackgroundCheckFields() {
		return backgroundCheckFields;
	}
	public void setBackgroundCheckFields(BackgroundCheckFields backgroundCheckFields) {
		this.backgroundCheckFields = backgroundCheckFields;
	}
	
	
}