package com.aurion.model;

public class Supplier {

	private int supplier_id;
	private String name;
	private   String ContactInfo;
	public Supplier(int supplier_id, String name, String contactInfo) {
		super();
		this.supplier_id = supplier_id;
		this.name = name;
		ContactInfo = contactInfo;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactInfo() {
		return ContactInfo;
	}
	public void setContactInfo(String contactInfo) {
		ContactInfo = contactInfo;
	}
	
	public static Supplier parseSupplier(String data) {
        String[] fields = data.split(",");
        int id = Integer.parseInt(fields[0]);
        String name = fields[1];
        String contactInfo = fields[2];
        return new Supplier(id, name, contactInfo);
    }
	@Override
	public String toString() {
		return "Supplier [supplier_id=" + supplier_id + ", name=" + name + ", ContactInfo=" + ContactInfo + "]";
	}
	
}
