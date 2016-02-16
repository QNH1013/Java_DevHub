package request.Model;


public class AdvancedFraudResults {
    private String deviceReviewStatus = null;
	private String deviceReputationScore = null;
	private String triggeredRule = null;
    

	public String getDeviceReviewStatus() {
		return deviceReviewStatus;
	}
	public void setDeviceReviewStatus(String deviceReviewStatus) {
		this.deviceReviewStatus = deviceReviewStatus;
	}
	public String getDeviceReputationScore() {
		return deviceReputationScore;
	}
	public void setDeviceReputationScore(String deviceReputationScore) {
		this.deviceReputationScore = deviceReputationScore;
	}
	public String getTriggeredRule() {
		return triggeredRule;
	}
	public void setTriggeredRule(String triggeredRule) {
		this.triggeredRule = triggeredRule;
	}
	
	
}