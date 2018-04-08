package fr.norsys.backend.controller.admin;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.norsys.backend.entity.Resultat;
import fr.norsys.backend.service.IResultatService;

@RestController
@RequestMapping("/admin")
public class AdminResultatController {

	@Autowired
	private IResultatService resultatService;

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

}
