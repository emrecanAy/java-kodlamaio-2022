package oopKodlamaio.dataAccess;

import java.time.LocalDate;
import java.util.ArrayList;

import oopKodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	ArrayList<Instructor> instructors = new ArrayList<Instructor>();
	
	public HibernateInstructorDao() {
		instructors.add(new Instructor("260c0ed2-c7fd-4cb6-8b12-51a2c5372d44", "Engin", "Demiroğ", "https://www.filepicker.io/api/file/GsqiGFGCRmuBuel0qqF3", "Yazılım geliştirmeye lisede 'yazılım' bölümünde okurken başladım. Üniversite hayatıma ÖSS 2003 Türkiye derecesiyle başladım.", LocalDate.now(), false));
		instructors.add(new Instructor("1bb388a6-af4a-4be1-9917-b234f8ac74eb", "Halil Eren", "Yazıcı", "https://www.filepicker.io/api/file/GsqiGFGCRmuBuel0qqF3", "Oyun geliştirici olarak çalışmaktayım.", LocalDate.now(), false));
	}
	
	
	@Override
	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName()+ " added to system!(Hibernate)");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName()+ " updated!(Hibernate)");
		
	}

	@Override
	public void delete(String id) {
		System.out.println("Removed from system!(Hibernate)");
		
	}

	@Override
	public Instructor getByName(String name) {
		return null;
	}
	
	
	
	
	

}
