/*
package kz.iitu.itse1910.nurlan.oibekuly.service;

import kz.iitu.itse1910.nurlan.oibekuly.database.Bank;
import kz.iitu.itse1910.nurlan.oibekuly.database.Customers;
import kz.iitu.itse1910.nurlan.oibekuly.repository.BankRepository;
import kz.iitu.itse1910.nurlan.oibekuly.repository.BankRepositoryImpl;
import kz.iitu.itse1910.nurlan.oibekuly.repository.SecondBankRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BankServiceTest {
    @Mock
    BankRepository bankRepository;
    @Mock
    SecondBankRepository secondBankRepository;
    @Mock
    BankRepositoryImpl bankRepositoryImpl;
    @Mock
    Logger logger;
    @InjectMocks
    BankService bankService;

//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }

//    @InjectMocks
    private BankService bankServiceUnderTest=new BankService();

    @BeforeEach
    void setUp() {
//        bankServiceUnderTest = new BankService();
//        bankServiceUnderTest  = mock(BankRepository.class);
    }


    @Test
    void testGetAllBanks() {
        when(bankRepositoryImpl.getAllBanks()).thenReturn(Arrays.<Bank>asList(new Bank(Long.valueOf(1), "bankName", Integer.valueOf(0), Arrays.<Customers>asList(new Customers(0, "firstName", "lastName", 0, "address")))));

        List<Bank> result = bankService.getAllBanks();
//        Assertions.assertEquals(Arrays.<Bank>asList(new Bank(Long.valueOf(1), "bankName", Integer.valueOf(0), Arrays.<Customers>asList(new Customers(0, "firstName", "lastName", 0, "address")))), result);
    }

//    @Test
//    void testInsertCustomer() {
//        bankService.insertCustomer(new Customers(0, "firstName", "lastName", 0, "address"));
//    }

    @Test
    void testSelectCustomerById() {
        final Customers expectedResult = new Customers(0, "firstName", "lastName", 0, "address");

        final Customers customers = new Customers(0, "firstName", "lastName", 0, "address");
//        when(bankServiceUnderTest.selectCustomerById(0)).thenReturn(customers);

        final Customers result = bankServiceUnderTest.selectCustomerById(0);

//        assertEquals(expectedResult, result);
    }

//    @Test
//    void testSelectCustomerById() {
//        when(secondBankRepository.selectCustomerById(anyInt())).thenReturn(new Customers(0, "firstName", "lastName", 0, "address"));
//
//        Customers result = bankService.selectCustomerById(0);
//        Assertions.assertEquals(new Customers(0, "firstName", "lastName", 0, "address"), result);
//    }

    @Test
    void testSelectAllCustomers() {
//        when(secondBankRepository.selectAllCustomers()).thenReturn(Arrays.<Customers>asList(new Customers(0, "firstName", "lastName", 0, "address")));

        List<Customers> result = bankService.selectAllCustomers();
//        Assertions.assertEquals(Arrays.<Customers>asList(new Customers(0, "firstName", "lastName", 0, "address")), result);
    }

//    @Test
//    void testDeleteCustomer() {
//        when(secondBankRepository.deleteCustomer(any())).thenReturn(true);
//
//        boolean result = bankService.deleteCustomer(new Customers(0, "firstName", "lastName", 0, "address"));
//        Assertions.assertEquals(true, result);
//    }

//    @Test
//    void testUpdateCustomer() {
//        when(secondBankRepository.updateCustomer(any())).thenReturn(true);
//
//        boolean result = bankService.updateCustomer(new Customers(0, "firstName", "lastName", 0, "address"));
//        Assertions.assertEquals(true, result);
//    }
}

*/
