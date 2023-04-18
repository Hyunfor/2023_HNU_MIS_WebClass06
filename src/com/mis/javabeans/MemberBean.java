package com.mis.javabeans;

public class MemberBean {

	// 필드
	private String userId;
	private String userPwd;
	private int userType;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "MemberBean [userId=" + userId + ", userPwd=" + userPwd + ", userType=" + userType + "]";
	}

}
