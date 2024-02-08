package behavioralChainOfResponsibility;

public class Registration {
    private final int age;
    private final boolean hasPaid;
    private final boolean hasMedicalTest;

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
