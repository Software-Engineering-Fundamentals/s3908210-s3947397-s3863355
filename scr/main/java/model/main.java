import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        requestForRefund();

    }

    public static void requestForRefund() {
        Scanner scan = new Scanner(System.in);
        String traineeName, traineeID;
        double feepaid, refundAmount;

        financialManager refund = new financialManager();
        refund.vadility();
        System.out.println(
                "\"The refund can only be processed if you cancel the training 24 hours before the first session\"");
        System.out.print("Please enter your name: ");
        traineeName = scan.nextLine();
        System.out.print("Please enter your ID: ");
        traineeID = scan.nextLine();
        System.out.print("");

    }

}
