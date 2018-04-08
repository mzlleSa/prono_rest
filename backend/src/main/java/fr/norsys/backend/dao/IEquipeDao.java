package fr.norsys.backend.dao;

import java.sql.SQLException;
import java.util.List;

import fr.norsys.backend.entity.Equipe;

public interface IEquipeDao {

	List<Equipe> getEquipesOfPoule(Long idCompetition, int poule) throws SQLException;

	List<Equipe> getEquipesByMatch(Long idMatch) throws SQLException;

}
