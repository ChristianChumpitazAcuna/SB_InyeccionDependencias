package com.notebooker.model;

import java.time.LocalDate;

public class Teacher {
	private Integer id;
	private String name;
	private LocalDate birthday;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirdthday(LocalDate birdthday) {
		this.birthday = birdthday;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", birdthday=" + birthday + ", getId()=" + getId()
		+ ", getName()=" + getName() + ", getBirthday()=" + getBirthday() + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
