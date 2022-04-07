package kz.iitu.itse1910.nurlan.oibekuly.repository;

import kz.iitu.itse1910.nurlan.oibekuly.database.Bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.Mockito.*;

class JdbcBankRepositoryTest {
    @Mock
    JdbcTemplate jdbcTemplate;
    @InjectMocks
    JdbcBankRepository jdbcBankRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testFindAll() {
        Iterable<Bank> result = jdbcBankRepository.findAll();
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testFindOne() {
        Bank result = jdbcBankRepository.findOne(Long.valueOf(1));
        Assertions.assertNotEquals(new Bank(Long.valueOf(1), "Kaspi bank", Integer.valueOf(9999999)), result);
    }

    @Test
    void testSave() {
        Bank result = jdbcBankRepository.save(new Bank(Long.valueOf(1), "bankName", Integer.valueOf(0)));
        Assertions.assertEquals(new Bank(Long.valueOf(1), "bankName", Integer.valueOf(0)), result);
    }
}

