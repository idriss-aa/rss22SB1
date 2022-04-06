package fr.univrouen.rss22.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RSSController {
	
	@GetMapping("/resume")
	public String getListRSSinXML() {
	  return "Envoi de la liste des flux RSS";
	}
	
	@GetMapping("/id")
	public String getRSSinXML(
	   @RequestParam(value = "guid") String texte) {
		  return ("Détail du flux RSS demandé : " + texte);
	}
	
	@GetMapping("/test")
	public String getRSSinXML_(
	   @RequestParam(value = "nb") int number,
	   @RequestParam(value = "search") String text ) {
		  return ("Test :\n guid = "+ number +"\n titre = "+ text);
	}
	
}