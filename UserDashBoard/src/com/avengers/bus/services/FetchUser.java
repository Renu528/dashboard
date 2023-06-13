package com.avengers.bus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.avengers.bus.dao.ListsDao;
import com.avengers.bus.entityModels.User;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchUser {
	@Autowired
	private ListsDao ldao;

	public FetchUser(ListsDao ldao) {
		super();
		this.ldao = ldao;
	}

	public String getUserList() {
		List<User> services = ldao.UserList(1);
		ObjectMapper om = new ObjectMapper();

		try {
			// Convert the list to JSON
			String json = om.writeValueAsString(services);
			System.out.println(json);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
