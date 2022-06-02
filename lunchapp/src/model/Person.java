package model;

import java.io.Serializable;

public class Person  implements Serializable{
	private int id;
	private String name;
	private String menu;
	public Person() {}
	public Person(String name,String menu) {
		this.name=name;
		this.menu=menu;
	}
	public Person(int id,String name,String menu) {
		this(name,menu);
		this.id=id;
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
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}

}
