import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		Student std = new Student(); 
		std.setId(5);
		std.setName("Prakash");
		
		s.save(std);
		t.commit();
		s.close();
		
		System.out.println("Student Add Sucessfully......."+std);
		
	}

}
