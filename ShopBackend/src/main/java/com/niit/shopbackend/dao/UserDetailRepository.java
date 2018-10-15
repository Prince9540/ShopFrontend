package com.niit.shopbackend.dao;

import java.util.List;

import com.niit.shopbackend.model.Category;
import com.niit.shopbackend.model.UserDetail;

public interface UserDetailRepository {

	public boolean addUserDetail(UserDetail userDetail);
	public boolean updateUserDetail(UserDetail userDetail);
	public boolean deleteUserDetail(int userDetailId);
	public List<UserDetail> getAllUserDetail();
	public UserDetail getUserDetailById(int userDetailId);
}
