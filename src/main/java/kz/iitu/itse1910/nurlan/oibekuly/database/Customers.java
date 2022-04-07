package kz.iitu.itse1910.nurlan.oibekuly.database;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Scope("prototype")
@Component
public class Customers  {
    private Integer id;
    private String firstname;
    private String lastname;
    private int age;
    private String address;
    @OneToOne
    public Account account;

    public Customers(String firstName, String lastName) {
        this.firstname = firstName;
        this.lastname = lastName;
    }

    public Customers(int id, String firstName, String lastName, int age, String address) {
        this.id = id;
        this.firstname = firstName;
        this.lastname = lastName;
        this.age = age;
        this.address = address;
    }

    public static List<Customers> getAllCustomers() {
        Customers customers1 = Customers.builder()
                .id(0)
                .firstname("Ryan")
                .lastname("Reynolds")
                .age(41)
                .address("New York")
                .build();

        Customers customers2 = Customers.builder()
                .id(1)
                .firstname("Daniel")
                .lastname("Craige")
                .age(41)
                .address("Washington")
                .build();

        Customers customers3 = Customers.builder()
                .id(2)
                .firstname("Gal")
                .lastname("Gadot")
                .age(33)
                .address("Los Angeles")
                .build();

        Customers customers4 = Customers.builder()
                .id(3)
                .firstname("Ben")
                .lastname("Affleck")
                .age(36)
                .address("Texas")
                .build();

        return Arrays.asList(customers1, customers2, customers3, customers4);
    }

}
