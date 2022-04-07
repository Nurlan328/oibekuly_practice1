package kz.iitu.itse1910.nurlan.oibekuly.service;

import kz.iitu.itse1910.nurlan.oibekuly.database.Account;
import kz.iitu.itse1910.nurlan.oibekuly.repository.AccountRepository;
import kz.iitu.itse1910.nurlan.oibekuly.repository.JdbcAccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    private JdbcAccountRepository jdbcAccountRepository;

    @Autowired
    public AccountService(JdbcAccountRepository jdbcAccountRepository) {
        this.jdbcAccountRepository = jdbcAccountRepository;
    }

    Account account = new Account();
    double balance = account.getBalance();

    public void transfer(double amount, Account from, Account to) {
        if(from.balance >= amount) {
            from.balance = from.balance - amount;
            to.balance = to.balance + amount;
            System.out.println("Successfully transfered.");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public String accountDetails() {
        return "Account information: " +'\n' +
                "Account number: " + account.getAccountNumber() + '\n' +
                "Balance: " + account.getBalance() + '\n' +
                "Interest: " + account.getInterest() + '\n';
    }
}
