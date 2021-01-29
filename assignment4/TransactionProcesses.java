package com.planon.assignment4;

import java.time.LocalDate;
import java.util.List;

public interface TransactionProcesses {
	
	 void getCreditDetails(List<Transaction> transactionlist);
	 void getBalanceSheet(LocalDate inputLocalDate, List<Transaction> transactionlist);

}
