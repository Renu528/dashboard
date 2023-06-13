package com.avengers.bus.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.avengers.bus.entityModels.User;

@Repository
@Transactional
public class ListDaoImpl implements ListsDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<User> UserList(int userId) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("select u from User u WHERE u.id= :userId", User.class);
		query.setParameter("userId", userId);
		return query.getResultList();
	}

	// public User updateUser(User user) {
	// return em.merge(user);
	// }

	// public void updateUser(User user) {
	// this.em.persist(user);
	// }

	public User findById(long id) {
		User user = (User) em.find(User.class, id);
		return user;
	}

	@Transactional
	public User updateUser(User user) {
		em.merge(user);
		return user;
	}

}
