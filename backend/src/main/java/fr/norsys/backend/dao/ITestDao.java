package fr.norsys.backend.dao;

import java.sql.SQLException;
import java.util.List;

public interface ITestDao {

	List<Test> findAll() throws SQLException;

}
