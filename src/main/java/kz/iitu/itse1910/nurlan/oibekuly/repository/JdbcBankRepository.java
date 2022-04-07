package kz.iitu.itse1910.nurlan.oibekuly.repository;

import kz.iitu.itse1910.nurlan.oibekuly.database.Account;
import kz.iitu.itse1910.nurlan.oibekuly.database.Bank;
import kz.iitu.itse1910.nurlan.oibekuly.database.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JdbcBankRepository implements BankRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Iterable<Bank> findAll() {
        return jdbcTemplate.query(
                "select id, bankName, customerAccountNumber from Bank",
                this::mapRowToBank
        );
    }

    @Override
    public Bank findOne(Long id) {
        return jdbcTemplate.queryForObject(
                "select id, bankName, customerAccountNumber from Bank where id=?",
                this::mapRowToBank, id
        );
    }

    @Override
    public Bank save(Bank bank) {
        jdbcTemplate.update(
                "insert into Bank (id, bankName, customerAccountNumber) values (?, ?, ?)",
                bank.getId(),
                bank.getBankName(),
                bank.getCustomerAccountNumber()
        );
        return bank;
    }

    private Bank mapRowToBank (ResultSet rs, int rowNum) throws SQLException {
        return new Bank(
                rs.getLong("id"),
                rs.getString("bankName"),
                rs.getInt("customerAccountNumber"));
    }
}
