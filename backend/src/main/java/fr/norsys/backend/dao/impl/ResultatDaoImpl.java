package fr.norsys.backend.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.norsys.backend.dao.IResultatDao;
import fr.norsys.backend.entity.Resultat;

@Repository
public class ResultatDaoImpl implements IResultatDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Optional<Resultat> findByIdMatchIdEquipe(Long idMatch, Long idEquipe) throws SQLException {
		String sql = "select * from resultat where id_match=? and id_equipe=?";
		List<Resultat> resultats = jdbcTemplate.query(sql, statement -> {
			statement.setLong(1, idMatch);
			statement.setLong(2, idEquipe);
		}, this::mapResultatThreeArgs);
		return resultats.isEmpty() ? Optional.empty() : Optional.of(resultats.get(0));
	}

	@Override
	public List<Resultat> findByIdMatch(Long idMatch) throws SQLException {
		String sql = "select * from resultat where id_match=? and score is not null";
		return jdbcTemplate.query(sql, statement -> statement.setLong(1, idMatch), this::mapResultatThreeArgs);
	}

	private Resultat mapResultatThreeArgs(ResultSet resultSet, int num) throws SQLException {
		return new Resultat(resultSet.getLong("id_match"), resultSet.getLong("id_equipe"),
				(Integer) resultSet.getObject("score"));
	}
}
