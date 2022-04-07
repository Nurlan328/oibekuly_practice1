package kz.iitu.itse1910.nurlan.oibekuly.config;

import kz.iitu.itse1910.nurlan.oibekuly.OibekulyApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.ApplicationContext;

class OibekulyConfigTest {
    @Mock
    ApplicationContext applicationContext;
    @InjectMocks
    OibekulyApplication oibekulyConfig;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMain() {
        OibekulyApplication.main(new String[]{"args"});
    }
}

