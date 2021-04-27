package kodlamaIoJava;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C# + Angular Kursu", "Engin Demiroğ", 0);
		Course course2 = new Course(2, "Java + React Kursu", "Engin Demiroğ", 0);
		Course course3 = new Course(3, "Programlamaya giriş için temel kurs", "Engin Demiroğ", 0);
		
		Course[] courses = {course1, course2, course3};
		
		Category category1 = new Category(1, "Programlama");
		
		Category[] categories = {category1};
		
		
		for(Course course : courses) {
			System.out.println(course.name);
		}
		
		
		CourseManager courseManager= new CourseManager();
		
		courseManager.Add(course1);
		
		courseManager.Add(course2);
		
		courseManager.Add(course3);


	}

}
