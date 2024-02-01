package behavioralChainOfResponsibility;

public class Registration {
    private int age;
    private boolean hasPaid;
    private boolean hasMedicalTest;

    public Registration(int age, boolean hasPaid, boolean hasMedicalTest){
        this.age = age;
        this.hasPaid = hasPaid;
        this.hasMedicalTest = hasMedicalTest;
    }

    public int getAge(){
        return age;
    }

    public boolean hasPaid(){
        return hasPaid;
    }

    public boolean hasMedicalTest(){
        return hasMedicalTest;
    }
}
