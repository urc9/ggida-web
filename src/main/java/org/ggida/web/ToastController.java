package org.ggida.web;

import org.ggida.web.model.Toast;
import org.ggida.web.service.ToastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/toast")
@Controller
public class ToastController {
	@Autowired
	private ToastService toastService;

	@RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("list", toastService.getList());
		return "/toast/index";
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String view(Model model, @PathVariable int id) {
		model.addAttribute("toast", toastService.get(id));
		return "/toast/view";
	}

	@RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
	public String insert(Model model, String name) {
		toastService.update(new Toast(name));
		return "redirect:/toast";
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public String update(Model model, @PathVariable int id, String name) {
		toastService.update(new Toast(id, name));
		return "redirect:/toast" + id;
	}
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String delete(Model model, @PathVariable int id) {
		toastService.delete(id);
		return "redirect:/toast";
	}
}
