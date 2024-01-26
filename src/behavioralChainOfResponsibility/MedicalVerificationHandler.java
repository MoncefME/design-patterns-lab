package behavioralChainOfResponsibility;

public class MedicalVerificationHandler implements RegistrationHandler{
    private RegistrationHandler nextHandler;

    @Override
    public void processRegistration(Registration registration){
        if (registration.hasMedicalTest()){
            System.out.println("Medical test verified");
            if (nextHandler != null){
                nextHandler.processRegistration(registration);
            }
        }else{
            System.out.println("Medical test verification failed");
        }
    }

    @Override
    public void setNextHandler(RegistrationHandler nextHandler){
        this.nextHandler = nextHandler;
    }
}
