import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // create actors
        // manager
        Manager manager = new Manager();
        manager.setName("Gill Bates");
        // trainee
        Trainee traineeTemp = new Trainee();
        traineeTemp.setName("Kalana");

        // lodge enquiry scenario
        lodgeEnquiryScenario(manager, traineeTemp);

        // requestForRefund();

    }

    // public static void requestForRefund() {
    // Scanner scan = new Scanner(System.in);
    // String traineeName, traineeID;
    // double feepaid, refundAmount;

    // financialManager refund = new financialManager();
    // refund.vadility();
    // System.out.println(
    // "\"The refund can only be processed if you cancel the training 24 hours
    // before the first session\"");
    // System.out.print("Please enter your name: ");
    // traineeName = scan.nextLine();
    // System.out.print("Please enter your ID: ");
    // traineeID = scan.nextLine();
    // System.out.print("");

    // }

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
