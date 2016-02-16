package request.Model;
import request.Model.AdvancedFraudResults;

public class FraudResult {
    private String avsResult = null;
	private String cardValidationResult = null;
	private String authenticationResult = null;
	private String advancedAVSResult = null;
	private AdvancedFraudResults advancedFraudResults = null;
    

	public String getAvsResult() {
		return avsResult;
	}
	public void setAvsResult(String avsResult) {
		this.avsResult = avsResult;
	}
	public String getCardValidationResult() {
		return cardValidationResult;
	}
	public void setCardValidationResult(String cardValidationResult) {
		this.cardValidationResult = cardValidationResult;
	}
	public String getAuthenticationResult() {
		return authenticationResult;
	}
	public void setAuthenticationResult(String authenticationResult) {
		this.authenticationResult = authenticationResult;
	}
	public String getAdvancedAVSResult() {
		return advancedAVSResult;
	}
	public void setAdvancedAVSResult(String advancedAVSResult) {
		this.advancedAVSResult = advancedAVSResult;
	}
	public AdvancedFraudResults getAdvancedFraudResults() {
		return advancedFraudResults;
	}
	public void setAdvancedFraudResults(AdvancedFraudResults advancedFraudResults) {
		this.advancedFraudResults = advancedFraudResults;
	}
	
	
}