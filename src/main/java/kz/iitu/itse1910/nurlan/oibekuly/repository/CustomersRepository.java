package kz.iitu.itse1910.nurlan.oibekuly.repository;

import kz.iitu.itse1910.nurlan.oibekuly.database.Bank;
import kz.iitu.itse1910.nurlan.oibekuly.database.Customers;

public interface CustomersRepository {
    Iterable<Customers> findAll();
    Customers findOne(Integer id);
    Customers save(Customers customers);
}
