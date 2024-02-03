package structuralFacade;

public class Main {
    public static void main(String[] args) {
        SchoolFacade school = new SchoolFacade();

        school.enrollStudent(1, "Moncef");
        school.enrollStudent(2, "Ahmed");
        school.enrollStudent(3, "Ali");

        school.addCourse(1, "Math");
        school.addCourse(2, "Physics");

        school.addGrade(1, 1, 15);
        school.addGrade(1, 2, 10);
        school.addGrade(2, 1, 12);
        school.addGrade(2, 2, 18);

        school.displayAllStudents();
        school.displayAllCourses();
        school.displayAllGrades();

    }
}
