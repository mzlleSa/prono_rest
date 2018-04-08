package fr.norsys.backend.controller.admin;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.norsys.backend.service.IUtilisateurService;

@RestController
public class AdminUtilisateurController {

	@Autowired
	private IUtilisateurService utilisateurService;

	@PostMapping("/deleteUtilisateur")
	public void deleteUtilisateur(@RequestBody Long idUtilisateur) throws SQLException {
		this.utilisateurService.delete(idUtilisateur);
	}

}
