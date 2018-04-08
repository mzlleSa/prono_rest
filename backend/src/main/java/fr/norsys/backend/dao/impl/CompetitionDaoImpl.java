package fr.norsys.backend.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.norsys.backend.dao.ICompetitionDao;
import fr.norsys.backend.entity.Competition;

@Repository
public class CompetitionDaoImpl implements ICompetitionDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Competition> findAll() throws DataAccessException {
		String sql = "select * from competition";
		return jdbcTemplate.query(sql, (resultSet, rowNum) -> new Competition(resultSet.getLong("id"),
				resultSet.getString("identifiant"), resultSet.getDate("date_competition")));
	}
}
