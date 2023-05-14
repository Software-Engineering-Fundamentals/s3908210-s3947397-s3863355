
public class main {

    public static void main(String[] args) {

        // create dummy actors
        Manager manager = new Manager();
        manager.setName("Gill Bates");

        FinancialManager financialManager = new FinancialManager();
        financialManager.setName("Kim Took");

        Trainee traineeTemp = new Trainee();
        traineeTemp.setName("Kalana");

        // refund scenario
        requestForRefund(financialManager, traineeTemp);

        // lodge enquiry scenario
        lodgeEnquiryScenario(manager, traineeTemp);

    }

    public static void requestForRefund(FinancialManager financialManager, Trainee trainee) {

        // create dummy training session where trainee is enrolled in for this scenario
        TrainingSession trainingSession = new TrainingSession();
        trainingSession.setCommenceTime("15:00 16/05/2023");

        // create dummy payment class for payment method to transfer money for refund
        Payment traineePayment = new Payment();
        trainee.setPayment(traineePayment);

        // trainee requests for refund by passing the training session trainee enrolled
        // in
        trainee.requestRefund(trainingSession);

        // add request into arraylist of requests in FinancialManager class
        financialManager.addRefundToList(trainee.getRefundRequest());

        // trainee finished requesting refunding and is waiting for financial manager to
        // reply

        // financial manager handles refunds
        financialManager.processRefunds();

    }

    public static void lodgeEnquiryScenario(Manager manager, Trainee trainee) {

        String enquiryTrackingID;

        // trainee makes enquiry
        enquiryTrackingID = trainee.lodgeEnquiry();

        // manager gets all enquires
        // enquiryList[] = manager.getAllGeneralEnquiries();
        /*
         * NOTE: we have stored all the enquires in Enquiry class for the purposes of
         * the demonstration, in the proper implementation all the enquires would be
         * stored in a database.
         */
        // manager replies by iterating through all enquires
        for (Enquiry eq : Enquiry.enquiryList) {
            manager.processEnquiry(eq);
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
