package fr.norsys.backend.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import fr.norsys.backend.config.AppConfig;

public class MainTest {
	public static void main(String[] args) {
		AppConfig config = new AppConfig();
		TestDaoImpl dao = new TestDaoImpl();
		dao.setJdbcTemplate(new JdbcTemplate(config.getDataSource()));
		try {
			List<Test> tests = dao.findAll();
			System.out.println("mora find");
			if (tests.isEmpty()) {
				System.out.println("empty");
			} else {
				System.out.println("not");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("mora exc");

			e.printStackTrace();
		}
	}

}
