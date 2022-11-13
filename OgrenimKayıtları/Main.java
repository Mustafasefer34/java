
public class Main {

	public static void main(String[] args) {
		
		Season[] s1 = Season.values();
		for (Season season : s1) {
			System.out.println(season);
		}
		
	
		
		
		 Course[] courses = Course.values();
		      for (Course course : courses) {
				System.out.println(course + " "+ course.getCourseId()+" "+ course.getLecturer());
			}
	}

}
