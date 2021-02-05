package com.planon.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggerWithSingleton {
		private static LoggerWithSingleton logger = null;
	    private final String logFile = "D:\\Singletonlogger.txt";
	    private PrintWriter writer;
	    private LoggerWithSingleton() {
	        try {
	            FileWriter fw = new FileWriter(logFile);
	            writer = new PrintWriter(fw, true);
	        } catch (IOException e) {}
	    }
	    
	    public static synchronized LoggerWithSingleton getInstance(){
			if(logger == null)
				logger = new LoggerWithSingleton();
			return logger;
		}
		
	    public void logWithdraw (String account, double amount) {
	        writer.println("WITHDRAW ("
	            + account + "): " + amount);
	    }
	    public void logDeposit (String account, double amount) {
	        writer.println("DEPOSIT ("
	            + account + "): " + amount );
	    }
	    public void logTransfer (String fromAccount, String toAccount, double amount) {
	        writer.println("TRANSFER ("
	           + fromAccount + "->" + toAccount + "): " + amount);
	    }
	

	public static void main(String[] args) {
		
		LoggerWithSingleton Logger1 = LoggerWithSingleton.getInstance();
		LoggerWithSingleton Logger2 = LoggerWithSingleton.getInstance();
		LoggerWithSingleton Logger3 = LoggerWithSingleton.getInstance();
		
		Logger1.logDeposit("0001", 80.5);
		Logger2.logWithdraw("0002", 100);
		Logger1.logTransfer("0001", "0003", 40);
		Logger3.logDeposit("0004", 56.74);
		Logger2.logWithdraw("0005", 30);

}
}