package kz.iitu.itse1910.nurlan.oibekuly.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

class BankTest {
    @Mock
    List<Customers> customers;
    @InjectMocks
    Bank bank;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testBuilder() {
        final Bank.BankBuilder result = Bank.builder();
    }

//    @Test
//    void testBuilder() {
//        Bank.BankBuilder result = Bank.builder();
//        Assertions.assertEquals(
//                new Bank(Long.valueOf(1L), "Kaspi bank", Integer.valueOf(9999999)
////                        , Arrays.<Customers>asList(
////                new Customers(0, "Ryan", "Reynolds", 41, "New York"),
////                new Customers(1, "Daniel", "Craige", 41, "Washington"),
////                new Customers(2, "Gal", "Gadot", 33, "Los Angeles"),
////                new Customers(3, "Ben", "Affleck", 36, "Texas")
////    )
//        ).new BankBuilder(), result);
//    }

//    @Test
//    void testGetAllBanks() {
//        List<Bank> result = Bank.getAllBanks();
//        Assertions.assertEquals(Arrays.<Bank>asList(new Bank(Long.valueOf(1), "Kaspi bank", Integer.valueOf(9999999),
//                Arrays.<Customers>asList(
//                new Customers(0, "Ryan", "Reynolds", 41, "New York"),
//                new Customers(1, "Daniel", "Craige", 41, "Washington"),
//                new Customers(2, "Gal", "Gadot", 33, "Los Angeles"),
//                new Customers(3, "Ben", "Affleck", 36, "Texas")))), result);
//    }

    @Test
    void testCustomersList() {
        List<Customers> result = bank.getAllCustomers();
        Assertions.assertEquals(Arrays.<Customers>asList(
                new Customers(0, "Ryan", "Reynolds", 41, "New York"),
                new Customers(1, "Daniel", "Craige", 41, "Washington"),
                new Customers(2, "Gal", "Gadot", 33, "Los Angeles"),
                new Customers(3, "Ben", "Affleck", 36, "Texas")), result);
    }
//
//    @Test
//    void testSetCustomers() {
//        bank.setCustomers(Arrays.<Customers>asList(new Customers(1, "Daniel", "Craige", 41, "Washington")));
//    }
}

