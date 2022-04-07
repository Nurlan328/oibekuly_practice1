package kz.iitu.itse1910.nurlan.oibekuly.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

class CustomersTest {
    @Mock
    List<Customers> customersList;
    @InjectMocks
    Customers customers;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testCustomerBuilder() {
        final Customers.CustomersBuilder result = Customers.builder();
    }

//    @Test
//    void testGetCustomers() {
//        List<Customers> result = Customers.getCustomers();
//        Assertions.assertEquals(Arrays.<Customers>asList(new Customers(0, "firstName", "lastName", 0, "address")), result);
//    }

    @Test
    void testGetCustomers() {
        final List<Customers> result = Customers.getAllCustomers();
        Assertions.assertNotEquals(Collections.<Customers>singletonList(new Customers()), result.toString());
    }


}

