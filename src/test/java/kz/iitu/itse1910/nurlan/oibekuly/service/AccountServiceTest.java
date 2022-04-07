package kz.iitu.itse1910.nurlan.oibekuly.service;

import kz.iitu.itse1910.nurlan.oibekuly.database.Account;
import kz.iitu.itse1910.nurlan.oibekuly.repository.AccountRepository;
import kz.iitu.itse1910.nurlan.oibekuly.repository.JdbcAccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

class AccountServiceTest {
    @Mock
    AccountRepository accountRepository;
    @Mock
    JdbcAccountRepository jdbcAccountRepository;
    @Mock
    Logger logger;
    @Mock
    Account account;
    @InjectMocks
    AccountService accountService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testTransfer() {
        accountService.transfer(1d, new Account(1L, 1, 0.02d), new Account(2L, 1, 0.02d));
    }
}

