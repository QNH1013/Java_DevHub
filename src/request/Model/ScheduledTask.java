package request.Model;
import request.Model.CreateDiscount;
import request.Model.CreateAddOn;
import request.Model.UpdateDiscount;
import request.Model.DeleteDiscount;
import request.Model.UpdateAddOn;
import request.Model.DeleteAddOn;

public class ScheduledTask {
    private String scheduledTaskID = null;
	private String runCycles = null;
	private String runStartDate = null;
	private String amount = null;
	private CreateDiscount createDiscount = null;
	private CreateAddOn createAddOn = null;
	private String subscriptionID = null;
	private String name = null;
	private String description = null;
	private String runFrequency = null;
	private String trialRunCycles = null;
	private String trialRunFrequency = null;
	private String active = null;
	private String billingDate = null;
	private UpdateDiscount updateDiscount = null;
	private DeleteDiscount deleteDiscount = null;
	private UpdateAddOn updateAddOn = null;
	private DeleteAddOn deleteAddOn = null;
    

	public String getScheduledTaskID() {
		return scheduledTaskID;
	}
	public void setScheduledTaskID(String scheduledTaskID) {
		this.scheduledTaskID = scheduledTaskID;
	}
	public String getRunCycles() {
		return runCycles;
	}
	public void setRunCycles(String runCycles) {
		this.runCycles = runCycles;
	}
	public String getRunStartDate() {
		return runStartDate;
	}
	public void setRunStartDate(String runStartDate) {
		this.runStartDate = runStartDate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public CreateDiscount getCreateDiscount() {
		return createDiscount;
	}
	public void setCreateDiscount(CreateDiscount createDiscount) {
		this.createDiscount = createDiscount;
	}
	public CreateAddOn getCreateAddOn() {
		return createAddOn;
	}
	public void setCreateAddOn(CreateAddOn createAddOn) {
		this.createAddOn = createAddOn;
	}
	public String getSubscriptionID() {
		return subscriptionID;
	}
	public void setSubscriptionID(String subscriptionID) {
		this.subscriptionID = subscriptionID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRunFrequency() {
		return runFrequency;
	}
	public void setRunFrequency(String runFrequency) {
		this.runFrequency = runFrequency;
	}
	public String getTrialRunCycles() {
		return trialRunCycles;
	}
	public void setTrialRunCycles(String trialRunCycles) {
		this.trialRunCycles = trialRunCycles;
	}
	public String getTrialRunFrequency() {
		return trialRunFrequency;
	}
	public void setTrialRunFrequency(String trialRunFrequency) {
		this.trialRunFrequency = trialRunFrequency;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}
	public UpdateDiscount getUpdateDiscount() {
		return updateDiscount;
	}
	public void setUpdateDiscount(UpdateDiscount updateDiscount) {
		this.updateDiscount = updateDiscount;
	}
	public DeleteDiscount getDeleteDiscount() {
		return deleteDiscount;
	}
	public void setDeleteDiscount(DeleteDiscount deleteDiscount) {
		this.deleteDiscount = deleteDiscount;
	}
	public UpdateAddOn getUpdateAddOn() {
		return updateAddOn;
	}
	public void setUpdateAddOn(UpdateAddOn updateAddOn) {
		this.updateAddOn = updateAddOn;
	}
	public DeleteAddOn getDeleteAddOn() {
		return deleteAddOn;
	}
	public void setDeleteAddOn(DeleteAddOn deleteAddOn) {
		this.deleteAddOn = deleteAddOn;
	}
	
	
}