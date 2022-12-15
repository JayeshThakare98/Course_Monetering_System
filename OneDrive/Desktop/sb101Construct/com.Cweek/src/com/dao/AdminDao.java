package com.dao;

import com.exception.AdminException;
import com.modelBean.Admin;

public interface AdminDao {
//	logout admit
	public void logoutAdmin() throws AdminException;
	
	
//	login admit 	
	public Admin loginAdmin(String username,String password )throws AdminException;


}
