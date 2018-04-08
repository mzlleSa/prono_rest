package fr.norsys.backend.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.norsys.backend.dao.IEquipeDao;
import fr.norsys.backend.entity.Equipe;
import fr.norsys.backend.service.IEquipeService;

@Service
public class EquipeServiceImpl implements IEquipeService {

	@Autowired
	private IEquipeDao equipeDao;

	@Override
	public List<Equipe> getEquipesOfPoule(Long idCompetition, int poule) throws SQLException {
		return equipeDao.getEquipesOfPoule(idCompetition, poule);
	}

	@Override
	public List<Equipe> getEquipesByMatch(Long idMatch) throws SQLException {
		return equipeDao.getEquipesByMatch(idMatch);
	}

	public void setDaoEquipe(IEquipeDao equipeDao) {
		this.equipeDao = equipeDao;
	}

	public void setEquipeDao(IEquipeDao equipeDao) {
		this.equipeDao = equipeDao;
	}
}
