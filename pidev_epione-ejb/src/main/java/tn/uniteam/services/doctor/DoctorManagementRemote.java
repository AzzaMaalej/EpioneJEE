package tn.uniteam.services.doctor;

import java.util.List;

import javax.ejb.Remote;

import tn.uniteam.persistence.AspNetUser;
import tn.uniteam.persistence.Reason;

@Remote
public interface DoctorManagementRemote {
	List<AspNetUser> ConsommationGetAllDoc();
	void addReason(Reason r);
	void updateReason(Reason r);
	void deleteReason(Reason r);
	List<Reason> getAllReasons();
	AspNetUser getDoctorById(String id);
	Reason getReasonById(int id);
}
