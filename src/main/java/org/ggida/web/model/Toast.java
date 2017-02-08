package org.ggida.web.model;

public class Toast {
	private int id;
	private String name;
	
	public Toast() {
	}
	public Toast(String name) {
		this(0, name);
	}
	public Toast(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
