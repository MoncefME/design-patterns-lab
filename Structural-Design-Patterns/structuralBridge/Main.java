package structuralBridge;

public class Main {
    public static void main(String[] args) {
        Developer developer = new SoftwareDeveloper(new JavaCodingSkill());
        developer.writeCode();

        developer = new SoftwareDeveloper(new PythonCodingSkill());
        developer.writeCode();
    }
}
