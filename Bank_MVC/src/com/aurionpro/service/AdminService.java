package com.aurionpro.service;

import com.aurionpro.entiites.Admin;

public class AdminService 
{
	public Admin createAdmin(String adminId, String adminName, String adminPassword)
	{
		Admin admin = new Admin(adminId, adminName, adminPassword);
		return admin;
	}

}
