package com.hibernateMapping;

public class Member {
	private int memberId;
	private String memberName;
	private House h;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public House getH() {
		return h;
	}

	public void setH(House h) {
		this.h = h;
	}

}
