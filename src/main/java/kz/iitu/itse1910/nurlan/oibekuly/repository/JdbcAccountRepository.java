package kz.iitu.itse1910.nurlan.oibekuly.repository;

import kz.iitu.itse1910.nurlan.oibekuly.database.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcAccountRepository implements AccountRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Iterable<Account> findAll() {
        return jdbcTemplate.query(
                "select accountNumber, balance, interest from Account",
                this::mapRowToAccount
        );
    }

    @Override
    public Account findOne(Long id) {
        return jdbcTemplate.queryForObject(
                "select accountNumber, balance, interest from Account where id=?",
                this::mapRowToAccount, id
        );
    }

    @Override
    public Account save(Account account) {
        jdbcTemplate.update(
                "insert into Account (accountNumber, balance, interest) values (?, ?, ?)",
                account.getAccountNumber(),
                account.getBalance(),
                account.getInterest()
        );
        return account;
    }

    private Account mapRowToAccount (ResultSet rs, int rowNum) throws SQLException {
        return new Account(
                rs.getLong("accountNumber"),
                rs.getDouble("balance"),
                rs.getDouble("interest"));
    }
}




