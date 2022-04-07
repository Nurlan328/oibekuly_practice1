package kz.iitu.itse1910.nurlan.oibekuly.database;

import lombok.*;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Scope("prototype")
@Component
@DependsOn("Customers")
public class Account {

    public static Long accountNumber;
    public double balance;
    private double interest;

    public Account(Long accountNumber, double balance, double interest) {
         this.accountNumber = accountNumber++;
    }


    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
