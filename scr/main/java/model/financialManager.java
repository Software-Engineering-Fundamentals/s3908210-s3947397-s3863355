import java.util.ArrayList;
import java.util.Scanner;

public class FinancialManager extends Person {

    protected ArrayList<Refund> refundRequests = new ArrayList<>();

    public FinancialManager() {
    }

    public boolean processRefund(String registrationID) {
        return true;
    }

    public void addRefundToList(Refund refund) {
        refundRequests.add(refund);
    }

    public void processRefunds() {
        Scanner scan = new Scanner(System.in);
        String reply;

        System.out.println("---PROCESS REFUNDS AS FINANCIAL MANAGER---");

        // financial manager iterates through all requests and handles them
        for (Refund rr : refundRequests) {

            // gets the commence date of the training session the current request is
            // associated to
            TrainingSession tempTrainingSession = rr.getTrainingSession();
            String commenseTimeString = tempTrainingSession.getCommenceTime();

            // gets trainee details
            Trainee tempTrainee = rr.getTrainee();

            // manager checks if the gap between commence time and current time is less than
            // 24hrs
            System.out.println("Student Name: " + tempTrainee.getName());
            System.out.println("Requested Time: " + rr.getRequestedTime());
            System.out.println("First Class Commense Time: " + commenseTimeString);

            // ask for reply from manager
            System.out.print("Approve refund (Y/N)? ");
            reply = scan.nextLine();

            // change state of refund based on input

            if (reply.equals("Y")) {

                System.out.println();

                rr.setValidation(true);
                // set refund fee
                double refundFee = 12900;
                // make refund transaction
                Payment studentPayment = tempTrainee.getPayment();

                studentPayment.makeRefundTransaction(refundFee);

            } else if (reply.equals("N")) {

                rr.setValidation(false);
            }

            System.out.println();

            // notify trainee of outcome
            rr.notifyRefundStatus();

        }
    }
}