package request.Model;


public class Identification {
    private String ssn = null;
	private String birthDate = null;
	private String customerRegistrationDate = null;
	private String incomeAmount = null;
	private String customerCheckingAccount = null;
	private String customerSavingsAccount = null;
	private String employerName = null;
	private String customerWorkTelephone = null;
	private String yearsAtResidence = null;
	private String yearsAtEmployer = null;
    private String customerType = null;
	private String incomeCurrency = null;
	private String residenceStatus = null;

	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getCustomerRegistrationDate() {
		return customerRegistrationDate;
	}
	public void setCustomerRegistrationDate(String customerRegistrationDate) {
		this.customerRegistrationDate = customerRegistrationDate;
	}
	public String getIncomeAmount() {
		return incomeAmount;
	}
	public void setIncomeAmount(String incomeAmount) {
		this.incomeAmount = incomeAmount;
	}
	public String getCustomerCheckingAccount() {
		return customerCheckingAccount;
	}
	public void setCustomerCheckingAccount(String customerCheckingAccount) {
		this.customerCheckingAccount = customerCheckingAccount;
	}
	public String getCustomerSavingsAccount() {
		return customerSavingsAccount;
	}
	public void setCustomerSavingsAccount(String customerSavingsAccount) {
		this.customerSavingsAccount = customerSavingsAccount;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getCustomerWorkTelephone() {
		return customerWorkTelephone;
	}
	public void setCustomerWorkTelephone(String customerWorkTelephone) {
		this.customerWorkTelephone = customerWorkTelephone;
	}
	public String getYearsAtResidence() {
		return yearsAtResidence;
	}
	public void setYearsAtResidence(String yearsAtResidence) {
		this.yearsAtResidence = yearsAtResidence;
	}
	public String getYearsAtEmployer() {
		return yearsAtEmployer;
	}
	public void setYearsAtEmployer(String yearsAtEmployer) {
		this.yearsAtEmployer = yearsAtEmployer;
	}
	public String getCustomerType() {
        return customerType;
    }
    public void setCustomerType(CustomerType name) {
        this.customerType = name.toString();
    }
	public String getIncomeCurrency() {
        return incomeCurrency;
    }
    public void setIncomeCurrency(IncomeCurrency name) {
        this.incomeCurrency = name.toString();
    }
	public String getResidenceStatus() {
        return residenceStatus;
    }
    public void setResidenceStatus(ResidenceStatus name) {
        this.residenceStatus = name.toString();
    }
	public enum CustomerType {
        NEW("New"),
		EXISTING("Existing");

        private String value;
        private CustomerType(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
	public enum IncomeCurrency {
        AUD("AUD"),
		CAD("CAD"),
		CHF("CHF"),
		DKK("DKK"),
		EUR("EUR"),
		GBP("GBP"),
		HKD("HKD"),
		JPY("JPY"),
		NOK("NOK"),
		NZD("NZD"),
		SEK("SEK"),
		SGD("SGD"),
		USD("USD");

        private String value;
        private IncomeCurrency(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
	public enum ResidenceStatus {
        OWN("Own"),
		RENT("Rent"),
		OTHER("Other");

        private String value;
        private ResidenceStatus(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
}