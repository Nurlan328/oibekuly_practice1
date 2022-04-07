package kz.iitu.itse1910.nurlan.oibekuly.config;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.core.env.Environment;

import static org.mockito.Mockito.*;

class AccountConfigTest {
    @Mock
    Logger logger;
    @Mock
    Environment env;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }
}

