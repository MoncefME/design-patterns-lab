package structuralFacade;

import java.util.HashMap;
import java.util.Map;

public class GradeManagement {
    private Map<String,Integer> gradeList ;

    public GradeManagement(){
        this.gradeList = new HashMap<>();
    }

    public void addGrade(int studentId , int courseId ,Integer grade ){
        String key = studentId + "-" + courseId;
        gradeList.put(key,grade);
        System.out.println("Assigned grade to :" +grade+" to student "+studentId+" for course "+courseId);
    }

    public void removeGrade(int studentId , int courseId){
        String key = studentId + "-" + courseId;
        gradeList.remove(key);
        System.out.println("Removed grade for student "+studentId+" for course "+courseId);
    }

    public void displayGrade(int studentId , int courseId){
        String key = studentId + "-" + courseId;
        if(!gradeList.containsKey(key)){
            System.out.println("Grade for student "+studentId+" for course "+courseId+" does not exist");
            return;
        }
        System.out.println("Grade for student "+studentId+" for course "+courseId+" is "+gradeList.get(key));
    }

    public void displayAllGrades(){
        System.out.println("All grades: ");
        for (Map.Entry<String, Integer> entry : gradeList.entrySet()) {
            String[] keys = entry.getKey().split("-");
            displayGrade(Integer.parseInt(keys[0]),Integer.parseInt(keys[1]));
        }
    }

}
