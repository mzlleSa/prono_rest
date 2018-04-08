package fr.norsys.backend.service;

import java.sql.SQLException;
import java.util.List;

import fr.norsys.backend.entity.Equipe;

public interface IEquipeService {

	List<Equipe> getEquipesOfPoule(Long idCompetition, int poule) throws SQLException;

	List<Equipe> getEquipesByMatch(Long idMatch) throws SQLException;

}
