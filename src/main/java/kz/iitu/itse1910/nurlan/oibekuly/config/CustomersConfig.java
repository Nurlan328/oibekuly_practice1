package kz.iitu.itse1910.nurlan.oibekuly.config;

import kz.iitu.itse1910.nurlan.oibekuly.database.Bank;
import kz.iitu.itse1910.nurlan.oibekuly.database.Customers;
import kz.iitu.itse1910.nurlan.oibekuly.service.BankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;

@Configuration
@PropertySource(value = "application.properties", ignoreResourceNotFound = true)
public class CustomersConfig {

    private static Logger logger = LoggerFactory.getLogger(CustomersConfig.class);

    @PostConstruct
    public void init() {
        logger.info("Doing my initialization");
    }

    @Autowired
    private Environment env;

    @Lazy
    @Bean
    public static Customers customerMikhail() {
        Customers customerMikhail = new Customers();
        customerMikhail.setId(1);
        customerMikhail.setFirstname("Mikhail");
        customerMikhail.setLastname("Lomtadze");
        customerMikhail.setAge(44);
        customerMikhail.setAddress("Almaty");
        return customerMikhail;
    }

    @Lazy
    @Bean
    public static Customers customerVyacheslav() {
        Customers customerVyacheslav = new Customers();
        customerVyacheslav.setId(1);
        customerVyacheslav.setFirstname("Vyacheslav");
        customerVyacheslav.setLastname("Kim");
        customerVyacheslav.setAge(49);
        customerVyacheslav.setAddress("Astana");
        return customerVyacheslav;
    }

    public void run() {
        logger.info("From Customer Environment");
        logger.info("Customer id: {}", env.getProperty("customer.id"));
        logger.info("Customer name: {}", env.getProperty("customer.firstname"));
        logger.info("Customer lastname: {}", env.getProperty("customer.lastname"));
        logger.info("Age of customer : {}", env.getProperty("customer.age"));
        logger.info("Address of customer : {}", env.getProperty("customer.address"));
    }

    @PreDestroy
    public void destroy() {
        logger.info("Doing my destruction");
    }
}
