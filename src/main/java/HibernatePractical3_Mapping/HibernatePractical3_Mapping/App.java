package HibernatePractical3_Mapping.HibernatePractical3_Mapping;

import java.util.List;
import java.util.UUID;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernatePractical3_Mapping.HibernatePractical3_Mapping.Entities.Doctor;
import HibernatePractical3_Mapping.HibernatePractical3_Mapping.Entities.Patient;

public class App 
{
    public static void main( String[] args )
    {
       /* Doctor d1=new Doctor();
        d1.setDid(UUID.randomUUID().toString());
        d1.setDname("Dr.Mangesh");
        d1.setDemail("drmangesh@gmail.com");
        d1.setDedu("BHMS");
        
        Patient p1=new Patient();
        p1.setPid(UUID.randomUUID().toString());
        p1.setPname("Pratha");
        p1.setPemail("pratha@gmail.com");
        p1.setPdis("Cold");
        
        p1.setD(d1);
        
        d1.setP(p1);*/
        
        //step1
        
        Configuration con=new Configuration();
        con.configure("/HibernatePractical3_Mapping/HibernatePractical3_Mapping/Configuration/hibernate.cfg.xml");
        
        //step2
        
        SessionFactory sf=con.buildSessionFactory();
        
        //step3
        
        Session ss=sf.openSession();
        
        //step4
        
       // ss.save(d1);
       // ss.save(p1);
        
        /*Doctor d1=ss.get(Doctor.class, "20a2f448-2e94-4c0e-b9cd-fd4b9c9dc4c2"); //fetch patient_name by dr_id
        System.out.println(d1.getP().getPname());*/
        
        /*Patient p1=ss.get(Patient.class, "ccf53869-f1b6-40ea-abe9-7fc1af468b5a"); //fetch dr_name by p_id
        System.out.println(p1.getD().getDname());*/
        
        /*Patient pk=ss.get(Patient.class, "ccf53869-f1b6-40ea-abe9-7fc1af468b5a"); //fetch all record of patient by id
        System.out.println(pk.getPid());
        System.out.println(pk.getPname());
        System.out.println(pk.getPemail());
        System.out.println(pk.getPdis());*/
        
        /*List<Patient> l1=ss.createQuery("FROM Patient where pemail='gatha@gmail.com'").list(); //fetch record by email
        System.out.println(l1);*/
        
        /*Query qq=ss.createQuery("delete from Patient where pid='ccf53869-f1b6-40ea-abe9-7fc1af468b5a'");
        qq.executeUpdate();
        System.out.println("Record deleted"); //HQL query to delete data by id or email or any data*/
        
        /*Patient pk=ss.get(Patient.class, "ccf53869-f1b6-40ea-abe9-7fc1af468b5a");
        ss.delete(pk);*/  
         
       /* org.hibernate.Transaction t = ss.beginTransaction();
        Query qq=ss.createQuery("update Patient set pemail='gatha12@gmail.com' where pid='896f1052-73c1-4c82-84d0-96afd7829c8f'");
        qq.executeUpdate();
        t.commit();*/
        
        Doctor d1=ss.get(Doctor.class, "9a017946-6e08-492e-8e36-d729ae40a6c6");
        d1.setDemail("drreema123@gmail.com");
        ss.update(d1);
        
        //step5
        
        ss.beginTransaction().commit();   
       // System.out.println("Record Saved");
    }
}
