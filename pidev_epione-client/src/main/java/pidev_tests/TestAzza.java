package pidev_tests;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.uniteam.persistence.AspNetUser;
import tn.uniteam.persistence.Reason;
import tn.uniteam.services.doctor.DoctorManagementRemote;
import tn.uniteam.services.userservices.UserManagementRemote;

public class TestAzza {

	public static void main(String[] args) throws NamingException {

		InitialContext ctx= new InitialContext();
		Object obj=ctx.lookup("pidev_epione-ear/pidev_epione-ejb/DoctorManagement!tn.uniteam.services.doctor.DoctorManagementRemote");
		DoctorManagementRemote client=(DoctorManagementRemote) obj;
		
		System.out.println(client.ConsommationGetAllDoc().toString());
		
		/*
		String jndiName ="pidev_epione-ear/pidev_epione-ejb/DoctorManagement!tn.uniteam.services.doctor.DoctorManagementRemote";
		DoctorManagementRemote proxy = (DoctorManagementRemote) ctx.lookup(jndiName);
		Reason reason=new Reason();
		reason.setAspNetUser(proxy.getDoctorById("kjfkjjkjdefeffjkkj"));
		reason.setPrix(40);
		reason.setReasonContent("extraction");
	   // proxy.addReason(reason);
	    //System.out.println("reson added");
		Reason re=proxy.getReasonById(1);
		//System.out.println(re.toString());
		proxy.deleteReason(re);
		System.out.println("reson deleted");
	    System.out.println(proxy.getAllReasons().toString());*/
	}

}
