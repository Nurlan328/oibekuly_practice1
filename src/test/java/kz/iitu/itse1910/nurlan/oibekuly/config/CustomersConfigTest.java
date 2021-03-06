package kz.iitu.itse1910.nurlan.oibekuly.config;

import kz.iitu.itse1910.nurlan.oibekuly.database.Customers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.core.env.Environment;

import static org.mockito.Mockito.*;

class CustomersConfigTest {
    @Mock
    Logger logger;
    @Mock
    Environment env;
    @InjectMocks
    CustomersConfig customersConfig;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testCustomerMikhail() {
        Customers result = CustomersConfig.customerMikhail();
        Assertions.assertEquals(new Customers(Integer.valueOf(1), "Mikhail", "Lomtadze", 44, "Almaty", null), result);
    }

    @Test
    void testCustomerVyacheslav() {
        Customers result = CustomersConfig.customerVyacheslav();
        Assertions.assertEquals(new Customers(Integer.valueOf(1), "Vyacheslav", "Kim", 49, "Astana", null), result);
    }

    @Test
    void testInit() {
        customersConfig.init();
    }

    @Test
    void testDestroy() {
        customersConfig.destroy();
    }

    @Test
    void testRun() {
        customersConfig.run();
    }
}

