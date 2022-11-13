public enum Course {
    MATH(101, "John nash"),
    CS(103, "Alan kay"),
    PHYSICS(104, "newton"),
    CHEMISTRY(105, "walter white");

     private int courseId;
     private String lecturer;

    Course(int courseID, String lecturer){
        this.courseId = courseID;
        this.lecturer = lecturer;
    }
    int getCourseId(){
        return courseId;
    }
	public String getLecturer() {
		return lecturer;
	}
	
    
}