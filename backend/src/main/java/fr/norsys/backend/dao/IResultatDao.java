package fr.norsys.backend.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import fr.norsys.backend.entity.Resultat;

public interface IResultatDao {

	Optional<Resultat> findByIdMatchIdEquipe(Long idMatch, Long idEquipe) throws SQLException;

	List<Resultat> findByIdMatch(Long idMatch) throws SQLException;

}
