package io.javabrains.springbootstarter.Topics;

public class Topic {
private String course;
private int id;
private String tutorial;



public Topic(String course, int id, String tutorial) {
	
	this.course = course;
	this.id = id;
	this.tutorial = tutorial;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTutorial() {
	return tutorial;
}

public void setTutorial(String tutorial) {
	this.tutorial = tutorial;
}




}
