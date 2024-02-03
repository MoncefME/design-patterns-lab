package structuralFacade;

import java.util.HashMap;
import java.util.Map;

public class StudentManagement {
    private final Map<Integer,String> studentList ;

    public StudentManagement() {
        studentList = new HashMap<>();
    }

    public void enrollStudent(int id, String name){
        studentList.put(id,name);
        System.out.println("Student with id: " + id + " and name: " + name + " has been enrolled");
    }

    public void removeStudent(int id){
        studentList.remove(id);
        System.out.println("Student with id: " + id + " has been removed");
    }

    public void displayStudentDetails(int id){
        if(!studentList.containsKey(id)){
            System.out.println("Student with id: " + id + " does not exist");
            return;
        }
        System.out.println("Student with id: " + id + " has name: " + studentList.get(id));
    }

    public void displayAllStudents(){
        System.out.println("All students: ");
        for (Map.Entry<Integer, String> entry : studentList.entrySet()) {
            displayStudentDetails(entry.getKey());
        }
    }
}
