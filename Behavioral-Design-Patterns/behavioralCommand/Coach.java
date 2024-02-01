package behavioralCommand;

public class Coach {
    private TrainingCommand command;

    public void setTrainingCommand(TrainingCommand command){
        this.command = command;
    }

    public void executeTrainingCommand(){
        command.execute();
    }
}
