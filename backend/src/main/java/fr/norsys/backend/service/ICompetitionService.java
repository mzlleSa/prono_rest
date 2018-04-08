package fr.norsys.backend.service;

import java.sql.SQLException;
import java.util.List;

import fr.norsys.backend.entity.Competition;

public interface ICompetitionService {

	List<Competition> findAll() throws SQLException;

}
