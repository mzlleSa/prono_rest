package fr.norsys.backend.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.norsys.backend.service.IMatchService;

@RestController
public class HomeController {

	@Autowired
	IMatchService matchService;

	@GetMapping("/")
	private void showAcceuil() throws SQLException {
		this.matchService.setTrueForPlayedMatch();
	}
}
