package com.hibernateMapping;

import java.util.Set;

public class Question {
	private int Qid;
	private String Qname;
	private Set children;

	public int getQid() {
		return Qid;
	}

	public void setQid(int qid) {
		Qid = qid;
	}

	public String getQname() {
		return Qname;
	}

	public void setQname(String qname) {
		Qname = qname;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

}
