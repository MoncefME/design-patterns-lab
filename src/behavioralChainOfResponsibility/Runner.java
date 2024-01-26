package behavioralChainOfResponsibility;

public class Runner {
    private RegistrationHandler registrationHandler;

    public Runner (RegistrationHandler registrationHandler){
        this.registrationHandler = registrationHandler;
    }

    public void registerForMarathon(Registration registration){
        registrationHandler.processRegistration(registration);
    }
}
