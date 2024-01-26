package behavioralCommand;

public class StretchCommand implements TrainingCommand{
    private Runner runner;

    public StretchCommand(Runner runner){
        this.runner = runner;
    }

    @Override
    public void execute(){
        runner.stretch();
    }
}
