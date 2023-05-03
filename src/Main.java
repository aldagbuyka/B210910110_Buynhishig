
public class Main {

	public static void main(String[] args) {
		Course course = new Course("Sofware Construction");
		course.setCourseName("Sofware Construction");
		
		System.out.println(course.courseName);
		System.out.println(course.getCourseName());
		
		course.setCourseName("Программ хангамжийн бүтээлт");
		System.out.println(course.getCourseName());
		

	}

}
