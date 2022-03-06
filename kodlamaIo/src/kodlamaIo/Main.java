package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course (1,"Java+React","Engin Demiroğ",20);
		
		Course course2 = new Course (2,"C# + Angular","Engin Demiroğ",70);
		
		Course course3 = new Course (3,"JavaScript", "Engin Demiroğ",55);
		
		
		Course [] courses = {course1,course2,course3};
		for(Course course : courses)
		{
			System.out.println(course.name);
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.joinToCourse(course1);
		courseManager.joinToCourse(course2);
		courseManager.joinToCourse(course3);
		

	}

}
