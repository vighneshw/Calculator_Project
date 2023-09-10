package com.practice.json;

import com.google.gson.Gson;
import com.practice.json.TransactionDetail;
public class JsonData {
	/*	 *  "status": "Success",	This states whether the call was successful or not.
Pay Id	Unique pay Id for payout.
BATCH SETTLEMENT DATE TIME	Date & time of settlement of a payout
BATCH SETTLEMENT AMOUNT	Payout amount for a payout.
SETTLEMENT BANK ACCOUNT NO	Account number for payout
COUNT OF TRANSACTION SETTLED	Number of transaction settled for a payout
UTR Number	Unique id from bank against each payout id.
TID	TID of the journey
RID	RID number
CCAvenue Reference No.	CCAvenue reference no allocated to the transaction.
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
	
	
	
	//SETTLEMENT BANK ACCOUNT NO	Account number for payout
//	COUNT OF TRANSACTION SETTLED	Number of transaction settled for a payout
//	UTR Number	Unique id from bank against each payout id.
//	TID	TID of the journey
//	RID	RID number
	private String status;
	private String payId;
	private String batchSettlementDate;
	private String batchSettlementAmount;
	private String settlementBankAccountNo;
	private String countOfTransactions;
	private String utrNumber;
	private String tid;
	private String rid;
	private TransactionDetail[] tranDet;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public TransactionDetail[] getTranDet() {
		return tranDet;
	}
	public void setTranDet(TransactionDetail[] tranDet) {
		this.tranDet = tranDet;
	}
	
	public String getBatchSettlementDate() {
		return batchSettlementDate;
	}
	public void setBatchSettlementDate(String batchSettlementDate) {
		this.batchSettlementDate = batchSettlementDate;
	}
	public String getBatchSettlementAmount() {
		return batchSettlementAmount;
	}
	public void setBatchSettlementAmount(String batchSettlementAmount) {
		this.batchSettlementAmount = batchSettlementAmount;
	}
	public String getSettlementBankAccountNo() {
		return settlementBankAccountNo;
	}
	public void setSettlementBankAccountNo(String settlementBankAccountNo) {
		this.settlementBankAccountNo = settlementBankAccountNo;
	}
	public String getCountOfTransactions() {
		return countOfTransactions;
	}
	public void setCountOfTransactions(String countOfTransactions) {
		this.countOfTransactions = countOfTransactions;
	}
	public String getUtrNumber() {
		return utrNumber;
	}
	public void setUtrNumber(String utrNumber) {
		this.utrNumber = utrNumber;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public static void main(String[] args) {
		JsonData jd = new JsonData();
		jd.setStatus("Sucess");
		jd.setPayId("11111111");
		jd.setBatchSettlementDate("2023-06-02 10:36:53.233");
		jd.setBatchSettlementAmount("200.5");
		jd.setSettlementBankAccountNo("10000000000200");
		jd.setCountOfTransactions("2");
		jd.setUtrNumber("HDFC1023435");
		jd.setTid("7234897");
		jd.setRid("123456");
		
		TransactionDetail tranDet = new TransactionDetail("10000000000200", "234325", "2020-05-07 14:38:21.667", "INR", "100", "OPTUPI", "paymentDetails", "HDFC", "xxxxxxxxxxxx1234", "0.23", "0.02", "Credit", "2020-07-07 14:38:21.667", "Test Name", "test@hdfcbank.com", "https://fakeurl.com", "udf1", "udf2", "udf3", "udf4", "udf5", "udf6", "udf7", "udf8", "udf9", "udf10");
		
		tranDet.setLeadNumber("lead123");
		
		TransactionDetail tranDet2 = new TransactionDetail("10000000000200", "234325", "2020-05-07 14:38:21.667", "INR", "100", "OPTUPI", "paymentDetails", "HDFC", "xxxxxxxxxxxx1234", "0.23", "0.02", "Credit", "2020-07-07 14:38:21.667", "Test Name", "test@hdfcbank.com", "https://fakeurl.com", "udf1", "udf2", "udf3", "udf4", "udf5", "udf6", "udf7", "udf8", "udf9", "udf10");
		
		tranDet2.setLeadNumber("lead456");
		TransactionDetail[] tranList = {tranDet,tranDet2};
		
		jd.setTranDet(tranList);
		
		System.out.println(new Gson().toJson(jd));
		
	}
	
	public <T> void meth() {
		
		T obj;
	}
	
}
