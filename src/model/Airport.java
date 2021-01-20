package model;

import java.util.UUID;

public class Airport {
	
	private final String id;
	
	private String code;
	
	private String name;
	
	private Address address;

	public Airport(String code, String name, Address address) {
		this.id = UUID.randomUUID().toString();
		this.code = code.toUpperCase();
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", code=" + code + ", name=" + name + ", Address=" + address + "]";
	}

}
