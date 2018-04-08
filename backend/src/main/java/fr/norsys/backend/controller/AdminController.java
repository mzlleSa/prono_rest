package fr.norsys.backend.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.norsys.backend.entity.Competition;
import fr.norsys.backend.entity.Equipe;
import fr.norsys.backend.entity.Match;
import fr.norsys.backend.entity.Resultat;
import fr.norsys.backend.service.ICompetitionService;
import fr.norsys.backend.service.IEquipeService;
import fr.norsys.backend.service.IMatchService;
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
	private IResultatService resultatService;
	@Autowired
	private IUtilisateurService utilisateurService;

	@PostMapping("/addCompetition")
	public int addCompetition(@RequestBody Competition competition) throws SQLException {
		return this.competitionService.add(competition);
	}

	@PostMapping("/updateCompetition")
	public int updateCompetition(@RequestBody Competition competition) throws SQLException {
		return this.competitionService.update(competition);
	}

	@PostMapping("/deleteCompetition")
	public void deleteCompetition(@PathVariable Long idCompetition) throws SQLException {
		this.competitionService.delete(idCompetition);
	}

	@PostMapping("/addMatch")
	public void addMatch(@RequestBody Match match) throws SQLException {
		this.matchService.add(match);
	}

	@PostMapping("/updateMatch")
	public void updateMatch(@RequestBody Match match) throws SQLException {
		this.matchService.update(match);
	}

	@PostMapping("/deleteMatch")
	public void deleteMatch(@PathVariable Long idMatch) throws SQLException {
		this.matchService.delete(idMatch);
	}

	@PostMapping("/addEquipe")
	public int addEquipe(@RequestBody Equipe equipe) throws SQLException {
		return this.equipeService.add(equipe);
	}

	@PostMapping("/updateEquipe")
	public int updateEquipe(@RequestBody Equipe equipe) throws SQLException {
		return this.equipeService.update(equipe);
	}

	@PostMapping("/deleteEquipe")
	public void deleteEquipe(@PathVariable Long idEquipe) throws SQLException {
		this.equipeService.delete(idEquipe);
	}

	@PostMapping("/addResultat")
	public int addResultat(@RequestBody Resultat resultat) throws SQLException {
		return this.resultatService.add(resultat);
	}

	@PostMapping("/updateResultat")
	public int updateResultat(@RequestBody Resultat resultat) throws SQLException {
		return this.resultatService.update(resultat);
	}

	@PostMapping("/deleteResultat")
	public void deleteResultat(@RequestBody Long idResultat) throws SQLException {
		this.resultatService.delete(idResultat);
	}

	@PostMapping("/deleteUtilisateur")
	public void deleteUtilisateur(@RequestBody Long idUtilisateur) throws SQLException {
		this.utilisateurService.delete(idUtilisateur);
	}

}
