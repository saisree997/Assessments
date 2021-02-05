package com.planon.TransactionsImplementation;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface TransactionOperations {

	/**
	 * to calculate credit balance of each source
	 * 
	 * @param transactionlist
	 */
	void getCreditDetails(List<Transaction> transactionlist);

	/**
	 * to get balance sheet of each source before to the given date
	 * 
	 * @param inputLocalDate
	 * @param transactionlist
	 */
	void getBalanceSheet(LocalDate inputLocalDate, List<Transaction> transactionlist);

	/**
	 * to get balance of each source based on quarter
	 * 
	 * @param transactionlist
	 * @return
	 */
	Map<String, Double> getQuaterBasedBal(List<Transaction> transactionlist);

	/**
	 * to calculate interest amount of each source based on quarter
	 * 
	 * @param transactionlist
	 * @return
	 **/
	void getQuaterBasedInterest(Map<String, Double> tranmap);

	/**
	 * to calculate interest amount for each source based on given period
	 * 
	 * @param transactionlist
	 * @param year
	 * @param key
	 * @return
	 */
	Map<String, Double> getPeriodBasedBal(List<Transaction> transactionlist, String year, String periodkey);

	/**
	 * to get interest amount of each source based on given period
	 * @param tranmap
	 */
	void getPeriodBasedInterest(Map<String, Double> tranmap);
}
