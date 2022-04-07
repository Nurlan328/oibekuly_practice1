package kz.iitu.itse1910.nurlan.oibekuly.repository;

import kz.iitu.itse1910.nurlan.oibekuly.database.Account;
import kz.iitu.itse1910.nurlan.oibekuly.database.Customers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.Mockito.*;

class JdbcCustomersRepositoryTest {
    @Mock
    JdbcTemplate jdbcTemplate;
    @InjectMocks
    JdbcCustomersRepository jdbcCustomersRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testFindAll() {
        Iterable<Customers> result = jdbcCustomersRepository.findAll();
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testFindOne() {
        Customers result = jdbcCustomersRepository.findOne(Integer.valueOf(0));
        Assertions.assertNotEquals(new Customers(Integer.valueOf(0), "firstname", "lastname", 0, "address", new Account(Long.valueOf(1), 0d, 0d)), result);
    }

    @Test
    void testSave() {
        Customers result = jdbcCustomersRepository.save(new Customers(Integer.valueOf(0), "firstname", "lastname", 0, "address", new Account(Long.valueOf(1), 0d, 0d)));
        Assertions.assertEquals(new Customers(Integer.valueOf(0), "firstname", "lastname", 0, "address", new Account(Long.valueOf(1), 0d, 0d)), result);
    }
}

