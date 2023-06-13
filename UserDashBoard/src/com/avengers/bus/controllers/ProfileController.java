package com.avengers.bus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.avengers.bus.dao.ListsDao;
import com.avengers.bus.entityModels.User;
import com.avengers.bus.services.FetchUser;

@Controller
public class ProfileController {

	ListsDao ldao;

	@Autowired
	public ProfileController(ListsDao listdao) {
		ldao = listdao;
	}

	@RequestMapping(value = "/UserList", method = RequestMethod.GET)
	@ResponseBody
	public String UserDetailsController() {
		System.out.println("im working...");
		FetchUser fl = new FetchUser(ldao);
		String userJson = fl.getUserList();
		return userJson;

	}
	//
	// @GetMapping("/{id}")
	// public String getProductById(@PathVariable("id") int id, Model model) {
	// Product product = productService.getProductById(id);
	// model.addAttribute("product", product);
	// return "product";
	// }

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	@ResponseBody
	public void Userupdate(@Validated User user) {
		System.out.println("updatingggg...");
		ldao.updateUser(user);

	}

}
