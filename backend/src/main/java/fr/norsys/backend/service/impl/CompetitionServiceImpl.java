package fr.norsys.backend.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.norsys.backend.dao.ICompetitionDao;
import fr.norsys.backend.entity.Competition;
import fr.norsys.backend.service.ICompetitionService;

@Service
public class CompetitionServiceImpl implements ICompetitionService {

	@Autowired
	private ICompetitionDao competitionDao;

	@Override
	public List<Competition> findAll() throws SQLException {
		return competitionDao.findAll();
	}

	public void setDaoCompetition(ICompetitionDao competitionDao) {
		this.competitionDao = competitionDao;
	}
}
