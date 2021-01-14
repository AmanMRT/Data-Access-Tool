package com.aman.NiitHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Project")
public class Project {

	@Id
	@GeneratedValue
	@Column(name="Code")
	public int pcode;
	@Column(name="title")
	public String ptitle;
	@Column(name="Duration")
	public float pduration;
	@Column(name="Size")
	public int psize;
	@Column(name="Technology")
	public String ptech;
	@Column(name="TeamSize")
	public int pteamsize;
	@Column(name="Cost")
	public float pcost;
	
	
//	public Project(int pcode, String ptitle, float pduration, int psize, String ptech, int pteamsize, float pcost) {
//		super();
//		this.pcode = pcode;
//		this.ptitle = ptitle;
//		this.pduration = pduration;
//		this.psize = psize;
//		this.ptech = ptech;
//		this.pteamsize = pteamsize;
//		this.pcost = pcost;
//	}
//	
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public float getPduration() {
		return pduration;
	}
	public void setPduration(float pduration) {
		this.pduration = pduration;
	}
	public int getPsize() {
		return psize;
	}
	public void setPsize(int psize) {
		this.psize = psize;
	}
	public String getPtech() {
		return ptech;
	}
	public void setPtech(String ptech) {
		this.ptech = ptech;
	}
	public int getPteamsize() {
		return pteamsize;
	}
	public void setPteamsize(int pteamsize) {
		this.pteamsize = pteamsize;
	}
	public float getPcost() {
		return pcost;
	}
	public void setPcost(float pcost) {
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", ptitle=" + ptitle + ", pduration=" + pduration + ", psize=" + psize
				+ ", ptech=" + ptech + ", pteamsize=" + pteamsize + ", pcost=" + pcost + "]";
	}

}
