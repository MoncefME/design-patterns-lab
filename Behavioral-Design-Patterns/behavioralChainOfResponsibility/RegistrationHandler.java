package behavioralChainOfResponsibility;

public interface RegistrationHandler {
    void processRegistration(Registration registration);
    void setNextHandler(RegistrationHandler nextHandler);
}
