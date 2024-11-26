package com.aurion.test;

import com.aurion.organsationdb.OrganizationDB;

public class OrganisationTest {
    public static void main(String[] args) {
        // Correct class and method calls
        OrganizationDB organizationDB = new OrganizationDB();
        organizationDB.connect();
        organizationDB.selectQuery("select * from organisationdb.dept"); // Replace with your query
        organizationDB.close();
    }
}
