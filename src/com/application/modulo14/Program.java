package com.application.modulo14;

import com.entities.modulo14.BusinessAccount;

/*
 * Suponha um negócio de banco que possui uma conta comum e uma conta para empresas, sendo que a conta 
 * para empresa possui todos membros da conta comum, mais um limite de empréstimo e uma operação de 
 * realizar empréstimo.
 */
public class Program {

	public static void main(String[] args) {
		
		BusinessAccount account = new BusinessAccount();
		account.getBalance();

	}

}
