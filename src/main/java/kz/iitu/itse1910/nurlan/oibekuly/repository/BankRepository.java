package kz.iitu.itse1910.nurlan.oibekuly.repository;
import kz.iitu.itse1910.nurlan.oibekuly.database.Bank;
public interface BankRepository {
    Iterable<Bank> findAll();
    Bank findOne(Long id);
    Bank save(Bank bank);
}
