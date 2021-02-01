package com.planon.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionDetails {

	public List<Transaction> getTransactionDetails() {

		List<Transaction> transactiondetails = new ArrayList<Transaction>();

		transactiondetails.add(new Transaction(1, "s1", "s2", TransactionType.CREDIT, 20, "20-01-2020", "Savings"));
		transactiondetails.add(new Transaction(1, "s2", "s1", TransactionType.DEBIT, 20, "20-01-2020", "Current"));
//		transactiondetails.add(new Transaction(1, "s1", "s2", TransactionType.CREDIT, 20, "20-01-2020","Savings"));
//		transactiondetails.add(new Transaction(1, "s2", "s1", TransactionType.DEBIT, 20, "20-01-2020","Savings"));
		transactiondetails.add(new Transaction(2, "s2", "s1", TransactionType.CREDIT, 20, "26-02-2020", "Current"));
		transactiondetails.add(new Transaction(2, "s1", "s2", TransactionType.DEBIT, 20, "26-02-2020", "Savings"));
		transactiondetails.add(new Transaction(3, "s3", "s2", TransactionType.CREDIT, 50, "27-03-2020", "Fixed"));
		transactiondetails.add(new Transaction(3, "s2", "s3", TransactionType.DEBIT, 50, "27-03-2020", "Current"));
		transactiondetails.add(new Transaction(4, "s3", "s1", TransactionType.CREDIT, 30, "27-03-2020", "Fixed"));
		transactiondetails.add(new Transaction(4, "s1", "s3", TransactionType.DEBIT, 30, "27-03-2020", "Savings"));

		List<Transaction> transactionlist = transactiondetails.stream().distinct().collect(Collectors.toList());
		List<Transaction> finallist = Collections.unmodifiableList(transactionlist);

		return finallist;

	}
}
