package request.Model;


public class SubMerchantFunding {
    private String enabled = null;
	private String feeProfile = null;
	private String fundingSubmerchantID = null;
    

	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getFeeProfile() {
		return feeProfile;
	}
	public void setFeeProfile(String feeProfile) {
		this.feeProfile = feeProfile;
	}
	public String getFundingSubmerchantID() {
		return fundingSubmerchantID;
	}
	public void setFundingSubmerchantID(String fundingSubmerchantID) {
		this.fundingSubmerchantID = fundingSubmerchantID;
	}
	
	
}