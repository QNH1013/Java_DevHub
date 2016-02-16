package request.Model;


public class Bml {
    private String merchantID = null;
	private String productType = null;
	private String termsAndConditions = null;
	private String preApprovalNumber = null;
	private String virtualAuthenticationKeyPresenceIndicator = null;
	private String virtualAuthenticationKeyData = null;
	private String itemCategoryCode = null;
    

	public String getMerchantID() {
		return merchantID;
	}
	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTermsAndConditions() {
		return termsAndConditions;
	}
	public void setTermsAndConditions(String termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}
	public String getPreApprovalNumber() {
		return preApprovalNumber;
	}
	public void setPreApprovalNumber(String preApprovalNumber) {
		this.preApprovalNumber = preApprovalNumber;
	}
	public String getVirtualAuthenticationKeyPresenceIndicator() {
		return virtualAuthenticationKeyPresenceIndicator;
	}
	public void setVirtualAuthenticationKeyPresenceIndicator(String virtualAuthenticationKeyPresenceIndicator) {
		this.virtualAuthenticationKeyPresenceIndicator = virtualAuthenticationKeyPresenceIndicator;
	}
	public String getVirtualAuthenticationKeyData() {
		return virtualAuthenticationKeyData;
	}
	public void setVirtualAuthenticationKeyData(String virtualAuthenticationKeyData) {
		this.virtualAuthenticationKeyData = virtualAuthenticationKeyData;
	}
	public String getItemCategoryCode() {
		return itemCategoryCode;
	}
	public void setItemCategoryCode(String itemCategoryCode) {
		this.itemCategoryCode = itemCategoryCode;
	}
	
	
}