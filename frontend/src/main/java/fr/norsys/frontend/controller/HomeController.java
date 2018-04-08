package fr.norsys.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import fr.norsys.frontend.constant.Url;
import fr.norsys.frontend.constant.View;

@Controller
public class HomeController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/")
	public String showAcceuil() {
		restTemplate.getForEntity(Url.GET_HOME, Void.class).getBody();
		return View.HOME;
	}

}
