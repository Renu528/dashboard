package com.avengers.bus.dao;

import java.util.List;

import com.avengers.bus.entityModels.User;

public interface ListsDao {
	public List<User> UserList(int userId);

	public void updateUser(User user);

}
