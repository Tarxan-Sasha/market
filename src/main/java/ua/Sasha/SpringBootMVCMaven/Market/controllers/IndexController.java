package ua.Sasha.SpringBootMVCMaven.Market.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@RequestMapping("/sasha")
	public String hello() {
		return "Саша";
	}
}
