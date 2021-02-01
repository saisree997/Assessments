package com.planon.assignment4;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class Application {

	public static void main(String args[]) throws ParseException {
		TransactionDetails td = new TransactionDetails();
		TransactionOperations tp = new TransactionOperationsImpl();
		List<Transaction> transactionlist = td.getTransactionDetails();
		tp.getCreditDetails(transactionlist);
		String inputdate = "20-05-2020";
		LocalDate inputLocalDate = LocalDate.parse(inputdate, DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US));
		tp.getBalanceSheet(inputLocalDate, transactionlist);
		
		
		
	
}
}
