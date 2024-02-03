package structuralFacade;

import java.util.HashMap;
import java.util.Map;

public class CourseManagement {
    private final Map<Integer,String> courseList ;

    public CourseManagement() {
        this.courseList = new HashMap<>();
    }

    public void addCourse(int id, String name){
        courseList.put(id,name);
        System.out.println("Course with id: " + id + " and name: " + name + " has been added");
    }

    public void removeCourse(int id){
        courseList.remove(id);
        System.out.println("Course with id: " + id + " has been removed");
    }

    public void displayCourseDetails(int id){
        if(!courseList.containsKey(id)){
            System.out.println("Course with id: " + id + " does not exist");
            return;
        }
        System.out.println("Course with id: " + id + " has name: " + courseList.get(id));
    }

    public void displayAllCourses(){
        System.out.println("All courses: ");
        for (Map.Entry<Integer, String> entry : courseList.entrySet()) {
            displayCourseDetails(entry.getKey());
        }
    }
}
