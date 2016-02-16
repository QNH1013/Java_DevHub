package request.Model;


public class DetailTax {
    private String taxIncludedInTotal = null;
	private String taxAmount = null;
	private String taxRate = null;
	private String alternateTaxIdentifier = null;
    private String taxTypeIdentifier = null;

	public String getTaxIncludedInTotal() {
		return taxIncludedInTotal;
	}
	public void setTaxIncludedInTotal(String taxIncludedInTotal) {
		this.taxIncludedInTotal = taxIncludedInTotal;
	}
	public String getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
	public String getAlternateTaxIdentifier() {
		return alternateTaxIdentifier;
	}
	public void setAlternateTaxIdentifier(String alternateTaxIdentifier) {
		this.alternateTaxIdentifier = alternateTaxIdentifier;
	}
	public String getTaxTypeIdentifier() {
        return taxTypeIdentifier;
    }
    public void setTaxTypeIdentifier(TaxTypeIdentifier name) {
        this.taxTypeIdentifier = name.toString();
    }
	public enum TaxTypeIdentifier {
        UNKOWN("00"),
		NATL_SALES("01"),
		ST_SALES("02"),
		CTY_SALES("03"),
		LCL_SALES("04"),
		MUN_SALES("05"),
		OTHER("06"),
		VAT("10"),
		GST("11"),
		PST("12"),
		HST("13"),
		QST("14"),
		ROOM("20"),
		OCCUPANCY("21"),
		ENERGY("22");

        private String value;
        private TaxTypeIdentifier(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
}