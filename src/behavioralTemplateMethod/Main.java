package behavioralTemplateMethod;

public class Main  {
    public static void main(String[] args) {
        System.out.println("---------------Morning Run-----------------");
        RunTemplate morningRun = new MoringRun();
        morningRun.performRun();

        System.out.println("---------------Group Run-----------------");
        RunTemplate groupRun = new GroupRun();
        groupRun.performRun();

        System.out.println("---------------Race Run------------------");
        RunTemplate raceRun = new RaceRun();
        raceRun.performRun();
    }
}
