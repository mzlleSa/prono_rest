package fr.norsys.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fr.norsys.backend.service.ICompetitionService;
import fr.norsys.backend.service.IEquipeService;
import fr.norsys.backend.service.IMatchService;
import fr.norsys.backend.service.IPronosticService;
import fr.norsys.backend.service.IResultatService;
import fr.norsys.backend.service.IUtilisateurService;

@RestController
public class AdminController {
	@Autowired
	private ICompetitionService competitionService;
	@Autowired
	private IEquipeService equipeService;
	@Autowired
	private IMatchService matchService;
	@Autowired
	private IPronosticService pronosticService;
	@Autowired
	private IResultatService resultatService;
	@Autowired
	private IUtilisateurService utilisateurService;

	
	
}
