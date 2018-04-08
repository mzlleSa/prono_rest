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

import fr.norsys.backend.entity.Equipe;
import fr.norsys.backend.service.IEquipeService;

@RestController
@RequestMapping("/admin")
public class AdminEquipeController {
	@Autowired
	private IEquipeService equipeService;

	@GetMapping("/equipes")
	public List<Equipe> showEquipe() throws SQLException {
		return this.equipeService.findAll();
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
}
