package com.planon.assignment4;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class TransactionDetails {

	public  List<Transaction> getTransactionDetails() {

		List<Transaction> transactiondetails = new ArrayList<Transaction>();

		transactiondetails.add(new Transaction(1, "s1", "s2", TransactionType.CREDIT, 20, "20-01-2020"));
		transactiondetails.add(new Transaction(1, "s2", "s1", TransactionType.DEBIT, 20, "20-01-2020"));
		transactiondetails.add(new Transaction(1, "s1", "s2", TransactionType.CREDIT, 20, "20-01-2020"));
		transactiondetails.add(new Transaction(1, "s2", "s1", TransactionType.DEBIT, 20, "20-01-2020"));
		transactiondetails.add(new Transaction(2, "s2", "s1", TransactionType.CREDIT, 20, "26-02-2020"));
		transactiondetails.add(new Transaction(2, "s1", "s2", TransactionType.DEBIT, 20, "26-02-2020"));
		transactiondetails.add(new Transaction(3, "s3", "s2", TransactionType.CREDIT, 50, "27-03-2020"));
		transactiondetails.add(new Transaction(3, "s2", "s3", TransactionType.DEBIT, 50, "27-03-2020"));
		transactiondetails.add(new Transaction(4, "s3", "s1", TransactionType.CREDIT, 30, "27-03-2020"));
		transactiondetails.add(new Transaction(4, "s1", "s3", TransactionType.DEBIT, 30, "27-03-2020"));
		
		List<Transaction> transactionlist = transactiondetails.stream().distinct().collect(Collectors.toList());
		List<Transaction> finallist = Collections.unmodifiableList(transactionlist);  
		
		return finallist;

	}
	public static void main(String args[]) throws ParseException {
		TransactionDetails td = new TransactionDetails();
		TransactionProcesses tp = new TransactionProcessImpl();
		List<Transaction> transactionlist = td.getTransactionDetails();
		tp.getCreditDetails(transactionlist);
		String inputdate = "20-05-2020";
		LocalDate inputLocalDate = LocalDate.parse(inputdate, DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US));
		tp.getBalanceSheet(inputLocalDate, transactionlist);
	}
}