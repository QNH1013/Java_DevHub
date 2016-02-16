package request.Model;


public class UpdateAddOn {
    private String addOnCode = null;
	private String name = null;
	private String amount = null;
	private String startDate = null;
	private String endDate = null;
    

	public String getAddOnCode() {
		return addOnCode;
	}
	public void setAddOnCode(String addOnCode) {
		this.addOnCode = addOnCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
}