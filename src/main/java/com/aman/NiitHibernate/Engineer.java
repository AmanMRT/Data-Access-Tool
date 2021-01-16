package com.aman.NiitHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="SoftwareEngineer")
public class Engineer {

	@Id
	@GeneratedValue
	@Column(name="Id")
	public int eid;
	@Column(name="Name")
	public String ename;
	@Column(name="Address")
	public String eaddress;
	@Column(name="Designation")
	public String edesignation;
	@Column(name="Skills")
	public String eskill;
	@Column(name="ProjectId")
	public int eprojectID;
	 
	
	public Engineer() {
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	public String getEskill() {
		return eskill;
	}
	public void setEskill(String eskill) {
		this.eskill = eskill;
	}
	public int getEprojectID() {
		return eprojectID;
	}
	public void setEprojectID(int eprojectID) {
		this.eprojectID = eprojectID;
	}
	@Override
	public String toString() {
		return "Engineer [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", edesignation=" + edesignation
				+ ", eskill=" + eskill + ", eprojectID=" + eprojectID + "]";
	}
}
