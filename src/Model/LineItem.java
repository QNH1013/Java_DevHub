package request.Model;
import request.Model.DetailTax;

public class LineItem {
    private String itemSequenceNumber = null;
	private String itemDescription = null;
	private String productCode = null;
	private String lineItemCount = null;
	private String unitOfMeasure = null;
	private String taxAmount = null;
	private String lineItemTotalAmount = null;
	private String lineItemTotalWithTax = null;
	private String lineItemDiscountAmount = null;
	private String itemCommodityCode = null;
	private String unitCost = null;
	private DetailTax[] detailTaxArray = null;
	private DetailTax detailTax = null;
    

	public String getItemSequenceNumber() {
		return itemSequenceNumber;
	}
	public void setItemSequenceNumber(String itemSequenceNumber) {
		this.itemSequenceNumber = itemSequenceNumber;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getLineItemCount() {
		return lineItemCount;
	}
	public void setLineItemCount(String lineItemCount) {
		this.lineItemCount = lineItemCount;
	}
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public String getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getLineItemTotalAmount() {
		return lineItemTotalAmount;
	}
	public void setLineItemTotalAmount(String lineItemTotalAmount) {
		this.lineItemTotalAmount = lineItemTotalAmount;
	}
	public String getLineItemTotalWithTax() {
		return lineItemTotalWithTax;
	}
	public void setLineItemTotalWithTax(String lineItemTotalWithTax) {
		this.lineItemTotalWithTax = lineItemTotalWithTax;
	}
	public String getLineItemDiscountAmount() {
		return lineItemDiscountAmount;
	}
	public void setLineItemDiscountAmount(String lineItemDiscountAmount) {
		this.lineItemDiscountAmount = lineItemDiscountAmount;
	}
	public String getItemCommodityCode() {
		return itemCommodityCode;
	}
	public void setItemCommodityCode(String itemCommodityCode) {
		this.itemCommodityCode = itemCommodityCode;
	}
	public String getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}
	public DetailTax[] getDetailTaxArray() {
		return detailTaxArray;
	}
	public void setDetailTaxArray(DetailTax[] detailTaxArray) {
		this.detailTaxArray = detailTaxArray;
	}
	public DetailTax getDetailTax() {
		return detailTax;
	}
	public void setDetailTax(DetailTax detailTax) {
		this.detailTax = detailTax;
	}
	
	
}