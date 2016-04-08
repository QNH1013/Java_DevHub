package request.Model;
import request.Model.DetailTax;
import request.Model.LineItem;

public class EnhancedData {
    private String purchaseOrder = null;
	private String taxAmount = null;
	private String taxExempt = null;
	private String discountAmount = null;
	private String freightAmount = null;
	private String dutyAmount = null;
	private String shipFromPostalCode = null;
	private String destinationPostalCode = null;
	private String destinationCountryCode = null;
	private String invoiceReferenceNumber = null;
	private String orderDate = null;
	private DetailTax detailTax = null;
	private DetailTax[] detailTaxArray = null;
	private LineItem lineItem = null;
	private LineItem[] lineItemArray = null;
    private String deliveryType = null;

	public String getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(String purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	public String getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getTaxExempt() {
		return taxExempt;
	}
	public void setTaxExempt(String taxExempt) {
		this.taxExempt = taxExempt;
	}
	public String getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getFreightAmount() {
		return freightAmount;
	}
	public void setFreightAmount(String freightAmount) {
		this.freightAmount = freightAmount;
	}
	public String getDutyAmount() {
		return dutyAmount;
	}
	public void setDutyAmount(String dutyAmount) {
		this.dutyAmount = dutyAmount;
	}
	public String getShipFromPostalCode() {
		return shipFromPostalCode;
	}
	public void setShipFromPostalCode(String shipFromPostalCode) {
		this.shipFromPostalCode = shipFromPostalCode;
	}
	public String getDestinationPostalCode() {
		return destinationPostalCode;
	}
	public void setDestinationPostalCode(String destinationPostalCode) {
		this.destinationPostalCode = destinationPostalCode;
	}
	public String getDestinationCountryCode() {
		return destinationCountryCode;
	}
	public void setDestinationCountryCode(String destinationCountryCode) {
		this.destinationCountryCode = destinationCountryCode;
	}
	public String getInvoiceReferenceNumber() {
		return invoiceReferenceNumber;
	}
	public void setInvoiceReferenceNumber(String invoiceReferenceNumber) {
		this.invoiceReferenceNumber = invoiceReferenceNumber;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public DetailTax getDetailTax() {
		return detailTax;
	}
	public void setDetailTax(DetailTax detailTax) {
		this.detailTax = detailTax;
	}
	public DetailTax[] getDetailTaxArray() {
		return detailTaxArray;
	}
	public void setDetailTaxArray(DetailTax[] detailTaxArray) {
		this.detailTaxArray = detailTaxArray;
	}
	public LineItem getLineItem() {
		return lineItem;
	}
	public void setLineItem(LineItem lineItem) {
		this.lineItem = lineItem;
	}
	public LineItem[] getLineItemArray() {
		return lineItemArray;
	}
	public void setLineItemArray(LineItem[] lineItemArray) {
		this.lineItemArray = lineItemArray;
	}
	public String getDeliveryType() {
        return deliveryType;
    }
    public void setDeliveryType(DeliveryType name) {
        this.deliveryType = name.toString();
    }
	public enum DeliveryType {
        CNC("CNC"),
		DIG("DIG"),
		PHY("PHY"),
		SVC("SVC"),
		TBD("TBD");

        private String value;
        private DeliveryType(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
}