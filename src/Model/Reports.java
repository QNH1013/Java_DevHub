package request.Model;


public class Reports {
    private String reportGroup = null;
	private String affiliate = null;
	private String campaign = null;
	private String merchantGroupingID = null;
    

	public String getReportGroup() {
		return reportGroup;
	}
	public void setReportGroup(String reportGroup) {
		this.reportGroup = reportGroup;
	}
	public String getAffiliate() {
		return affiliate;
	}
	public void setAffiliate(String affiliate) {
		this.affiliate = affiliate;
	}
	public String getCampaign() {
		return campaign;
	}
	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}
	public String getMerchantGroupingID() {
		return merchantGroupingID;
	}
	public void setMerchantGroupingID(String merchantGroupingID) {
		this.merchantGroupingID = merchantGroupingID;
	}
	
	
}