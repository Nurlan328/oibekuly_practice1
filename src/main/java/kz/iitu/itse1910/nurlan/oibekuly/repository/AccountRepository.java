package kz.iitu.itse1910.nurlan.oibekuly.repository;

import kz.iitu.itse1910.nurlan.oibekuly.database.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository {
    Iterable<Account> findAll();
    Account findOne(Long id);
    Account save(Account account);
}
