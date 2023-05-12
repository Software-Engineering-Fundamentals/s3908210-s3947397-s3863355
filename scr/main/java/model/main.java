import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // create actors
        // manager
        Manager manager = new Manager();
        manager.setName("Gill Bates");
        // financial manager
        FinancialManager financialManager = new FinancialManager();
        financialManager.setName("Kim Took");
        // trainee
        Trainee traineeTemp = new Trainee();
        traineeTemp.setName("Kalana");

        // refund scenario
        requestForRefund(financialManager, traineeTemp);

        // lodge enquiry scenario
        // lodgeEnquiryScenario(manager, traineeTemp);

    }

    public static void requestForRefund(FinancialManager fm, Trainee trainee) {

        // create dummy training session where trainee enrolled in for this scenario
        TrainingSession trainingSession = new TrainingSession();
        trainingSession.setCommenceTime("15:00 16/05/2023");

        // set trainee payment method for refunds
        Payment traineePayment = new Payment();
        trainee.setPayment(traineePayment);

        // trainee requests for refund by passing the training session trainee enrolled
        // in
        trainee.requestRefund(trainingSession);

        // add request into arraylist of requests in FinancialManager class
        fm.addRefundToList(trainee.getRefundRequest());

        // trainee finished requesting refunding and is waiting for financial manager to
        // reply

        // financial manager handles refunds
        fm.processRefunds();

    }

    public static void lodgeEnquiryScenario(Manager manager, Trainee trainee) {

        String enquiryTrackingID;

        // trainee makes enquiry
        enquiryTrackingID = trainee.lodgeEnquiry();

        // manager replies by iterating through all enquires
        for (Enquiry eq : Enquiry.enquiryList) {
            manager.repondToEnquiry(eq);
        }

        // trainee views response by iterating over all enquires and matching IDs
        for (Enquiry eq : Enquiry.enquiryList) {
            if (eq.getTrackingID().equals(enquiryTrackingID)) {
                System.out.println("Response for ID: " + eq.getTrackingID());
                System.out.println("------------------------");
                System.out.println(eq.getReply());
                System.out.println("------------------------");

            }
        }

    }

}
