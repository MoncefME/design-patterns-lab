package behavioralCommand;

public class RunCommand implements TrainingCommand{
    private Runner runner;

    public RunCommand(Runner runner){
        this.runner = runner;
    }

    @Override
    public void execute(){
        runner.run();
    }
}
