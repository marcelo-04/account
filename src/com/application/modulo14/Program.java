package com.application.modulo14;

import com.entities.modulo14.Account;
import com.entities.modulo14.BusinessAccount;
import com.entities.modulo14.SavingsAccount;

/*
 * Suponha um negócio de banco que possui uma conta comum e uma conta para empresas, sendo que a conta 
 * para empresa possui todos membros da conta comum, mais um limite de empréstimo e uma operação de 
 * realizar empréstimo.
 */
public class Program {

	public static void main(String[] args) {
		
		Account x = new Account(1020, "Marcelo", 1000.0);
		Account y = new SavingsAccount(1023, "Bob", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
}
