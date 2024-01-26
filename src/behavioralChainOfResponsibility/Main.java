package behavioralChainOfResponsibility;

public class Main {
    public static void main(String[] args){
        RegistrationHandler ageVerificationHandler = new AgeVerificationHandler();
        RegistrationHandler medicalVerificationHandler = new MedicalVerificationHandler();
        RegistrationHandler paymentVerificationHandler = new PaymentVerificationHandler();

        ageVerificationHandler.setNextHandler(medicalVerificationHandler);
        medicalVerificationHandler.setNextHandler(paymentVerificationHandler);

        Runner runner = new Runner(ageVerificationHandler);

        Registration validRegistration = new Registration(20, true, true);
        Registration underAgeRegistration = new Registration(15, true, true);
        Registration noMedicalTestRegistration = new Registration(20, true, false);
        Registration noPaymentRegistration = new Registration(20, false, true);

        System.out.println("---------ValidRegistration-----------");
        runner.registerForMarathon(validRegistration);

        System.out.println("---------UnderAgeRegistration-----------");
        runner.registerForMarathon(underAgeRegistration);

        System.out.println("---------NoMedicalTestRegistration-----------");
        runner.registerForMarathon(noMedicalTestRegistration);

        System.out.println("---------NoPaymentRegistration-----------");
        runner.registerForMarathon(noPaymentRegistration);

    }
}
