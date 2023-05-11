import java.util.Scanner;

public class Manager extends Person {
    String addressEnquiry;

    public Manager() {
    }

    public void repondToEnquiry(Enquiry eq) {

        Scanner scan = new Scanner(System.in);
        String reply = "";

        // display details for enquiry
        System.out.println("--- REPLY TO ENQUIRY AS MANAGER ---");
        System.out.println("Equiry for ID: " + eq.getTrackingID());
        System.out.println("------------------------");
        System.out.println(eq.getGeneralEnquiry());
        System.out.println("------------------------");
        System.out.println();

        // reply to enquiry
        System.out.println("Please enter your reply:");
        reply = scan.nextLine();
        System.out.println("Replied to enquiry!");
        System.out.println("");

        eq.setReply(reply);

    }
}
