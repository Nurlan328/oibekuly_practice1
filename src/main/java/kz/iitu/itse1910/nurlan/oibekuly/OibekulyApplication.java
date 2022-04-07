package kz.iitu.itse1910.nurlan.oibekuly;

import kz.iitu.itse1910.nurlan.oibekuly.config.AccountConfig;
import kz.iitu.itse1910.nurlan.oibekuly.config.BankConfig;
import kz.iitu.itse1910.nurlan.oibekuly.config.CustomersConfig;
import kz.iitu.itse1910.nurlan.oibekuly.database.Account;
import kz.iitu.itse1910.nurlan.oibekuly.service.AccountService;
import kz.iitu.itse1910.nurlan.oibekuly.service.CustomersService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OibekulyApplication {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(OibekulyApplication.class, args);

        BankConfig bank = applicationContext.getBean(BankConfig.class);
        bank.run();

        CustomersConfig customer = applicationContext.getBean(CustomersConfig.class);
        customer.run();

        AccountConfig accountConfig = applicationContext.getBean(AccountConfig.class);
        accountConfig.run();

        CustomersService customers = applicationContext.getBean(CustomersService.class);
        System.out.println("Your balance is = " + customers.getBalance());
        System.out.println("Withdraw operation: " + customers.makeWithdraw(5000));
        System.out.println();

        Account account1 = new Account();
        account1.setBalance(31242d);
        Account account2 = new Account();
        account2.setBalance(43522d);
        AccountService accountService = applicationContext.getBean(AccountService.class);

        System.out.println("Balance of account1 = " + account1.getBalance());
        accountService.transfer(10000, account1, account2);
        System.out.println(account1.getBalance());
        System.out.println("Balance of account2 = " + account2.getBalance());
    }
}
