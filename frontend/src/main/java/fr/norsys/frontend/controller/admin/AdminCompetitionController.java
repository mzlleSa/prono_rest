package fr.norsys.frontend.controller.admin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import fr.norsys.backend.entity.Competition;
import fr.norsys.backend.entity.Equipe;
import fr.norsys.frontend.constant.Constant;
import fr.norsys.frontend.constant.Url;
import fr.norsys.frontend.constant.View;


@Controller
public class AdminCompetitionController {
	
	@Autowired
	RestTemplate restTemplate;
	@PostMapping("/addCompetition")
	public String addCompetition(Model model, @ModelAttribute Competition competition) {
		setAttributeForRestTemplate();
		restTemplate.postForObject("http://localhost:8099/admin/addCompetition", competition, Competition.class);
		return "addCompetition";
}
	@PostMapping("/updateCompetition")
	public String updateCompetition(Model model, @ModelAttribute Competition competition) {
		setAttributeForRestTemplate();
		restTemplate.postForObject("http://localhost:8099/admin/updateCompetition", competition, Competition.class);
		return "addCompetition";
}
//	@GetMapping("/competitionsAdmin")
//	public String showCompetition(Model model) {
//		Competition[] competitions = restTemplate.getForEntity("http://localhost:8099/admin/competitions", Competition[].class).getBody();
//		model.addAttribute(Constant.LISTE_COMPETITIONS, competitions);
//		return View.COMPETITIONS;
//	}
//
//	@GetMapping(value = "/competitionAdmin")
//	public String showPoulesForCompetition(@RequestParam("id") String id, Model model) {
//		@SuppressWarnings("unchecked")
//		Map<Integer, List<Equipe>> poules = restTemplate
//				.getForEntity(Url.GET_COMPETITION, Map.class, Long.parseLong(id)).getBody();
//		model.addAttribute(Constant.ATTRIBUTE_POULES, poules);
//		model.addAttribute(Constant.ATTRIBUTE_ID_COMPETITION, id);
//		return View.POULES;
//	}
	
	private void setAttributeForRestTemplate() {
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
	}
}

