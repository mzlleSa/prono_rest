package fr.norsys.backend.controller.admin;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.norsys.backend.entity.Competition;
import fr.norsys.backend.entity.Equipe;
import fr.norsys.backend.service.ICompetitionService;
import fr.norsys.backend.service.IEquipeService;

@RestController
@RequestMapping("/admin")
public class AdminCompetitionController {

	@Autowired
	private ICompetitionService competitionService;
	@Autowired
	private IEquipeService equipeService;

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

//	@GetMapping("/competitions")
//	public List<Competition> showCompetition() throws SQLException {
//		return this.competitionService.findAll();
//	}
//
//	@GetMapping("/competitions/competition/{idCompetition}")
//	public Map<Integer, List<Equipe>> showPoulesForCompetition(@PathVariable String idCompetition) {
//		Map<Integer, List<Equipe>> poules = new HashMap<Integer, List<Equipe>>();
//		Long competitionId = Long.parseLong(idCompetition);
//		IntStream.range(1, 9).forEach(poule -> wrapperLambda(poules, competitionId, poule));
//		return poules;
//	}

//	private void wrapperLambda(Map<Integer, List<Equipe>> poules, Long competitionId, int poule) {
//		try {
//			poules.put(poule, this.equipeService.getEquipesOfPoule(competitionId, poule));
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

}
