package com.irexchange.interview;

public class Child {
	
	protected int id;
	protected Child link;
	
	
	
	public Child(int id, Child link) {
		super();
		this.id = id;
		this.link = link;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Child getLink() {
		return link;
	}
	public void setLink(Child link) {
		this.link = link;
	}
	
	

}
