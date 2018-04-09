package fr.norsys.backend.controller.admin;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("/competitions")
	public List<Competition> showAllCompetitions() throws SQLException {
		return this.competitionService.findAll();
	}

	@PostMapping("/competition/add")
	public int addCompetition(@RequestBody Competition competition) throws SQLException {
		return this.competitionService.add(competition);
	}

	@PostMapping("/competition/update")
	public int updateCompetition(@RequestBody Competition competition) throws SQLException {
		return this.competitionService.update(competition);
	}

	@GetMapping("/competition/delete/{id}")
	public void deleteCompetition(@PathVariable("id") Long id) throws SQLException {
		this.competitionService.delete(id);
	}

}
