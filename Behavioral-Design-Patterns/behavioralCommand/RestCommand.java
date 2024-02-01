package behavioralCommand;

public class RestCommand implements TrainingCommand{
    private Runner runner;

    public RestCommand(Runner runner){
        this.runner = runner;
    }

    @Override
    public void execute(){
        runner.rest();
    }
}
