package request.Model;


public class Transaction {
    private String customerID = null;
	private String referenceNumber = null;
	private String transactionAmount = null;
	private String partialCapture = null;
	private String authorizationDate = null;
	private String approvalNumber = null;
	private String transactionID = null;
	private String convenienceFeeAmount = null;
	private String partialApprovedFlag = null;
	private String fraudFilterOverride = null;
	private String surchargeFee = null;
	private String actionReason = null;
	private String verify = null;
    private String orderSource = null;
	private String taxType = null;

	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public String getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getPartialCapture() {
		return partialCapture;
	}
	public void setPartialCapture(String partialCapture) {
		this.partialCapture = partialCapture;
	}
	public String getAuthorizationDate() {
		return authorizationDate;
	}
	public void setAuthorizationDate(String authorizationDate) {
		this.authorizationDate = authorizationDate;
	}
	public String getApprovalNumber() {
		return approvalNumber;
	}
	public void setApprovalNumber(String approvalNumber) {
		this.approvalNumber = approvalNumber;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getConvenienceFeeAmount() {
		return convenienceFeeAmount;
	}
	public void setConvenienceFeeAmount(String convenienceFeeAmount) {
		this.convenienceFeeAmount = convenienceFeeAmount;
	}
	public String getPartialApprovedFlag() {
		return partialApprovedFlag;
	}
	public void setPartialApprovedFlag(String partialApprovedFlag) {
		this.partialApprovedFlag = partialApprovedFlag;
	}
	public String getFraudFilterOverride() {
		return fraudFilterOverride;
	}
	public void setFraudFilterOverride(String fraudFilterOverride) {
		this.fraudFilterOverride = fraudFilterOverride;
	}
	public String getSurchargeFee() {
		return surchargeFee;
	}
	public void setSurchargeFee(String surchargeFee) {
		this.surchargeFee = surchargeFee;
	}
	public String getActionReason() {
		return actionReason;
	}
	public void setActionReason(String actionReason) {
		this.actionReason = actionReason;
	}
	public String getVerify() {
		return verify;
	}
	public void setVerify(String verify) {
		this.verify = verify;
	}
	public String getOrderSource() {
        return orderSource;
    }
    public void setOrderSource(OrderSource name) {
        this.orderSource = name.toString();
    }
	public String getTaxType() {
        return taxType;
    }
    public void setTaxType(TaxType name) {
        this.taxType = name.toString();
    }
	public enum OrderSource {
        ECOMMERCE("ecommerce"),
		INSTALLMENT("installment"),
		MAIL_ORDER("mailorder"),
		RECURRING("recurring"),
		RETAIL("retail"),
		TELEPHONE("telephone"),
		AUTH_3DS("3dsAuthenticated"),
		ATTEMPTED_3DS("3dsAttempted"),
		RECURRING_TEL("recurringtel"),
		ECHECK_PPD("echeckppd"),
		APPLEPAY("applepay");

        private String value;
        private OrderSource(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
	public enum TaxType {
        PAYMENT("payment"),
		FEE("fee");

        private String value;
        private TaxType(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
}