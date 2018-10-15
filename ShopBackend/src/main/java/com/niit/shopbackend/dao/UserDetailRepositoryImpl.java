package com.niit.shopbackend.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shopbackend.model.Category;
import com.niit.shopbackend.model.Product;
import com.niit.shopbackend.model.UserDetail;



@Repository("userDetailRepository")
@Transactional
public class UserDetailRepositoryImpl implements UserDetailRepository {

	@Autowired
	private SessionFactory sessionFactory;
	public boolean addUserDetail(UserDetail userDetail) {
		
		Session session=sessionFactory.getCurrentSession();
		try{
		session.save(userDetail);
		return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateUserDetail(UserDetail userDetail) {
		
		Session session=sessionFactory.getCurrentSession();
		try{
		session.update(userDetail);
		return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteUserDetail(int userDetailId) {
		
		Session session=sessionFactory.getCurrentSession();
		try{
		session.delete(getUserDetailById(userDetailId));
		return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public List<UserDetail> getAllUserDetail() {
		
		Session session=sessionFactory.getCurrentSession();
		try{
		Query query=session.createQuery("from Product");
		List<UserDetail> userDetailList=(List<UserDetail>)query.getResultList();
		return userDetailList;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public UserDetail getUserDetailById(int userDetailId) {
		
		Session session=sessionFactory.getCurrentSession();
		try{
	    UserDetail userDetail=(UserDetail)session.get(UserDetail.class,userDetailId);
		return userDetail;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	

	}
