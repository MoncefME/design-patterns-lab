package behavioralChainOfResponsibility;

public class PaymentVerificationHandler implements RegistrationHandler{
    private RegistrationHandler nextHandler;

    @Override
    public void processRegistration(Registration registration){
        if (registration.hasPaid()){
            System.out.println("Payment verified");
            if (nextHandler != null){
                nextHandler.processRegistration(registration);
            }
        }else{
            System.out.println("Payment verification failed");
        }
    }

    @Override
    public void setNextHandler(RegistrationHandler nextHandler){
        this.nextHandler = nextHandler;
    }
}
