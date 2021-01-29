package com.planon.assignment4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionProcessImpl implements TransactionProcesses {

	public void getCreditDetails(List<Transaction> transactionlist) {

		Map<String, Double> creditmap = new HashMap<String, Double>();
		transactionlist.stream().filter(credittransaction -> credittransaction.getType().equals(TransactionType.CREDIT))
				.forEach(transaction -> {
					double creditamount = creditmap.containsKey(transaction.getSrc())
							? creditmap.get(transaction.getSrc()) + transaction.getAmount()
							: transaction.getAmount();
					creditmap.put(transaction.getSrc(), creditamount);
				});
		System.out.println("credit amount for each source::" + " " +creditmap);
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

}
