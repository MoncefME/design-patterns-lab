package structuralBridge;

public class SoftwareDeveloper implements Developer {
    private final CodingSkill codingSkill;

    public SoftwareDeveloper(CodingSkill codingSkill) {
        this.codingSkill = codingSkill;
    }

    @Override
    public void writeCode() {
        System.out.print("The developer is ");
        codingSkill.applySkill();
    }
}
