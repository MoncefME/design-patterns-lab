package behavioralChainOfResponsibility;

public class AgeVerificationHandler implements RegistrationHandler{
    private RegistrationHandler nextHandler;

    @Override
    public void processRegistration(Registration registration) {
        if (registration.getAge() >= 18){
            System.out.println("Age verified");
            if (nextHandler != null){
                nextHandler.processRegistration(registration);
            }
        }else{
            System.out.println("Age verification failed");
        }
    }

    @Override
    public void setNextHandler(RegistrationHandler nextHandler){
        this.nextHandler = nextHandler;
    }
}
