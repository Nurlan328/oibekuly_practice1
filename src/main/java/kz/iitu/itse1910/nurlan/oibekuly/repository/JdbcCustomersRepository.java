package kz.iitu.itse1910.nurlan.oibekuly.repository;

import kz.iitu.itse1910.nurlan.oibekuly.database.Account;
import kz.iitu.itse1910.nurlan.oibekuly.database.Bank;
import kz.iitu.itse1910.nurlan.oibekuly.database.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcCustomersRepository implements CustomersRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Iterable<Customers> findAll() {
        return jdbcTemplate.query(
                "select id, firstname, lastname, age, address from Customers",
                this::mapRowToCustomer
        );
    }

    @Override
    public Customers findOne(Integer id) {
        return jdbcTemplate.queryForObject(
                "select id, firstname, lastname, age, address from Customers where id=?",
                this::mapRowToCustomer, id
        );
    }

    @Override
    public Customers save(Customers customers) {
        jdbcTemplate.update(
                "insert into Customers (id, firstname, lastname, age, address) values (?, ?, ?, ?, ?)",
                customers.getId(),
                customers.getFirstname(),
                customers.getLastname(),
                customers.getAge(),
                customers.getAddress()
        );
        return customers;
    }

    private Customers mapRowToCustomer (ResultSet rs, int rowNum) throws SQLException {
        return new Customers(
                rs.getInt("id"),
                rs.getString("firstname"),
                rs.getString("lastname"),
                rs.getInt("age"),
                rs.getString("address"));
    }
}
