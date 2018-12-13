package tn.uniteam.services;

import java.util.List;

import javax.ejb.Remote;

import tn.uniteam.persistence.AspNetUser;

@Remote
public interface UserManagementRemote {
		public List<AspNetUser> getAllUsers();
		public void addUser(AspNetUser a);
	}

