import java.util.Scanner;

public class Trainee extends Person {
    private String registrationID;
    private String password;
    private String[] enrolledCourses;
    private Refund refundRequest;
    private Payment payment;

    public Trainee() {
    }

    public void requestRefund(TrainingSession trainingSes) {

        System.out.println("---REQUESTING REFUND AS TRAINEE---");

        // create refund obj
        Refund refund = new Refund();
        refund.setTrainee(this);
        refund.setTrainingSession(trainingSes);

        // current time of request to keep track of when trainee requested for the
        // refund
        String currentTime = "11:00 13/5/2023";
        refund.setRequestedTime(currentTime);

        // add refund to trainees attribute
        this.setRefundRequest(refund);

        System.out.println();

    }

    // getters and setters
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Refund getRefundRequest() {
        return refundRequest;
    }

    public void setRefundRequest(Refund refundRequest) {
        this.refundRequest = refundRequest;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String[] enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

}
