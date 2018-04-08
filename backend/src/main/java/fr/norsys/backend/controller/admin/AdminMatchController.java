package fr.norsys.backend.controller.admin;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.norsys.backend.entity.Match;
import fr.norsys.backend.service.IMatchService;

@RestController
@RequestMapping("/admin")
public class AdminMatchController {
	@Autowired
	private IMatchService matchService;

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
}