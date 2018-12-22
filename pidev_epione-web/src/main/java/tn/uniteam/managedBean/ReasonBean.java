package tn.uniteam.managedBean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import tn.uniteam.persistence.AspNetUser;
import tn.uniteam.persistence.Reason;
import tn.uniteam.services.doctor.DoctorManagement;

@ManagedBean
@SessionScoped

public class ReasonBean {

	private int reasonId;
	private float prix;
	private String reasonContent;
	private AspNetUser aspNetUser;

	public ReasonBean() {
		// TODO Auto-generated constructor stub
	}
	@EJB
    DoctorManagement reasonManagement;
	public void ajouterReason() {
		Reason r=new Reason(prix,reasonContent);
		r.setAspNetUser(reasonManagement.getDoctorById("kjfkjjkjdefeffjkkj"));
		reasonManagement.addReason(r);
	}
    public List<Reason> getListeReasons() {

		return reasonManagement.getAllReasons();
		
	}
	public int getReasonId() {
		return reasonId;
	}
	public void setReasonId(int reasonId) {
		this.reasonId = reasonId;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getReasonContent() {
		return reasonContent;
	}
	public void setReasonContent(String reasonContent) {
		this.reasonContent = reasonContent;
	}
	public AspNetUser getAspNetUser() {
		return aspNetUser;
	}
	public void setAspNetUser(AspNetUser aspNetUser) {
		this.aspNetUser = aspNetUser;
	}
	
}
