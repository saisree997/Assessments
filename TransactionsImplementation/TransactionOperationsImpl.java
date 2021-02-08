/**
 * this is implemented class of TransactionOperation interface
 */

package com.planon.TransactionsImplementation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class TransactionOperationsImpl implements TransactionOperations {
/**
@inheritdoc
**/
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
	/**
	@inheritDoc
	**/
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
	/**
	@inheritdoc
	**/
	@Override
	public Map<String, Double> getQuaterBasedBal(List<Transaction> transactionlist) {
		Map<String, Double> tranmap = new HashMap<String, Double>();
		transactionlist.forEach(trans -> {
			double amount = 0;
			String trankey = trans.getSrc() + "-" + trans.getAccountType() + "-" + "Q"
					+ trans.getLocalDate().get(IsoFields.QUARTER_OF_YEAR);
			if (tranmap.containsKey(trankey)) {
				amount = trans.getType().equals(TransactionType.CREDIT) ? tranmap.get(trankey) + trans.getAmount()
						: tranmap.get(trankey) - trans.getAmount();
			} else

			{
				amount = trans.getType().equals(TransactionType.CREDIT) ? +trans.getAmount() : -trans.getAmount();
			}

			tranmap.put(trankey, amount);
		});
		return tranmap;
	}
	/**
	@inheritdoc
	**/
	@Override
	public void getQuaterBasedInterest(Map<String, Double> tranmap) {
		InterestFactory insfactory = new InterestFactory(); 
		tranmap.forEach((trankey, amount) -> {
			String[] keys = trankey.split("-");
			String Quaterernum = keys[2];
			String acctype = keys[1];
			String src = keys[0];
			Interest ins = insfactory.getAccountType(acctype);
			double rate = ins.getInterestRate();
			ins.calculateInterest(amount, Quaterernum, rate, src);
		});
	}
	/**
	@inheritdoc
	**/
	@Override
	public Map<String, Double> getPeriodBasedBal(List<Transaction> transactionlist,String qkey,String year) {
		
		
		 final	Map<String, String> noofdaysmap = new HashMap<String,String>();
			noofdaysmap.put("Q1", "Q1,01-01-,31-03-,90");
			noofdaysmap.put("Q2", "Q2,01-01-,31-03-,91");
			noofdaysmap.put("Q3", "Q3,01-01-,31-03-,91");
			noofdaysmap.put("Q4", "Q4,01-01-,31-03-,92");
			noofdaysmap.put("SA1", "SA1,01-01-,31-06-,181");
			noofdaysmap.put("SA2", "SA2,01-07-,31-12-,184");
			noofdaysmap.put("A", "A,01-01-,31-12-,365");
			
			Map<String, Double> constantsmap = new HashMap<String,Double>();
			
			if(noofdaysmap.containsKey(qkey))
			{
				String[] values = noofdaysmap.get(qkey).split(",");
				String quatername = values[0];
				String fromdate = values[1]+year;
				LocalDate fromdateLocalDate = LocalDate.parse(fromdate, DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US));
				String todate = values[2]+year;
				LocalDate todateLocalDate = LocalDate.parse(todate, DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US));
				String noofdays = values[3];
				
				transactionlist.stream().filter(
						trans -> trans.getLocalDate().isBefore(todateLocalDate) && trans.getLocalDate().isAfter(fromdateLocalDate))
						.forEach(transaction -> {
							double balanceamount = 0;
							
							if (constantsmap.containsKey(transaction.getSrc())) {
								balanceamount = (transaction.getType().equals(TransactionType.CREDIT)
										? constantsmap.get(transaction.getSrc()) + transaction.getAmount()
										: constantsmap.get(transaction.getSrc()) - transaction.getAmount());
							} else {
								balanceamount = (transaction.getType().equals(TransactionType.CREDIT) ? transaction.getAmount()
										: -transaction.getAmount());
							}
							constantsmap.put(transaction.getSrc()+ "-" + transaction.getAccountType()+"-"+ noofdays+"-"+quatername, balanceamount);
				});
	}
			return constantsmap;
	}
	/**
	@inheritdoc
	**/
	@Override
	public void getPeriodBasedInterest(Map<String, Double> tranmap) {
		InterestFactory insfactory = new InterestFactory(); 
		tranmap.forEach((trankey, amount) -> {
			String[] keys = trankey.split("-");
			String Quaterernum = keys[3];
			int noofdays = Integer.parseInt(keys[2]);
			String acctype = keys[1];
			String src = keys[0];
			Interest ins = insfactory.getAccountType(acctype);
			double rate = ins.getInterestRate();
			ins.CalculatePeriodBasedInterest(amount, Quaterernum, rate, src,noofdays);
		});
	}
}
