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
	private CreateDiscount[] createDiscountArray = null;
	private CreateAddOn createAddOn = null;
	private CreateAddOn[] createAddOnArray = null;
	private String subscriptionID = null;
	private String name = null;
	private String description = null;
	private String runFrequency = null;
	private String trialRunCycles = null;
	private String trialRunFrequency = null;
	private String active = null;
	private String billingDate = null;
	private UpdateDiscount updateDiscount = null;
	private UpdateDiscount[] updateDiscountArray = null;
	private DeleteDiscount deleteDiscount = null;
	private DeleteDiscount[] deleteDiscountArray = null;
	private UpdateAddOn updateAddOn = null;
	private UpdateAddOn[] updateAddOnArray = null;
	private DeleteAddOn deleteAddOn = null;
	private DeleteAddOn[] deleteAddOnArray = null;
    

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
	public CreateDiscount[] getCreateDiscountArray() {
		return createDiscountArray;
	}
	public void setCreateDiscountArray(CreateDiscount[] createDiscountArray) {
		this.createDiscountArray = createDiscountArray;
	}
	public CreateAddOn getCreateAddOn() {
		return createAddOn;
	}
	public void setCreateAddOn(CreateAddOn createAddOn) {
		this.createAddOn = createAddOn;
	}
	public CreateAddOn[] getCreateAddOnArray() {
		return createAddOnArray;
	}
	public void setCreateAddOnArray(CreateAddOn[] createAddOnArray) {
		this.createAddOnArray = createAddOnArray;
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
	public UpdateDiscount[] getUpdateDiscountArray() {
		return updateDiscountArray;
	}
	public void setUpdateDiscountArray(UpdateDiscount[] updateDiscountArray) {
		this.updateDiscountArray = updateDiscountArray;
	}
	public DeleteDiscount getDeleteDiscount() {
		return deleteDiscount;
	}
	public void setDeleteDiscount(DeleteDiscount deleteDiscount) {
		this.deleteDiscount = deleteDiscount;
	}
	public DeleteDiscount[] getDeleteDiscountArray() {
		return deleteDiscountArray;
	}
	public void setDeleteDiscountArray(DeleteDiscount[] deleteDiscountArray) {
		this.deleteDiscountArray = deleteDiscountArray;
	}
	public UpdateAddOn getUpdateAddOn() {
		return updateAddOn;
	}
	public void setUpdateAddOn(UpdateAddOn updateAddOn) {
		this.updateAddOn = updateAddOn;
	}
	public UpdateAddOn[] getUpdateAddOnArray() {
		return updateAddOnArray;
	}
	public void setUpdateAddOnArray(UpdateAddOn[] updateAddOnArray) {
		this.updateAddOnArray = updateAddOnArray;
	}
	public DeleteAddOn getDeleteAddOn() {
		return deleteAddOn;
	}
	public void setDeleteAddOn(DeleteAddOn deleteAddOn) {
		this.deleteAddOn = deleteAddOn;
	}
	public DeleteAddOn[] getDeleteAddOnArray() {
		return deleteAddOnArray;
	}
	public void setDeleteAddOnArray(DeleteAddOn[] deleteAddOnArray) {
		this.deleteAddOnArray = deleteAddOnArray;
	}
	
	
}