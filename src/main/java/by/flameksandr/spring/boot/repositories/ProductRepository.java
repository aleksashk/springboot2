package by.flameksandr.spring.boot.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(String name) {
        String sql = "insert into product values(null, ?)";
        jdbcTemplate.update(sql, name);
    }
}
