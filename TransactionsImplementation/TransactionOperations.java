package com.planon.assignment4;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface TransactionOperations {
	
	 void getCreditDetails(List<Transaction> transactionlist);
	 void getBalanceSheet(LocalDate inputLocalDate, List<Transaction> transactionlist);
	 Map<String, Double> getQuaterBasedBal(List<Transaction> transactionlist);
	 void getQuaterBasedInterest(List<Transaction> transactionlist);
}
