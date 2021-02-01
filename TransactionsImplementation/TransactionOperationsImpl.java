package com.planon.assignment4;

import java.time.LocalDate;
import java.time.temporal.IsoFields;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionOperationsImpl implements TransactionOperations {

	public void getCreditDetails(List<Transaction> transactionlist) {

		Map<String, Double> creditmap = new HashMap<String, Double>();
		transactionlist.stream().filter(credittransaction -> credittransaction.getType().equals(TransactionType.CREDIT))
				.forEach(transaction -> {
					double creditamount = creditmap.containsKey(transaction.getSrc())
							? creditmap.get(transaction.getSrc()) + transaction.getAmount()
							: transaction.getAmount();
					creditmap.put(transaction.getSrc(), creditamount);
				});
		System.out.println("credit amount for each source::" + " " + creditmap);
	}

	public void getBalanceSheet(LocalDate inputLocalDate, List<Transaction> transactionlist) {

		Map<String, Double> balancemap = new HashMap<String, Double>();
		transactionlist.stream().filter(
				trans -> trans.getLocalDate().isBefore(inputLocalDate) || trans.getLocalDate().equals(inputLocalDate))
				.forEach(transaction -> {

					double balanceamount = 0;
					if (balancemap.containsKey(transaction.getSrc())) {
						balanceamount = (transaction.getType().equals(TransactionType.CREDIT)
								? balancemap.get(transaction.getSrc()) + transaction.getAmount()
								: balancemap.get(transaction.getSrc()) - transaction.getAmount());
					} else {
						balanceamount = (transaction.getType().equals(TransactionType.CREDIT) ? transaction.getAmount()
								: -transaction.getAmount());
					}
					balancemap.put(transaction.getSrc(), balanceamount);
				});
		System.out.println("balance amount for each source before particular date::" + " " + balancemap);
	}

//	@Override
//	public String[] getDatesBasedQuater(String quarter, String year) {
//
//		String fromdate = null;
//		String todate = null;
//		String[] fromtodate = new String[] { fromdate, todate };
//
//		if (quarter.equals("Q1")) {
//			fromdate = "01-01-" + year;
//			todate = "31-03-" + year;
//		}
//
//		else if (quarter.equals("Q2")) {
//			fromdate = "01-04-" + year;
//			todate = "30-06-" + year;
//		} else if (quarter.equals("Q3")) {
//			fromdate = "01-07-" + year;
//			todate = "30-09-" + year;
//		} else if (quarter.equals("Q4")) {
//			fromdate = "01-10-" + year;
//			todate = "31-12-" + year;
//		}
//		return fromtodate;
//	}


	@Override
	public Map<String, Double> getQuaterBasedBal(List<Transaction> transactionlist) {
		Map<String,Double> tranmap= new HashMap<String,Double>();
		double amount;
		transactionlist.forEach( trans ->
				 trans.getSrc() + "-" +  trans.getAccountType() + "-" + "Q" + trans.getLocalDate().get(IsoFields.QUARTER_OF_YEAR);	
					if( trans.getType().equals(TransactionType.CREDIT) )
						{
						amount = +trans.getAmount();
						}
					else
					{
						amount = -trans.getAmount();
					});
		return tranmap;	
}
		

	@Override
	public void getQuaterBasedInterest(List<Transaction> transactionlist) {
		
		CalculateInterest ci = new CalculateInterest();
		transactionlist.stream().forEach(trans->   (ci).calculateInterest(trans));
	}

}
