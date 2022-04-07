package kz.iitu.itse1910.nurlan.oibekuly.database;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.OneToMany;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Scope("prototype")
@Component
public class Bank {

    private Long id;
    private String bankName;
    private Integer customerAccountNumber;
    @OneToMany
    private static List<Customers> customers = Customers.getAllCustomers();;

    public static List<Bank> getAllBanks () {
        Bank bank = Bank.builder()
                .id(1L)
                .bankName("Kaspi bank")
                .customerAccountNumber(9999999)
                .build();

        Bank bank1 = Bank.builder()
                .id(2L)
                .bankName("Halyk Bank")
                .customerAccountNumber(9999999)
                .build();

        return Arrays.asList(bank, bank1);
    }

    public static List<Customers> getAllCustomers() {
        return Customers.getAllCustomers();
    }

}
