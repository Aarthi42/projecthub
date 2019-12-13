package org.bank;

public class AxisBank extends BankkInfo{
	public void deposit() {
		System.out.println("5% interest");
	}
	public static void main(String[] args) {
	AxisBank bank =new AxisBank();
	bank.deposit();
	}
	}
