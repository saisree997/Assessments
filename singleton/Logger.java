package com.planon.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

	private final String logFile = "D://logger.txt";
	private PrintWriter writer;
	
	public Logger() {
		try {
			FileWriter fw = new FileWriter(logFile);
		    writer = new PrintWriter(fw, true);
		} catch (IOException e) {}
	}
	
	public void logWithdraw (String account, double amount) {
		writer.println("WITHDRAW (" + account + "): " + amount);
	}
	
	public void logDeposit (String account, double amount) {
		writer.println("DEPOSIT (" + account + "): " + amount);
	}
	
	public void logTransfer (String fromAccount, String toAccount, double amount) {
		writer.println("TRANSFER (" + fromAccount + "->" + toAccount + "): " + amount);
	}
	
	public static void main(String[] args) {
	
	Logger logger1 = new Logger();
	Logger logger2 = new Logger();
	Logger logger3 = new Logger();
	
	logger1.logDeposit("0001", 80.5);
	logger2.logWithdraw("0002", 100);
	logger1.logTransfer("0001", "0003", 40);
	logger3.logDeposit("0004", 56.74);
	logger2.logWithdraw("0005", 30);

}
	

}