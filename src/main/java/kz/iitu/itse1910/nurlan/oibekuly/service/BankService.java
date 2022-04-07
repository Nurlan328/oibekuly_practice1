package kz.iitu.itse1910.nurlan.oibekuly.service;

import kz.iitu.itse1910.nurlan.oibekuly.database.Account;
import kz.iitu.itse1910.nurlan.oibekuly.database.Bank;
import kz.iitu.itse1910.nurlan.oibekuly.database.Customers;
import kz.iitu.itse1910.nurlan.oibekuly.repository.BankRepository;
import kz.iitu.itse1910.nurlan.oibekuly.repository.JdbcBankRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BankService {

    @Autowired
    private BankRepository bankRepository;
    private JdbcBankRepository jdbcBankRepository;

    @Autowired
    public BankService(JdbcBankRepository jdbcBankRepository) {
        this.jdbcBankRepository = jdbcBankRepository;
    }

    private static Logger logger = LoggerFactory.getLogger(BankService.class);

    public void deposit(Account account, Double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    public void withdraw(Account account, Double amount) {

        if (amount < 0) {
            logger.info("The withdrawn amount must exceed 1000");
        }

        account.setBalance(account.getBalance() - amount);

    }

    public String bankDetails() {
        Bank bank = new Bank();
        return "Bank id: "  + bank.getId() +
                "\n Bank name: " + bank.getBankName() +
                "\n Number of customer account " + bank.getCustomerAccountNumber();
    }
}
