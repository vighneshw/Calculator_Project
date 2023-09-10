package com.practice.json;

public class TransactionDetail {
	
	/*
	 * CCAvenue Reference No.	CCAvenue reference no allocated to the transaction.
Order No.	Order No for the transaction
LEAD NUMBER	Unique number generated for the customer taking the journey
Order Datetime	This is the latest date and time when order status is modified.
Currency	Currency in which merchant processed the transaction
Order Amt	Amount of transaction.
Mode of payment	Type of payment option (NET BANKING / UPI / DEBIT CARD)
Payment Details	    VPA for UPI transactions
    Customer Bank name for Net Banking transactions
    Masked Card number for Debit card Transactions
PG Fee	Fee applied to process transaction by CCAvenue.
Tax	Sum of Taxes applied for the transaction.
Settled Amt	Payable amount for given transaction to merchant
Settlement Type	Credit
Settlement Date	Date of settlement for this transaction
Billing Name	Order billing name for the order
Billing Email	Customer email id for the transaction
  "trackingId": 883764428	 CCAvenue Team- Please confirm what is “tracking id”
  "partnerId": "",	 CCAvenue Team- Please confirm what is “patnerid”
Callback Url	Call Back URL
UDF 1	Merchant can update one param value against unique reference no after placing order
UDF 2	Merchant can update one param value against unique reference no after placing order
UDF 3	Merchant can update one param value against unique reference no after placing order
UDF 4	Merchant can update one param value against unique reference no after placing order
UDF 5	Merchant can update one param value against unique reference no after placing order
UDF 6	Merchant can update one param value against unique reference no after placing order
UDF 7	Merchant can update one param value against unique reference no after placing order
UDF 8	Merchant can update one param value against unique reference no after placing order
UDF 9	Merchant can update one param value against unique reference no after placing order
UDF 10	Merchant can update one param value against unique reference no after placing order	 * 	 * */	
	
	private String ccavReferenceNumber;
	private String orderNo;
	private String leadNumber;
	private String orderDatetime;
	private String orderCurrency;
	private String orderAmount;
	private String modeOfPayment;
	private String paymentDetails;
	private String customerBankName;
	private String maskedCardNumber;
	private String pgFee;
	private String tax;
	private String settlementType;
	private String settlementDate;
	private String billingName;
	private String billingEmail;
	private String callbackUrl;
	private String udf1;
	private String udf2;
	private String udf3;
	private String udf4;
	private String udf5;
	private String udf6;
	private String udf7;
	private String udf8;
	private String udf9;
	private String udf10;
	public String getCcavReferenceNumber() {
		return ccavReferenceNumber;
	}
	public void setCcavReferenceNumber(String ccavReferenceNumber) {
		this.ccavReferenceNumber = ccavReferenceNumber;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderDatetime() {
		return orderDatetime;
	}
	public void setOrderDatetime(String orderDatetime) {
		this.orderDatetime = orderDatetime;
	}
	public String getOrderCurrency() {
		return orderCurrency;
	}
	public void setOrderCurrency(String orderCurrency) {
		this.orderCurrency = orderCurrency;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public String getCustomerBankName() {
		return customerBankName;
	}
	public void setCustomerBankName(String customerBankName) {
		this.customerBankName = customerBankName;
	}
	public String getMaskedCardNumber() {
		return maskedCardNumber;
	}
	public void setMaskedCardNumber(String maskedCardNumber) {
		this.maskedCardNumber = maskedCardNumber;
	}
	public String getPgFee() {
		return pgFee;
	}
	public void setPgFee(String pgFee) {
		this.pgFee = pgFee;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getSettlementType() {
		return settlementType;
	}
	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}
	public String getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}
	public String getBillingName() {
		return billingName;
	}
	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}
	public String getBillingEmail() {
		return billingEmail;
	}
	public void setBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
	}
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public String getUdf1() {
		return udf1;
	}
	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}
	public String getUdf2() {
		return udf2;
	}
	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}
	public String getUdf3() {
		return udf3;
	}
	public void setUdf3(String udf3) {
		this.udf3 = udf3;
	}
	public String getUdf4() {
		return udf4;
	}
	public void setUdf4(String udf4) {
		this.udf4 = udf4;
	}
	public String getUdf5() {
		return udf5;
	}
	public void setUdf5(String udf5) {
		this.udf5 = udf5;
	}
	public String getUdf6() {
		return udf6;
	}
	public void setUdf6(String udf6) {
		this.udf6 = udf6;
	}
	public String getUdf7() {
		return udf7;
	}
	public void setUdf7(String udf7) {
		this.udf7 = udf7;
	}
	public String getUdf8() {
		return udf8;
	}
	public void setUdf8(String udf8) {
		this.udf8 = udf8;
	}
	public String getUdf9() {
		return udf9;
	}
	public void setUdf9(String udf9) {
		this.udf9 = udf9;
	}
	public String getUdf10() {
		return udf10;
	}
	public void setUdf10(String udf10) {
		this.udf10 = udf10;
	}
	public TransactionDetail(String ccavReferenceNumber, String orderNo, String orderDatetime, String orderCurrency,
			String orderAmount, String modeOfPayment, String paymentDetails, String customerBankName,
			String maskedCardNumber, String pgFee, String tax, String settlementType, String settlementDate,
			String billingName, String billingEmail, String callbackUrl, String udf1, String udf2, String udf3,
			String udf4, String udf5, String udf6, String udf7, String udf8, String udf9, String udf10) {
		super();
		this.ccavReferenceNumber = ccavReferenceNumber;
		this.orderNo = orderNo;
		this.orderDatetime = orderDatetime;
		this.orderCurrency = orderCurrency;
		this.orderAmount = orderAmount;
		this.modeOfPayment = modeOfPayment;
		this.paymentDetails = paymentDetails;
		this.customerBankName = customerBankName;
		this.maskedCardNumber = maskedCardNumber;
		this.pgFee = pgFee;
		this.tax = tax;
		this.settlementType = settlementType;
		this.settlementDate = settlementDate;
		this.billingName = billingName;
		this.billingEmail = billingEmail;
		this.callbackUrl = callbackUrl;
		this.udf1 = udf1;
		this.udf2 = udf2;
		this.udf3 = udf3;
		this.udf4 = udf4;
		this.udf5 = udf5;
		this.udf6 = udf6;
		this.udf7 = udf7;
		this.udf8 = udf8;
		this.udf9 = udf9;
		this.udf10 = udf10;
	}
	public String getLeadNumber() {
		return leadNumber;
	}
	public void setLeadNumber(String leadNumber) {
		this.leadNumber = leadNumber;
	}
	
	
}
