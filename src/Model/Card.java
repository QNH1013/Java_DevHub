package request.Model;


public class Card {
    private String cVV = null;
	private String cardNumber = null;
	private String expirationMonth = null;
	private String expirationYear = null;
	private String track1Data = null;
	private String track2Data = null;
	private String paypageRegistrationID = null;
	private String accountNumber = null;
    private String type = null;

	public String getCVV() {
		return cVV;
	}
	public void setCVV(String cVV) {
		this.cVV = cVV;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpirationMonth() {
		return expirationMonth;
	}
	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	public String getExpirationYear() {
		return expirationYear;
	}
	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}
	public String getTrack1Data() {
		return track1Data;
	}
	public void setTrack1Data(String track1Data) {
		this.track1Data = track1Data;
	}
	public String getTrack2Data() {
		return track2Data;
	}
	public void setTrack2Data(String track2Data) {
		this.track2Data = track2Data;
	}
	public String getPaypageRegistrationID() {
		return paypageRegistrationID;
	}
	public void setPaypageRegistrationID(String paypageRegistrationID) {
		this.paypageRegistrationID = paypageRegistrationID;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getType() {
        return type;
    }
    public void setType(Type name) {
        this.type = name.toString();
    }
	public enum Type {
        MC("MC"),
		VI("VI"),
		AX("AX"),
		DC("DC"),
		DI("DI"),
		PP("PP"),
		JC("JC"),
		BL("BL"),
		EC("EC"),
		GC("GC"),
		NONE("");

        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
}