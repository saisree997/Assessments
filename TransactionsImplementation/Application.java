/**
 * this is the main class to call required method
 */

package com.planon.TransactionsImplementation;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Application {

	private static Object L;

	public static void main(String args[]) throws ParseException {
		TransactionDetails td = new TransactionDetails();
		TransactionOperations tp = new TransactionOperationsImpl();
		List<Transaction> transactionlist = td.getTransactionDetails();
		tp.getCreditDetails(transactionlist);
		String inputdate = "20-05-2020";
		LocalDate inputLocalDate = LocalDate.parse(inputdate, DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US));
		tp.getBalanceSheet(inputLocalDate, transactionlist);

		Map<String, Double> tranmap = tp.getQuaterBasedBal(transactionlist);
		tp.getQuaterBasedInterest(tranmap);
		
	    Map<String,Double> constantsmap = tp.getPeriodBasedBal(transactionlist, "Q1", "2020");
	    tp.getPeriodBasedInterest(constantsmap);
	}
}
