package es.webstilos.tocdify.web.views;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.webstilos.tocdify.service.SettingsService;
import es.webstilos.tocdify.web.model.SettingsDto;
import es.webstilos.tocdify.web.model.TemplateDto;

@Controller
public class SettingsController {

	@Autowired
	private SettingsService settingsService;

	@GetMapping("/settings")
	public String settingForm(Model model) {
		model.addAttribute("settings", new SettingsDto(settingsService.getSettings()));
		model.addAttribute("newTemplate", new TemplateDto());
		return "settings/settings";
	}

	@PostMapping("/changeUser")
	public String changeUser(@ModelAttribute SettingsDto settings) {
		settingsService.saveUser(settings.getUsername(), settings.getPassword());
		return "redirect:/settings";
	}

}
