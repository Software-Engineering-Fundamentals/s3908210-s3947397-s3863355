import java.util.Scanner;

public class Person {
    private String title;
    private String name;
    private long phone;
    private String emailAddress;

    public Person() {
    };

    public String lodgeEnquiry() {

        Scanner scan = new Scanner(System.in);
        System.out.println("--- LODGE ENQUIRY AS USER ---");

        // type is set to general enquiry for given scenario
        String type = "general";
        System.out.println("Please enter your enquiry: ");
        String message = scan.nextLine();
        System.out.println("Enquiry Lodged!");
        System.out.println();

        // make new Enquiry obj and this obj is added to enquiryList in constructor
        Enquiry enquiry = new Enquiry(type, message);

        return enquiry.getTrackingID();

    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
