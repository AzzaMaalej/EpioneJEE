package tn.uniteam.managedBean;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.uniteam.persistence.AspNetUser;
import tn.uniteam.persistence.AspNetUser.Gender;
import tn.uniteam.persistence.AspNetUser.Speciality;
import tn.uniteam.services.doctor.DoctorManagement;

@ManagedBean
@SessionScoped
public class DoctorBean {
	
	private String address;
	private int age;
	private Date birthDate;	
	private String discriminator;
	private String email;
	private String firstName;	
	private Gender gender;
	private String imageName;
	private String lastName;
	private String phoneNumber;
	private Speciality speciality;
	private String username;
	AspNetUser aspNetUser;
	public AspNetUser getAspNetUser() {
		return aspNetUser;
	}
	public void setAspNetUser(AspNetUser aspNetUser) {
		this.aspNetUser = aspNetUser;
	}
	private List<AspNetUser> listeUsers;
	public List<AspNetUser> getListeUsers() {
		return listeUsers;
	}
	public void setListeUsers(List<AspNetUser> listeUsers) {
		this.listeUsers = listeUsers;
	}
	@EJB
	DoctorManagement doctorManagement;
	
	public List<AspNetUser> getListeDoctors() {	
		System.out.println(doctorManagement.ConsommationGetAllDoc());
		return doctorManagement.ConsommationGetAllDoc();		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getDiscriminator() {
		return discriminator;
	}
	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Speciality getSpeciality() {
		return speciality;
	}
	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public DoctorManagement getDoctorManagement() {
		return doctorManagement;
	}
	public void setDoctorManagement(DoctorManagement doctorManagement) {
		this.doctorManagement = doctorManagement;
	}
	
}
