package structuralFacade;

public class SchoolFacade {
    private final StudentManagement studentManagement;
    private final CourseManagement courseManagement;
    private final GradeManagement gradeManagement;

    public SchoolFacade(){
        studentManagement = new StudentManagement();
        courseManagement = new CourseManagement();
        gradeManagement = new GradeManagement();
    }

    public void enrollStudent(int id, String name){
        studentManagement.enrollStudent(id, name);
    }

    public void removeStudent(int id){
        studentManagement.removeStudent(id);
    }

    public void displayStudentDetails(int id){
        studentManagement.displayStudentDetails(id);
    }

    public void displayAllStudents(){
        studentManagement.displayAllStudents();
    }

    public void addCourse(int id, String name){
        courseManagement.addCourse(id, name);
    }

    public void removeCourse(int id){
        courseManagement.removeCourse(id);
    }

    public void displayCourseDetails(int id){
        courseManagement.displayCourseDetails(id);
    }

    public void displayAllCourses(){
        courseManagement.displayAllCourses();
    }

    public void addGrade(int studentId , int courseId ,Integer grade ){
        gradeManagement.addGrade(studentId, courseId, grade);
    }

    public void removeGrade(int studentId , int courseId){
        gradeManagement.removeGrade(studentId, courseId);
    }

    public void displayGrade(int studentId , int courseId){
        gradeManagement.displayGrade(studentId, courseId);
    }

    public void displayAllGrades(){
        gradeManagement.displayAllGrades();
    }



}
