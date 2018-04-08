package fr.norsys.backend.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.norsys.backend.dao.IResultatDao;
import fr.norsys.backend.entity.Resultat;
import fr.norsys.backend.service.IResultatService;

@Service
public class ResultatServiceImpl implements IResultatService {

	@Autowired
	private IResultatDao resultatDao;

	@Override
	public Optional<Resultat> findByIdMatchIdEquipe(Long idMatch, Long idEquipe) throws SQLException {
		return resultatDao.findByIdMatchIdEquipe(idMatch, idEquipe);
	}

	@Override
	public List<Resultat> findByIdMatch(Long idMatch) throws SQLException {
		return resultatDao.findByIdMatch(idMatch);
	}

	@Override
	public int update(Resultat resultat) throws SQLException {
		return this.resultatDao.update(resultat);
	}

	@Override
	public int add(Resultat resultat) throws SQLException {
		return this.resultatDao.add(resultat);
	}

	@Override
	public void delete(Long idResultat) throws SQLException {
		this.resultatDao.delete(idResultat);
	}

}
