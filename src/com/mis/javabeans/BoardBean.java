package com.mis.javabeans;

public class BoardBean {

	// 필드
	private String name;
	private String userpwd;
	private String email;
	private String title;
	private String content;

	// getter and setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BoardBean [name=" + name + ", userpwd=" + userpwd + ", email=" + email + ", title=" + title
				+ ", content=" + content + "]";
	}


}
