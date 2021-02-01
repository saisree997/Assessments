package com.planon.assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Transaction {

	private int id;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AccountType == null) ? 0 : AccountType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		result = prime * result + id;
		result = prime * result + ((localDate == null) ? 0 : localDate.hashCode());
		result = prime * result + ((src == null) ? 0 : src.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (AccountType == null) {
			if (other.AccountType != null)
				return false;
		} else if (!AccountType.equals(other.AccountType))
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (dest == null) {
			if (other.dest != null)
				return false;
		} else if (!dest.equals(other.dest))
			return false;
		if (id != other.id)
			return false;
		if (localDate == null) {
			if (other.localDate != null)
				return false;
		} else if (!localDate.equals(other.localDate))
			return false;
		if (src == null) {
			if (other.src != null)
				return false;
		} else if (!src.equals(other.src))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	private String src;
	private String dest;
	private double amount;
	private LocalDate localDate;
	private TransactionType type;
	private String AccountType;

	public Transaction(int id, String src, String dest, TransactionType type, double amount, String dateoftran, String AccountType) {

		this.id = id;
		this.src = src;
		this.dest = dest;
		this.amount = amount;
		this.type = type;
		this.localDate = LocalDate.parse(dateoftran, DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US));
		this.AccountType = AccountType;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSrc() {
		return this.src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

}
