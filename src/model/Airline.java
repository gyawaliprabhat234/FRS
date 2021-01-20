package model;

import java.util.UUID;

public class Airline {
	private String id;
	private String code;
	private String name;
	public Airline(String id, String code, String name) {
		super();
		this.id = UUID.randomUUID().toString();
		this.code = code;
		this.name = name;
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
}
