package tn.uniteam.services.doctor;

import java.util.List;

import javax.ejb.Local;

import tn.uniteam.persistence.AspNetUser;
import tn.uniteam.persistence.Reason;

@Local
public interface DoctorManagementLocal {
	List<AspNetUser> ConsommationGetAllDoc();
void addReason(Reason r);
void updateReason(Reason r);
void deleteReason(Reason r);
List<Reason> getAllReasons();
}
