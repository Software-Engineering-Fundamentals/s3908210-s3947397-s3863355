public class Refund {
    private boolean validation;
    private double refundAmount;
    private Trainee trainee;
    private TrainingSession trainingSession;
    private String requestedTime;

    public void notifyRefundStatus() {
        System.out.println("---VIEW NOTIFICATION AS TRAINEE---");

        // notify trainee
        if (this.validation) {
            System.out.println("Refund Approved!");
        } else {
            System.out.println("Refund Rejected!");

        }
    }

    // setters and getters
    public boolean isValidation() {
        return validation;
    }

    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Trainee getTrainee() {
        return trainee;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    public Refund() {
    }

    public TrainingSession getTrainingSession() {
        return trainingSession;
    }

    public void setTrainingSession(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }

    public String getRequestedTime() {
        return requestedTime;
    }

    public void setRequestedTime(String requestedTime) {
        this.requestedTime = requestedTime;
    }
}
