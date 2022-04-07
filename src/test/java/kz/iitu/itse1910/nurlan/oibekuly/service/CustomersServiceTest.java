package kz.iitu.itse1910.nurlan.oibekuly.service;

import kz.iitu.itse1910.nurlan.oibekuly.database.Account;
import kz.iitu.itse1910.nurlan.oibekuly.repository.CustomersRepository;
import kz.iitu.itse1910.nurlan.oibekuly.repository.JdbcCustomersRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import static org.mockito.Mockito.*;

class CustomersServiceTest {
    @Mock
    CustomersRepository customersRepository;
    @Mock
    JdbcCustomersRepository jdbcCustomersRepository;
    @Mock
    Logger logger;
    @Mock
    Account account;
    @InjectMocks
    CustomersService customersService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMakeWithdraw() {
        String result = customersService.makeWithdraw(0d);
        Assertions.assertNotEquals("replaceMeWithExpectedResult", result);
    }
}

