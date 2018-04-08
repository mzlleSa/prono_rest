package fr.norsys.backend.controller.admin;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.norsys.backend.entity.Competition;
import fr.norsys.backend.service.ICompetitionService;

@RestController
@RequestMapping("/admin")
public class AdminCompetitionController {

	@Autowired
	private ICompetitionService competitionService;

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

}
