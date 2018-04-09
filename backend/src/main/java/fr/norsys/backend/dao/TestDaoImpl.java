package fr.norsys.backend.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestDaoImpl implements ITestDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Test> findAll() throws SQLException {
		return jdbcTemplate.query("select * from test",
				(resultSet, num) -> new Test(resultSet.getLong("id"), resultSet.getString("nom")));
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
