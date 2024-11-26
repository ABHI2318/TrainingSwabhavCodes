package com.aurion.service;

import com.aurion.entities.Admin;

public class AdminService {

	public Admin createAdmin(String name, String adminId, String password) {
		Admin admin = new Admin(name, adminId, password);
		return admin;
	}
}