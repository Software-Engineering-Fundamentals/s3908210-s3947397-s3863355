public class Payment {
    protected String paymentDetails;
    private String paymentMethod;

    public Payment() {
        this.paymentDetails = "ABC123";
    }

    public void makeRefundTransaction(double refundFee) {
        System.out.println("---PAYMENT CLASS MAKING REFUND---");

        System.out.println("Refunded fee of: " + refundFee + ", to account no: " + paymentDetails);
    }
}
