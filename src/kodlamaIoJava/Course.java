package kodlamaIoJava;

public class Course {
	
	public Course() {
		
	}
	
	public Course(int id, String name, String instructor, int courseProgress) {
		this.id= id;
		this.name=name;
		this.instructor= instructor;
		this.courseProgress= courseProgress;
		
	}

	int id;
	String name;
	String instructor;
	int courseProgress;
	
}
